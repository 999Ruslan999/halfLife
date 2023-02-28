package halfLife;

import halfLife.weapons.*;
public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                new Gun(),
        new AK74(),
        new Grenade(),
        new WaterGun()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль

        // Получаем оружие из выбранного слота

        if (slot < 0 || slot >= weaponSlots.length) {
            System.out.println("Нет такого оружия");
            return;
        }
        Weapon weapon = weaponSlots[slot];

        weapon.shot();
    }
}
