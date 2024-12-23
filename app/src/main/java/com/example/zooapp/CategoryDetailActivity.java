package com.example.zooapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_detail);

        String categoryName = getIntent().getStringExtra("category_name");

        // Установка заголовка категории
        TextView titleText = findViewById(R.id.titleText);
        titleText.setText(categoryName);

        // Загрузка изображения и описание в зависимости от категории
        ImageView animalImage = findViewById(R.id.animalImage);
        TextView descriptionText = findViewById(R.id.descriptionText);

        switch (categoryName) {
            case "Млекопитающие":
                animalImage.setImageResource(R.drawable.lion); // Замените на ваше изображение льва
                descriptionText.setText("Млекопитающие — это класс животных, которые имеют волосы и кормят своих детенышей молоком.\n\nПримеры: Львы, Слоны, Тигры.");
                break;
            case "Птицы":
                animalImage.setImageResource(R.drawable.parrot); // Замените на ваше изображение попугая
                descriptionText.setText("Птицы — это теплокровные позвоночные животные с перьями и крыльями.\n\nПримеры: Попугаи, Орлы, Воробьи.");
                break;
            case "Рыбы":
                animalImage.setImageResource(R.drawable.goldfish); // Замените на ваше изображение золотой рыбки
                descriptionText.setText("Рыбы — это водные позвоночные животные, которые дышат с помощью жабр.\n\nПримеры: Золотые рыбки, Акулы, Форели.");
                break;
            case "Рептилии":
                animalImage.setImageResource(R.drawable.snake); // Замените на ваше изображение змеи
                descriptionText.setText("Рептилии — это холоднокровные позвоночные животные с чешуей.\n\nПримеры: Змеи, Ящерицы, Черепахи.");
                break;
            case "Амфибии":
                animalImage.setImageResource(R.drawable.frog); // Замените на ваше изображение лягушки
                descriptionText.setText("Амфибии — это класс животных, которые могут жить как в воде, так и на суше.\n\nПримеры: Лягушки, Саламандры.");
                break;
            default:
                break;
        }
    }
}
