public class Usuario {

    private Sting nome;
    private Sting sobrnome;
    private String sexo;
    private int id;
    private int idade;

    @Override
    public Usuario(String nome, String sobrenome, String sexo, int id, int idade){
        this.nome = nome;
        this.sobrnome = sobrenome;
        this.sexo = sexo;
        this.id = id;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

     public String getSobrenome(){
        return sobrnome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrnome = sobrenome;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(int sexo){
        this.sexo = sexo;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public void acessandoSistema(){
        System.out.println("Acesso concedido com sucesso" + nome);
    }
    
    @Override
    public int acessandoPorId (String nome){
        return id;
    }

}
