package nu.paesta.paesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String URL_MESSAGE= "nu.paesta.paesta.URL_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newPaste(View view){
        Intent intent = new Intent(this, NewActivity.class);
        EditText urlText = (EditText) findViewById(R.id.urlText);
        String url = urlText.getText().toString();
        intent.putExtra(URL_MESSAGE, url);
        startActivity(intent);
    }

    public void latestPastes(View view){
        Intent intent = new Intent(this, NewActivity.class);
        EditText urlText = (EditText) findViewById(R.id.urlText);
        String url = urlText.getText().toString();
        intent.putExtra(URL_MESSAGE, url);
        startActivity(intent);
    }

    public void searchPastes(View view){
        Intent intent = new Intent(this, NewActivity.class);
        EditText urlText = (EditText) findViewById(R.id.urlText);
        String url = urlText.getText().toString();
        intent.putExtra(URL_MESSAGE, url);
        startActivity(intent);
    }
}
