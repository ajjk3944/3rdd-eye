package kd;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f28240e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f28241f;
    public final com.applovin.mediation.nativeAds.a g;

    public w(o oVar, int i4) {
        super(oVar);
        this.f28240e = R.drawable.design_password_eye;
        this.g = new com.applovin.mediation.nativeAds.a(16, this);
        if (i4 != 0) {
            this.f28240e = i4;
        }
    }

    @Override // kd.p
    public final void b() {
        p();
    }

    @Override // kd.p
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // kd.p
    public final int d() {
        return this.f28240e;
    }

    @Override // kd.p
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // kd.p
    public final boolean j() {
        return true;
    }

    @Override // kd.p
    public final boolean k() {
        EditText editText = this.f28241f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // kd.p
    public final void l(EditText editText) {
        this.f28241f = editText;
        p();
    }

    @Override // kd.p
    public final void q() {
        EditText editText = this.f28241f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f28241f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // kd.p
    public final void r() {
        EditText editText = this.f28241f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
