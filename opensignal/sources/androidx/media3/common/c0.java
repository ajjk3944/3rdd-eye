package androidx.media3.common;

import android.net.Uri;

/* loaded from: classes.dex */
public final class c0 implements i {
    public static final ab.c B;

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f1577g = new c0(new bm.d(6));

    /* renamed from: r, reason: collision with root package name */
    public static final String f1578r;

    /* renamed from: x, reason: collision with root package name */
    public static final String f1579x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f1580y;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1581a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1582d;

    static {
        int i10 = a5.d0.f105a;
        f1578r = Integer.toString(0, 36);
        f1579x = Integer.toString(1, 36);
        f1580y = Integer.toString(2, 36);
        B = new ab.c(9);
    }

    public c0(bm.d dVar) {
        this.f1581a = (Uri) dVar.f2826d;
        this.f1582d = (String) dVar.f2827g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return a5.d0.a(this.f1581a, c0Var.f1581a) && a5.d0.a(this.f1582d, c0Var.f1582d);
    }

    public final int hashCode() {
        Uri uri = this.f1581a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f1582d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
