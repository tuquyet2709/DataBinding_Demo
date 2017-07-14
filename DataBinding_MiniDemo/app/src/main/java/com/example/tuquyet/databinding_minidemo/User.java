package com.example.tuquyet.databinding_minidemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by tuquyet on 14/07/2017.
 */
public class User extends BaseObservable {
    public int mUserAvatar;
    private String mUserName;
    private String mUserAge;

    public User(int userAvatar, String userName, String userAge) {
        mUserAvatar = userAvatar;
        mUserName = userName;
        mUserAge = userAge;
    }

    @Bindable
    public int getUserAvatar() {
        return mUserAvatar;
    }

    public void setUserAvatar(int userAvatar) {
        mUserAvatar = userAvatar;
    }

    @Bindable
    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    @Bindable
    public String getUserAge() {
        return mUserAge;
    }

    public void setUserAge(String userAge) {
        mUserAge = userAge;
    }
}
