package net.com.gopal.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void s(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();

    }
}
