package app;

// Клас розрахунку вартості товару, враховуючи вартість доставки
// Успадковує клас CalcCostBase.
public class CalcCostDelivery extends CalcCostBase {

    // Вартість доставки
    private final static double deliveryPrice = 7.0; // Наприклад, фіксована вартість доставки

    // Розрахунок вартості товару з урахуванням доставки
    @Override
    public double calcCost(Product product) {
        // Викликаємо метод calcCost з базового класу для отримання базової вартості
        double baseCost = super.calcCost(product);
        return baseCost + deliveryPrice; // Додаємо вартість доставки
    }
}
