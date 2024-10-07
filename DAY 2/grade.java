import java.util.*;
class grade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 subject marks:");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int total=m1+m2+m3;
        int Grade=total/3;
        if (Grade>=90 && Grade<=100){
            System.out.println("Grade A");
        }else if(Grade>=75 && Grade<90){
            System.out.println("Grade B");
        }else if(Grade>=55 && Grade<75){
            System.out.println("Grade C");
        }else{
            System.out.print("Fail");
        }
    }
}