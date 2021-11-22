    /**
    *KitaevaJavaHomeWorkFive
    *
    *@author KseniaKitaeva
    *@version 22.11.2021
    */

    class KitaevaJavaHomeWorkFive {

    public static void main(String[] args) {
        Worker[] workers = {
            new Worker("Smit Jhon", "QA team, tester_1", "jsmit@mail.com", "123456789", 80000, 36),
            new Worker("White Mary", "QA team, tester_2", "mwhite@mail.com", "234567890", 80000, 32),
            new Worker("Ward Jimmy", "QA team, tester_3", "jward@mail.com", "345678901", 80000, 43),
            new Worker("Morgan Melinda", "QA team, tester_4", "mmorgan@mail.com", "456789012", 80000, 41),
            new Worker("Jhonson Peter", "QA team, scrum master", "pjhonson@mail.com", "567890123", 180000, 44)
        };

        for (Worker worker : workers) {
            if (worker.getAge() > 40) {
                System.out.println (worker);
            }
        }
    }
}

    class Worker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Worker (String name, String position, String email, String phone,
            int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + 
            "\n| Position: " + position +
            "\n| Email: " + email +
            "\n| Phone: " + phone + 
            "\n| Salary: " + salary +
            "\n| Age: " + age);
    }
}