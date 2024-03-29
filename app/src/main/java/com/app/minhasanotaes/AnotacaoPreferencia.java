package com.app.minhasanotaes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencia {

    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private final String NOME_ARQUIVO = "AnotacaoPreferncia";
    private final String CHAVE_NOME = "anotacao";

    public AnotacaoPreferencia(Context c){
        this.context = c;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    public void salvarAnotacao(String anotacao){
        editor.putString(CHAVE_NOME, anotacao);
        editor.commit();
    }

    public String retornarAnotacao(){//nome da chave e o valor default
        return preferences.getString(CHAVE_NOME, "");
    }

}
