public class ForoMalesHabitos {
    private List<Pair<Usuario, String>> lista_mensajes;
    private Map<Usuario, Integer> dias_sin_actividades_negativas;

    public ForoMalesHabitos() {
        this.lista_mensajes = new ArrayList<>();
        this.dias_sin_actividades_negativas = new HashMap<>();
    }

    public void publicarMensaje(Usuario usuario, String mensaje) {
        this.lista_mensajes.add(new Pair<>(usuario, mensaje));
    }

    public List<Pair<Usuario, String>> obtenerMensajes() {
        return this.lista_mensajes;
    }

    public void registrarDiaPositivo(Usuario usuario) {
        if (this.dias_sin_actividades_negativas.containsKey(usuario)) {
            this.dias_sin_actividades_negativas.put(usuario, this.dias_sin_actividades_negativas.get(usuario) + 1);
        } else {
            this.dias_sin_actividades_negativas.put(usuario, 1);
        }
    }

    public int obtenerDiasSinActividadesNegativas(Usuario usuario) {
        return this.dias_sin_actividades_negativas.getOrDefault(usuario, 0);
    }
}