package ak;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f559a;

    /* renamed from: b, reason: collision with root package name */
    public final long f560b;

    /* renamed from: c, reason: collision with root package name */
    public final int f561c;

    /* renamed from: d, reason: collision with root package name */
    public final double f562d;

    /* renamed from: e, reason: collision with root package name */
    public final int f563e;

    /* renamed from: f, reason: collision with root package name */
    public final double f564f;

    /* renamed from: g, reason: collision with root package name */
    public final int f565g;

    /* renamed from: h, reason: collision with root package name */
    public final double f566h;

    /* renamed from: i, reason: collision with root package name */
    public final int f567i;
    public final double j;
    public final double k;

    /* renamed from: l, reason: collision with root package name */
    public final double f568l;

    /* renamed from: m, reason: collision with root package name */
    public final int f569m;

    /* renamed from: n, reason: collision with root package name */
    public final int f570n;

    /* renamed from: o, reason: collision with root package name */
    public final double f571o;

    /* renamed from: p, reason: collision with root package name */
    public final double f572p;

    /* renamed from: q, reason: collision with root package name */
    public final l0 f573q;

    /* renamed from: r, reason: collision with root package name */
    public final String f574r;

    /* renamed from: s, reason: collision with root package name */
    public final long f575s;

    /* renamed from: t, reason: collision with root package name */
    public final String f576t;

    /* renamed from: u, reason: collision with root package name */
    public final String f577u;

    /* renamed from: v, reason: collision with root package name */
    public final int f578v;

    public j0(String str, long j, int i10, double d6, int i11, double d10, int i12, double d11, int i13, double d12, double d13, double d14, int i14, int i15, double d15, double d16, l0 l0Var, String str2, long j7, String str3, String str4, int i16) {
        br.l.e(str, "taskName");
        br.l.e(l0Var, "qosTestType");
        this.f559a = str;
        this.f560b = j;
        this.f561c = i10;
        this.f562d = d6;
        this.f563e = i11;
        this.f564f = d10;
        this.f565g = i12;
        this.f566h = d11;
        this.f567i = i13;
        this.j = d12;
        this.k = d13;
        this.f568l = d14;
        this.f569m = i14;
        this.f570n = i15;
        this.f571o = d15;
        this.f572p = d16;
        this.f573q = l0Var;
        this.f574r = str2;
        this.f575s = j7;
        this.f576t = str3;
        this.f577u = str4;
        this.f578v = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return br.l.a(this.f559a, j0Var.f559a) && this.f560b == j0Var.f560b && this.f561c == j0Var.f561c && Double.compare(this.f562d, j0Var.f562d) == 0 && this.f563e == j0Var.f563e && Double.compare(this.f564f, j0Var.f564f) == 0 && this.f565g == j0Var.f565g && Double.compare(this.f566h, j0Var.f566h) == 0 && this.f567i == j0Var.f567i && Double.compare(this.j, j0Var.j) == 0 && Double.compare(this.k, j0Var.k) == 0 && Double.compare(this.f568l, j0Var.f568l) == 0 && this.f569m == j0Var.f569m && this.f570n == j0Var.f570n && Double.compare(this.f571o, j0Var.f571o) == 0 && Double.compare(this.f572p, j0Var.f572p) == 0 && this.f573q == j0Var.f573q && br.l.a(this.f574r, j0Var.f574r) && this.f575s == j0Var.f575s && br.l.a(this.f576t, j0Var.f576t) && br.l.a(this.f577u, j0Var.f577u) && this.f578v == j0Var.f578v;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f578v) + c7.a.g(this.f577u, c7.a.g(this.f576t, h0.b.b(c7.a.g(this.f574r, (this.f573q.hashCode() + h0.b.a(this.f572p, h0.b.a(this.f571o, c7.a.C(this.f570n, c7.a.C(this.f569m, h0.b.a(this.f568l, h0.b.a(this.k, h0.b.a(this.j, c7.a.C(this.f567i, h0.b.a(this.f566h, c7.a.C(this.f565g, h0.b.a(this.f564f, c7.a.C(this.f563e, h0.b.a(this.f562d, c7.a.C(this.f561c, h0.b.b(this.f559a.hashCode() * 31, 31, this.f560b), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31, this.f575s), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QosResultItem(taskName=");
        sb2.append(this.f559a);
        sb2.append(", executionDate=");
        sb2.append(this.f560b);
        sb2.append(", connectionType=");
        sb2.append(this.f561c);
        sb2.append(", download=");
        sb2.append(this.f562d);
        sb2.append(", downloadTestStatus=");
        sb2.append(this.f563e);
        sb2.append(", upload=");
        sb2.append(this.f564f);
        sb2.append(", uploadTestStatus=");
        sb2.append(this.f565g);
        sb2.append(", latency=");
        sb2.append(this.f566h);
        sb2.append(", latencyTestStatus=");
        sb2.append(this.f567i);
        sb2.append(", jitter=");
        sb2.append(this.j);
        sb2.append(", packetDiscard=");
        sb2.append(this.k);
        sb2.append(", icmp=");
        sb2.append(this.f568l);
        sb2.append(", icmpTestStatus=");
        sb2.append(this.f569m);
        sb2.append(", rssi=");
        sb2.append(this.f570n);
        sb2.append(", latitude=");
        sb2.append(this.f571o);
        sb2.append(", longitude=");
        sb2.append(this.f572p);
        sb2.append(", qosTestType=");
        sb2.append(this.f573q);
        sb2.append(", connectionId=");
        sb2.append(this.f574r);
        sb2.append(", connectionStartDate=");
        sb2.append(this.f575s);
        sb2.append(", connectionSsid=");
        sb2.append(this.f576t);
        sb2.append(", connectionAccessPoint=");
        sb2.append(this.f577u);
        sb2.append(", connectionTechnology=");
        return c7.a.q(sb2, this.f578v, ')');
    }
}
