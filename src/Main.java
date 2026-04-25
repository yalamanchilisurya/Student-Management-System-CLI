import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try (Scanner input = new Scanner(System.in)) {
            StudentAManagment obj = new StudentAManagment();


            while (true) {
                int choice;


                System.out.print("----------------------------------------\n");
                System.out.println(

                        """
                                Pick the option
                                1.Add
                                2.view
                                3.removing
                                4.exit
                                """
                );
                System.out.println("------------------------------------------------");
                choice = input.nextInt();
                input.nextLine();
                System.out.println("------------------------------------------");

                if (choice == 4) {
                    System.out.println("Site is closed");
                    break;
                }


                switch (choice) {
                    case 1:
                        int rollnum;
                        String name;
                        double grade;

                        System.out.println("Enter the (  StudentName , rollNumber , grade )of the Student: ");

                        name = input.nextLine();
                        rollnum = input.nextInt();
                        grade = input.nextDouble();
                        obj.add(new Student(rollnum, name, grade));
                        obj.Student_Info();
                        break;

                    case 2:
                        System.out.println("viewing...........");
                        Thread.sleep(2000);
                        obj.Student_Info();
                        break;


                    case 3:
                        System.out.println("************************************");
                        System.out.print("please Enter the rollNumber of number to remove: ");
                        int removestd = input.nextInt();
                        System.out.println("Removing List......................");
                        obj.findStudent(removestd);
                        obj.remove(removestd);
                        System.out.println("***********Successfully Deleted *****************");
                        obj.Student_Info();
                        break;

                    default:
                        System.out.println("Wrong choice...!");
                        break;
                }


            }

        } catch (Exception e) {
            System.out.println(e);
        }



    }
}