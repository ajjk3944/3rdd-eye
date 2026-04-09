package u3;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class s0 extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f23212e;

    public s0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f23212e = windowInsetsAnimation;
    }

    @Override // u3.t0
    public final long a() {
        return this.f23212e.getDurationMillis();
    }

    @Override // u3.t0
    public final float b() {
        return this.f23212e.getInterpolatedFraction();
    }

    @Override // u3.t0
    public final int c() {
        return this.f23212e.getTypeMask();
    }

    @Override // u3.t0
    public final void d(float f10) {
        this.f23212e.setFraction(f10);
    }
}
