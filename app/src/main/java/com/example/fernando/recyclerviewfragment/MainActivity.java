package com.example.fernando.recyclerviewfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fernando.recyclerviewfragment.Fragment.FragmentTwo;
import com.example.fernando.recyclerviewfragment.Fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnFrag1;
    private boolean select = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrag1 = (Button)findViewById(R.id.btn_main_frag1);

        //Carrega o fragment
        Fragment fragment = new MainFragment();

        //Pega o FragmentManager
        /*A classe FragmentManager permite que você adicione, remova e substitua Fragment no layout de sua Activity de forma dinâmica.
        Ele pode ser acessado em uma Activity através do método getSupportFragmentManager().*/
        FragmentManager fm = getSupportFragmentManager();

        // Abre uma transação e adiciona o a Classe Fragment à ser chamada. ex: FragmentMain() ou FragmentTwo()
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.fragment, new MainFragment());
        ft.commit();

        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFragment();
            }
        });
    }

    public void selectFragment(){
        Fragment fragment;

        if(select == true) {
            fragment = new MainFragment();
            select = false;
            btnFrag1.setText("Fragment1");
        }
        else {
            fragment = new FragmentTwo();
            select = true;
            btnFrag1.setText("Fragment2");
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.fragment, fragment);
        ft.commit();
    }
}
