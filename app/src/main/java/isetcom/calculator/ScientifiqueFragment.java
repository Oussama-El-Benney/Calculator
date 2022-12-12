package isetcom.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScientifiqueFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScientifiqueFragment extends Fragment {
    EditText edt;
    TextView tvres;
    Button btnc;
    RadioButton rbl, rbe, rbr;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ScientifiqueFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScientifiqueFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScientifiqueFragment newInstance(String param1, String param2) {
        ScientifiqueFragment fragment = new ScientifiqueFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inf = inflater.inflate(R.layout.fragment_scientifique, container, false);
        edt = inf.findViewById(R.id.fop3);
        tvres = inf.findViewById(R.id.res);
        btnc = inf.findViewById(R.id.fragcalc);
        rbl = inf.findViewById(R.id.rblog);
        rbe = inf.findViewById(R.id.rbexp);
        rbr = inf.findViewById(R.id.rbrac);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = edt.getText().toString();
                String msg = getResources().getString(R.string.res);
                int x1 = 0;
                if(s1.isEmpty()){
                    Toast.makeText(getContext(), "enter a value !", Toast.LENGTH_LONG).show();
                }else{
                 x1 = Integer.valueOf(s1);}
                double r=0;
                    if(rbl.isChecked()){
                        r = Math.log((double)x1);
                        tvres.setText(msg + r);
                    }
                    if(rbe.isChecked()){
                        r = Math.exp((double)x1);
                        tvres.setText(msg+r);
                    }
                    if(rbr.isChecked()){
                        r = Math.sqrt((double)x1);
                        tvres.setText(msg+r);
                    }
                if(!rbl.isChecked() && !rbe.isChecked() && !rbr.isChecked()){
                    Toast.makeText(getContext(), "Il faut choisir une opération !", Toast.LENGTH_LONG).show();
                }
            }
        });

        return inf;
    }
}