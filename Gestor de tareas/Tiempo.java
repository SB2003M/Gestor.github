public class Tiempo {
    private List<Evento> eventos;

    public Tiempo() {
        this.eventos = new ArrayList<>();
    }

    public void agregar_evento(Evento evento) {
        this.eventos.add(evento);
    }

    public List<Evento> obtener_eventos()