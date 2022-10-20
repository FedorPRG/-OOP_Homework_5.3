public abstract class Human {
    protected Integer id;
    protected String name;
    protected Integer year_of_birth;

    public Human(int id, String name, int year_of_birth) {
        this.id = id;
        this.name = name;
        this.year_of_birth = year_of_birth;
    }
    
    public String getFullName() {
        return String.format("%d  %-11s %s года рождения" , id, name, year_of_birth);
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }


}
