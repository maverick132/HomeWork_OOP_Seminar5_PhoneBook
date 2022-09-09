package Client;

import Export.*;
import Import.FileImport;
import Import.FileImportAnother;
import Import.FileImportJson;
import Import.IDataImport;
import Model.Contact;
import Model.PhoneBook;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        new UI("PhoneBookExport.txt").start();
    }
}