/*

Nesta clase é feito a requisição dos dados na API Olho Vivo.

O objetivc é fazer a autenticação, utilizando o token de acesso, para
conseguir realizar requisições na API.

Os dados são guardados em um Array e são utilizados na MapsActivity.

*/

package com.example.desafioestagio;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;


public class SpTransDados  {

    URL urlAutentication = new URL("http://api.olhovivo.sptrans.com.br/v2.1");
    HttpURLConnection conection = (HttpURLConnection) urlAutentication.openConnection();

    public SpTransDados() throws IOException {
    }
}
