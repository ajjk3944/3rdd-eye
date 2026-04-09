package e4;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j1 extends k1 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f22362e;

    public j1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f22362e = windowInsetsAnimation;
    }

    public static v3.b f(WindowInsetsAnimation.Bounds bounds) {
        return v3.b.d(bounds.getUpperBound());
    }

    public static v3.b g(WindowInsetsAnimation.Bounds bounds) {
        return v3.b.d(bounds.getLowerBound());
    }

    public static void h(View view, androidx.datastore.preferences.protobuf.j jVar) {
        view.setWindowInsetsAnimationCallback(jVar != null ? new i1(jVar) : null);
    }

    @Override // e4.k1
    public final float a() {
        return this.f22362e.getAlpha();
    }

    @Override // e4.k1
    public final long b() {
        return this.f22362e.getDurationMillis();
    }

    @Override // e4.k1
    public final float c() {
        return this.f22362e.getInterpolatedFraction();
    }

    @Override // e4.k1
    public final int d() {
        return this.f22362e.getTypeMask();
    }

    @Override // e4.k1
    public final void e(float f10) {
        this.f22362e.setFraction(f10);
    }
}
