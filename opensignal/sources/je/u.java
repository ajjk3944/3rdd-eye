package je;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class u extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f13689e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f13690f;

    /* renamed from: g, reason: collision with root package name */
    public final am.b f13691g;

    public u(m mVar, int i10) {
        super(mVar);
        this.f13689e = ed.e.design_password_eye;
        this.f13691g = new am.b(13, this);
        if (i10 != 0) {
            this.f13689e = i10;
        }
    }

    @Override // je.n
    public final void b() {
        p();
    }

    @Override // je.n
    public final int c() {
        return ed.j.password_toggle_content_description;
    }

    @Override // je.n
    public final int d() {
        return this.f13689e;
    }

    @Override // je.n
    public final View.OnClickListener f() {
        return this.f13691g;
    }

    @Override // je.n
    public final boolean j() {
        return true;
    }

    @Override // je.n
    public final boolean k() {
        EditText editText = this.f13690f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // je.n
    public final void l(EditText editText) {
        this.f13690f = editText;
        p();
    }

    @Override // je.n
    public final void q() {
        EditText editText = this.f13690f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f13690f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // je.n
    public final void r() {
        EditText editText = this.f13690f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
