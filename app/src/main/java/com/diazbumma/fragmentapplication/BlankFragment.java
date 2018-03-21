package com.diazbumma.fragmentapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public BlankFragment() {
        // Required empty public constructor
    }

    private OnFragmentInteractionListener mListener;

    public interface OnFragmentInteractionListener{
        public void onFragmentInteraction(String hasil);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (OnFragmentInteractionListener) context;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
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
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        final EditText editBil1 = (EditText) view.findViewById(R.id.bilangan_satu);
        final EditText editBil2 = (EditText) view.findViewById(R.id.bilangan_dua);
        Button buttonTambah = (Button) view.findViewById(R.id.button_plus);
        Button buttonKurang = (Button) view.findViewById(R.id.button_minus);
        Button buttonKali = (Button) view.findViewById(R.id.button_kali);
        Button buttonBagi = (Button) view.findViewById(R.id.button_bagi);

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double hasil = Double.parseDouble(editBil1.getText().toString()) +
                        Double.parseDouble(editBil2.getText().toString());
                //Toast.makeText(getActivity(),"Lele "+hasil, Toast.LENGTH_SHORT).show();
                mListener.onFragmentInteraction(hasil+"");
            }
        });
        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double hasil = Double.parseDouble(editBil1.getText().toString()) -
                        Double.parseDouble(editBil2.getText().toString());
                //Toast.makeText(getActivity(),"Lele "+hasil, Toast.LENGTH_SHORT).show();
                mListener.onFragmentInteraction(hasil+"");
            }
        });
        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double hasil = Double.parseDouble(editBil1.getText().toString()) *
                        Double.parseDouble(editBil2.getText().toString());
                //Toast.makeText(getActivity(),"Lele "+hasil, Toast.LENGTH_SHORT).show();
                mListener.onFragmentInteraction(hasil+"");
            }
        });
        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double hasil = Double.parseDouble(editBil1.getText().toString()) /
                        Double.parseDouble(editBil2.getText().toString());
                //Toast.makeText(getActivity(),"Lele "+hasil, Toast.LENGTH_SHORT).show();
                mListener.onFragmentInteraction(hasil+"");
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
