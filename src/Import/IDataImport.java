package Import;

import Model.PhoneBook;
import Model.View;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IDataImport extends View {

    void read(PhoneBook b, String pt) throws IOException;
}
