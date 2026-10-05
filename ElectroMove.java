import java.util.Scanner;

public class ElectroMove {
        public static void main(String[] args) {

                // Comencem a provar el sistema de gestió de mobilitat elèctrica
                System.out.println("*** ELECTROMOVE SOLUTIONS ***");
                System.out.println("*** SISTEMA DE GESTIÓ DE MOBILITAT ELÈCTRICA ***\n");
                System.out.println("Inicialitzant la xarxa...\n");

                // Anem a crear la ubicació (coordenades) d'un punt de càrrega
                System.out.println("*** CREACIÓ DE LA UBICACIÓ ***\n");
                Coordenades c1 = new Coordenades(41.3874, 2.1686);

                // Anem a mostrar la ubicació creada
                System.out.println("La ubicació del punt de càrrega és: " + c1.toString() + "\n");

                // Anem a crear el punt de càrrega
                System.out.println("*** CREACIÓ DEL PUNT DE CÀRREGA ***\n");
                PuntCarrega pc1 = new PuntCarrega("BCN-001", c1, 128.50, PuntCarrega.CCS);

                // Anem a mostrar el punt de càrrega creat
                System.out.println("\nEl punt de càrrega " + pc1.getIdentificador() + " ha estat creat.\n");
                System.out.println("Les seves dades són: " + pc1.toString() + "\n");

                // Anem a crear un vehicle
                System.out.println("*** CREACIÓ DEL VEHICLE ***\n");
                Vehicle v1 = new Vehicle("1234ABC", "Byd", "Dolphin Surf", 322);
                

                // Anem a mostrar el vehicle
                System.out.println("\nEl vehicle " + v1.getMarca() + " " + v1.getModel() + " ha estat creat.\n");
                System.out.println("Les seves dades són: " + v1.toString() + "\n");

                System.out.println("*** ACTUALITZACIÓ DE L'ESTAT DEL VEHICLE ***\n");

                // Anem a posar en marxa el cotxe
                v1.setEstat(2);
                System.out.println("El vehicle " + v1.getMarca() + " " + v1.getModel() + " està en estat: " + v1.getEstat()
                                                + "\n");

                // Anem a crear un altre punt de càrrega
                System.out.println("*** CREACIÓ DE LA UBICACIÓ ***\n");
                Coordenades c2 = new Coordenades(41.1189, 1.2445);
                System.out.println("*** CREACIÓ DEL PUNT DE CÀRREGA ***\n");
                PuntCarrega pc2 = new PuntCarrega("TAR-001", c2, 128.50, PuntCarrega.TYPE2);

                // Anem a mostrar el punt de càrrega creat
                System.out.println("El punt de càrrega " + pc2.getIdentificador() + " ha estat creat\n");
                System.out.println("Les seves dades són: " + pc2.toString() + "\n");

                // Anem a mostrar la distància entre els dos punts de càrrega
                System.out.println("La distància entre els dos punts de càrrega creats és: " + c1.distancia(c2));


                System.out.println("\n*** FI DE LES PROVES ***\n");

                System.out.println("*** PROVES INTERACTIVES ***\n");

                Scanner scan = new Scanner(System.in);

                System.out.println("*** CREACIÓ DE VEHICLE ***\n");
                System.out.print("Matrícula: ");
                String matricula = scan.nextLine();

                System.out.print("Marca: ");
                String marca = scan.nextLine();

                System.out.print("Model: ");
                String model = scan.nextLine();

                System.out.print("Autonomia (en km): ");
                int autonomia = scan.nextInt();

                // Anem a crear el Vehicle
                Vehicle v2 = new Vehicle(matricula, marca, model, autonomia);
                System.out.println("\nEl vehicle amb matricula " + v2.getMatricula() + " ha estat creat correctament.\n");

                // Anem a mostrar que hem creat el vehicle i quines són les seves dades
                System.out.println("Les seves dades són: " + v2.toString() + "\n");

		// no traieu aquesta línia perquè es necessita per a gestionar l'entrada de dades per teclat
		scan.nextLine();

                System.out.println("*** CREACIÓ DE PUNT DE CÀRREGA ***\n");
                System.out.print("Identificador: ");
                String identificador = scan.nextLine();

                System.out.print("Potència (en kw): ");
                double potencia = scan.nextDouble();

                System.out.println("\t1 - TYPE2\n\t2 - CSS\n\t3 - CHADEMO");
                System.out.print("Connector: ");
                int connector = scan.nextInt();

                System.out.println("Ubicació:");
                System.out.print("\tLatitud: ");
                double latitud = scan.nextDouble();
                System.out.print("\tLongitud: ");
                double longitud = scan.nextDouble();
                
		// Anem a crear les coordenades
                Coordenades c3 = new Coordenades(latitud, longitud);
		// Anem a crear el punt de càrrega
                PuntCarrega pc3 = new PuntCarrega("BCN-002", c3, 57.0, PuntCarrega.CHADEMO);

                System.out.println("El punt de càrrega amb identificador " + pc3.getIdentificador() +
                                " ha estat creat correctament.\n");
                System.out.println("Les seves dades són: " + pc3.toString() + "\n");

                System.out.println("Nombre de vehicles creats: " + Vehicle.getNumVehiclesGestionats() + "\n");
                
                // Anem a mostrar el nombre de punts de càrrega creats
                System.out.println("Nombre de punts de càrrega creats: " + PuntCarrega.numPuntsCarregaGestionats() + "\n");

                System.out.println("\n*** FI PROVES INTERACTIVES ***\n");
                scan.close();
        }

}
