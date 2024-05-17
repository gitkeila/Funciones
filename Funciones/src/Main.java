//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //Llamar Funcion con parametros y no retorno
        float a=3.5f;
        numCubo(a);
        
    //Llamar Funcion con parametros y retorno

        System.out.println(numCubo1(a));

    //Llamar Funcion sin parametros y retorno
        float b= numCubo();
        System.out.println(b);

     //Llamar  funcion sin parametros y sin retorno

       numCubo1();


    }

    //Funcion con parametros y no retorno

    public static void numCubo(float a){
        a= a*a*a;
        System.out.println(a);
    }
    //Funcion con parametros y retorno
    public static float numCubo1(float a){
        a = a*a*a;
        return a;
    }
    //Funcion sin parametros y retorno

    public static float numCubo(){
        float num= 3;
        return num*num*num;
    }

    //Funcion sin parametros y sin retorno

    public static void numCubo1(){
        float a=3.5f;
        a= a*a*a;
        System.out.println(a);
    }

}
