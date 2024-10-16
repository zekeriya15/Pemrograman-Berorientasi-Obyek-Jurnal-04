public class MainHospital {
    public static void main(String[] args) {

        Nurse n1 = new Nurse("Budi", 2);
        Hospital h1 = new Hospital("Health Hospital", 1001, new Nurse[]{new Nurse("Bakrie", 0), n1}); 

        Nurse[] list1 = h1.getNurses();

       
        Nurse n2 = new Nurse("Andi", 20);
        Hospital h2 = new Hospital("Brave Hospital", 1002, new Nurse[]{new Nurse("Yakup", 20), n2});

        Nurse[] list2 = h2.getNurses();


        displayNurses(h1, list1);
        displayNurses(h2, list2);

    }

    private static void displayNurses(Hospital h, Nurse[] list) {
        System.out.println("\nNama RS: " + h.getName() + "\nKode RS: " + h.getId() + "\n");
        for (Nurse n : list) {
            if (n != null) {
                System.out.println("Nama perawat: " + n.getName());
                System.out.println("Kode perawat: " + n.getId());
                System.out.println();
            }
        }

    }
}
