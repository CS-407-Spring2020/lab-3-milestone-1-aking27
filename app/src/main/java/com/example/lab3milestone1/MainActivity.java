package com.example.lab3milestone1;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openDialog();
            }

        });
    }

    public void openDialog(){
        DialogClass dialogClass = new DialogClass();
        dialogClass.show(getSupportFragmentManager(), "example dialog");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){
            default:return super.onOptionsItemSelected(item);
        }
    }

}
