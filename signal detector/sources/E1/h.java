package e1;

import V0.m;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f19908a;

    /* renamed from: b, reason: collision with root package name */
    public int f19909b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f19910c;

    /* renamed from: d, reason: collision with root package name */
    public String f19911d;

    /* renamed from: e, reason: collision with root package name */
    public V0.f f19912e;

    /* renamed from: f, reason: collision with root package name */
    public V0.f f19913f;

    /* renamed from: g, reason: collision with root package name */
    public long f19914g;

    /* renamed from: h, reason: collision with root package name */
    public long f19915h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public V0.c f19916j;

    /* renamed from: k, reason: collision with root package name */
    public int f19917k;

    /* renamed from: l, reason: collision with root package name */
    public int f19918l;

    /* renamed from: m, reason: collision with root package name */
    public long f19919m;

    /* renamed from: n, reason: collision with root package name */
    public long f19920n;

    /* renamed from: o, reason: collision with root package name */
    public long f19921o;

    /* renamed from: p, reason: collision with root package name */
    public long f19922p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19923q;

    /* renamed from: r, reason: collision with root package name */
    public int f19924r;

    static {
        m.h("WorkSpec");
    }

    public h(String str, String str2) {
        V0.f fVar = V0.f.f3820c;
        this.f19912e = fVar;
        this.f19913f = fVar;
        this.f19916j = V0.c.i;
        this.f19918l = 1;
        this.f19919m = 30000L;
        this.f19922p = -1L;
        this.f19924r = 1;
        this.f19908a = str;
        this.f19910c = str2;
    }

    public final long a() {
        int i;
        if (this.f19909b == 1 && (i = this.f19917k) > 0) {
            return Math.min(18000000L, this.f19918l == 2 ? this.f19919m * i : (long) Math.scalb(this.f19919m, i - 1)) + this.f19920n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f19920n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f19914g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j6 = this.f19920n;
        if (j6 == 0) {
            j6 = this.f19914g + jCurrentTimeMillis2;
        }
        long j7 = this.i;
        long j8 = this.f19915h;
        if (j7 != j8) {
            return j6 + j8 + (j6 == 0 ? j7 * (-1) : 0L);
        }
        return j6 + (j6 != 0 ? j8 : 0L);
    }

    public final boolean b() {
        return !V0.c.i.equals(this.f19916j);
    }

    public final boolean c() {
        return this.f19915h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f19914g != hVar.f19914g || this.f19915h != hVar.f19915h || this.i != hVar.i || this.f19917k != hVar.f19917k || this.f19919m != hVar.f19919m || this.f19920n != hVar.f19920n || this.f19921o != hVar.f19921o || this.f19922p != hVar.f19922p || this.f19923q != hVar.f19923q || !this.f19908a.equals(hVar.f19908a) || this.f19909b != hVar.f19909b || !this.f19910c.equals(hVar.f19910c)) {
            return false;
        }
        String str = this.f19911d;
        if (str != null) {
            if (!str.equals(hVar.f19911d)) {
                return false;
            }
        } else if (hVar.f19911d != null) {
            return false;
        }
        return this.f19912e.equals(hVar.f19912e) && this.f19913f.equals(hVar.f19913f) && this.f19916j.equals(hVar.f19916j) && this.f19918l == hVar.f19918l && this.f19924r == hVar.f19924r;
    }

    public final int hashCode() {
        int iHashCode = (this.f19910c.hashCode() + ((AbstractC2984e.c(this.f19909b) + (this.f19908a.hashCode() * 31)) * 31)) * 31;
        String str = this.f19911d;
        int iHashCode2 = (this.f19913f.hashCode() + ((this.f19912e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j6 = this.f19914g;
        int i = (iHashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f19915h;
        int i3 = (i + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.i;
        int iC = (AbstractC2984e.c(this.f19918l) + ((((this.f19916j.hashCode() + ((i3 + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31) + this.f19917k) * 31)) * 31;
        long j9 = this.f19919m;
        int i6 = (iC + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f19920n;
        int i7 = (i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f19921o;
        int i8 = (i7 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f19922p;
        return AbstractC2984e.c(this.f19924r) + ((((i8 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f19923q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return A.f.p(new StringBuilder("{WorkSpec: "), this.f19908a, "}");
    }
}
