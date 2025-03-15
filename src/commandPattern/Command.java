package commandPattern;

import java.util.ArrayList;

abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup; // 'text' em TypeScript geralmente corresponde a String em Java

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup() {
        backup = editor.getText(); // Assumindo que Editor tem um método getText()
    }

    public void undo() {
        editor.setText(backup); // Assumindo que Editor tem um método setText()
    }

    public abstract boolean execute();
}
