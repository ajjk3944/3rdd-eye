package com.google.android.material.timepicker;

import F1.W;
import O3.g;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.j;
import com.google.android.material.internal.n;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private final Chip f37902a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f37903b;

    /* renamed from: c, reason: collision with root package name */
    private final EditText f37904c;

    /* renamed from: d, reason: collision with root package name */
    private TextWatcher f37905d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f37906e;

    private class b extends j {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f37902a.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String strC = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f37902a;
            if (TextUtils.isEmpty(strC)) {
                strC = ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return e.a(getResources(), charSequence);
    }

    private void d() {
        this.f37904c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37902a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f37902a.setChecked(z10);
        this.f37904c.setVisibility(z10 ? 0 : 4);
        this.f37902a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            n.k(this.f37904c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f37902a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f37902a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f37902a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(g.f17104g, (ViewGroup) this, false);
        this.f37902a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(g.f17105h, (ViewGroup) this, false);
        this.f37903b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f37904c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f37905d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f37906e = (TextView) findViewById(O3.e.f17084n);
        editText.setId(W.k());
        W.x0(this.f37906e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
