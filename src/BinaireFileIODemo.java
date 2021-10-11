import java.util.Scanner;

public class BinaireFileIODemo {

    public void opslaanGetallen(String bestandsnaam){

        //ObjectOutputStream object aanmaken

        //Getallen inlezen
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Geef een positief getal .");
        System.out.println ("Om te stoppen geef een negatief getal.");
        int getal;

        do
        {
            getal = keyboard.nextInt ();

        }
        while (getal >= 0);

    }

    public void lezenGetallen(String bestandsnaam){
        //aanmaken ObjectInputStream object
    }

    public void bewarenStudenten(String bestandsnaam){
        Student student1 = new Student("Boels","Karel","45678");
        Student student2 = new Student("De Smet","Dirk","67567");

        //aanmaken ObjectOutputStream

        //wegschrijven van studenten + stoppen bij fout

        // sluiten stream
    }

    public void lezenStudenten(String bestandsnaam){
        //aanmaken ObjectInpuStream

        //lezen van objecten en stoppen bij EOFException
    }

    public void scrijvenStudenten(String bestandsnaam, Student[] studenten){

    }

    public Student[] lezenStudent(String bestandsnaam){
        return null;
    }

    public static void main(String[] args) {
        //DEMO 1
        String bestandsnaam1 = "numbers.dat";
        BinaireFileIODemo demo1 = new BinaireFileIODemo();
        demo1.opslaanGetallen(bestandsnaam1);
        demo1.lezenGetallen(bestandsnaam1);

        //Demo 2
        String bestandsnaam2 = "student.dat";
        BinaireFileIODemo demo2 = new BinaireFileIODemo();
        demo2.opslaanGetallen(bestandsnaam1);
        demo2.lezenGetallen(bestandsnaam1);

        //Demo 3
        Student student1 = new Student("Boels","Karel","45678");
        Student student2 = new Student("De Smet","Dirk","67567");

        Student[] studenten = new Student[2];
        studenten[0] = student1;
        studenten[1] = student2;

        String bestandsnaam3 = "studentenArray.dat";
        BinaireFileIODemo demo3 = new BinaireFileIODemo();
        demo3.scrijvenStudenten(bestandsnaam2,studenten);
        demo3.lezenStudenten(bestandsnaam3);

    }
}
