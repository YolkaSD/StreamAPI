import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Написать метод, который будет принимать на вход список целых чисел и возвращать новый список, в котором каждый
        // элемент будет умножен на 2.
        List<Integer> integerList = List.of(1, 2, 3, 4, 5 , 6, 7, 8, 9, 10);
        List<Integer> newIntegerList = integerList.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println(newIntegerList);

        //Написать метод, который будет принимать на вход список строк и возвращать новый список,
        //в котором будут только те строки, которые начинаются с буквы "A".
        List<String> stringList = List.of("Ананас", "Тыква", "Яблоко", "Апельсин", "Малина");
        List<String> newStringList = stringList.stream()
                .filter(s -> s.startsWith("А"))
                .collect(Collectors.toList());
        System.out.println(newStringList);

        //Написать метод, который будет принимать на вход список объектов класса Person,
        //который имеет поля name (String) и age (int), и возвращать новый список объектов класса Person,
        //в котором будут только те объекты, у которых возраст больше 18.
        List<Person> people = new ArrayList<>();
        people.add(new Person(20, "Alina"));
        people.add(new Person(30, "Boris"));
        people.add(new Person(10, "Victor"));
        people.add(new Person(50, "Denis"));
        people.add(new Person(17, "Elena"));
        people.add(new Person(8, "Ivan"));
        people.add(new Person(34, "Kirill"));
        people.add(new Person(14, "Lana"));
        people.add(new Person(24, "Mykola"));
        people.add(new Person(27, "Nikolay"));
        List<Person> adultPeople = people.stream()
                .filter(p -> p.getAge() > 18)
                .collect(Collectors.toList());
        System.out.println(adultPeople);

        //Написать метод, который будет принимать на вход список строк и возвращать новый список,
        // в котором будут только уникальные строки (без повторений).
        List<String> strings = List.of("1111", "2222", "3333", "4444", "1111", "2222", "333", "4444");
        List<String> stringsDistinct = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(stringsDistinct);

        //Написать метод, который будет принимать на вход список объектов класса Student,
        //который имеет поля name (String) и grade (int),
        //и возвращать средний балл по всем студентам в списке.
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Alina"));
        studentList.add(new Student(4, "Boris"));
        studentList.add(new Student(5, "Victor"));
        studentList.add(new Student(1, "Denis"));
        studentList.add(new Student(5, "Elena"));
        studentList.add(new Student(3, "Ivan"));
        studentList.add(new Student(4, "Kirill"));
        studentList.add(new Student(2, "Lana"));
        studentList.add(new Student(5, "Mykola"));
        studentList.add(new Student(1, "Nikolay"));
        double avg = studentList.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
        System.out.println(avg);

        //Написать метод, который будет принимать на вход список строк и возвращать новый список,
        //в котором будут только уникальные символы из этих слов.
        //List<String> strings = List.of("1111", "2222", "3333", "4444", "1111", "2222", "333", "4444");
        List<Character> uniqueString = strings.stream()
                .flatMap(s -> s.chars().mapToObj(i -> (char) i))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueString);


    }
}