package com.cavsci.medres.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TextView extends androidx.appcompat.widget.AppCompatTextView {
    public TextView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public TextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/ravie.ttf"));
    }
}
