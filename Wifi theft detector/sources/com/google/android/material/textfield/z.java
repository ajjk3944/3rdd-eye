package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes2.dex */
public class z extends t {

    /* renamed from: e, reason: collision with root package name */
    public int f11442e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f11443f;

    /* renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f11444g;

    public z(s sVar, int i10) {
        super(sVar);
        this.f11442e = j4.e.design_password_eye;
        this.f11444g = new View.OnClickListener() { // from class: com.google.android.material.textfield.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.v(this.f11441a, view);
            }
        };
        if (i10 != 0) {
            this.f11442e = i10;
        }
    }

    public static /* synthetic */ void v(z zVar, View view) {
        EditText editText = zVar.f11443f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (zVar.w()) {
            zVar.f11443f.setTransformationMethod(null);
        } else {
            zVar.f11443f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            zVar.f11443f.setSelection(selectionEnd);
        }
        zVar.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.t
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.t
    public int c() {
        return j4.j.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.t
    public int d() {
        return this.f11442e;
    }

    @Override // com.google.android.material.textfield.t
    public View.OnClickListener f() {
        return this.f11444g;
    }

    @Override // com.google.android.material.textfield.t
    public boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    public boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f11443f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.t
    public void s() {
        if (x(this.f11443f)) {
            this.f11443f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.t
    public void u() {
        EditText editText = this.f11443f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f11443f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
