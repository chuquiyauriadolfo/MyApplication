package aplicacion.android.adolfo2.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.support.constraint.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate", Toast.LENGTH_LONG).show();

        //Probando la clase creada Test
        //Test.myToast(this);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,"onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show();
        super.onDestroy();

    }


}
