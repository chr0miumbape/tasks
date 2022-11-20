import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Human human1 = new Human("bob" , 15);
        Human human2 = new Human();
        Human human3 = new Human("mark");
        Human human4 = new Human(15);
    }
    static class Human{
        public Human(String name, int age){
            System.out.println("Данные заданы");
            this.name = name;
            this.age = age;
            System.out.println("My name is " + name + " i`m " + age + " y.o");
        }
        public Human(){
            System.out.println();
            System.out.println("Данные не заданы");
            Scanner s = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = s.next();
            System.out.println("Введите возраст: ");
            int userage = s.nextInt();
            System.out.println("Вас зовут: " + name + " вам " + userage + " лет.");


        }
        public Human(String name){
            System.out.println();
            System.out.println("Задано только имя");
            System.out.println(name);
            Scanner s = new Scanner(System.in);
            this.name = name;
            System.out.println("Введите ваш возраст: ");
            int userage = s.nextInt();
            System.out.println("Вас зовут " + name + " вам " + userage + " лет.");
        }
        public Human(int age){
            System.out.println();
            System.out.println("Задан только возраст");
            System.out.println(age);
            Scanner s = new Scanner(System.in);

            System.out.println("Введите имя:");
            String username = s.nextLine();

            System.out.println("Вас зовут " + username + " вам " + age + " лет");
            s.close();
        }

        private String name;
        private int age;

    }
}
