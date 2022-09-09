package Import;

import Model.Contact;
import Model.PhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileImportAnother extends FileImport {
    @Override
    public void read(PhoneBook phoneBook, String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String data = reader.readLine();
            while (data != null) {
                Contact contact = new Contact(
                        data,
                        reader.readLine(),
                        reader.readLine(),
                        reader.readLine()
                );
                phoneBook.updateContact(contact);
                data = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
