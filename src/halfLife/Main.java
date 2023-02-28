package halfLife;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Player player = new Player();
            // исчисление начинается с 0
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти%n",
                    player.getSlotsCount()
            );
            int slot;

            // TODO главный цикл игры:
            // запрашивать номер с клавиатуры
            // с помощью scanner.nextInt(),
            // пока не будет введено -1
            while (true) {
                System.out.println("Выберите оружие из которого нужно выстрелить или -1...");
                slot = scanner.nextInt();
                if (slot == -1) break;

                player.shotWithWeapon(slot);
            }
            System.out.println("Game over!");
        }
    }
}
