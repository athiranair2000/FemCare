package com.example.femcare.ui.firstaid;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirstAidViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FirstAidViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is first-aid fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}