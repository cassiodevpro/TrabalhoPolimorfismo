package usuario; 
public class Admin extends Usuario {  

   public Admin(String nome, String sobrenome, String sexo, int id, int idade){
        super(nome, sobrenome, sexo, id, idade); 
    } 

       @Override
    public void acessandoSistema() {
        int id = getId();           
        String papel;              

        switch (id) {
            case 1:
                papel = "PACIENTE";
                break;
            case 2:
                papel = "MEDICO";
                break;
            case 3:
                papel = "ADMIN";
                break;
            default:
                System.out.println("caractere invalido");
                return;  
        }

        System.out.println("Acesso concedido com sucesso " 
            + getNome() + " " + getSobrenome()
            + " Sexo: " + getSexo()
            + " ID Admin: " + id
            + " Tipo ID: " + papel
            + " idade: " + getIdade());
    }

}
