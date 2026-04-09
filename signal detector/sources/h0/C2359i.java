package h0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2359i extends R2.a {

    /* renamed from: e, reason: collision with root package name */
    public final C2358h f20459e;

    public C2359i(TextView textView) {
        this.f20459e = new C2358h(textView);
    }

    @Override // R2.a
    public final void B(boolean z6) {
        if (f0.j.f19988k != null) {
            this.f20459e.B(z6);
        }
    }

    @Override // R2.a
    public final void E(boolean z6) {
        C2358h c2358h = this.f20459e;
        if (f0.j.f19988k != null) {
            c2358h.E(z6);
        } else {
            c2358h.f20458g = z6;
        }
    }

    @Override // R2.a
    public final TransformationMethod I(TransformationMethod transformationMethod) {
        return !(f0.j.f19988k != null) ? transformationMethod : this.f20459e.I(transformationMethod);
    }

    @Override // R2.a
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        return !(f0.j.f19988k != null) ? inputFilterArr : this.f20459e.o(inputFilterArr);
    }

    @Override // R2.a
    public final boolean u() {
        return this.f20459e.f20458g;
    }
}
