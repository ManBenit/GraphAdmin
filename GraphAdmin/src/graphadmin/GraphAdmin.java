package graphadmin;

import GUI.Message;
import PIE.Adviser;
import PIE.Graph;
import PIE.Member;
import enums.Color;
import enums.Phase;

public class GraphAdmin {
    public static void main(String[] args) {
        //Instancias iniciales de miembros de gráfica
        Member francisco= new Member("Francisco Genaro", "Rodríguez", "Badillo", 45, "La dirección de PAco :v", "Chofer", 6000);
        Member mauro= new Member("Mauro", "dfsdf", "dsdvdvx", 21, "ghjkghjkg", "bvnbvbmvb", 6000);
        Member ruben= new Member("Rubén", "dfsdf", "dsdvdvx", 21, "ghjkghjkg", "bvnbvbmvb", 6000);
        Member lorena= new Member("Lorena", "dfsdf", "dsdvdvx", 21, "ghjkghjkg", "bvnbvbmvb", 6000);
        Member indra= new Member("Indra", "dfsdf", "dsdvdvx", 21, "ghjkghjkg", "bvnbvbmvb", 6000);
        Member sofy= new Member("Sofía", "dfsdf", "dsdvdvx", 21, "ghjkghjkg", "bvnbvbmvb", 6000);
        Member liliana= new Member("Liliana", "dfsdf", "dsdvdvx", 21, "ghjkghjkg", "bvnbvbmvb", 6000);
        Member desconocido= new Member("aún no hay", "dfsdf", "dsdvdvx", 21, "ghjkghjkg", "bvnbvbmvb", 6000);
        Member pablo= new Member("Pablo", "apaternoDepablo", "amaterno de pablo", 55, "La dirección de Pablo :v", "no sé", 6000);
        Member diana= new Member("Diana", "norecuerdo", "tampoocrecuerdo", 24, "pos no sé", "pos no es doctora :v", 6000);
        Member dany= new Member("Daniela", "Chávez", "Gaspar", 24, "jaja no sé", "Doctora", 6000);
        Member eli= new Member("Elizabeth", "Romero", "xcbvbc", 40, "jaja no sé x2", "zcvxcvxc", 6000);
        Member lety= new Member("Leticia", "Javier", "Chavarría", 20, "por olímpica :v", "Asistente", 6000);
        Member lupita= new Member("Guadalupe", "Gómez", "sdfvsdvsd", 65, "mpi", "super npi", 6000);
        Member yomero= new Member("Manuel Emilio", "Benítez", "Morales", 22, "Calle sur 78 mz 125 lt 30 col nvo apseo de san agustín 2a secc", "Técnico en computación", 6000);
        
        
        Adviser silvia= new Adviser("Silvia", "Sánchez", "Negrete", 62, "jaja por los arcos :v", "ama de casa");
        Adviser mijefita= new Adviser("Gabriela", "Morales", "Flemate", 46, "Calle sur 78 mz 125 lt 30 col nvo apseo de san agustín 2a secc", "Consultora de belleza, optometrista, empresaria, n'hombre! puras cosas poderosas");
        Adviser barcenas= new Adviser("Javier", "Bárcenas", "Silva", 60, "jaja no sé", "no sé XD");
        
        //Colores
        silvia.setColor(Color.GREEN);
        mijefita.setColor(Color.BLUE);
        barcenas.setColor(Color.RED);
        
        francisco.setPhase(Phase.YELLOW);
        mauro.setPhase(Phase.YELLOW);
        ruben.setPhase(Phase.YELLOW);
        lorena.setPhase(Phase.YELLOW);
        indra.setPhase(Phase.YELLOW);
        sofy.setPhase(Phase.YELLOW);
        liliana.setPhase(Phase.YELLOW);
        desconocido.setPhase(Phase.YELLOW);
        pablo.setPhase(Phase.GREEN);
        diana.setPhase(Phase.GREEN);
        dany.setPhase(Phase.GREEN);
        eli.setPhase(Phase.GREEN);
        lety.setPhase(Phase.BLUE);
        lupita.setPhase(Phase.BLUE);
        yomero.setPhase(Phase.RED);
        
        //Nombres de gráfica
        silvia.setGraphicName("");
        mijefita.setGraphicName("");
        barcenas.setGraphicName("");
        
        francisco.setGraphicName("Francisco");
        mauro.setGraphicName("Mauro");
        ruben.setGraphicName("Rubén");
        lorena.setGraphicName("Lorena");
        indra.setGraphicName("Indra");
        sofy.setGraphicName("Sofy");
        liliana.setGraphicName("Liliana");
        desconocido.setGraphicName("unknown");
        pablo.setGraphicName("Pablo");
        diana.setGraphicName("Diana");
        dany.setGraphicName("Dany");
        eli.setGraphicName("Elizabeth");
        lety.setGraphicName("Lety");
        lupita.setGraphicName("Lupita");
        yomero.setGraphicName("Emilio");
        
        
        System.out.println(francisco);
        System.out.println(mauro);
        System.out.println(ruben);
        System.out.println(lorena);
        System.out.println(indra);
        System.out.println(sofy);
        System.out.println(liliana);
        System.out.println(desconocido);
        System.out.println(pablo);
        System.out.println(diana);
        System.out.println(dany);
        System.out.println(eli);
        System.out.println(lety);
        System.out.println(lupita);
        System.out.println(yomero);
        
        System.out.println(silvia);
        System.out.println(mijefita);
        System.out.println(barcenas);
        
        //Prueba De gráfica
        Graph graph= new Graph(true, yomero, silvia, mijefita, barcenas);
        System.out.println(graph);
    }
    
}
