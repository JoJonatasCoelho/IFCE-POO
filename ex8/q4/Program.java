class Program{
    public static void main (String[] args) {
        printaIsso("oi ", "como ", "está?");
    }
    static void printaIsso(String...frase){
        for (String palavra : frase ) {
            System.out.print(palavra);
        }

    }
}
