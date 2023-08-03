package src.Exercice14;

public class MultiplicationTable {
    private int number;

    private MultiplicationTable() {
    }

    public MultiplicationTable(int number) {
        this.number = number;
    }

    public String getTable() {
        StringBuilder table = new StringBuilder();
        table.append("-----------------------------\n");
        table.append("Tabla de multiplicar del ").append(number).append("\n");
        table.append("-----------------------------\n");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            table.append(number).append("\t x \t").append(i).append("\t = \t").append(result).append("\n");
        }

        table.append("-----------------------------");
        return table.toString();
    }
}
