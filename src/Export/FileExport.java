package Export;

import Model.Contact;
import Model.PhoneBook;

import java.io.File;
import java.io.FileWriter;

public class FileExport implements IDataExport {
    String path;

    public FileExport(String path) {
        this.path = path;
    }

    @Override
    public void write(PhoneBook b) {
        File fl = new File(path);
        try(FileWriter fw = new FileWriter(fl, false)){
            for (Contact item : b.getContacts()) {
                fw.write(item.getLastName()+" ");
                fw.write(item.getFirstName());
                if (item.getMiddleName() !=null) fw.write(" " + item.getMiddleName());
                else fw.write(" -");
                fw.write(":");
                fw.write(item.getPhone());
                fw.write("\n");
            }
            fw.flush();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }



}
