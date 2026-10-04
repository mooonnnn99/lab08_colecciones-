public class Main {
    public static void main(String[] args){
        
    // ──────────────────────────────────────────
    // Bloque 1: Gestión de roster con arrayList
    // ──────────────────────────────────────────

    GestionGremio gremio = new GestionGremio();
    gremio.agregarMiembro(new Druida("Sylva", 10, 300, 100));
    gremio.agregarMiembro(new Nigromante("Malachar", 8, 250, 120));
    gremio.agregarMiembro(new Arquero("Legolas", 6, 150, "Arco", 20));
    gremio.agregarMiembro(new Guerrero("Thorin", 9, 400, 80, "Hacha"));
    gremio.mostrarRoster();

    gremio.eliminarMiembro("Malachar");
    gremio.mostrarRoster();

    Personaje encontrado = gremio.buscarPorNombre("Legolas");
    if (encontrado != null)
        System.out.println("Encontrado: " + encontrado.getNombre());

    // ──────────────────────────────────────────
    //Bloque 2: Cola de espera con LinkedList
    // ──────────────────────────────────────────

    gremio.encolarSolicitante("Gandalf");
    gremio.encolarSolicitante("Aragorn");
    gremio.encolarSolicitante("Gimli");
    gremio.mostrarCola();

    gremio.atenderSiguiente();   // atiende a Gandalf (FIFO)
    gremio.mostrarCola();

    // ──────────────────────────────────────────
    //Bloque 3: Inventario con HashMap
    // ──────────────────────────────────────────
    gremio.agregarObjeto("Poción de vida", 5);
    gremio.agregarObjeto("Flecha élfica", 30);
    gremio.agregarObjeto("Poción de vida", 3);  // suma → 8

    gremio.mostrarInventario();

    gremio.usarItem("Poción de vida");
    gremio.usarItem("Pergamino de fuego");    // no existe
    gremio.mostrarInventario();

    // ──────────────────────────────────────────
    //Bloque 4: Habilidades unicas con Hashset
    // ──────────────────────────────────────────

    gremio.registrarHabilidad("Curación");
    gremio.registrarHabilidad("Magia oscura");
    gremio.registrarHabilidad("Curación");    // duplicado — no se agrega

    gremio.mostrarHabilidades();

    System.out.println("¿Tiene flecha? " + gremio.tieneHabilidad("Tiro con arco"));
    System.out.println("¿Tiene curación? " + gremio.tieneHabilidad("Curación"));


    // ──────────────────────────────────────────
    //Bloque 5: resumen del gremio
    // ──────────────────────────────────────────

    gremio.mostrarRoster();
    gremio.mostrarCola();
    gremio.mostrarInventario();
    gremio.mostrarHabilidades();
    }
}
