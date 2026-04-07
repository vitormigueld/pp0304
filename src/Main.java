public class Main {
    public static void main(String[] args) {
        Produto mouse    = new Produto(80, "Mouse");
        Produto teclado  = new Produto(150,"Teclado");
        Produto monitor  = new Produto(900,"Monitor");
        Produto mousepad = new Produto(40,"Mousepad");

        Kit kitPerifericos = new Kit("Kit Periféricos");
        kitPerifericos.adicionar(mouse);
        kitPerifericos.adicionar(teclado);
        kitPerifericos.adicionar(mousepad);

        Kit kitSetup = new Kit("Kit Setup");
        kitSetup.adicionar(monitor);
        kitSetup.adicionar(kitPerifericos);

            kitSetup.exibir("PC");
    }
    }
