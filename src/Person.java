public class Person {

    private int id;
    private String name;
    private String email;


    public Person(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
