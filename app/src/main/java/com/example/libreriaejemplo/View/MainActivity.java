package com.example.libreriaejemplo.View;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.libreriaejemplo.ViewModel.MainViewModel;
import com.example.libreriaejemplo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        vm = new ViewModelProvider(this).get(MainViewModel.class);
        setContentView(binding.getRoot());

        // Observa los resultados de la búsqueda
        vm.getmLibro().observe(this, libro -> {
            if (libro != null) {
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("libro", libro);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Libro no encontrado", Toast.LENGTH_SHORT).show();
            }
        });

        // Acción del botón
        binding.btBuscar.setOnClickListener(v ->
                vm.buscarLibro(binding.etTitulo.getText().toString())
        );
    }
}