package a_Dzien_1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings({"SqlResolve", "SqlNoDataSourceInspection"})
public class ExerciseDao extends AbstractDao {
    private static final String LOAD_ALL_QUERY = "SELECT * FROM exercise;";
    private static final String LOAD_BY_ID_QUERY = "SELECT * FROM exercise WHERE id=?;";
    private static final String CREATE_QUERY = "INSERT INTO exercise(title,description) VALUES(?,?);";
    private static final String UPDATE_QUERY = "UPDATE exercise SET title=? WHERE id=?;";
    private static final String DELETE_QUERY = "DELETE FROM exercise WHERE id=?;";

    @Override
    protected Model newFromResultSet(ResultSet rs) throws SQLException {
        return new Exercise(rs.getLong("id"), rs.getString("title"), rs.getString("description"));
    }

    @Override
    protected String getLoadAllQuery() {
        return LOAD_ALL_QUERY;
    }

    @Override
    protected String getLoadByIdQuery() {
        return LOAD_BY_ID_QUERY;
    }

    @Override
    protected PreparedStatement saveNewStatement(Connection con, Model item) throws SQLException {
        PreparedStatement ps = con.prepareStatement(CREATE_QUERY);
        ps.setString(1, ((Exercise) item).getTitle());
        ps.setString(2, ((Exercise) item).getDescription());
        return ps;
    }

    @Override
    protected PreparedStatement updateExistingStatement(Connection con, Model item) throws SQLException {
        PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
        ps.setString(1, ((Exercise) item).getTitle());
        ps.setLong(2, item.getId());
        return ps;
    }

    @Override
    protected PreparedStatement deleteStatement(Connection con, Model item) throws SQLException {
        PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
        ps.setLong(1, item.getId());
        return ps;
    }

    @Override
    public void save(Model item) {
        try (Connection con = DbUtil.getConnection()) {
            if (item.getId() == null) {
                saveNewStatement(con, item).executeUpdate();
            } else {
                updateExistingStatement(con, item).executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
