package d;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f21570a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21571b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21572c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21573d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21574e;

    public a(float f10, float f11, float f12, int i4, long j) {
        this.f21570a = f10;
        this.f21571b = f11;
        this.f21572c = f12;
        this.f21573d = i4;
        this.f21574e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f21570a + ", touchY=" + this.f21571b + ", progress=" + this.f21572c + ", swipeEdge=" + this.f21573d + ", frameTimeMillis=" + this.f21574e + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        nk.k.e(backEvent, "backEvent");
    }
}
