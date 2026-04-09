package p4;

import B2.r;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* renamed from: p4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5465o extends AbstractC5458h {

    /* renamed from: e, reason: collision with root package name */
    public final int f45196e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f45197f;

    /* renamed from: g, reason: collision with root package name */
    public final r f45198g;

    public C5465o(com.google.android.material.textfield.a aVar, int i) {
        super(aVar);
        this.f45196e = R.drawable.design_password_eye;
        this.f45198g = new r(this, 5);
        if (i != 0) {
            this.f45196e = i;
        }
    }

    @Override // p4.AbstractC5458h
    public final void b() {
        q();
    }

    @Override // p4.AbstractC5458h
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p4.AbstractC5458h
    public final int d() {
        return this.f45196e;
    }

    @Override // p4.AbstractC5458h
    public final View.OnClickListener f() {
        return this.f45198g;
    }

    @Override // p4.AbstractC5458h
    public final boolean k() {
        return true;
    }

    @Override // p4.AbstractC5458h
    public final boolean l() {
        EditText editText = this.f45197f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p4.AbstractC5458h
    public final void m(EditText editText) {
        this.f45197f = editText;
        q();
    }

    @Override // p4.AbstractC5458h
    public final void r() {
        EditText editText = this.f45197f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f45197f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p4.AbstractC5458h
    public final void s() {
        EditText editText = this.f45197f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
