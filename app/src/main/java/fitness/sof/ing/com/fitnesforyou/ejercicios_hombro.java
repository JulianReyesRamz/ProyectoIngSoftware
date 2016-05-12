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
public class ejercicios_hombro extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.ejercicios_hombros, container, false);
        Button botonpressmilitar = (Button) rootview.findViewById(R.id.boton_press_militar);
        botonpressmilitar.setOnClickListener(this);
        Button botonh2 = (Button) rootview.findViewById(R.id.boton_hombros2);
        botonh2.setOnClickListener(this);
        return rootview;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();

        switch (v.getId()){
            case R.id.boton_press_militar:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new press_militar())
                        .commit();
                break;
            case R.id.boton_polea_pecho:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new press_declinado())
                        .commit();
                break;

    }
}
}
