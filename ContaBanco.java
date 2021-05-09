
public class ContaBanco {
    
    // Atributos 
    public int numConta;
    protected String tipo;
    private String dono;
    static float saldo= 2000;
    private Boolean status;

    
    
    public void estadoAtual (){
            System.out.println("------------------------------");
            System.out.println("Conta: "+ this.getNumConta());
            System.out.println("Tipo: "+ this.getTipo());
            System.out.println("Dono: "+ this.getDono());
            System.out.println("Saldo: "+ this.getSaldo());
            System.out.println("Status: "+ this.getStatus());
                   
    
    }
    
    public void abrirConta(String t){
      this.setTipo(t);
      this.setStatus(true);
      if (t == "CC"){
          this.setSaldo(50);
      } else if(t== "CP"){
          this.setSaldo(150);
      }
      System.out.println("Conta aberta com Sucesso!");
      }
    
    public void fecharConta(){
      if (this.getSaldo()> 0){
       System.out.println("Conta nao pode ser fechada pq tem saldo.");
      }else if(this.getSaldo()< 0){
       System.out.println("Conta não pode ser fechada pq está em débito");
      }else {
       this.setStatus(false);
       System.out.println("Conta fechada com Sucesso!");
      }
    }
    
    public void depositar(float v){
    if (this.getStatus()){
      this.setSaldo((int) (this.getSaldo()+ v));
      System.out.println("Deposito realizado na conta de "+ this.dono);
    }else {
      System.out.println("Impossivel depositar em uma conta fechada!");
      }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
           if(this.getSaldo()>= v){
           this.setSaldo((int) (this.getSaldo()- v));
           System.out.println("Saque realizado na conta de "+ this.dono);
        }else {
            System.out.println("Saldo insuficiente para saque");
           }
        }else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal(){
      int v=0;
      if (this.getTipo() == "CC"){
         v = 12;   
      }else if (this.getTipo()== "CP"){
      v = 20;
      }
      if (this.getStatus()){
        this.setSaldo((int) (this.getSaldo()- v));
        System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
      }else {
        System.out.println("Impossível pagar uma conta fechada!");
      }
   }
    
    
    
    //Metodo Construtor
    public ContaBanco() {
       this.saldo=0;
       this.status= false;
       
    }
// Metodos Especiais (Gettrs e Settrs)
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int s) {
        this.saldo = s;
    }
    
    public boolean getStatus(){
         return status;
    }
    
    public void setStatus(boolean status ){
         this.status = status;
    }
    
    
    
    
}
