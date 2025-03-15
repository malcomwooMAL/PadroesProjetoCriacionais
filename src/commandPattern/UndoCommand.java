package commandPattern;

class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor){
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo(); // Assumindo que Application tem um método undo()
        return false;
    }
}