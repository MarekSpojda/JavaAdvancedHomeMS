package a_Dzien_1.dao;

import a_Dzien_1.model.Model;

import java.util.List;

public interface DaoInterface {

    List<Model> loadAll();

    Model loadById(int id);

    void save(Model object);

    void delete(Model object);

}

