/*
* Класс JavaMap
* version - 1.1
* Авторское право: все мое.
*/
package map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Программа ждет на вход количество пользователей и логин
 * и пароль для каждого.
 * Далее запрашивает логин польозвателя
 * и по нему выводит пароль этого пользователя.
 * @version 1.1 13 Apr 2019
 * @author Pavel Samotaev
 */
public final class JavaMap {
    private JavaMap() { }
    public static void main(final String[] args) {

        HashMap<String, String> dataBase = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введи количество пользователей");
        int numberOfUsers = in.nextInt();
        if (numberOfUsers <= 0) {
            return;
        }
        for (int i = 0; i <= numberOfUsers; i++) {
            String login;
            String password;
            if (i == 0) {
                in.nextLine();
                continue;
            }
            System.out.println("Введи логин " + i + "ого пользователя");
            login = in.nextLine();
            System.out.println("Введи пароль " + i + "ого пользователя");
            password = in.nextLine();
            dataBase.put(login, password);
        }
        System.out.println("Введи логин пользователя,"
               + " чей пароль хочешь посмотреть");
        String login = in.nextLine();
        System.out.println("Пароль: " + dataBase.get(login));
    }
}
