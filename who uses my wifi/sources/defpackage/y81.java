package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y81 extends z81 {
    public final WindowInsetsAnimation e;

    public y81(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.z81
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.z81
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.z81
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.z81
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
