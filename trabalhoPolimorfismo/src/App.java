import usuario.Usuario; 
public class App {
    public static void main(String[] args) throws Exception {
    Usuario usuario = new Usuario(
        "Carlos"
        , "Henrique"
        , "M"
        , 84729
        , 27
        ); 

        usuario.setNome("Carlos");
        usuario.getNome();

    }
}
