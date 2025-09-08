package com.example.libreriaejemplo.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.libreriaejemplo.Model.Libro;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private MutableLiveData<Libro> mLibro;
    private List<Libro> libros;

    public MainViewModel(@NonNull Application application) {
        super(application);

        libros = new ArrayList<>();

        libros.add(new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                "La historia de la familia Buendía en Macondo."
        ));

        libros.add(new Libro(
                "Rayuela",
                "Julio Cortázar",
                "Novela experimental que rompe la narrativa tradicional."
        ));

        libros.add(new Libro(
                "La sombra del viento",
                "Carlos Ruiz Zafón",
                "Un joven descubre un libro misterioso en la Barcelona de posguerra."
        ));

        libros.add(new Libro(
                "Los detectives salvajes",
                "Roberto Bolaño",
                "Dos poetas buscan a una escritora desaparecida."
        ));

        libros.add(new Libro(
                "El Señor de los Anillos",
                "J.R.R. Tolkien",
                "La comunidad del anillo lucha contra Sauron en la Tierra Media."
        ));
    }

    public MutableLiveData<Libro> getmLibro() {
        if (mLibro == null) {
            mLibro = new MutableLiveData<>();
        }
        return mLibro;
    }

    public void buscarLibro(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo.trim())) {
                getmLibro().setValue(l);
                return;
            }
        }
        getmLibro().setValue(null);
    }
}
