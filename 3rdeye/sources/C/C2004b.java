package c;

import N7.H7;
import android.window.BackEvent;

/* compiled from: BackEventCompat.kt */
/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2004b {

    /* renamed from: a, reason: collision with root package name */
    public final float f18265a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18266b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18267c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18268d;

    public C2004b(BackEvent backEvent) {
        C2003a c2003a = C2003a.f18264a;
        float fD = c2003a.d(backEvent);
        float fE = c2003a.e(backEvent);
        float fB = c2003a.b(backEvent);
        int iC = c2003a.c(backEvent);
        this.f18265a = fD;
        this.f18266b = fE;
        this.f18267c = fB;
        this.f18268d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f18265a);
        sb.append(", touchY=");
        sb.append(this.f18266b);
        sb.append(", progress=");
        sb.append(this.f18267c);
        sb.append(", swipeEdge=");
        return H7.p(sb, this.f18268d, '}');
    }
}
