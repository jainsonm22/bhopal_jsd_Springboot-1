package Jsd_batch.example.StudentManagement;

public class Student {
    int admnNO;
    String name;
    String state;

    public Student(int admnNO, String name, String state) {
        this.admnNO = admnNO;
        this.name = name;
        this.state = state;
        System.out.println("hello from constructor ");
    }

    public int getAdmnNO() {
        return admnNO;
    }

    public void setAdmnNO(int admnNO) {
        this.admnNO = admnNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
