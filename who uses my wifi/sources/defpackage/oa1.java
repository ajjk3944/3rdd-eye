package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oa1 {
    public String a;
    public int b = 1;
    public String c;
    public String d;
    public im e;
    public im f;
    public long g;
    public long h;
    public long i;
    public ri j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;

    static {
        h80.f("WorkSpec");
    }

    public oa1(String str, String str2) {
        im imVar = im.c;
        this.e = imVar;
        this.f = imVar;
        this.j = ri.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.a = str;
        this.c = str2;
    }

    public final long a() {
        int i;
        if (this.b == 1 && (i = this.k) > 0) {
            return Math.min(18000000L, this.l == 2 ? this.m * i : (long) Math.scalb(this.m, i - 1)) + this.n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.n;
        if (j == 0) {
            j = this.g + jCurrentTimeMillis2;
        }
        long j2 = this.i;
        long j3 = this.h;
        if (j2 != j3) {
            return j + j3 + (j == 0 ? j2 * (-1) : 0L);
        }
        return j + (j != 0 ? j3 : 0L);
    }

    public final boolean b() {
        return !ri.i.equals(this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oa1.class != obj.getClass()) {
            return false;
        }
        oa1 oa1Var = (oa1) obj;
        if (this.g != oa1Var.g || this.h != oa1Var.h || this.i != oa1Var.i || this.k != oa1Var.k || this.m != oa1Var.m || this.n != oa1Var.n || this.o != oa1Var.o || this.p != oa1Var.p || this.q != oa1Var.q || !this.a.equals(oa1Var.a) || this.b != oa1Var.b || !this.c.equals(oa1Var.c)) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            if (!str.equals(oa1Var.d)) {
                return false;
            }
        } else if (oa1Var.d != null) {
            return false;
        }
        return this.e.equals(oa1Var.e) && this.f.equals(oa1Var.f) && this.j.equals(oa1Var.j) && this.l == oa1Var.l && this.r == oa1Var.r;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((ex0.s(this.b) + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.g;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int iS = (ex0.s(this.l) + ((((this.j.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31;
        long j4 = this.m;
        int i3 = (iS + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.p;
        return ex0.s(this.r) + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return ex0.k(new StringBuilder("{WorkSpec: "), this.a, "}");
    }
}
