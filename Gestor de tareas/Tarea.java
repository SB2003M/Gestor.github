public class Tarea {
    private String descripcion;
    private String categoria;
    private String recordatorio;
    private String notificacion;

    public Tarea(String descripcion, String categoria, String recordatorio, String notificacion) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.recordatorio = recordatorio;
        this.notificacion = notificacion;
    }

    public String obtenerNotificacion() {
        return this.notificacion;
    }

    public void establecerNotificacion(String nuevaNotificacion) {
        this.notificacion = nuevaNotificacion;
    }

    public String obtenerCategoria() {
        return this.categoria;
    }

    public void establecerCategoria(String nuevaCategoria) {
        this.categoria = nuevaCategoria;
    }

    public String obtenerRecordatorio() {
        return this.recordatorio;
    }

    public void establecerRecordatorio(String nuevoRecordatorio) {
        this.recordatorio = nuevoRecordatorio;
    }

    // Getters y setters
}