package application.pilha;

public class PilhaSimples {
    private String[] itens;
    private int tamanho;
    private int topo;

    public PilhaSimples(int tamanho){
        this.tamanho = tamanho;
        this.itens = new String[this.tamanho];
        this.topo = -1;
    }

    public void empilhar(String valor){
        if (topo == (tamanho)){
            System.out.println("Pilha cheia!!!");
        }
        else {
            itens[topo++] = valor;
        }

    public String desempilhar(){
        String resultado = "";
        if (topo == -1){
            System.out.println("Pilha vazia!!!");
        }
        else {
            resultado = itens[topo--];
        }
        return resultado;
    }    

        @Override
        public String toString(){
            String resultado = "";
            if (topo >= 0){
                for (int cont = 0; cont <= topo; cont++){
                    resultado += intens[cont] + "  ";
                }
            }
            return resultado;
        }
    }
}
