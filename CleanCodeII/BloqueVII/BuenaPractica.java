package BloqueVII;

public class BuenaPractica {

    public static class ServicioEmail {
        public void enviarEmailBienvenida(String email) {
            System.out.println("Email enviado a: " + email);
        }
    }

    public static class RegistroActividad {
        public void registrarActividad(String usuario, String actividad) {
            System.out.println("Actividad registrada: " + actividad + " - " + usuario);
        }
    }

    public static class Usuario {
        private final String nombre;
        private final String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }

        public String getNombre() {
            return nombre;
        }

        public String getEmail() {
            return email;
        }
    }

    private final ServicioEmail servicioEmail;
    private final RegistroActividad registroActividad;

    public BuenaPractica(ServicioEmail servicioEmail, RegistroActividad registroActividad) {
        this.servicioEmail = servicioEmail;
        this.registroActividad = registroActividad;
    }

    public void crearUsuario(Usuario usuario) {
        System.out.println("Usuario creado: " + usuario.getNombre());
        servicioEmail.enviarEmailBienvenida(usuario.getEmail());
        registroActividad.registrarActividad(usuario.getNombre(), "Usuario creado");
    }

    public static void main(String[] args) {
        ServicioEmail servicioEmail = new ServicioEmail();
        RegistroActividad registroActividad = new RegistroActividad();
        BuenaPractica gestorUsuarios = new BuenaPractica(servicioEmail, registroActividad);
        Usuario usuario = new Usuario("Juan", "juan@example.com");
        gestorUsuarios.crearUsuario(usuario);
    }
}