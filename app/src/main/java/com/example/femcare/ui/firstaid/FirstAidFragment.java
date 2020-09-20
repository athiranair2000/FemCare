package com.example.femcare.ui.firstaid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.femcare.R;

public class FirstAidFragment extends Fragment {

    private FirstAidViewModel firstaidViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        firstaidViewModel =
                ViewModelProviders.of(this).get(FirstAidViewModel.class);
        View root = inflater.inflate(R.layout.fragment_firstaid, container, false);
        final TextView textView = root.findViewById(R.id.text_send);
        firstaidViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}