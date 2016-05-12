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
public class ejercicios_bicep extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.ejercicios_bicep, container, false);
        Button botoncurl = (Button) rootview.findViewById(R.id.curl_biceps);
        botoncurl.setOnClickListener(this);
        return rootview;
    }
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();

        switch (v.getId()){
            case R.id.curl_biceps:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new curl_bicep())
                        .commit();
                break;
            case R.id.boton_martillo:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new press_declinado())
                        .commit();
                break;

        }
    }
}
