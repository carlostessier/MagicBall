package es.carlostessier.magicball;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    static TextView tPrediction;

    public MainActivityFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        iniziateViews(rootView);

        return rootView;
    }

    /**
     * Method iniciate the views and
     *         add a Listener to the button prediction
     * @param rootView View to the fragment layout
     */
    private void iniziateViews(View rootView) {
         tPrediction = (TextView)
                rootView.findViewById(R.id.tv_prediction);

        Button button = (Button) rootView.findViewById(R.id.b_prediction);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sPrediction =  MakePrediction.getPrediction(getActivity());
                tPrediction.setText(sPrediction);
            }
        });
    }
}
