package commandPattern;

import java.util.ArrayList;
import java.util.List;

class Application {
    private String clipboard;
    private List<Editor> editors = new ArrayList<>();
    private Editor activeEditor;
    private CommandHistory history = new CommandHistory();

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
        
    //Os botões em java seriam feitos de forma diferente
    //usando javax.swing.*;

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }
}