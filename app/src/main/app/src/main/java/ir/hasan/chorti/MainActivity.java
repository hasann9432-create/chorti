package ir.hasan.chorti;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setBackgroundColor(Color.parseColor("#0D1B2A"));
        root.setPadding(40, 40, 40, 40);

        TextView title = new TextView(this);
        title.setText("چرتی");
        title.setTextSize(50);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        root.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("\nدستیار ایمنی راننده\n\n");
        subtitle.setTextSize(20);
        subtitle.setTextColor(Color.parseColor("#AAAAAA"));
        subtitle.setGravity(Gravity.CENTER);
        root.addView(subtitle);

        Button startBtn = new Button(this);
        startBtn.setText("شروع پایش");
        startBtn.setTextSize(22);
        startBtn.setPadding(80, 40, 80, 40);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "به‌زودی...", Toast.LENGTH_SHORT).show();
            }
        });
        root.addView(startBtn);

        setContentView(root);
    }
}
