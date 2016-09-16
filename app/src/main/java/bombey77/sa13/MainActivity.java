package bombey77.sa13;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvColor, tvSize;

    final private int MENU_COLOR_RED = 1;
    final private int MENU_COLOR_BLUE = 2;
    final private int MENU_COLOR_GREEN = 3;

    final private int MENU_SIZE_22 = 4;
    final private int MENU_SIZE_26 = 5;
    final private int MENU_SIZE_30 = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvColor = (TextView)findViewById(R.id.tvColor);
        tvSize = (TextView)findViewById(R.id.tvSize);

      tvColor.setOnCreateContextMenuListener(this);
      tvSize.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.tvColor:
                menu.add(0, MENU_COLOR_RED, 0, "Red");
                menu.add(0, MENU_COLOR_BLUE, 0, "Blue");
                menu.add(0, MENU_COLOR_GREEN, 0, "Green");
                break;
            case R.id.tvSize:
                menu.add(0, MENU_SIZE_22, 0, "22");
                menu.add(0, MENU_SIZE_26, 0, "26");
                menu.add(0, MENU_SIZE_30, 0, "30");
                break;
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_COLOR_RED:
                tvColor.setTextColor(Color.RED);
                break;
            case MENU_COLOR_BLUE:
                tvColor.setTextColor(Color.BLUE);
                break;
            case MENU_COLOR_GREEN:
                tvColor.setTextColor(Color.GREEN);
                break;
            case MENU_SIZE_22:
                tvSize.setTextSize(22);
                break;
            case MENU_SIZE_26:
                tvSize.setTextSize(26);
                break;
            case MENU_SIZE_30:
                tvSize.setTextSize(30);
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    public void addBrench() {
        int i;
    }

}
