package Client;

import Model.Contact;
import Model.PhoneBook;

import java.io.IOException;

public class UI {
    Presenter p;
    ConsoleView ui;
    private String path;
    PhoneBook phoneBook;

    public UI(String path) {
        this.phoneBook = new PhoneBook();
        this.p =  new Presenter(this.phoneBook,path);
        this.path = path;
        this.ui = new ConsoleView();
    }

    public void start() throws IOException {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Load from file\n")
                .append("2 - Save to File\n")
                .append("3 - Add contact\n")
                .append("4 - Remove contact\n")
                .append("0 - exit\n");
        StringBuilder sbLoad = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Load from file\n")
                .append("2 - Load from another file\n")
                .append("3 - Load from file Json\n")
                .append("0 - exit\n");
        StringBuilder sbSave = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Save from file\n")
                .append("2 - Save from another file\n")
                .append("3 - Save from file Json\n")
                .append("0 - exit\n");


        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    ui.set(sbLoad.toString());
                    switch (ui.get()) {
                        case "1": p.LoadFromFile(); break;
                        case "2": p.LoadFromFileAnother();  break;
                        case "3": p.LoadFromFileJson();  break;
                        case "0": return;
                    }
                    break;
                case "2":
                    ui.set(sbSave.toString());
                    switch (ui.get()) {
                        case "1": p.saveToFile(); break;
                        case "2": p.saveToFileAnother();  break;
                        case "3": p.saveToFileJson();  break;
                        case "0": return;
                    }
                    break;
                case "3":
                    System.out.println("Введите контакт построчно. Вначале имя, потом фамилия, отчество (- если нету) и телефон");
                    p.add(new Contact(ui.get(),ui.get(),ui.get(),ui.get()));
                    break;
                case "4":
                    System.out.println("Введите контакт построчно. Вначале имя, потом фамилия, отчество (- если нету) и телефон");
                    p.remove(new Contact(ui.get(),ui.get(),ui.get(),ui.get()));
                    break;
                case "0":
                    return;
            }
        }
    }
}
