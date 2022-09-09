package Import;

import Model.Contact;
import Model.PhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileImportJson extends FileImport {
    @Override
    public void read(PhoneBook phoneBook, String path) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String data = reader.readLine();
            while (data != null) {
                if(data.equals("{") || data.equals("}")) {
                    data = reader.readLine();
                }
                else {
                    String[] temp = data.split(":");
                    String[] temp2 = temp[1].split(" ");

                    Contact contact = new Contact(
                            temp[1].split(" ")[1],
                            temp[1].split(" ")[2],
                            temp[1].split(" ")[3],
                            reader.readLine().split(":")[1]
                    );
                    phoneBook.updateContact(contact);
                    data = reader.readLine();

                    }
                }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
