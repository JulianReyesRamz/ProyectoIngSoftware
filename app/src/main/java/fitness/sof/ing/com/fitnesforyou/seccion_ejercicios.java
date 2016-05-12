package fitness.sof.ing.com.fitnesforyou;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class seccion_ejercicios extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.seccion_ejercicios, container, false);
        Button botonp = (Button) rootview.findViewById(R.id.boton_pecho);
        botonp.setOnClickListener(this);
        Button botonp1 = (Button) rootview.findViewById(R.id.boton_bicep);
        botonp1.setOnClickListener(this);
        Button botonespalda = (Button) rootview.findViewById(R.id.boton_espalda);
        botonespalda.setOnClickListener(this);
        Button botonhomros = (Button) rootview.findViewById(R.id.boton_ejercicios_hombros);
        botonhomros.setOnClickListener(this);

        return rootview;
    }
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();

        switch (v.getId()){
            case R.id.boton_pecho:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new ejercicios_pecho())
                        .commit();
                break;
            case R.id.boton_bicep:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame,new ejercicios_bicep() )
                        .commit();
                break;
            case R.id.boton_espalda:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new ejercicios_espalda())
                        .commit();
                break;
            case R.id.boton_ejercicios_hombros:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new ejercicios_hombro())
                        .commit();
                break;


        }
    }


}
