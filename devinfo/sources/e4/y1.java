package e4;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y1 extends x1 {

    /* renamed from: s, reason: collision with root package name */
    public static final c2 f22421s = c2.h(null, WindowInsets.CONSUMED);

    public y1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
    }

    @Override // e4.w1, e4.s1, e4.z1
    public v3.b g(int i4) {
        return v3.b.d(this.f22391c.getInsets(b2.a(i4)));
    }

    @Override // e4.w1, e4.s1, e4.z1
    public v3.b h(int i4) {
        return v3.b.d(this.f22391c.getInsetsIgnoringVisibility(b2.a(i4)));
    }

    @Override // e4.w1, e4.s1, e4.z1
    public boolean q(int i4) {
        return this.f22391c.isVisible(b2.a(i4));
    }

    public y1(c2 c2Var, y1 y1Var) {
        super(c2Var, y1Var);
    }
}
