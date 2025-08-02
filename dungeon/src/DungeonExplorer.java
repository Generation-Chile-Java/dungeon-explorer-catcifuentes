import java.util.Scanner;

public class DungeonExplorer {
    private final Player player;
    private final Room[] dungeon;
    private int currentRoomIndex;

    public DungeonExplorer() {
        // Crear jugador
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Mmm? Qué haces aquí?\n" +
                "Sólo un alma curiosa llega a tocar esta puerta......");
        System.out.print("¿Cuál es tu nombre, pequeño/a viajero/a? \n Ingresa tu nombre: ");
        String playerName = scanner.nextLine();
        this.player = new Player(playerName, 100);

        // Construir la mazmorra
        this.dungeon = createDungeon();
        this.currentRoomIndex = 0;
    }

    private Room[] createDungeon() {
        // Crear objetos del juego
        GameObject healthPotion = new HealthPotion(30);
        GameObject sword = new Weapon("Espada de Fuego", 15);
        GameObject goblin = new Enemy("Goblin", 30, 10);
        GameObject skeleton = new Enemy("Esqueleto", 40, 15);
        GameObject dragon = new Enemy("Dragón", 100, 25);

        // Crear salas o cuevas
        Room[] dungeonRooms = {
                new EmptyRoom("La entrada de la mazmorra"),
                new TreasureRoom("Cueva con cofre", healthPotion),
                new EnemyRoom("Cámara de los Goblin", goblin),
                new TreasureRoom("Cueva del tesoro olvidado", sword),
                new EnemyRoom("Cripta del Esqueleto", skeleton),
                new EmptyRoom("Pasillo oscuro"),
                new EnemyRoom("Cueva del Dragón", dragon),
                new TreasureRoom("Cueva del tesoro final", new HealthPotion(50))
        };

        return dungeonRooms;
    }

    public void play() {
        System.out.println("\n¡Bienvenido/a, " + player.getName() + "!");
        System.out.println("Tu objetivo es explorar todas las cuevas de este lugar, y salir con vida, ¿estás listo/a?.");

        Scanner scanner = new Scanner(System.in);

        while (player.isAlive() && currentRoomIndex < dungeon.length) {
            player.showStatus();

            System.out.println("\n---");
            Room currentRoom = dungeon[currentRoomIndex];
            currentRoom.enter(player);

            if (!player.isAlive()) {
                System.out.println("¡Has sido derrotado/a! Fin del juego.");
                break;
            }

            if (currentRoomIndex < dungeon.length - 1) {
                System.out.println("\n¿Qué deseas hacer?");
                System.out.println("1. Ir a la siguiente sala");
                System.out.println("2. Salir y terminar la aventura");

                int choice = scanner.nextInt();
                if (choice == 1) {
                    currentRoomIndex++;
                } else {
                    System.out.println("Así que bandonas la travesía... Esta bien, ¡espero verte una próxima vez!");
                    break;
                }
            } else {
                System.out.println("\n¡Felicidades! Has explorado todas las cuevas. Haz concluido tu viaje");
                break;
            }
        }

        System.out.println("\n=== RESUMEN FINAL ===");
        player.showStatus();
        System.out.println("Cuevas exploradas: " + (currentRoomIndex + 1) + "/" + dungeon.length);
        System.out.println("\n¡Gracias por jugar!");
    }

    public static void main(String[] args) {
        DungeonExplorer game = new DungeonExplorer();
        game.play();
    }
}
