package Export;

import Model.Contact;
import Model.PhoneBook;

import java.io.File;
import java.io.FileWriter;

public class FileExportJson extends FileExport{
    public FileExportJson(String path) {
        super(path);
    }

    @Override
    public void write(PhoneBook b) {
        File fl = new File(path);
        try(FileWriter fw = new FileWriter(fl, false)){
            for (Contact item : b.getContacts()) {
                fw.write("{\n");
                fw.write("ФИО: ");
                fw.write(item.getLastName()+" ");
                fw.write(item.getFirstName());
                if (item.getMiddleName() !=null) fw.write(" " + item.getMiddleName());
                else fw.write(" -");
                fw.write("\n");
                fw.write("Номер: ");
                fw.write(item.getPhone());
                fw.write("\n");
                fw.write("}\n");
            }
            fw.flush();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
