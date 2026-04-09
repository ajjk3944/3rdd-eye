package e4;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class v1 extends u1 {

    /* renamed from: o, reason: collision with root package name */
    public v3.b f22411o;

    /* renamed from: p, reason: collision with root package name */
    public v3.b f22412p;

    /* renamed from: q, reason: collision with root package name */
    public v3.b f22413q;

    public v1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
        this.f22411o = null;
        this.f22412p = null;
        this.f22413q = null;
    }

    @Override // e4.z1
    public v3.b i() {
        if (this.f22412p == null) {
            this.f22412p = v3.b.d(this.f22391c.getMandatorySystemGestureInsets());
        }
        return this.f22412p;
    }

    @Override // e4.z1
    public v3.b k() {
        if (this.f22411o == null) {
            this.f22411o = v3.b.d(this.f22391c.getSystemGestureInsets());
        }
        return this.f22411o;
    }

    @Override // e4.z1
    public v3.b m() {
        if (this.f22413q == null) {
            this.f22413q = v3.b.d(this.f22391c.getTappableElementInsets());
        }
        return this.f22413q;
    }

    @Override // e4.s1, e4.z1
    public c2 n(int i4, int i10, int i11, int i12) {
        return c2.h(null, this.f22391c.inset(i4, i10, i11, i12));
    }

    public v1(c2 c2Var, v1 v1Var) {
        super(c2Var, v1Var);
        this.f22411o = null;
        this.f22412p = null;
        this.f22413q = null;
    }

    @Override // e4.t1, e4.z1
    public void u(v3.b bVar) {
    }
}
