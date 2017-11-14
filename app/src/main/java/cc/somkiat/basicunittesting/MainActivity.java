package cc.somkiat.basicunittesting;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EmailValidation validation;
    final String Prefname = "SETTING_CONF";
    SharedPreferences storage;
    SharedPreferences.Editor sEditor;
    EditText username, email;
    DatePicker ddmmyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        validation = new EmailValidation();

        username = findViewById(R.id.userNameInput);
        email = findViewById(R.id.emailInput);
        ddmmyy = findViewById(R.id.dateOfBirthInput);

        storage = getSharedPreferences(Prefname, Context.MODE_PRIVATE);

        username.setText(storage.getString("username",""));
        email.setText(storage.getString("email",""));
        ddmmyy.updateDate(storage.getInt("year", Calendar.getInstance().get(Calendar.YEAR)),
                (storage.getInt("month", 0)),
                (storage.getInt("date",1)));

    }

    public void onSaveClick(View view) {
        storage = getSharedPreferences(Prefname, Context.MODE_PRIVATE);
        sEditor = storage.edit();

        sEditor.putString("username", username.getText().toString());
        sEditor.putString("email", email.getText().toString());
        sEditor.putInt("date", ddmmyy.getDayOfMonth());
        sEditor.putInt("month", ddmmyy.getMonth());
        sEditor.putInt("year", ddmmyy.getYear());
        sEditor.apply();
        Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();

    }

    public void onRevertClick(View view) {
        username.setText("");
        email.setText("");
        ddmmyy.updateDate(Calendar.getInstance().get(Calendar.YEAR),0,1);

    }

}
