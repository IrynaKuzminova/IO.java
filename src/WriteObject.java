import java.io.File;
import java.io.IOException;

public interface WriteObject {
    void serializeObject(Employee employee, File file) throws IOException;

}
