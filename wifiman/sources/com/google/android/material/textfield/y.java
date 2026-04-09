package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes3.dex */
class y extends s {

    /* renamed from: e, reason: collision with root package name */
    private int f37889e;

    /* renamed from: f, reason: collision with root package name */
    private EditText f37890f;

    /* renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f37891g;

    y(r rVar, int i10) {
        super(rVar);
        this.f37889e = O3.d.f17045a;
        this.f37891g = new View.OnClickListener() { // from class: com.google.android.material.textfield.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37888a.y(view);
            }
        };
        if (i10 != 0) {
            this.f37889e = i10;
        }
    }

    private boolean w() {
        EditText editText = this.f37890f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText = this.f37890f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (w()) {
            this.f37890f.setTransformationMethod(null);
        } else {
            this.f37890f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f37890f.setSelection(selectionEnd);
        }
        r();
    }

    @Override // com.google.android.material.textfield.s
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return O3.h.f17137v;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return this.f37889e;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f37891g;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    void n(EditText editText) {
        this.f37890f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        if (x(this.f37890f)) {
            this.f37890f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f37890f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
