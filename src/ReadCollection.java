import java.io.File;
import java.io.IOException;
import java.util.List;

public interface ReadCollection {
    List<Employee> deserializeCollection(File file) throws IOException, ClassNotFoundException;
}
