package fitness.sof.ing.com.fitnesforyou;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by super on 23/04/2016.
 */
public class seccion_rutinas extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.seccion_rutinas, container, false);
        return rootview;
    }
}
