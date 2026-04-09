package com.google.android.material.timepicker;

import C.V;
import L0.I;
import L0.S;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import d4.i;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b, reason: collision with root package name */
    public final Chip f23158b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f23159c;

    public class a extends i {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (zIsEmpty) {
                chipTextInputComboView.f23158b.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
            Chip chip = chipTextInputComboView.f23158b;
            if (TextUtils.isEmpty(strA)) {
                strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
            }
            chip.setText(strA);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f23158b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f23159c = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f23158b.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f23159c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z10) {
        Chip chip = this.f23158b;
        chip.setChecked(z10);
        int i = z10 ? 0 : 4;
        EditText editText = this.f23159c;
        editText.setVisibility(i);
        chip.setVisibility(z10 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new V(editText, 23));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f23158b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f23158b.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f23158b.toggle();
    }
}
