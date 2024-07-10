package kg.less.hm_02;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class inFragment extends Fragment {

    private Button btnNext;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_in, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        btnNext = requireActivity().findViewById(R.id.btn_fragment);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new BlankFragment()).commit();
            }
        });
    }
}