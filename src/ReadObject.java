import java.io.File;
import java.io.IOException;

public interface ReadObject {
    Employee deserializeObject(File file) throws IOException, ClassNotFoundException;
}
