public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private List<Tarea> tareas;

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public List<Tarea> obtenerTareas() {
        return this.tareas;
    }

    // Getters y setters
}