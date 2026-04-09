package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f9 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public f9(BackEvent backEvent) {
        i30.m(backEvent, "backEvent");
        float fC = w4.c(backEvent);
        float fD = w4.d(backEvent);
        float fA = w4.a(backEvent);
        int iB = w4.b(backEvent);
        long jA = Build.VERSION.SDK_INT >= 36 ? x4.a(backEvent) : 0L;
        this.a = fC;
        this.b = fD;
        this.c = fA;
        this.d = iB;
        this.e = jA;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + '}';
    }
}
