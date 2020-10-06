package pl.cyfrogen.budget.models;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import pl.cyfrogen.budget.R;
import pl.cyfrogen.budget.firebase.models.User;
import pl.cyfrogen.budget.firebase.models.WalletEntryCategory;

public  class DefaultCategories {
    private static Category[] categories = new Category[]{
            new Category(":sarathi", "Sarathi", R.drawable.category_transport, Color.parseColor("#d32f2f")),
            new Category(":parivahan", "Parivahan", R.drawable.category_kids, Color.parseColor("#c2185b")),
            new Category(":work", "Work", R.drawable.category_briefcase, Color.parseColor("#f57c00")),
            new Category(":others", "Others", R.drawable.category_gift, Color.parseColor("#455a64")),
    };

    public static Category createDefaultCategoryModel(String visibleName) {
        return new Category("default", visibleName, R.drawable.category_sport,
                Color.parseColor("#26a69a"));
    }


    public static Category[] getDefaultCategories() {
        return categories;
    }
}
