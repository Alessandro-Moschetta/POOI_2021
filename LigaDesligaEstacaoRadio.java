package exercicioaula_3004;

public class LigaDesligaEstacaoRadio {
    
    private int posicao; //default 0
    private boolean desligado; // default false
    private int estacao;
    private boolean ativada;
    
    public LigaDesligaEstacaoRadio() {
        this.posicao = 0;
        this.desligado = true;
        this.estacao = 20;
        this.ativada = true;
    }
    
    public LigaDesligaEstacaoRadio(int posicao) {
        this.setPosicao(posicao);
        //this.setEstacao(estacao);
    }
    
    public int getPosicao() {
        return this.posicao;
    }
    
    public int getEstacao() {
        return this.estacao;
    }
    
    public void setPosicao(int posicao) {
        if (posicao >= 0 && posicao <= 10){
            this.posicao = posicao;
            if (this.posicao == 10){
                this.desligado = false;
            } else {
                this.desligado = true;
            }
        } else {
            System.out.println("Posição deve ser Entre 0 e 10!!");
        }
    }
    
    public void setEstacao(int estacao) {
        if (estacao >= 12 && estacao <= 20){
            this.estacao = estacao;
            if (this.estacao == 20){
                this.ativada = false;
            } else {
                this.ativada = true;
            }
        } else {
            System.out.println("Estação deve estar Entre 12 e 20!!");
        }
    }
    
    public void ligaRadio(){
        if (posicao >= 10){
            System.out.println("O Rádio já está DESLIGADO !!! ");
        } else {
            this.posicao += 2;
            if (this.posicao == 10){
                this.desligado = false;
            }
        }
    }
    
    public void desligaRadio(){
        if (this.posicao == 0){
            System.out.println("O Rádio já está LIGADO!!! ");
        } else {
            this.posicao -= 2;
            this.desligado = true;
        }
    }
    
    public void estacaoconectadaRadio(){
        if (estacao >= 20){
            System.out.println("O Rádio nao está na Estação CORRETA !!! ");
        } else {
            posicao += 2;            
            if (this.estacao == 20){
                this.ativada = false;
            }
        }
    }
    
    public void estacaodesconectadaRadio(){
        if (this.estacao == 12){
            System.out.println("O Rádio está DESCONECTADO !!! ");
        } else {
            this.estacao -= 2;
            this.ativada = true;
        }
    }
    
    public void status(){
        System.out.println("O Rádio está Ligado? " + this.desligado);
        System.out.println("A Posição é : " + this.posicao);
        
        System.out.println("Estação Conectada: " + this.ativada);
        System.out.println("Estação do Rádio: " + this.estacao);
    }
}