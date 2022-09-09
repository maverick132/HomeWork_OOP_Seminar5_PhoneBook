package Export;

import Model.PhoneBook;
import Model.View;

public interface IDataExport extends View {
    void write(PhoneBook b);
}
