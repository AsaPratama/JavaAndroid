package com.example.login;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengambil nilai dari EditText
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Memeriksa apakah kedua EditText tidak kosong
                if (!username.isEmpty() && !password.isEmpty()) {
                    // Proses autentikasi (misalnya, mengirim data ke server atau memverifikasi secara lokal)
                    // Di sini Anda dapat menambahkan logika autentikasi Anda sendiri

                    // Contoh: Menampilkan pesan sukses
                    makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();makeText(MainActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                } else {
                    // Menampilkan pesan kesalahan jika salah satu atau kedua EditText kosong
                    makeText(MainActivity.this, "Username dan password harus diisi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}