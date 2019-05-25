package a_Dzien_1.dao;

public class Exercise implements Model {
    private Long id;
    private String title;
    private String description;

    public Exercise(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Exercise(String title, String description) {
        this.id = null;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id= " + this.getId() + ", title= " + this.getTitle() + ", description= " + this.getDescription();
    }
}
