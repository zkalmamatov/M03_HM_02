package kg.less.hm_02;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    private TextView textViewCount;
    private int count = 0;
    private Button btnPls;
    private Button btnMns;


    public BlankFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        textViewCount = view.findViewById(R.id.txt_count);
        btnMns = view.findViewById(R.id.btn_minus);
        btnPls = view.findViewById(R.id.btn_plus);

        btnMns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                updateCounterText();
            }
        });

        btnPls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                updateCounterText();
            }
        });

        updateCounterText();

        return view;
    }

    private void updateCounterText() {
        textViewCount.setText(String.valueOf(count));
    }


}