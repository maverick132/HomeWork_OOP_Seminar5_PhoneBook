package Export;

import Export.IDataExport;
import Model.Contact;
import Model.PhoneBook;

public class ConsoleOutputI implements IDataExport {

    @Override
    public void write(PhoneBook b) {
        for (Contact item : b.getContacts()) {
            System.out.println(item);
        }
    }
}
