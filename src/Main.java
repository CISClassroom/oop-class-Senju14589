public class Main {
    public void  main(String[] args) {
        // creat Student object
        Student waii = new Student();
        Student ohm = new Student();
        Student sen =new Student();

        // input data to object
        waii.name= "Senju";
        waii.id= "623410008-8";
        waii.major= "CIS";
        ohm.name= "youngohm";
        ohm.id= "007";
        ohm.major= "CIS";
        sen.name= "sama";
        sen.id= "008";
        sen.major= "CS";


        //get data from object
        System.out.println("1."+ waii.name +" "+ waii.major);
        System.out.println("2."+ ohm.name +" "+ ohm.major);
        System.out.println("3."+ sen.name +" "+ sen.major);

        // add student to array
        // array intex       0
        Student[] oopStudents = {waii,ohm,sen};

        System.out.println("1."+oopStudents[0].name);
        System.out.println("2."+oopStudents[1].name);
        System.out.println("3."+oopStudents[2].name);

        find_CIS_Student(oopStudents);
    }
    // To find CIS Student
    public void  find_CIS_Student(Student[] students){
        for(int i = 0; i < students.length; i++){
            // check student.major is "CIS"
            if (students[i].major == "CIS"){
                System.out.println(i+1 + ". "+ students[i].name);
            }
        }

    }
}
