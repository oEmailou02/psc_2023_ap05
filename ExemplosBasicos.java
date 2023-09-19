public class ExemplosBasicos{
    public static void main(String[] args) {
        // indent (indentação)
        //for, while e do/while
        //repetição manual, não faça isso
        //System.out.println(1);
        //System.out.println(2);
        //repetição controlada por contador
        //declara o contador
        //int cont = 1;
        //while(cont <= 3){//boleana (1 ou 2, verdadeiro ou falso)
            //System.out.print(cont);
            //cont = cont + 1;
        //}

        //for(cont = 1; cont <= 2; cont = cont + 1){
            //System.out.print(cont);
        //}

        int cont = 4;
        do{
            //%d é um placeholder
            System.out.printf("Valor da vez: %d\n", cont);
            cont += 1; //cont = cont + 1;
        }while(cont <= 3);
    }
}