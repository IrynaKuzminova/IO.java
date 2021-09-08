import java.io.File;
import java.io.IOException;
import java.util.List;

public interface WriteCollection {
    void serializeCollection(List<Employee> employees, File file) throws IOException;
}
