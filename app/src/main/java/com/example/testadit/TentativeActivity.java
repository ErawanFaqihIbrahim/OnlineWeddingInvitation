package com.example.testadit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TentativeActivity extends AppCompatActivity {

    private Button button, add;
    private EditText name, phone, quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentative);

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        quantity = findViewById(R.id.quantity);
        add = findViewById(R.id.buttonadd);
        button = findViewById(R.id.button2);

        AddGroup addGroup = new AddGroup();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("GroupPeople");
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addGroup.setName(name.getText().toString());
                addGroup.setPhone(phone.getText().toString());
                addGroup.setQuantity(Integer.valueOf(quantity.getText().toString()));
                myRef.push().setValue(addGroup);
                name.setText("");
                phone.setText("");
                quantity.setText("");
                Toast.makeText(TentativeActivity.this, "Group successfully added!", Toast.LENGTH_LONG).show();
            }
        });
    }
}