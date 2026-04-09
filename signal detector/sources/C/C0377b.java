package c;

import android.window.BackEvent;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377b {

    /* renamed from: a, reason: collision with root package name */
    public final float f5818a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5819b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5820c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5821d;

    public C0377b(BackEvent backEvent) {
        q5.i.e(backEvent, "backEvent");
        C0376a c0376a = C0376a.f5817a;
        float fD = c0376a.d(backEvent);
        float fE = c0376a.e(backEvent);
        float fB = c0376a.b(backEvent);
        int iC = c0376a.c(backEvent);
        this.f5818a = fD;
        this.f5819b = fE;
        this.f5820c = fB;
        this.f5821d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f5818a + ", touchY=" + this.f5819b + ", progress=" + this.f5820c + ", swipeEdge=" + this.f5821d + '}';
    }
}
