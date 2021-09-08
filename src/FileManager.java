import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager implements WriteObject, ReadObject, WriteCollection, ReadCollection {

    @Override
    public void serializeObject(Employee employee, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object was serialized!");
    }

    @Override
    public Employee deserializeObject(File file) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee employee = (Employee) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Object was deserialized!");
        return employee;
    }

    @Override
    public void serializeCollection(List<Employee> employees, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeInt(employees.size());
        for (Object o : employees) {
            objectOutputStream.writeObject(o);
        }
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Collection was serialized!");
    }

    @Override
    public List<Employee> deserializeCollection(File file) throws IOException, ClassNotFoundException {
        List<Employee> employees = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        int sizeCollection = objectInputStream.readInt();
        for (int i = 0; i < sizeCollection; i++) {
            Employee employee = (Employee) objectInputStream.readObject();
            employees.add(employee);
        }
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Collection was deserialized!");
        return employees;
    }
}

