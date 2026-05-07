package Switchloop;
class Student {

    private int id;         
    String name;             
    protected String course; 
    public String college;  

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class access {
    public static void main(String[] args) {

        Student s = new Student();

        s.setId(101);       
        s.name = "Suraj";      
        s.course = "IT";        
        s.college = "NIT";       

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.name);
        System.out.println("Course: " + s.course);
        System.out.println("College: " + s.college);
    }
}
