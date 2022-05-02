public class Main {
    public static void main(String[] args) {
        int startingScore = 100; // сумма на счету
        int replenishmentAmount = 1100; // сумма пополнения
        int bonus;
        int grandTotal;

        if (replenishmentAmount < 1000) {
            bonus = 0;
            grandTotal = bonus + replenishmentAmount + startingScore;
            System.out.println(grandTotal);
        } else {
            bonus = replenishmentAmount / 100;
            grandTotal = bonus + replenishmentAmount + startingScore;
            System.out.println(grandTotal);
        }

    }


}
