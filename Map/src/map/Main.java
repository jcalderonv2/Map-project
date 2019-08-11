package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    static Dijkstra dijkstra = new Dijkstra();
    static Vertex v1 = new Vertex("Canada");
    static Vertex v2 = new Vertex("Estados unidos");
    static Vertex v3 = new Vertex("Mexico");
    static Vertex v4 = new Vertex("Colombia");
    static Vertex v5 = new Vertex("Peru");
    static Vertex v6 = new Vertex("Brasil");
    static Vertex v7 = new Vertex("Chile");
    static Vertex v8 = new Vertex("Uruguay");
    static Vertex v9 = new Vertex("Argentina");
    static Vertex v10 = new Vertex("Islandia");
    static Vertex v11 = new Vertex("Inglaterra");
    static Vertex v12 = new Vertex("Portugal");
    static Vertex v13 = new Vertex("Senegal");
    static Vertex v14 = new Vertex("Finlandia");
    static Vertex v15 = new Vertex("Alemania");
    static Vertex v16 = new Vertex("Espana");
    static Vertex v17 = new Vertex("Madagascar");
    static Vertex v18 = new Vertex("India");
    static Vertex v19 = new Vertex("Rusia");
    static Vertex v20 = new Vertex("Mongolia");
    static Vertex v21 = new Vertex("China");
    static Vertex v22 = new Vertex("Japon");
    static Vertex v23 = new Vertex("Indonesia");
    static Vertex v24 = new Vertex("Australia");
    static Vertex v25 = new Vertex("Nueva Zelanda");
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        mainMenu();

    }

    public static void mainMenu() throws IOException {

        String option;

        do {

            out.println("----MENU PRINCIPAL DEL MAPA----");
            out.println();
            out.println("1.  Ruta mas corta.");
            out.println("2. Salir.");
            out.println();
            out.println(" Digite la opcion: ");
            out.println();
            option = in.readLine();
            out.println();
            processMainMenu(option);
            out.println();

        } while (!"2".equals(option));

    }

    static void processMainMenu(String popc) throws IOException {

        switch (popc) {

            case "1": //registrar medico	

                shortestPath();

                break;

            case "2": //salir

                out.println("MUCHAS GRACIAS.");
                break;

            default: //Cualquier otro valor 

                out.println("Opcion invalida");
                out.println();
                break;

        }

    }

    public static void shortestPath() throws IOException{

     
        
        generateEdges();
        dijkstra.computePath(v1);

        System.out.println(dijkstra.getShortestPathTo(v25));

    }

    public static void generateEdges() {

        v1.addNeighbour(new Edge(2.258, v1, v2)); // Canada - USA
        v1.addNeighbour(new Edge(3.622, v1, v3)); // Canada - Mexico
        v1.addNeighbour(new Edge(4.469, v1, v10)); // Canada - Islandia

        v2.addNeighbour(new Edge(1.630, v2, v3)); // USA - Mexico
        v2.addNeighbour(new Edge(7.308, v2, v12)); // USA - Portugal
        v2.addNeighbour(new Edge(6.821, v2, v11)); // USA - Inglaterra

        v3.addNeighbour(new Edge(3.622, v3, v1)); // Mexico - Canada
        v3.addNeighbour(new Edge(1.630, v3, v2)); // Mexico - USA
        v3.addNeighbour(new Edge(3.692, v3, v4)); // Mexico - Colombia
        v3.addNeighbour(new Edge(4.714, v3, v5)); // Mexico - Peru

        v4.addNeighbour(new Edge(3.692, v4, v3)); // Colombia - Mexico
        v4.addNeighbour(new Edge(1.530, v4, v5)); // Colombia - Peru
        v4.addNeighbour(new Edge(3.230, v4, v6)); // Colombia - Brasil

        v5.addNeighbour(new Edge(1.530, v5, v4)); // Peru - Colombia
        v5.addNeighbour(new Edge(4.714, v5, v3)); // Peru - Mexico
        v5.addNeighbour(new Edge(2.571, v5, v6)); // Peru - Brasil
        v5.addNeighbour(new Edge(2.962, v5, v7)); // Peru - Chile

        v6.addNeighbour(new Edge(3.230, v6, v4));// Brasil - Colombia
        v6.addNeighbour(new Edge(2.571, v6, v5));// Brasil - Peru
        v6.addNeighbour(new Edge(2.068, v6, v8));// Brasil - Uruguay

        v7.addNeighbour(new Edge(2.962, v7, v5));// Chile - Peru
        v7.addNeighbour(new Edge(1.491, v7, v8));// Chile - Uruguay
        v7.addNeighbour(new Edge(765, v7, v9));// Chile - Argentina

        v8.addNeighbour(new Edge(2.068, v8, v6));// Uruguay - Brasil
        v8.addNeighbour(new Edge(1.491, v8, v7));// Uruguay - Chile
        v8.addNeighbour(new Edge(965, v8, v9));// Uruguay - Argentina
        v8.addNeighbour(new Edge(10.005, v8, v17));// Uruguay - Madagascar

        v9.addNeighbour(new Edge(765, v9, v7));// Argentina - Chile
        v9.addNeighbour(new Edge(965, v9, v8));// Argentina - Uruguay

        v10.addNeighbour(new Edge(1.361, v10, v11)); // Islandia - Inglaterra
        v10.addNeighbour(new Edge(2.200, v10, v14));// Islandia - Finlandia
        v10.addNeighbour(new Edge(4.469, v10, v1));// Islandia - Canada

        v11.addNeighbour(new Edge(1.361, v11, v10));// Inglaterra - Islandia
        v11.addNeighbour(new Edge(1.809, v11, v12));// Inglaterra - Portugal
        v11.addNeighbour(new Edge(6.821, v11, v2));// Inglaterra - USA

        v12.addNeighbour(new Edge(1.809, v12, v11));// Portugal - Inglaterra
        v12.addNeighbour(new Edge(7.308, v12, v2));// Portugal - USA
        v12.addNeighbour(new Edge(2.831, v12, v13));// Portugal - Senegal
        v12.addNeighbour(new Edge(399, v12, v16));// Portugal - Espana

        v13.addNeighbour(new Edge(2.831, v13, v12));// Senegal - Portugal
        v13.addNeighbour(new Edge(3.064, v13, v16));// Senegal - Espana
        v13.addNeighbour(new Edge(7.655, v13, v17));// Senegal - Madagascar

        v14.addNeighbour(new Edge(2.200, v14, v10));// Finlandia - Islandia 
        v14.addNeighbour(new Edge(3.919, v14, v19));// Finlandia - Rusia
        v14.addNeighbour(new Edge(1.510, v14, v15));// Finlandia - Alemania
        v14.addNeighbour(new Edge(5.953, v14, v21));// Finlandia - China

        v15.addNeighbour(new Edge(1.510, v15, v14));// Alemania - Finlandia
        v15.addNeighbour(new Edge(1.613, v15, v16));// Alemania - Espana
        v15.addNeighbour(new Edge(6.743, v15, v18));// Alemania - India

        v16.addNeighbour(new Edge(399, v16, v12));// Espana - Portugal
        v16.addNeighbour(new Edge(3.064, v16, v13));// Espana - Senegal
        v16.addNeighbour(new Edge(1.613, v16, v15));// Espana - Alemania
        v16.addNeighbour(new Edge(7.931, v16, v18));// Espana - India

        v17.addNeighbour(new Edge(10.005, v17, v8));// Madagascar - Uruguay
        v17.addNeighbour(new Edge(7.655, v17, v13));// Madagascar - Senegal
        v17.addNeighbour(new Edge(8.819, v17, v24));// Madagascar - Australia

        v18.addNeighbour(new Edge(6.743, v18, v15));// India - Alemania
        v18.addNeighbour(new Edge(7.931, v18, v16));// India - Espana
        v18.addNeighbour(new Edge(4.479, v18, v23));// India - Indonesia

        v19.addNeighbour(new Edge(3.919, v19, v14));// Rusia - Finlandia
        v19.addNeighbour(new Edge(1.631, v19, v20));// Rusia - Mongolia
        v19.addNeighbour(new Edge(3.624, v19, v22));// Rusia - Japon

        v20.addNeighbour(new Edge(1.631, v20, v19));// Mongolia - Rusia
        v20.addNeighbour(new Edge(1.222, v20, v21));// Mongolia - China
        v20.addNeighbour(new Edge(3.065, v20, v22));// Mongolia - Japon

        v21.addNeighbour(new Edge(1.222, v21, v20));// China - Mongolia
        v21.addNeighbour(new Edge(5.953, v21, v14));// China - Finlandia

        v22.addNeighbour(new Edge(3.624, v22, v19));// Japon - Rusia
        v22.addNeighbour(new Edge(3.065, v22, v20));// Japon - Mongolia
        v22.addNeighbour(new Edge(4.815, v22, v23));// Japon - Indonesia

        v23.addNeighbour(new Edge(4.479, v23, v18));// Indonesia - India
        v23.addNeighbour(new Edge(4.815, v23, v22));// Indonesia - Japon
        v23.addNeighbour(new Edge(7.543, v23, v25));// Indonesia - Nueva zelanda

        v24.addNeighbour(new Edge(8.819, v24, v17));// Australia - Madagascar
        v24.addNeighbour(new Edge(4.152, v24, v25));// Australia - Nueva Zelanda

        v25.addNeighbour(new Edge(7.543, v25, v23));// Nueva zelanda - Indonesia
        v25.addNeighbour(new Edge(4.152, v25, v24));// Nueva zelanda - Australia

    }

}
