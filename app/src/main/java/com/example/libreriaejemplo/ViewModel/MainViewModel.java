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
                "Considerada una de las obras cumbres de la literatura hispanoamericana y universal, "
                        + "narra la historia de la familia Buendía a lo largo de siete generaciones en el mítico pueblo de Macondo. "
                        + "A través de realismo mágico, García Márquez mezcla lo cotidiano con lo fantástico para explorar la soledad, "
                        + "el poder, el amor y la decadencia. Es una metáfora de la historia de América Latina, sus ciclos de violencia, "
                        + "esperanza y desengaños, todo envuelto en un lenguaje poético y cautivador."
        ));

        libros.add(new Libro(
                "Rayuela",
                "Julio Cortázar",
                "Novela experimental que desafía la narrativa tradicional. "
                        + "Cortázar invita al lector a elegir distintos caminos de lectura: lineal o saltando capítulos según un tablero propuesto. "
                        + "La obra explora la vida bohemia en París y Buenos Aires, a través de Horacio Oliveira y la Maga, su enigmática amante. "
                        + "Rayuela reflexiona sobre el sentido de la existencia, el amor, el arte y la imposibilidad de alcanzar una verdad definitiva, "
                        + "convirtiéndose en un hito de la literatura del siglo XX."
        ));

        libros.add(new Libro(
                "La sombra del viento",
                "Carlos Ruiz Zafón",
                "Ambientada en la Barcelona de la posguerra, un niño llamado Daniel descubre un misterioso libro en el Cementerio de los Libros Olvidados. "
                        + "Fascinado por su autor, Julián Carax, inicia una investigación que lo llevará a desentrañar secretos familiares, pasiones prohibidas y tragedias ocultas. "
                        + "La novela combina misterio, romance y un homenaje al poder de la literatura, con un estilo envolvente que atrapa al lector desde la primera página."
        ));

        libros.add(new Libro(
                "Los detectives salvajes",
                "Roberto Bolaño",
                "Relata las peripecias de dos jóvenes poetas, Arturo Belano y Ulises Lima, en busca de Cesárea Tinajero, una misteriosa escritora desaparecida. "
                        + "La historia se despliega a través de múltiples voces y testimonios de personajes que cruzan sus vidas con los protagonistas a lo largo de décadas y países. "
                        + "Bolaño construye una obra monumental que explora la juventud, la bohemia, la literatura, la violencia y la desilusión, "
                        + "convirtiéndose en una radiografía generacional de finales del siglo XX."
        ));

        libros.add(new Libro(
                "El Señor de los Anillos",
                "J.R.R. Tolkien",
                "Una de las sagas más influyentes de la fantasía épica. "
                        + "Cuenta la historia de Frodo Bolsón, un hobbit que recibe el Anillo Único, un objeto de poder absoluto creado por el Señor Oscuro Sauron. "
                        + "Frodo y la Comunidad del Anillo emprenden un viaje peligroso para destruirlo en el Monte del Destino, "
                        + "enfrentando batallas, traiciones y la tentación del poder. "
                        + "Más allá de la aventura, la obra trata sobre la amistad, el sacrificio, la lucha contra el mal y la esperanza en los tiempos oscuros."
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
