package com.example.page1;

import android.app.Activity;

public class Intent extends android.content.Intent {
    public Intent(MainActivity mainActivity, Class<loginreg> loginregClass) {
    }

    public Intent(Activity loginreg, Class<loginreg> loginregClass) {

    }
}
