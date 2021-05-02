package exercicioaula_3004;

public final class LigaDesligaRadio {
    
    private int posicao;
    private boolean ligado;
    private int estacao;
    private boolean ativada;
    
    public LigaDesligaRadio() {
        this.posicao = 0;
        this.ligado = true;
        this.estacao = 0;
        this.ativada = true;
    }
    
    public LigaDesligaRadio(int posicao, int estacao) {
        this.setPosicao(posicao);
        this.setEstacao(estacao);
    }
    
    public int getPosicao() {
        return this.posicao;
    }
    
    public int getEstacao() {
        return this.estacao;
    }
    
    public void setPosicao(int posicao) {
        if (posicao >= 0 && posicao <= 4){
            this.posicao = posicao;
        
            if (this.posicao == 4){
                this.ligado = false;
            } else {
                this.ligado = true;
            }
        } else {
            System.out.println("Posição deve ser Entre 0 e 4!!");
        }
    }
    
    public void setEstacao(int estacao) {
        if (estacao >= 0 && estacao <= 20){
            this.estacao = estacao;
        
            if (this.estacao == 20){
                this.ativada = false;
            } else {
                this.ativada = true;
            }
        } else {
            System.out.println("Estação deve estar Entre 0 e 20!!");
        }
    }
    
    public void ligarRadio(){
        if (posicao >= 4){
            this.ligado = false;
            System.out.println("O Rádio já está DESLIGADO!!! ");
        } else {
            posicao += 2;
            
            if (this.posicao == 4){
                this.ligado = false;
            }
        }
    }
    
    public void desligarRadio(){
        if (this.posicao <= 0){
            System.out.println("O Rádio já está LIGADO!!! ");
        } else {
            this.posicao -= 2;
            this.ligado = true;
        }
    }
    
    public void status(){
        System.out.println("Rádio Ligado? " + this.ligado);
        System.out.println("Posição: " + this.posicao);
        
        System.out.println("Estação do Rádio: " + this.estacao);
        System.out.println("Estação Conectada: " + this.ativada);
    }
}