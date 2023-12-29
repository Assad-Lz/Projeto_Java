import java.util.Scanner;

class Demo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        

        String [] menu = {"Cheeseburger",
        "Hambúrguer simples",
        "Cheeseburguer com bacon",
        "Hambúrguer duplo",
        "X-Bacon",
        "X-Burger",
        "X-Tudo",
        "Vegetariano",
        "Vegano",
        "Frango grelhado",
        }

        int numeroPedido = sc.nextInt();

        switch(numeroPedido){
            case 1:
            System.out.println(menu[0]);
            break;
            case 2:
            System.out.println(menu[1]);
            break;
            case 3:
            System.out.println(menu[2]);
            break;
            case 4:
            System.out.println(menu[3]);
            break;
            case 5:
            System.out.println(menu[4]);
            break;
            case 6:
            System.out.println(menu[5]);
            break;
            case 7:
            System.out.println(menu[6]);
            break;
            case 8:
            System.out.println(menu[7]);
            break;
            case 9:
            System.out.println(menu[8]);
            break;
            case 10:
            System.out.println(menu[9]);
            break;
        }


    }
}