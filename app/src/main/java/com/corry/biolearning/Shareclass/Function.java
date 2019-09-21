package com.corry.biolearning.Shareclass;

import android.content.Context;
import android.widget.Toast;

public class Function {


    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}
