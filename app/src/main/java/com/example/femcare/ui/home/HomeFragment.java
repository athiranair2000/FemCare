package com.example.femcare.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.femcare.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        final int[] imageArray = {R.drawable.p2, R.drawable.p5, R.drawable.p3, R.drawable.p4 };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button btnJoinUs = getActivity().findViewById(R.id.btnPregnancy1);
        Button btnSubmit = getActivity().findViewById(R.id.btnGeneral1);
        btnJoinUs.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        getActivity().findViewById(R.id.appBarAnim).setBackgroundColor(Color.parseColor("#1DE9B6"));
    }

    public void explore() {
        getActivity().getSupportFragmentManager().
                beginTransaction().
                replace(R.id.content_frame, new ExtraEventsFragment(), "ExtraEventsFragment")
                .commit();
    }

    public void join() {
        getActivity().getSupportFragmentManager().
                beginTransaction().
                replace(R.id.content_frame, new FragmentPregnancy1(), "FragmentJoinUs")
                .commit();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.explore:
                explore();
                break;

            case R.id.btnPregnancy1:
                pregnancy();
                break;

            case R.id.btnDonate1:
                donate();
                break;
        }
    }

    @Override
    public void onDestroy() {
        getActivity().findViewById(R.id.appBarAnim).setBackgroundResource(R.drawable.green);
        super.onDestroy();
    }
}

}