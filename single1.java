class learners extends complab {
    String name;

    learners(int id, String name) {
        super(id);
        this.name = name;
    }

    public static void main(String[] args) {
        learners learners = new learners(889, "alice");
        System.out.println("Id = " + learners.id + " Student Name = " + learners.name);

    }
}
class complab 
{
    int id;

    complab(int id) {
        this.id = id;
    }
}

