// import RandomSequence.ExportType;

public class linventif {
    private static final Boolean devMode = true;
    public static void main(String[] args) {
        if (!devMode) {
            System.out.println("Hello World");
            String[] test = new String[]{"hello", "word"};
            System.out.println(test[1]);
        } else {
            // String[] test = new String[]{"Java", "C", "Php"};
            // Parameter.main(test);
            // RandomSequence.main(10, 2, "REAL");
            int[][] test = new int[][]{
                {1, 2},
                {2, 0},
            };
            Irregular ir = new Irregular(test);
            ir.display();
        }
    }
    public static void PrintTable(String[] table){
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }
}
