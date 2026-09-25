public class Condition {
    public static void main(String[] args) {
        int salary = 50000;
        {
            if (salary > 40000) {
                salary = salary + 10000;
            } else {
                salary = salary - 10000;
            }
        }
        System.out.println(salary);
    }

}
