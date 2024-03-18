import java.util.scanner;

import java.util.scanner;

public class GradeChecker{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

double avgscore;

System.out.print("Enter your score: ");

avgscore = scanner.nextInt();

if(avgscore >=0 && avgscore<=39 ){
System.out.printIn("Grade: Fail");

} else if(avgscore >=40 && avgscore <=49 ){
System.out.printIn("Grade: D");

}else if(avgscore >=50 && avgscore <=59 ){
System.out.printIn("Grade: C");

}else if(avgscore >=60 && avgscore <=69 ){
System.out.printIn("Grade: B");

}else if(avgscore >=70 && avgscore <=79 ){
System.out.printIn("Grade: A");

}else{
System.out.printIn("Grade: Hizi Ni Mawhat??");

scanner.close();
}
}
}

