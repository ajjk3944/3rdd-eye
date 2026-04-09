package j2;

import com.google.android.gms.internal.ads.AbstractC1135f5;

/* renamed from: j2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2552h {
    public static final C2552h i = new C2552h(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final C2552h f21338j;

    /* renamed from: k, reason: collision with root package name */
    public static final C2552h f21339k;

    /* renamed from: a, reason: collision with root package name */
    public final int f21340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21341b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21342c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21343d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21344e;

    /* renamed from: f, reason: collision with root package name */
    public int f21345f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21346g;

    /* renamed from: h, reason: collision with root package name */
    public int f21347h;

    static {
        new C2552h(468, 60, "468x60_as");
        new C2552h(320, 100, "320x100_as");
        new C2552h(728, 90, "728x90_as");
        new C2552h(300, 250, "300x250_as");
        new C2552h(160, 600, "160x600_as");
        new C2552h(-1, -2, "smart_banner");
        f21338j = new C2552h(-3, -4, "fluid");
        f21339k = new C2552h(0, 0, "invalid");
        new C2552h(50, 50, "50x50_mb");
        new C2552h(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2552h(int i3, int i6) {
        String strValueOf = i3 == -1 ? "FULL" : String.valueOf(i3);
        String strValueOf2 = i6 == -2 ? "AUTO" : String.valueOf(i6);
        this(i3, i6, AbstractC1135f5.o(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2552h)) {
            return false;
        }
        C2552h c2552h = (C2552h) obj;
        return this.f21340a == c2552h.f21340a && this.f21341b == c2552h.f21341b && this.f21342c.equals(c2552h.f21342c);
    }

    public final int hashCode() {
        return this.f21342c.hashCode();
    }

    public final String toString() {
        return this.f21342c;
    }

    public C2552h(int i3, int i6, String str) {
        if (i3 < 0 && i3 != -1 && i3 != -3) {
            throw new IllegalArgumentException(A.f.i(i3, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i3).length() + 26)));
        }
        if (i6 < 0 && i6 != -2 && i6 != -4) {
            throw new IllegalArgumentException(A.f.i(i6, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i6).length() + 27)));
        }
        this.f21340a = i3;
        this.f21341b = i6;
        this.f21342c = str;
    }
}
