
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student =  new Student();

        student.setName("Maksat");
        student.setSurname("Alimzhanov");
        student.setAge(22);
        student.setGpa(3.5);

        System.out.println(student.toString());
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
        System.out.println(student1.toString());
    }



}