package M3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class x extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f2944e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f2945f;

    /* renamed from: g, reason: collision with root package name */
    public final B4.g f2946g;

    public x(p pVar, int i) {
        super(pVar);
        this.f2944e = R.drawable.design_password_eye;
        this.f2946g = new B4.g(8, this);
        if (i != 0) {
            this.f2944e = i;
        }
    }

    @Override // M3.q
    public final void b() {
        q();
    }

    @Override // M3.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // M3.q
    public final int d() {
        return this.f2944e;
    }

    @Override // M3.q
    public final View.OnClickListener f() {
        return this.f2946g;
    }

    @Override // M3.q
    public final boolean k() {
        return true;
    }

    @Override // M3.q
    public final boolean l() {
        EditText editText = this.f2945f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // M3.q
    public final void m(EditText editText) {
        this.f2945f = editText;
        q();
    }

    @Override // M3.q
    public final void r() {
        EditText editText = this.f2945f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f2945f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // M3.q
    public final void s() {
        EditText editText = this.f2945f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
