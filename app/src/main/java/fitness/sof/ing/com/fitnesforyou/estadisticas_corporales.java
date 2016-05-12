package fitness.sof.ing.com.fitnesforyou;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by super on 23/04/2016.
 */
public class estadisticas_corporales extends Fragment  {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.estadisticas_corporales, container, false);
        return rootview;
    }
}
