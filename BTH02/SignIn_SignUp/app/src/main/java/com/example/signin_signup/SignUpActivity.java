package com.example.signin_signup;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class SignUpActivity extends AppCompatActivity {

    EditText edtEmailOrPhone, edtPw, edtConfirmPw;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edtEmailOrPhone = findViewById(R.id.edtEmaiorPhone);
        edtPw = findViewById(R.id.edtPw);
        edtConfirmPw = findViewById(R.id.edtConfirmPw);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtEmailOrPhone.getText().toString().trim();
                String password = edtPw.getText().toString().trim();
                String confirmPassword = edtConfirmPw.getText().toString().trim();

                // Kiểm tra không được để trống
                if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Không được để trống!", Toast.LENGTH_SHORT).show();
                }
                // Kiểm tra Email hoặc SĐT hợp lệ
                else if (!username.matches("^[0-9]{10}$") && !username.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,6}$")) {
                    Toast.makeText(SignUpActivity.this, "SĐT hoặc Email không hợp lệ!", Toast.LENGTH_SHORT).show();
                }
                // Kiểm tra mật khẩu có cả số, chữ và ký tự đặc biệt
                else if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{6,}$")) {
                    Toast.makeText(SignUpActivity.this, "Mật khẩu phải có ít nhất 6 ký tự, gồm chữ, số và ký tự đặc biệt!", Toast.LENGTH_SHORT).show();
                }
                // Kiểm tra mật khẩu trùng nhau
                else if (!password.equals(confirmPassword)) {
                    Toast.makeText(SignUpActivity.this, "Mật khẩu không trùng khớp!", Toast.LENGTH_SHORT).show();
                }
                // Đăng kí thành công
                else {
                    Toast.makeText(SignUpActivity.this, "Đăng kí thành công!", Toast.LENGTH_SHORT).show();
                    finish(); // Quay về màn hình đăng nhập
                }
            }
        });

    }
}