package fitness.sof.ing.com.fitnesforyou;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by super on 23/04/2016.
 */
public class seccion_rutinas extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.seccion_rutinas, container, false);
        Button boton_amateur = (Button) rootview.findViewById(R.id.boton_principiante);
        boton_amateur.setOnClickListener(this);
        Button boton_intermedio = (Button) rootview.findViewById(R.id.boton_intermedio);
        boton_intermedio.setOnClickListener(this);
        Button boton_avanzado = (Button) rootview.findViewById(R.id.boton_avanzado);
        boton_avanzado.setOnClickListener(this);
        Button boton_modo_bestia = (Button) rootview.findViewById(R.id.boton_modo_bestia);
        boton_modo_bestia.setOnClickListener(this);
        return rootview;
    }
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();

        switch (v.getId()){
            case R.id.boton_principiante:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new estadisticas_corporales())
                        .commit();
                break;
            case R.id.boton_intermedio:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new estadisticas_corporales())
                        .commit();
                break;
            case R.id.boton_avanzado:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new estadisticas_corporales())
                        .commit();
                break;
            case R.id.boton_modo_bestia:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new estadisticas_corporales())
                        .commit();
                break;


        }
    }
}
