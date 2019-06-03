package a_Dzien_1.dao;

import a_Dzien_1.model.DbUtil;
import a_Dzien_1.model.Model;
import a_Dzien_1.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings({"SqlResolve", "SqlNoDataSourceInspection"})
public class UserDao extends AbstractDao {
    private static final String LOAD_ALL_QUERY = "SELECT * FROM user;";
    private static final String LOAD_BY_ID_QUERY = "SELECT * FROM user WHERE id=?;";
    private static final String CREATE_QUERY = "INSERT INTO user(username,usergroup) VALUES(?,?);";
    private static final String UPDATE_QUERY = "UPDATE user SET username=?,usergroup=? WHERE id=?;";
    private static final String DELETE_QUERY = "DELETE FROM user WHERE id=?;";

    @Override
    protected Model newFromResultSet(ResultSet rs) throws SQLException {
        return new User(rs.getString("username"), rs.getLong("usergroup"));
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
        ps.setString(1, ((User) item).getUsername());
        ps.setString(2, "" + ((User) item).getUsergroup());
        return ps;
    }

    @Override
    protected PreparedStatement updateExistingStatement(Connection con, Model item) throws SQLException {
        PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
        ps.setString(1, ((User) item).getUsername());
        ps.setLong(2, ((User) item).getUsergroup());
        ps.setLong(3, item.getId());
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
