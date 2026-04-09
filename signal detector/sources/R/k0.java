package R;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class k0 extends i0 {

    /* renamed from: o, reason: collision with root package name */
    public J.c f3345o;

    /* renamed from: p, reason: collision with root package name */
    public J.c f3346p;

    /* renamed from: q, reason: collision with root package name */
    public J.c f3347q;

    public k0(r0 r0Var, WindowInsets windowInsets) {
        super(r0Var, windowInsets);
        this.f3345o = null;
        this.f3346p = null;
        this.f3347q = null;
    }

    @Override // R.o0
    public J.c g() {
        if (this.f3346p == null) {
            this.f3346p = J.c.c(this.f3332c.getMandatorySystemGestureInsets());
        }
        return this.f3346p;
    }

    @Override // R.o0
    public J.c i() {
        if (this.f3345o == null) {
            this.f3345o = J.c.c(this.f3332c.getSystemGestureInsets());
        }
        return this.f3345o;
    }

    @Override // R.o0
    public J.c k() {
        if (this.f3347q == null) {
            this.f3347q = J.c.c(this.f3332c.getTappableElementInsets());
        }
        return this.f3347q;
    }

    @Override // R.g0, R.o0
    public r0 l(int i, int i3, int i6, int i7) {
        return r0.g(null, this.f3332c.inset(i, i3, i6, i7));
    }

    @Override // R.h0, R.o0
    public void q(J.c cVar) {
    }
}
