public class Student {
    String name;
    String surname;

    int id;
    int lastId = 0;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = lastId++;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
