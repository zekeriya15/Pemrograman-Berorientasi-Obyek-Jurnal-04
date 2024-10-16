public class Hospital {
    private String name;
    private int id;
    private Nurse[] nurses;

    public Hospital(String name, int id, Nurse[] nurses) {
        this.name = name;
        this.id = id;
        this.nurses = nurses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public void setNurses(Nurse nurse) {
        int size = nurses.length;
        this.nurses[size] =  nurse;
    }

}
