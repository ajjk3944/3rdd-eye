package e4;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class w1 extends v1 {

    /* renamed from: r, reason: collision with root package name */
    public static final c2 f22415r = c2.h(null, WindowInsets.CONSUMED);

    public w1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
    }

    @Override // e4.s1, e4.z1
    public v3.b g(int i4) {
        return v3.b.d(this.f22391c.getInsets(a2.a(i4)));
    }

    @Override // e4.s1, e4.z1
    public v3.b h(int i4) {
        return v3.b.d(this.f22391c.getInsetsIgnoringVisibility(a2.a(i4)));
    }

    @Override // e4.s1, e4.z1
    public boolean q(int i4) {
        return this.f22391c.isVisible(a2.a(i4));
    }

    public w1(c2 c2Var, w1 w1Var) {
        super(c2Var, w1Var);
    }

    @Override // e4.s1, e4.z1
    public final void d(View view) {
    }
}
