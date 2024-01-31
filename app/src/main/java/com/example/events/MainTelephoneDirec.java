package com.example.events;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import android.widget.Toast;
import java.util.ArrayList;

public class MainTelephoneDirec extends AppCompatActivity {
    private ListView contactsListView;
    private ContactAdapter contactAdapter;
    private ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintelephonedirec);

        contactsListView = findViewById(R.id.contactsListView);

        // Tạo danh sách các phần tử trong danh bạ
        contacts = new ArrayList<>();
        contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "0987654321"));
        // Thêm các phần tử khác vào danh sách

        // Khởi tạo ContactAdapter và gán nó cho ListView
        contactAdapter = new ContactAdapter(this, contacts);
        contactsListView.setAdapter(contactAdapter);

        // Xử lý sự kiện click vào phần tử trong danh bạ
        contactsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact selectedContact = contacts.get(position);
                Toast.makeText(MainTelephoneDirec.this, "Name: " + selectedContact.getName() + ", Phone: " + selectedContact.getPhone(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}