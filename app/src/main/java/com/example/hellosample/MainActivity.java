package com.example.hellosample;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.button);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClear = findViewById(R.id.button2);
        btClear.setOnClickListener(listener);

    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            EditText input = findViewById(R.id.editText2);
            TextView output = findViewById(R.id.textView2);

            int id = view.getId();
            System.out.println(id);

            switch (id) {

                case R.id.button:
                    String inputStr = input.getText().toString();
                    output.setText(inputStr + "さん、こんばんは");
                    break;

                case R.id.button2:
                    input.setText("");
                    output.setText("");
                    break;
            }
        }
    }
}
