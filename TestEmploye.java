public class EntryEmployee {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Thai", "Hoang", 1077);
        System.out.println("Id: " + e.getId());
        System.out.println("Name: " + e.getFullName());
        System.out.println("Salary: " + e.getSalary());
    }
}
