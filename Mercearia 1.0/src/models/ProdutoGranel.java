package models;

public class ProdutoGranel extends Produto{
   
    protected String descricao;
    protected int kg, metro;
    protected String tipo = "granel";
    
    //> metodo construtor 
    public ProdutoGranel(String nome, String descricao, float valor,int numEstoque,int kg, int metro,Double minimo, int codigo, String tipo){
     super(nome,codigo,valor,numEstoque,minimo);
     this.kg = kg;
     this.metro = metro;
     this.descricao = descricao;
     this.tipo = tipo;
    } 
    
    //> Sets
    
    public void setKg(int kg){
        this.kg = kg;
    } 
    public void setMetro(int metro){
        this.metro = metro;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    //> Gets
    
    public int getKg(){
        return kg;
    }
    public int getMetro(){
        return metro;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getTipo(){
        return tipo;
    }
    
    //>To String
    
    @Override
    public String toString() {
       return "nome: "+nome+ " descricao: "+descricao+ " valor: "+valor+ " Numero no estoque: "+numEstoque+ " Numero de Quilos: "+kg+" Numero de metros: "+metro+" codigo: "+codigo+" Numero minimo para vendas: "+minimo;  
    }

}