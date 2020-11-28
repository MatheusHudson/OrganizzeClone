package com.example.organizzeclone.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.organizzeclone.R;
import com.example.organizzeclone.config.ConfiguracaoFireBase;
import com.example.organizzeclone.ui.CadastroActivity;
import com.example.organizzeclone.ui.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {
private FirebaseAuth autenticacao;

    @Override
    protected void onStart() {
        verificarUsuarioLogado();
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_3)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_4)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_cadastro)
                .canGoForward(false)
                .build()
        );

    }

    public void btCadastrar(View view) {
           startActivity(new Intent(this, CadastroActivity.class));
    }
      public void textLogar(View view) {
          startActivity(new Intent(this, LoginActivity.class));

    }

    public void verificarUsuarioLogado() {
        autenticacao = ConfiguracaoFireBase.getAutenticacao();

        if(autenticacao.getCurrentUser() !=null) {
            abrirTelaHome();
        }
    }

    public void abrirTelaHome() {
        startActivity(new Intent(this,HomeActivity.class));
        finish();
    }

}