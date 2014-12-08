import javax.swing.*;

public class Manager {
// Главный метод.
// Создание меню для взаимодействия с пользователем.

    public static void main(String[] args) {
        Procedures method = new Procedures(); // Создание объекта класса procedures.
        JOptionPane.showMessageDialog(null, "Здравствуйте! Вы работаете с калькулятором матриц." + "\n" + "\n" + "Выберете нужную Вам операцию, а затем следуйте указаниям.");
        while (true) {
            String text = "Введите соответствующую цифру:" + "\n" + "\n" + "1 - Определитель" + "\n" + "2 - Сумма" + "\n" + "3 - Разность" + "\n" + "4 - Произведение" + "\n" + "5 - Транспонирование" + "\n" + "\n" + "0 - для выхода из программы";
            int h = Integer.parseInt(JOptionPane.showInputDialog(text));
            switch (h) {
// Вычисление определителя
                case 1:
                    method.determinant();
                    break;
// Сумма
                case 2:
                    method.summation();
                    break;
// Разность
                case 3:
                    method.subtraction();
                    break;
// Произведение
                case 4:
                    method.multiplication();
                    break;
// Транспонирование
                case 5:
                    method.transposition();
                    break;
// Выход из программы
                case 0:
                    JOptionPane.showMessageDialog(null, "Спасибо за использование программы!" + "\n" + "\n" + "Автор: Морина А.И., гр. ИСБ-3-12");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Такого пункта не существует! Введите заново!");
            }
        }
    }
}

