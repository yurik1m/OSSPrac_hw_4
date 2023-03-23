import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("학번을 입력하세요: ");
        int id = sc.nextInt();
        System.out.print("학과을 입력하세요: ");
        String major = sc.next();
		
        System.out.println("<출력>");
        System.out.println("이름 : " + name);
        System.out.println("학번 : " + id);
        System.out.println("학과 : " + major);
	}

}