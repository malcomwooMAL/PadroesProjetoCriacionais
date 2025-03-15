package commandPattern;

class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }
     @Override
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(app.getClipboard()); //Assumindo um getClipboard()
        return true;
    }
}
