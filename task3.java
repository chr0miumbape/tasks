import java.util.Scanner;



public class task3 {
    public static void main (String [] args){
        bountyA (232300);
        emploeesBAmount();

    }
    static void bountyA(int salary){
        int bounty = (int) (salary / 1.5);
        int duty = (int) (bounty * 0.3);
        int result = bounty + duty;
        System.out.println("Премия составит - " + result);
    }
    static void emploeesBAmount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имена (через запятую): ");
        String[] employeesNames = scanner.nextLine().split(",");
        System.out.println("Введите зарплаты (через запятую соответсвенно)");
        String[] employeesSalaries = scanner.nextLine().split(",");
        for(int i  = 0; i < employeesSalaries.length; i ++ ){
            int salary = Integer.parseInt(employeesSalaries[i]);
            int bounty = (int) (salary / 1.5);
            int duty = (int) (bounty * 0.13);
            employeesSalaries[i] = String.valueOf(bounty + duty);
            System.out.println("Премия для " + employeesNames[i] + " составит " +employeesSalaries[i] + " рублей");
        }

    }

}
