import java.util.ArrayList;

public class StudentAManagment {

    //brain of the student class holding student information

    private final ArrayList<Student> STUDENTLIST;

    public StudentAManagment() {
        STUDENTLIST = new ArrayList<>();
    }


    public void add(Student Obj){
        STUDENTLIST.add(Obj);
    }

    public void Student_Info(){

        for (Student obj : STUDENTLIST
        ){
            System.out.println(obj);
        }
    }

    public void remove(int rollNumber ){

        boolean flag = false;

        for (int i = 0; i < STUDENTLIST
                .size(); i++) {

            Student current = STUDENTLIST
                    .get(i);

            if (current.getRollNumber() == rollNumber){
                STUDENTLIST
                        .remove(i);
                flag = true;

                break;
            }
        }
        if(!flag){
            System.out.println("Student Not Found!...");
        }



    }

    public StudentAManagment(ArrayList<Student> STUDENTLIST) {
        this.STUDENTLIST = STUDENTLIST;
    }


            public void findStudent(int seachId){
                for (Student obj : STUDENTLIST
                ){
                    if(obj.getRollNumber() == seachId){

                        System.out.println("Student RollNumber: "+obj.getRollNumber()+" "+" Student Name : "+obj.getStdName());
                        break;
                    }
                }
            }




}
