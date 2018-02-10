package com.example.kiranp.password_validator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button validatebutton;
    public TextView output;
    public EditText input;
    private boolean clicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validatebutton = findViewById(R.id.validate_button);
        final Validator validate_obj = new Validator();
        input = findViewById(R.id.password_input);
        output = findViewById(R.id.result);
        clicked = false;
        validatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked){
                    String in = String.valueOf(input.getText());
                    int passed = validate_obj.validate(in);
                    System.out.println(passed);
                    if(passed == 5){
                        output.setText("Strong!");
                    }
                    else{
                        output.setText("Not Strong!");
                    }
                }
            }
        });
    }
}
