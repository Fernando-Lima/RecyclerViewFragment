package com.example.fernando.recyclerviewfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fernando.recyclerviewfragment.Fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        //Abre uma tranzação e adiciona
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment_container,new MainFragment());
        ft.commit();

        //Substitui um fragment
        //ft.add(R.id.fragment_container,new MainFragment());

        //Remove um fragment
        //Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        //FragmentTransaction ft = fm.beginTransaction();
        //ft.remove(fragment);
        //ft.commit();


    }
}
