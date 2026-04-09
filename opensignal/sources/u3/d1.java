package u3;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class d1 extends b1 {

    /* renamed from: n, reason: collision with root package name */
    public k3.d f23155n;

    /* renamed from: o, reason: collision with root package name */
    public k3.d f23156o;

    /* renamed from: p, reason: collision with root package name */
    public k3.d f23157p;

    public d1(h1 h1Var, WindowInsets windowInsets) {
        super(h1Var, windowInsets);
        this.f23155n = null;
        this.f23156o = null;
        this.f23157p = null;
    }

    @Override // u3.f1
    public k3.d h() {
        if (this.f23156o == null) {
            this.f23156o = k3.d.c(this.f23240c.getMandatorySystemGestureInsets());
        }
        return this.f23156o;
    }

    @Override // u3.f1
    public k3.d j() {
        if (this.f23155n == null) {
            this.f23155n = k3.d.c(this.f23240c.getSystemGestureInsets());
        }
        return this.f23155n;
    }

    @Override // u3.f1
    public k3.d l() {
        if (this.f23157p == null) {
            this.f23157p = k3.d.c(this.f23240c.getTappableElementInsets());
        }
        return this.f23157p;
    }

    @Override // u3.z0, u3.f1
    public h1 m(int i10, int i11, int i12, int i13) {
        return h1.g(null, this.f23240c.inset(i10, i11, i12, i13));
    }

    @Override // u3.a1, u3.f1
    public void s(k3.d dVar) {
    }
}
