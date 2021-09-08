import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fileEmployees = new File("Employees.txt");
        boolean newFile = fileEmployees.createNewFile();
        System.out.println(newFile);
        FileManager methods = new FileManager();
        //Засеріалізувала і витянула обєкт
        Employee employee1 = new Employee("Iryna", "EE765122", new BigDecimal("20000"));
        methods.serializeObject(employee1, fileEmployees);
        Employee employee2 = methods.deserializeObject(fileEmployees);
        System.out.println(employee2);
        //Cеріалізую колекцію
        Employee employee3 = new Employee("Oleksiy", "EE565431", new BigDecimal("40000"));
        Employee employee4 = new Employee("Olena", "EE842345", new BigDecimal("25000"));
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee3);
        employees.add(employee4);
        methods.serializeCollection(employees, fileEmployees);
        List<Employee> employees1 = methods.deserializeCollection(fileEmployees);
        System.out.println(employees1);


    }
}
