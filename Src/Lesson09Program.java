import Models.Animal;

import java.util.Scanner;

public class Lesson09Program {
    public static void main(String[] args) {
        Person testPerson = new Person("Test Name", 26,
                true, "Undefined");
        System.out.println(testPerson);
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            menuCalculator();
//            int choice = scanner.nextInt();
//            switch (choice){
//                case 1:
//                    System.out.println("Enter first number: ");
//                    int a = scanner.nextInt();
//                    System.out.println("Enter second number: ");
//                    int b = scanner.nextInt();
//                    System.out.println(a + b);
//                    break;
//                case 2:
//                    System.out.println("Enter first number: ");
//                    int a1 = scanner.nextInt();
//                    System.out.println("Enter second number: ");
//                    int b1 = scanner.nextInt();
//                    System.out.println(a1 - b1);
//                    break;
//                case 3:
//                    System.out.println("Enter first number: ");
//                    int a2 = scanner.nextInt();
//                    System.out.println("Enter second number: ");
//                    int b2 = scanner.nextInt();
//                    System.out.println(a2 * b2);
//                    break;
//                case 4:
//                    System.out.println("Enter first number: ");
//                    int a3 = scanner.nextInt();
//                    System.out.println("Enter second number: ");
//                    int b3 = scanner.nextInt();
//                    if(b3 ==0){
//                        System.out.println("Cant' divide by zero");
//                    }else {
//                        System.out.println(a3 / b3);
//                    }
//                    break;
//                case 5:
//                    return;
//            }
//        }


//        Animal cat = new Animal("Matroskin", 3);
//        System.out.println(cat);
//        cat.name = "Tom";
//        System.out.println(cat);
//
//        Person testPerson = new Person("Test Name", 26,
//                true, "Undefined");
//        System.out.println(testPerson);
////
//        testPerson.sex = false;
//        System.out.println(testPerson);

//        Person kate = new Person("Kate", 18, false,
//                "Java developer");
//        System.out.println(kate);
//
//        Person tom = new Person();
//        tom.name = "Tom";
//        tom.age = 25;
//        tom.sex = true;
//        tom.profession = "Java developer";
//
//        System.out.println(tom);

//        Object object = new Object();
//        String str1Name = object.getClass().getName();
//        System.out.println(str1Name);
//        System.out.println(object);
//
//        Person person = new Person();
//        System.out.println(person);
//        String str2Name = person.getClass().getName();
//        System.out.println(str2Name);
    }

    public static void menuCalculator(){
        System.out.println("Please choose number: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }
}
