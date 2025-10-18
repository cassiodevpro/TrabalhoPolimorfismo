package usuario;

public class Paciente extends Usuario {

    public Paciente(String nome, String sobrenome, String sexo, int id, int idade){
        super(nome, sobrenome, sexo, id, idade);
    }

    @Override
    public void acessandoSistema() {
        int id = getId();          
        
        String tipoID;            
        
        switch (id) {
            case 1:
                tipoID = "PACIENTE";
                break;
            case 2:
                tipoID = "MEDICO";
                break;
            case 3:
                tipoID = "ADMIN";
                break;
            default:
                System.out.println("caractere invalido");
                return; 
        }

        System.out.println("Acesso concedido com sucesso " 
            + getNome() + " " + getSobrenome()
            + " Sexo: " + getSexo()
            + " ID Paciente: " + id
            + " Tipo ID: " + tipoID
            + " idade: " + getIdade());
    }
}