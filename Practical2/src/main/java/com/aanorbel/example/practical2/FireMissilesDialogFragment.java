package com.aanorbel.example.practical2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;


public class FireMissilesDialogFragment extends DialogFragment {

    public static final String FRAGMENT_TAG = FireMissilesDialogFragment.class.getName();

    public static FireMissilesDialogFragment newInstance() {

        Bundle args = new Bundle();

        FireMissilesDialogFragment fragment = new FireMissilesDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.pass_course)
                .setPositiveButton(R.string.pass, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Study deal hard!
                        Toast.makeText(getContext(), "God Help us", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

}
