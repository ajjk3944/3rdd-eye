package p0;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f3110a;

    /* renamed from: b, reason: collision with root package name */
    public String f3111b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3112c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3114e;

    /* renamed from: f, reason: collision with root package name */
    public int f3115f;

    /* renamed from: g, reason: collision with root package name */
    public int f3116g;

    /* renamed from: h, reason: collision with root package name */
    public String f3117h;

    /* renamed from: i, reason: collision with root package name */
    public String f3118i;

    /* renamed from: j, reason: collision with root package name */
    public String f3119j;

    /* renamed from: k, reason: collision with root package name */
    public String f3120k;

    /* renamed from: l, reason: collision with root package name */
    public String f3121l;

    /* renamed from: m, reason: collision with root package name */
    public String f3122m;

    /* renamed from: n, reason: collision with root package name */
    public String f3123n;

    /* renamed from: o, reason: collision with root package name */
    public String f3124o;

    /* renamed from: p, reason: collision with root package name */
    public String f3125p;

    /* renamed from: q, reason: collision with root package name */
    public String f3126q;

    /* renamed from: r, reason: collision with root package name */
    public String f3127r;

    /* renamed from: s, reason: collision with root package name */
    public String f3128s;

    /* renamed from: t, reason: collision with root package name */
    public int f3129t;

    /* renamed from: u, reason: collision with root package name */
    public int f3130u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3131v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3132w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3133x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f3134y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f3135z = -1;
    public int A = -1;

    public String a(boolean z2) {
        return e(this.f3110a, z2);
    }

    public String b(boolean z2) {
        return e(this.f3111b, z2);
    }

    public int c() {
        return this.f3135z;
    }

    public int d() {
        return this.A;
    }

    String e(String str, boolean z2) {
        if (str == null || str.length() <= 0 || str.length() >= 15) {
            return str;
        }
        if (!z2) {
            return null;
        }
        return str + "XXXXXXX";
    }

    public boolean f() {
        return this.f3135z >= 0 && this.A >= 0;
    }

    public boolean g() {
        return this.f3114e;
    }

    public boolean h() {
        return this.f3112c;
    }

    public boolean i() {
        return this.f3113d;
    }

    public String toString() {
        return " IMEI1 : " + this.f3110a + "\n IMEI2 : " + this.f3111b + "\n IS DUAL SIM : " + this.f3114e + "\n IS SIM1 READY : " + this.f3112c + "\n IS SIM2 READY : " + this.f3113d + "\n IS SIM1 networkType : " + n0.g.a(this.f3115f) + "\n IS SIM2 networkType : " + n0.g.a(this.f3116g) + "\n IS SIM1 simOperator : " + this.f3117h + "\n IS SIM2 simOperator : " + this.f3118i + "\n IS SIM1 simOperatorName : " + this.f3119j + "\n IS SIM2 simOperatorName : " + this.f3120k + "\n IS SIM1 simCountryIso : " + this.f3121l + "\n IS SIM2 simCountryIso : " + this.f3122m + "\n IS SIM1 netOperator : " + this.f3123n + "\n IS SIM2 netOperator : " + this.f3124o + "\n IS SIM1 netOperatorName : " + this.f3125p + "\n IS SIM2 netOperatorName : " + this.f3126q + "\n IS SIM1 netCountryIso : " + this.f3127r + "\n IS SIM2 netCountryIso : " + this.f3128s + "\n IS SIM1 Roaming : " + this.f3131v + "\n IS SIM2 Roaming : " + this.f3132w + "\n IS SIM1 dataActive : " + this.f3133x + "\n IS SIM2 dataActive : " + this.f3134y + "\n";
    }
}
