package org.example;

import com.google.gson.GsonBuilder;
import org.example.API.ConsultarApi;
import org.example.modelo.Conversor;
import org.example.DTO.Valores;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppConversor {

    public static void main(String[] args) {




        var menu = new Conversor();

        var entrada = new Scanner(System.in);

        int opc = 0;

        float valor;

//        String direccion = "https://v6.exchangerate-api.com/v6/" + Apikey + "/latest/" + parametro;


            do {
                menu.mostrarMenu();
                opc = entrada.nextInt();

                switch (opc) {


                    case 1:
                        System.out.println("Digite la cantidad");
                        valor =  Math.abs(entrada.nextFloat());
                        menu.DolarToARS(valor);

                        break;
                    case 2:
                        System.out.println("Digite la cantidad");
                        valor =  Math.abs(entrada.nextFloat());
                        menu.ARSToDolar(valor);
                        break;
                    case 3:
                        System.out.println("Digite la cantidad");
                        valor =  Math.abs(entrada.nextFloat());
                        menu.DolarToBRL(valor);
                        break;
                    case 4:
                        System.out.println("Digite la cantidad");
                        valor =  Math.abs(entrada.nextFloat());
                        menu.BRLToDolar(valor);
                        break;
                    case 5:
                        System.out.println("Digite la cantidad");
                        valor =  Math.abs(entrada.nextFloat());
                        menu.DolarToCOP(valor);
                        break;
                    case 6:
                        System.out.println("Digite la cantidad");
                        valor =  Math.abs(entrada.nextFloat());
                        menu.COPToDolar(valor);
                        break;
                    case 7:
                        System.out.println("Gracias vuelva Pronto");
                        break;

                    default:
                        System.out.println("Opcion no valida");

                }


            } while (opc != 7);


//            System.out.println(json);


    }

}