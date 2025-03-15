package commandPattern;

class Editor {
    private String text; // String para armazenar o texto

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getSelection() {
        // Implementação da lógica para obter a seleção
        // (Depende de como a seleção é representada)
        return ""; // Exemplo: retorna vazio por enquanto
    }

    public void deleteSelection() {
        // Implementação da lógica para deletar a seleção
    }

    public void replaceSelection(String text) {
        // Implementação da lógica para substituir a seleção
    }
}