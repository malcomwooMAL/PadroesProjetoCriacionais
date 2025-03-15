package mediator;

class Checkbox extends Component {
    public Checkbox(Mediator dialog){
        super(dialog);
    }
    public void check() {
        if(dialog != null){
            dialog.notify(this, "check");
        }
    }
    // ... outros métodos específicos de Checkbox
}
