package sg.edu.rp.c346.democontextmenutransition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind UI Component //
        tvTranslatedText = findViewById(R.id.tvTranslatedText);

        registerForContextMenu(tvTranslatedText);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "Italian");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        // returns true if menu item successfully handled
        if (item.getItemId() == 0) {
            //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("English");
            return true;
        } else if (item.getItemId() == 1) {
            //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Italian");
            return true;
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }


}
