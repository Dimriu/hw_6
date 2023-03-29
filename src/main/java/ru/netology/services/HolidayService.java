package ru.netology.services;
public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {

            if (money < threshold) {
                money = money + income - expenses;
            } else {
                money = money - expenses;
                int temp = money / 3 * 2;
                money = money - temp;
                count++;
            }
        }
        return count;
    }

}
