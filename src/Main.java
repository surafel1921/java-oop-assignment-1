public class Main {
    public static void main(String[] args) {

        // Create two students
        Student s1 = new Student("Sara Kim", 10001);
        Student s2 = new Student("Ahmed Ali", 10002);

        // Show their names
        System.out.println("Student 1 name: " + s1.getName());
        System.out.println("Student 2 name: " + s2.getName());

        // Bonus: changing name using setter
        s1.setName("Sara Mohamed");
        System.out.println("New name: " + s1.getName());
    }
    // Commit 3: Finalized and ready for submission
}