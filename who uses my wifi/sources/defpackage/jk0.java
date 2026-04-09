package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jk0 extends vs {
    public final int e;
    public EditText f;
    public final mf g;

    public jk0(us usVar, int i) {
        super(usVar);
        this.e = R.drawable.design_password_eye;
        this.g = new mf(3, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.vs
    public final void b() {
        p();
    }

    @Override // defpackage.vs
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.vs
    public final int d() {
        return this.e;
    }

    @Override // defpackage.vs
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.vs
    public final boolean j() {
        return true;
    }

    @Override // defpackage.vs
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.vs
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.vs
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.vs
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
