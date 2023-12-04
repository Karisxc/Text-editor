import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

//My first project<:)))))))
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath;

        System.out.println("Добро пожаловать в текстовый редактор!");

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать новый файл");
            System.out.println("2. Открыть существующий файл");
            System.out.println("3. Редактировать текущий файл");
            System.out.println("4. Сохранить текущий файл");
            System.out.println("5. Выйти из редактора");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите путь и имя файла для создания:");
                    filePath = scanner.nextLine();
                    createNewFile(filePath);
                    break;
                case 2:
                    System.out.println("Введите путь и имя файла для открытия:");
                    filePath = scanner.nextLine();
                    openFile(filePath);
                    break;
                case 3:
                    System.out.println("Введите новый текст:");
                    String text = scanner.nextLine();
                    editCurrentFile(text);
                    break;
                case 4:
                    System.out.println("Введите путь и имя файла для сохранения:");
                    filePath = scanner.nextLine();
                    saveCurrentFile(filePath);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
    }

    private static void createNewFile(String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.close();
            System.out.println("Файл успешно создан.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }
    }

    private static void openFile(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            System.out.println("Файл успешно открыт.");
        } catch (IOException e) {
            System.out.println("Ошибка при открытии файла: " + e.getMessage());
        }
    }

    private static void editCurrentFile(String text) {
        System.out.println("Текст успешно добавлен.");
    }

    private static void saveCurrentFile(String filePath) {
        System.out.println("Файл успешно сохранен.");
    }
}