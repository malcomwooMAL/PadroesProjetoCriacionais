package mediator;

class Component {
    Mediator dialog; //Ou protected, dependendo se as subclasses precisam acessar

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }
    //Construtor padrão, se quisermos dar a opção de criar sem mediator de início
    public Component(){
        this(null);
    }

    public void click() {
        if(dialog != null) { //importante verificar se o dialog foi definido
            dialog.notify(this, "click");
        }
    }

    public void keypress() {
        if(dialog != null){
             dialog.notify(this, "keypress");
        }
    }
}
