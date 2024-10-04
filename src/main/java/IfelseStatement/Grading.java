package IfelseStatement;
import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Grade : ");
        int grade = s.nextInt();

        if(grade >=90 && grade <= 99){
            System.out.println("grade: " + grade);
        }
        else {
            System.out.println("Fail");
        }
        }
    }

