package fitness.sof.ing.com.fitnesforyou;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by super on 23/04/2016.
 */
public class ejercicios_pecho extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.ejercicios_pecho, container, false);
        Button botonpress = (Button) rootview.findViewById(R.id.boton_press_precho);
        botonpress.setOnClickListener(this);
        Button botonpressdeclinado = (Button) rootview.findViewById(R.id.boton_press_declinado);
        botonpressdeclinado.setOnClickListener(this);
        return rootview;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();

        switch (v.getId()){
            case R.id.boton_press_precho:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new press_pecho2())
                        .commit();
                break;
            case R.id.boton_press_declinado:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new press_declinado())
                        .commit();
                break;

    }
}
}
