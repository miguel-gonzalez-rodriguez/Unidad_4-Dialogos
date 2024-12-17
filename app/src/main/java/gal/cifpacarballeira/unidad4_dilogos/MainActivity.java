package gal.cifpacarballeira.unidad4_dilogos;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Título")
//                .setMessage("Mensaje del diálogo")
//                .setPositiveButton("Aceptar", (dialog, which) -> {
//                    // Acción al aceptar
//                })
//                .setNegativeButton("Cancelar", (dialog, which) -> {
//                    // Acción al cancelar
//                })
//                .show();

//        DatePickerDialog datePickerDialog = new DatePickerDialog(
//                this,
//                (view, year, month, dayOfMonth) -> {
//                    // Acción con la fecha seleccionada
//                },
//                2024, 11, 15 // Año, Mes (0-indexado), Día
//        );
//        datePickerDialog.show();

//        TimePickerDialog timePickerDialog = new TimePickerDialog(
//                this,
//                (view, hourOfDay, minute) -> {
//                    // Acción con la hora seleccionada
//                },
//                12, 0, true // Hora inicial, Minuto inicial, formato 24h
//        );
//        timePickerDialog.show();

//        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
//        bottomSheetDialog.setContentView(R.layout.bottom_sheet_layout);
//        bottomSheetDialog.show();


    }
}