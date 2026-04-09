package v1;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: b, reason: collision with root package name */
    public int f23809b;

    /* renamed from: c, reason: collision with root package name */
    public int f23810c;

    /* renamed from: d, reason: collision with root package name */
    public long f23811d;

    /* renamed from: e, reason: collision with root package name */
    public long f23812e = x.f23817a;

    /* renamed from: f, reason: collision with root package name */
    public long f23813f = 0;

    public v() {
        long j = 0;
        this.f23811d = (j & 4294967295L) | (j << 32);
    }

    public int I() {
        return (int) (this.f23811d & 4294967295L);
    }

    public int K() {
        return (int) (this.f23811d >> 32);
    }

    public final void M() {
        this.f23809b = vc.e.h((int) (this.f23811d >> 32), t2.a.j(this.f23812e), t2.a.h(this.f23812e));
        this.f23810c = vc.e.h((int) (this.f23811d & 4294967295L), t2.a.i(this.f23812e), t2.a.g(this.f23812e));
        int i10 = this.f23809b;
        long j = this.f23811d;
        this.f23813f = (((i10 - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void N(long j, float f10, ar.k kVar);

    public final void O(long j) {
        if (ir.f0.t(this.f23811d, j)) {
            return;
        }
        this.f23811d = j;
        M();
    }

    public final void Q(long j) {
        if (t2.a.b(this.f23812e, j)) {
            return;
        }
        this.f23812e = j;
        M();
    }

    public abstract Object t();
}
