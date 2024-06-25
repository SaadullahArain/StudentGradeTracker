import java.util.ArrayList;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int numStudents = sc.nextInt();

        ArrayList<Integer> grades = new ArrayList<>();

        for (int i=0; i<numStudents; i++){
            System.out.println("Enter grades of student: " + (i+1) );
            grades.add(sc.nextInt());
        }
        int sum=0;
        int minGrade = grades.get(0);
        int maxGrade = grades.get(0);

        for (int grade : grades){
            sum+=grade;
            if (grade<minGrade ) {
                minGrade = grade;                
            }
            if (grade>maxGrade) {
                maxGrade = grade;
                
            }
        }
        double averageGrade = (double) sum/numStudents;

        System.out.println("Average grade: " + averageGrade);
        System.out.println("Minimum grade: " + minGrade);
        System.out.println("Maximum grade: " + maxGrade);

        sc.close();
    }

    
}