package vn.edu.ntu.nguyenthanhhuynh_59131001.nguyenthanhhuynh_59131001_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //
    EditText edtTen, edtNgaySinh, edtSoThichKhac;
    RadioGroup rdgGioiTinh;
    RadioButton rdbNam, rdbNu;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    //Phương thức khai báo
    void addViews(){
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSoThichKhac = findViewById(R.id.edtSoThichKhac);

        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        rdbNam = findViewById(R.id.rdbNam);
        rdbNu = findViewById(R.id.rdbNu);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

        btnXacNhan = findViewById(R.id.btnXacNhan);
    }

    //Phương thức sự kiện
    void addEvents(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = "";
                String ngaySinh = "";
                String gioiTinh = "";
                String soThich = "\nSở thích: ";

                //Thông tin Tên
                ten = edtTen.getText().toString();

                //Thông tin Ngày sinh
                ngaySinh = "\nNgày sinh: " + edtNgaySinh.getText().toString();

                //Thông tin Giới tính
                switch (rdgGioiTinh.getCheckedRadioButtonId()){
                    case R.id.rdbNam:
                        gioiTinh = "\nGiới tính: " + rdbNam.getText().toString();
                        break;
                    case R.id.rdbNu:
                        gioiTinh = "\nGiới tính: " + rdbNu.getText().toString();
                        break;
                    default:
                        gioiTinh = "Lỗi";
                        break;
                }

                //Thông tin Sở thích
                if(cb1.isChecked())
                    soThich = soThich + cb1.getText().toString() + "; ";
                if(cb2.isChecked())
                    soThich = soThich + cb2.getText().toString() + "; ";
                if(cb3.isChecked())
                    soThich = soThich + cb3.getText().toString() + "; ";
                if(cb4.isChecked())
                    soThich = soThich + cb4.getText().toString() + "; ";
                if(cb5.isChecked())
                    soThich = soThich + cb5.getText().toString() + "; ";

                //Thông tin Sở thích khác
                soThich = soThich + edtSoThichKhac.getText().toString();

                //Thông báo dạng Toast
                Toast.makeText(getApplicationContext(), ten + ngaySinh + gioiTinh + soThich, Toast.LENGTH_LONG).show();
            }
        });
    }

}
