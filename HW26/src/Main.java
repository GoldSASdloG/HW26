import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Task1
        Set<Set<String>> sets = new HashSet<>();

        Set<String> strings = new HashSet<>();
        strings.add("раз");
        strings.add("два");
        strings.add("три");

        Set<String> strings2 = new HashSet<>();
        strings2.add("Первое");
        strings2.add("Второе");
        strings2.add("Семьдесят шестое");

        Set<String> strings3 = new HashSet<>();
        strings3.add("12");
        strings3.add("783");
        strings3.add("37288736");

        Set<String> strings4 = new HashSet<>();
        strings4.add("Проверка");
        strings4.add("Струн");
        strings4.add("Раз-Два");

        sets.add(strings);
        sets.add(strings2);
        sets.add(strings3);
        sets.add(strings4);

//        int size = sets.stream()
//                .flatMap(s -> s.stream())
//                .mapToInt(s -> s.length())
//                .sum();
//        System.out.println(size);
//
//        int worldSizeMax = sets.stream()
//                .flatMap(s -> s.stream())
//                .mapToInt(s -> s.length())
//                .max()
//                .getAsInt();
//        System.out.println(worldSizeMax);

//        Task2
        List<Employee> employees = EmployeeFactory.createEmployee();

//        Employee employee = employees.stream()
//                .max(Comparator.comparing(Employee::getKpi))
//                .get();
//        System.out.println("лучшая КПА: " + employee);

//        Employee employee2 = employees.stream()
//                .max(Comparator.comparing(Employee::getSalary))
//                .get();
//        System.out.println("лучшая зарплата: " + employee2);
//
//        Employee employ = employees.stream()
//                .filter(e -> e.getName().matches("\\w+"))
//                .findFirst()
//                .get();
//        System.out.println("не русский: " + employ);
//
//        double avrKpi = employees.stream()
//                .mapToInt(e -> e.getKpi())
//                .average()
//                .getAsDouble();
//        System.out.println(avrKpi);
//        employees.stream()
//                .filter(e -> e.getKpi() > avrKpi)
//                .forEach(System.out::println);


//        employees.stream()
//                .filter(e -> e.getName().matches("[А-я]+"))
//                .filter(e -> e.getAge() > 40)
//                .filter(e -> e.getSalary() < 22000)
//                .forEach(System.out::println);
//
//        double avrKpi22 = employees.stream()
//                .filter(e -> e.getName().matches("[А-я]+"))
//                .filter(e -> e.getAge() > 40)
//                .filter(e -> e.getSalary() < 22000)
//                .mapToInt(e -> e.getKpi())
//                .average().orElse(0);
//        System.out.println(avrKpi22);

        Map<String, Employee> employeeMap = employees.stream()
                .filter(e-> e.getAge() < 35 && e.getSalary() > 10000)
                .collect(Collectors.toMap(e-> e.getName() + "  " + e.getSurname(), e-> e));

        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}