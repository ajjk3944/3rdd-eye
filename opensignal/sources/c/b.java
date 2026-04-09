package c;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f3000a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3001b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3002c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3003d;

    public b(BackEvent backEvent) {
        a aVar = a.f2999a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.f3000a = fD;
        this.f3001b = fE;
        this.f3002c = fB;
        this.f3003d = iC;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f3000a);
        sb2.append(", touchY=");
        sb2.append(this.f3001b);
        sb2.append(", progress=");
        sb2.append(this.f3002c);
        sb2.append(", swipeEdge=");
        return c7.a.q(sb2, this.f3003d, '}');
    }
}
