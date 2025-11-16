package org.example.modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.API.ConsultarApi;
import org.example.DTO.Valores;
import org.example.Interfaz.MetodosDeConveresion;

public class Conversor implements MetodosDeConveresion {

    ConsultarApi consultarapi = new ConsultarApi();

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    String valorApi;

    float Resultado;

    public void mostrarMenu() {

        String Menu = """
                                
                *************************************************
                Sea Bienvenido al Conversor de Monedas
                1) Dolar --> Peso Argetino 
                2) Peso Argetino --> Doalar 
                3) Dolar --> Real Brasileno 
                4) Real Brasileno --> Dolar
                5) Dolar --> Peso Colomiano
                6) Peso Colomiano --> Dolar 
                7) Salir 
                                
                Elija la opcion Valida:
                *************************************************       
                """;

        System.out.println(Menu);

    }

    @Override
    public void DolarToARS(float cantidad) {


        valorApi = consultarapi.AccederApi("ARS");

        Valores valores = gson.fromJson(valorApi, Valores.class);

        Resultado = (valores.conversion_rate()) * cantidad;


        System.out.println("La Conversion de USD " + cantidad + " a ARS es : " + Resultado);


//        System.out.println("La Conversion de USD " + valor + " a ARS es : " + Resultado);


    }

    @Override
    public void ARSToDolar(float cantidad) {

        valorApi = consultarapi.AccederApiPorPares("ARS");

        Valores valores = gson.fromJson(valorApi, Valores.class);

        Resultado = (valores.conversion_rate()) * cantidad;


        System.out.println("La Conversion de ARS " + cantidad + " a USD es : " + Resultado);

    }

    @Override
    public void DolarToBRL(float cantidad) {

        valorApi = consultarapi.AccederApi("BRL");

        Valores valores = gson.fromJson(valorApi, Valores.class);

        Resultado = (valores.conversion_rate()) * cantidad;

        System.out.println("La Conversion de USD " + cantidad + " a ARS es : " + Resultado);


    }

    @Override
    public void BRLToDolar(float cantidad) {

        valorApi = consultarapi.AccederApiPorPares("BRL");

        Valores valores = gson.fromJson(valorApi, Valores.class);

        Resultado = (valores.conversion_rate()) * cantidad;


        System.out.println("La Conversion de BRL " + cantidad + " a USD es : " + Resultado);

    }

    @Override
    public void DolarToCOP(float cantidad) {

        valorApi = consultarapi.AccederApi("COP");

        Valores valores = gson.fromJson(valorApi, Valores.class);

        Resultado = (valores.conversion_rate()) * cantidad;

        System.out.println("La Conversion de USD " + cantidad + " a ARS es : " + Resultado);


    }

    @Override
    public void COPToDolar(float cantidad) {

        valorApi = consultarapi.AccederApiPorPares("COP");

        Valores valores = gson.fromJson(valorApi, Valores.class);

        Resultado = (valores.conversion_rate()) * cantidad;


        System.out.println("La Conversion de COP " + cantidad + " a USD es : " + Resultado);

    }
}
