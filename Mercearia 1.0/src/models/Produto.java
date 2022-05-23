package models;

public abstract class Produto {
  
    protected Double minimo;
    protected float valor;
    protected String nome; 
    protected int codigo,numEstoque;
    protected String tipo;
  
    //> metodo construtor
    public Produto(String nome,int codigo, float valor,int numEstoque, Double minimo){
      this.nome = nome;
      this.codigo = codigo;
      this.valor = valor;   
      this.numEstoque = numEstoque;
      this.minimo = minimo;
    }
    
    //> Sets
    public void setNome(String nome){
      this.nome = nome;  
    }
    public void setCodigo(int codigo){
      this.codigo= codigo;  
    }
    public void setValor(float valor){
      this.valor = valor;  
    }
    public void setNumEstoque(int numEstoque){
      this.numEstoque = numEstoque;
    }
    public void setMinimo(Double minimo){
      this.minimo = minimo;
    }
    public void setTipo(String tipo){
      this.tipo = tipo;
    }
  
    //> Gets
    public String getNome(){
      return nome;  
    }
    public int getCodigo(){
      return codigo;  
    }
    public float getValor(){
      return valor;  
    }
    public int getNumEstoque(){
      return numEstoque;
    }
    public Double getMinimo(){
      return minimo;
    }
    public String getTipo(){
      return tipo;
    }
  }
  