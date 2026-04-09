package ru.andr7e.siminfo;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    String f3237a;

    /* renamed from: b, reason: collision with root package name */
    String f3238b;

    /* renamed from: c, reason: collision with root package name */
    int f3239c;

    /* renamed from: d, reason: collision with root package name */
    int f3240d;

    /* renamed from: e, reason: collision with root package name */
    long f3241e;

    /* renamed from: h, reason: collision with root package name */
    int f3244h;

    /* renamed from: l, reason: collision with root package name */
    int f3248l;

    /* renamed from: m, reason: collision with root package name */
    int f3249m;

    /* renamed from: o, reason: collision with root package name */
    String f3251o;

    /* renamed from: p, reason: collision with root package name */
    String f3252p;

    /* renamed from: r, reason: collision with root package name */
    String f3254r;

    /* renamed from: s, reason: collision with root package name */
    String f3255s;

    /* renamed from: t, reason: collision with root package name */
    String f3256t;

    /* renamed from: u, reason: collision with root package name */
    String f3257u;

    /* renamed from: k, reason: collision with root package name */
    int f3247k = -1;

    /* renamed from: i, reason: collision with root package name */
    boolean f3245i = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f3246j = false;

    /* renamed from: g, reason: collision with root package name */
    int f3243g = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    int f3242f = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    int f3250n = Integer.MAX_VALUE;

    /* renamed from: v, reason: collision with root package name */
    int f3258v = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    int f3259w = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    int f3253q = 0;

    b() {
    }

    public static String b(int i2) {
        return i2 != 2 ? i2 != 3 ? i2 != 4 ? "arfcn" : "nrarfcn" : "earfcn" : "uarfcn";
    }

    public static String c(int i2) {
        if (i2 == 1) {
            return "GSM";
        }
        if (i2 == 2) {
            return "UMTS";
        }
        if (i2 == 3) {
            return "LTE";
        }
        if (i2 == 4) {
            return "5G_NR";
        }
        if (i2 != 5) {
            return null;
        }
        return "5G_NSA";
    }

    String a() {
        String str = this.f3252p;
        return (str == null || str.isEmpty()) ? this.f3251o : this.f3252p;
    }

    void d(boolean z2) {
        this.f3245i = z2;
    }

    void e(int i2) {
        this.f3253q = i2;
    }

    void f(String str) {
        this.f3256t = str;
    }

    void g(String str) {
        this.f3255s = str;
    }

    void h(String str) {
        this.f3254r = str;
    }

    void i(String str) {
        this.f3257u = str;
    }

    void j(int i2) {
        this.f3247k = i2;
    }

    void k(String str, String str2) {
        this.f3237a = str;
        this.f3238b = str2;
    }

    void l(String str) {
        this.f3251o = str;
    }

    void m(String str) {
        this.f3252p = str;
    }

    void n(int i2) {
        this.f3243g = i2;
    }

    void o(int i2) {
        this.f3258v = i2;
    }

    void p(int i2) {
        this.f3259w = i2;
    }

    void q(boolean z2) {
        this.f3246j = z2;
    }

    void r(int i2, int i3) {
        this.f3248l = i2;
        this.f3249m = i3;
    }

    void s(int i2, int i3) {
        this.f3239c = i2;
        this.f3240d = i3;
    }

    void t(int i2, int i3, int i4) {
        this.f3239c = i2;
        this.f3240d = i3;
        this.f3242f = i4;
    }

    void u(int i2, long j2, int i3) {
        this.f3239c = i2;
        this.f3241e = j2;
        this.f3242f = i3;
    }

    void v(int i2) {
        this.f3250n = i2;
    }

    void w(int i2) {
        this.f3244h = i2;
    }
}
