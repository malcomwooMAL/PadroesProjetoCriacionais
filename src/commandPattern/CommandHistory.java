package commandPattern;

import java.util.ArrayList;
import java.util.List;

class CommandHistory {
    private List<Command> history = new ArrayList<>(); // Usando ArrayList para a lista

    public void push(Command c) {
        history.add(c); // Adiciona ao final da lista
    }

    public Command pop() {
        if (history.isEmpty()) {
            return null; // Ou lançar uma exceção, dependendo da sua necessidade
        }
        return history.remove(history.size() - 1); // Remove e retorna o último elemento
    }
}