package nellymlangeni.thenotepad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        Button login;
        final TextView txtUsername = (TextView) findViewById(R.id.txtLoginUsername);
        final TextView txtPass = (TextView) findViewById((R.id.txtLoginPass));

        login = (Button) findViewById((R.id.btnLogin));

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String username = txtUsername.getText().toString();
                String pass = txtPass.getText().toString();

                if(username.length()>0){
                    if(pass.length()>0){
                        //Database Code here!

                        if(true){
                            Intent i = new Intent(LoginScreen.this, ActivityHome.class);
                            startActivity(i);
                            finish();
                        }
                    }
                    else{
                        Toast.makeText(LoginScreen.this, "Password cannot be empty.", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(LoginScreen.this, "Username cannot be empty.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
