package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class we1 implements cg1 {
    public final ye1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public we1(ye1 ye1Var, long j, long j2, long j3, long j4, long j5) {
        this.a = ye1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.cg1
    public final long a() {
        return this.b;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        dg1 dg1Var = new dg1(j, xe1.a(this.a.d(j), 0L, this.c, this.d, this.e, this.f));
        return new bg1(dg1Var, dg1Var);
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return true;
    }
}
