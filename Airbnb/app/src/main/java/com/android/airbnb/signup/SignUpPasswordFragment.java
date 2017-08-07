package com.android.airbnb.signup;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.airbnb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpPasswordFragment extends Fragment implements View.OnClickListener{

    private SignUpActivity signUpActivity;
    private Button btnPreviousPassword, btnNextPassword;
    private TextView txtTitle, txtDescription, txtPassword1, txtPassword2, txtIndicate;
    private EditText editPassword1, editPassword2;


    public SignUpPasswordFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        signUpActivity = (SignUpActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up_password, container, false);
        setViews(view);
        setListeners();
        return view;
    }

    private void setViews(View view){
        btnPreviousPassword = (Button) view.findViewById(R.id.btnPreviousPassword);
        btnNextPassword = (Button) view.findViewById(R.id.btnNextPassword);
        txtTitle = (TextView) view.findViewById(R.id.txtTitle1);
        txtDescription = (TextView) view.findViewById(R.id.txtIntroduce);
        txtPassword1 = (TextView) view.findViewById(R.id.txtPassword1);
        txtPassword2 = (TextView) view.findViewById(R.id.txtPassword2);
        txtIndicate = (TextView) view.findViewById(R.id.txtIndicate);
        editPassword1 = (EditText) view.findViewById(R.id.editPassword1);
        editPassword2 = (EditText) view.findViewById(R.id.editPassword2);
    }

    private void setListeners(){
        btnPreviousPassword.setOnClickListener(this);
        btnNextPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPreviousPassword :
                signUpActivity.onBackPressed();
                break;
            case R.id.btnNextPassword :
                if( (editPassword1.getText().toString()).equals(editPassword2.getText().toString())) {
                    signUpActivity.signUpData.setPassword1(editPassword1.getText().toString());
                    signUpActivity.signUpData.setPasswrod2(editPassword2.getText().toString());
                    goSignUpBirthdayFragment();
                } else {
                    Toast.makeText(signUpActivity.getBaseContext(), "비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    // move goSignUpBirthdayFragment
    private void goSignUpBirthdayFragment(){
        signUpActivity.getSupportFragmentManager().beginTransaction()
                .add(R.id.container, signUpActivity.signUpBirthdayFragment)
                .addToBackStack(null)
                .commit();
    }
}
