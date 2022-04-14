package com.example.testexposeddropdownmenu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList_animals;
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList_animals = new ArrayList<>();
        arrayList_animals.add("Tiger");
        arrayList_animals.add("Lion");
        arrayList_animals.add("Elephant");
        arrayList_animals.add("Monkey");
        arrayList_animals.add("Cow");
        arrayList_animals.add("Panda");
        arrayList_animals.add("Firefox");
        arrayList_animals.add("Fox");
        arrayList_animals.add("Goose");
        arrayList_animals.add("Chicken");
        arrayList_animals.add("Pigeon");
        arrayList_animals.add("Eagle");
        arrayList_animals.add("Zebra");
        arrayList_animals.add("Gorilla");
        arrayList_animals.add("Whale");
        arrayList_animals.add("Giraffe");
        arrayList_animals.add("Crocodile");
        arrayList_animals.add("Bear");
        arrayList_animals.add("Yuk");
        arrayList_animals.add("Mouse");
        arrayList_animals.add("Cat");
        arrayList_animals.add("Camel");
        arrayList_animals.add("Tortoise");
        arrayList_animals.add("Hippopotamus");
        arrayList_animals.add("Kangaroo");

        autoCompleteTextView = findViewById(R.id.autocomplete_textview);

        adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.list_item, arrayList_animals);

        autoCompleteTextView.setAdapter(adapter);
    }
}