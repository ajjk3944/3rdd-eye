package pa;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final h f31527i = new h(320, 50, "320x50_mb");
    public static final h j;

    /* renamed from: k, reason: collision with root package name */
    public static final h f31528k;

    /* renamed from: l, reason: collision with root package name */
    public static final h f31529l;

    /* renamed from: a, reason: collision with root package name */
    public final int f31530a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31531b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31532c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31533d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31534e;

    /* renamed from: f, reason: collision with root package name */
    public int f31535f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f31536h;

    static {
        new h(468, 60, "468x60_as");
        new h(320, 100, "320x100_as");
        j = new h(728, 90, "728x90_as");
        new h(300, 250, "300x250_as");
        new h(160, 600, "160x600_as");
        new h(-1, -2, "smart_banner");
        f31528k = new h(-3, -4, "fluid");
        f31529l = new h(0, 0, "invalid");
        new h(50, 50, "50x50_mb");
        new h(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(int i4, int i10) {
        String strValueOf = i4 == -1 ? "FULL" : String.valueOf(i4);
        String strValueOf2 = i10 == -2 ? "AUTO" : String.valueOf(i10);
        this(i4, i10, a0.g.p(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"));
    }

    public static int a() {
        throw null;
    }

    public static int c() {
        throw null;
    }

    public final int b(Context context) {
        int i4 = this.f31531b;
        if (i4 == -4 || i4 == -3) {
            return -1;
        }
        if (i4 != -2) {
            za.d dVar = va.r.g.f36157a;
            return za.d.b(i4, context);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f10 = displayMetrics.heightPixels;
        float f11 = displayMetrics.density;
        int i10 = (int) (f10 / f11);
        return (int) ((i10 <= 400 ? 32 : i10 <= 720 ? 50 : 90) * f11);
    }

    public final int d(Context context) {
        int i4 = this.f31530a;
        if (i4 == -3) {
            return -1;
        }
        if (i4 == -1) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        za.d dVar = va.r.g.f36157a;
        return za.d.b(i4, context);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f31530a == hVar.f31530a && this.f31531b == hVar.f31531b && this.f31532c.equals(hVar.f31532c);
    }

    public final int hashCode() {
        return this.f31532c.hashCode();
    }

    public final String toString() {
        return this.f31532c;
    }

    public h(int i4, int i10, String str) {
        if (i4 < 0 && i4 != -1 && i4 != -3) {
            throw new IllegalArgumentException(d.h.q(i4, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i4).length() + 26)));
        }
        if (i10 < 0 && i10 != -2 && i10 != -4) {
            throw new IllegalArgumentException(d.h.q(i10, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i10).length() + 27)));
        }
        this.f31530a = i4;
        this.f31531b = i10;
        this.f31532c = str;
    }
}
