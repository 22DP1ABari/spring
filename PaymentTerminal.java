public class PaymentTerminal {

    private double money; 
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            this.affordableMeals += 1;
            this.money += 2.50;
            payment -= 2.50;
            return payment;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.heartyMeals += 1;
            this.money += 4.30;
            payment -= 4.30;
            return payment;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            this.affordableMeals += 1;
            card.takeMoney(2.50);
            return true;
        }

        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            this.heartyMeals += 1;
            card.takeMoney(4.30);
            return true;
        }

        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            this.money = this.money + sum;
            card.addMoney(sum);
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
