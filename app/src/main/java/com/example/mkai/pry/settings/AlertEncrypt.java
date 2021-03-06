package com.example.mkai.pry.settings;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mkai.pry.R;


public class AlertEncrypt extends DialogFragment implements OnClickListener{

    final String LOG_TAG = "myLogs";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().setTitle("Title!");
        View v = inflater.inflate(R.layout.alert_encrypt, null);
        v.findViewById(R.id.btnYes).setOnClickListener(AlertEncrypt.this);
        v.findViewById(R.id.btnNo).setOnClickListener(AlertEncrypt.this);
        return v;
    }

    public void onClick(View v) {
        Log.d(LOG_TAG, "Dialog Encrypt: " + ((Button) v).getText());
        dismiss();
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d(LOG_TAG, "Dialog Encrypt: onDismiss");
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        Log.d(LOG_TAG, "Dialog Encrypt: onCancel");
    }
}
