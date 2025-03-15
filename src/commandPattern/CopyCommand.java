package commandPattern;

class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor); // Chamada explícita ao construtor da superclasse
    }

    @Override // Boa prática: indicar que estamos sobrescrevendo um método
    public boolean execute() {
        app.setClipboard(editor.getSelection()); // Assumindo setClipboard() em Application
        return false;
    }
}