package kd;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f28250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f28251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f28252c;

    public y(TextInputLayout textInputLayout, EditText editText) {
        this.f28252c = textInputLayout;
        this.f28251b = editText;
        this.f28250a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f28252c;
        textInputLayout.w(!textInputLayout.B0, false);
        if (textInputLayout.f20615l) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f20631t) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f28251b;
        int lineCount = editText.getLineCount();
        int i4 = this.f28250a;
        if (lineCount != i4) {
            if (lineCount < i4) {
                int minimumHeight = editText.getMinimumHeight();
                int i10 = textInputLayout.f20634u0;
                if (minimumHeight != i10) {
                    editText.setMinimumHeight(i10);
                }
            }
            this.f28250a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
    }
}
