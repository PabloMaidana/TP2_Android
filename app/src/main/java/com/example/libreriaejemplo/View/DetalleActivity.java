package com.example.libreriaejemplo.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.libreriaejemplo.Model.Libro;
import com.example.libreriaejemplo.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {

    private ActivityDetalleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Libro libro = (Libro) getIntent().getSerializableExtra("libro");

        if (libro != null) {
            binding.tvTitulo.setText(libro.getTitulo());
            binding.tvAutor.setText(libro.getAutor());
            binding.tvDescripcion.setText(libro.getDescripcion());
            binding.imgPortada.setImageResource(libro.getPortada());
        }
    }
}