package Client;

import Export.*;
import Import.FileImport;
import Import.FileImportAnother;
import Import.FileImportJson;
import Import.IDataImport;
import Model.Contact;
import Model.PhoneBook;
import Model.View;

import java.io.IOException;

public class Presenter {
    private PhoneBook phoneBook;
    private String path;

    public Presenter(PhoneBook phoneBook, String path) {
        this.phoneBook = new PhoneBook();
        this.path = path;
    }

    public void LoadFromFile() throws IOException {
        IDataImport fileImport = new FileImport();
        fileImport.read(phoneBook, this.path);
        System.out.printf("Загружен файл %s", this.path);
    }
    public void LoadFromFileAnother() throws IOException {
        IDataImport fileImport = new FileImportAnother();
        fileImport.read(phoneBook, this.path);
        System.out.printf("Загружен файл %s", this.path);
    }
    public void LoadFromFileJson() throws IOException {
        IDataImport fileImport = new FileImportJson();
        fileImport.read(phoneBook, this.path);
        System.out.printf("Загружен файл %s", this.path);
    }

    public void add(Contact contact) {
        this.phoneBook.addContact(contact);
    }

    public void remove(Contact contact) {
        this.phoneBook.removeContact(contact);
    }

    public void saveToFile() {
        IDataExport fileExport = new FileExport(this.path);
        fileExport.write(this.phoneBook);
    }
    public void saveToFileAnother() {
        IDataExport fileExport = new FileExportAnother(this.path);
        fileExport.write(this.phoneBook);
    }
    public void saveToFileJson() {
        IDataExport fileExport = new FileExportJson(this.path);
        fileExport.write(this.phoneBook);
    }


}
