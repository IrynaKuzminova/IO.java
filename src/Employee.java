import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable {
    private String name;
    private String id;
    transient private BigDecimal salary;

    public Employee() {
    }

    public Employee(String name, String id, BigDecimal salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}'+"\n";
    }
}
