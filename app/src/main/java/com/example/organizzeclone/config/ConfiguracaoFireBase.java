package com.example.organizzeclone.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFireBase {
    private static FirebaseAuth autenticacao;


    //retorna instancia
    public static  FirebaseAuth getAutenticacao() {
        if(autenticacao == null) {
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }
}
