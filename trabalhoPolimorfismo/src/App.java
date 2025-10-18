import usuario.Admin;
import usuario.Medico;
import usuario.Paciente;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente paciente = new Paciente("Carlos", "Henrique", "M", 1, 27);
        paciente.acessandoSistema();
        Medico medico = new Medico("Cassio", "Moreira", "M", 2, 37);
        medico.acessandoPorId("2");
        medico.acessandoSistema();
        Admin admin = new Admin("Cassito", "Souza", "M", 3, 37);
        admin.acessandoSistema();

    }
}
