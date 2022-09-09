package Export;

import Model.Contact;
import Model.PhoneBook;

import java.io.File;
import java.io.FileWriter;

public class FileExportAnother extends FileExport {
    public FileExportAnother(String path) {
        super(path);
    }

    @Override
    public void write(PhoneBook b) {
        File fl = new File(path);
        try (FileWriter fw = new FileWriter(fl, false)) {
            for (Contact item : b.getContacts()) {
                fw.write(item.getLastName() + "\n");
                fw.write(item.getFirstName());
                if (item.getMiddleName() != null) fw.write("\n" + item.getMiddleName()+"\n");
                else fw.write("\n" + " -"+"\n");
                fw.write(item.getPhone());
                fw.write("\n");
            }
            fw.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
