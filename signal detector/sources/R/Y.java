package R;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class Y extends Z {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f3294e;

    public Y(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f3294e = windowInsetsAnimation;
    }

    @Override // R.Z
    public final long a() {
        return this.f3294e.getDurationMillis();
    }

    @Override // R.Z
    public final float b() {
        return this.f3294e.getInterpolatedFraction();
    }

    @Override // R.Z
    public final int c() {
        return this.f3294e.getTypeMask();
    }

    @Override // R.Z
    public final void d(float f2) {
        this.f3294e.setFraction(f2);
    }
}
