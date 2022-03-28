package lesson5.homework;

public class SuperLoop {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Иван Иванович", "Software Engineer", "testemail@gmail.com", "+7 (943) 720-88-01", 40000, 44 );
        empArray[1] = new Employee("Прохорова Стела Кирилловна", "QA Engineer", "testemail@gmail.com", "+7(992)699-42-57", 45000, 34 );
        empArray[2] = new Employee("Дубровский Бенедикт Петрович", "Tech-Support", "testemail@gmail.com", "+7(927)719-38-56", 30000, 45 );
        empArray[3] = new Employee("Трифонов Амадеус Павлович", "PM Manager", "testemail@gmail.com", "+7 (936) 615-97-32", 600000, 34 );
        empArray[4] = new Employee("Яковенко Раиса Робертовна", "Cleaner", "testemail@gmail.com", "+7 (996) 177-72-73", 20000, 24 );

        for (int i = 0; i < empArray.length; i++) {
                if (empArray[i].getAge() > 40) {
                    System.out.println(empArray[i]);
                };
            }
        }
    }

