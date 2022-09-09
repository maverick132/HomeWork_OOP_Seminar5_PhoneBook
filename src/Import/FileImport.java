package Import;

import Model.Contact;
import Model.PhoneBook;

import java.io.*;

public class FileImport implements IDataImport {

    @Override
    public void read(PhoneBook phoneBook, String path) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String data = reader.readLine();
            while (data != null) {
                String[] temp = data.split(":");
                Contact contact = new Contact(
                        temp[0].split(" ")[0],
                        temp[0].split(" ")[1],
                        temp[0].split(" ")[2],
                        temp[1]
                );
                phoneBook.updateContact(contact);
                data = reader.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
