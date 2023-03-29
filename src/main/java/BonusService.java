public class BonusService {
    public int calcBonus(int salary, int expenses, int remainder) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money < remainder) {
                money = money + salary - expenses;
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

