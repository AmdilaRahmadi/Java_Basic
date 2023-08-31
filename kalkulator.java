import java.util.Scanner;
import java.lang.Math;


public class kalkulator{
    static String simbol;
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args){
        input();
    }

    static void input(){
        System.out.print("Masukkan simbol : "); 
        simbol = key.next();

        switch(simbol){
            case "+" : tambah(); break;
            case "-" : kurang(); break;
            case "*" : kali(); break;
            case "/" : bagi(); break;
            case "p" : prima(); break;
            case "%" : modulus(); break;
            case "^" : pangkat(); break;
            case "!" : faktorial(); break;
            case "xy" : PersamaanKuadrat(); break;
            //case "rt" : akar(); break;
            case "end" : System.exit(0);
            default : System.out.println("ERROR");
        }
        input();
    }

    static void tambah(){
        Float a,b;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan angka pertama  : ");
        a = key.nextFloat();
        System.out.print("Ketikkan angka kedua : ");
        b = key.nextFloat();
        System.out.println("Hasilnya adalah  : " + (a+b) );
    }

    static void kurang(){
        float a,b;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan angka pertama  : ");
        a = key.nextFloat();
        System.out.print("Ketikkan angka kedua : ");
        b = key.nextFloat();
        System.out.println("Hasilnya adalah  : " + (a-b) );
    }

    static void kali(){
        Float a,b;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan angka pertama  : ");
        a = key.nextFloat();
        System.out.print("Ketikkan angka kedua : ");
        b = key.nextFloat();
        System.out.println("Hasilnya adalah  : " + (a*b) );
    }

    static void bagi(){
        Float a,b;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan angka pertama  : ");
        a = key.nextFloat();
        System.out.print("Ketikkan angka kedua : ");
        b = key.nextFloat();
        System.out.println("Hasilnya adalah  : " + (a/b) );
    }

    static void prima(){
        int a;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan angka  : ");
        a = key.nextInt();
        if((a == 2 | a == 3 | a == 5 | a == 7) | (a%2 != 0  & a%3 != 0 & a%5 != 0 & a%7 != 0) ){
            System.out.println("Bilangan " + a + " adalah prima");
        }
        else{
            System.out.println("Bilangan " + a + " bukan prima");
        }
    }

    static void modulus(){
        int a,b;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan angka pertama  : ");
        a = key.nextInt();
        System.out.print("Ketikkan angka kedua : ");
        b = key.nextInt();
        System.out.println("Hasilnya adalah  : " + (a%b) );
    }

    static void pangkat(){
        float a,b,c = 1;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan angka pertama  : ");
        a = key.nextFloat();
        System.out.print("Ketikkan angka kedua : ");
        b = key.nextFloat();
        for(int i = 0; i < b; i++){
            c = c*a;
        }
        System.out.println("Hasilnya adalah  : " + c );
    }

    static void faktorial(){
        int a, b = 1;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan angka : ");
        a = key.nextInt();
        if(a <= 1){
            System.out.println("Hasilnya adalah : " + a);
        }
        else{
            for(int i = 1; i < a; i++){
            b = b*a;
            a--;
            }
            System.out.println("Hasilnya adalah : " + b);
        }
    }

    static void PersamaanKuadrat(){
        double a,b,c,x1,x2;
        Scanner key = new Scanner(System.in);
        System.out.print("Ketikkan koef x^2 : ");
        a = key.nextDouble();
        System.out.print("Ketikkan koef x : ");
        b = key.nextDouble();
        System.out.print("Ketikkan konst : ");
        c = key.nextDouble();
        
        x1 = (-b + (Math.sqrt(b*b - 4*a*c)))/(2*a);
        x2 = (-b - (Math.sqrt(b*b - 4*a*c)))/(2*a);
        if(x1 == x2){
            System.out.println("Hasilnya adalah : " + x1);
        }
        else{
            System.out.println("Hasilnya adalah : " + x1 + " atau " + x2);
        }
    }

    static void akar(){
        
    }

    static void perbandingan(){

    }
    
}