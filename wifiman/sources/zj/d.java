package zj;

import java.math.BigInteger;
import yj.n;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class d extends b implements yj.k {

    /* renamed from: b, reason: collision with root package name */
    private static final BigInteger f67391b = BigInteger.valueOf(-128);

    /* renamed from: c, reason: collision with root package name */
    private static final BigInteger f67392c = BigInteger.valueOf(127);

    /* renamed from: d, reason: collision with root package name */
    private static final BigInteger f67393d = BigInteger.valueOf(-32768);

    /* renamed from: e, reason: collision with root package name */
    private static final BigInteger f67394e = BigInteger.valueOf(32767);

    /* renamed from: f, reason: collision with root package name */
    private static final BigInteger f67395f = BigInteger.valueOf(-2147483648L);

    /* renamed from: g, reason: collision with root package name */
    private static final BigInteger f67396g = BigInteger.valueOf(2147483647L);

    /* renamed from: h, reason: collision with root package name */
    private static final BigInteger f67397h = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: i, reason: collision with root package name */
    private static final BigInteger f67398i = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    private final BigInteger f67399a;

    public d(BigInteger bigInteger) {
        this.f67399a = bigInteger;
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean C() {
        return super.C();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean G() {
        return super.G();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    @Override // zj.b
    /* renamed from: O */
    public /* bridge */ /* synthetic */ yj.f i() {
        return super.i();
    }

    @Override // zj.b
    /* renamed from: Q */
    public /* bridge */ /* synthetic */ yj.g F() {
        return super.F();
    }

    @Override // zj.b
    /* renamed from: R */
    public /* bridge */ /* synthetic */ yj.h M() {
        return super.M();
    }

    @Override // zj.b
    /* renamed from: S */
    public /* bridge */ /* synthetic */ yj.i D() {
        return super.D();
    }

    @Override // zj.b
    /* renamed from: T */
    public /* bridge */ /* synthetic */ yj.j A() {
        return super.A();
    }

    @Override // zj.b, yj.u
    /* renamed from: U */
    public yj.k x() {
        return this;
    }

    @Override // zj.b
    /* renamed from: V */
    public /* bridge */ /* synthetic */ yj.l o() {
        return super.o();
    }

    @Override // zj.b
    /* renamed from: W */
    public /* bridge */ /* synthetic */ n L() {
        return super.L();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // yj.u
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!uVar.y()) {
            return false;
        }
        return this.f67399a.equals(uVar.x().q());
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.j(this.f67399a);
    }

    @Override // yj.u
    public String g() {
        return this.f67399a.toString();
    }

    public int hashCode() {
        if (f67395f.compareTo(this.f67399a) <= 0 && this.f67399a.compareTo(f67396g) <= 0) {
            return (int) this.f67399a.longValue();
        }
        if (f67397h.compareTo(this.f67399a) > 0 || this.f67399a.compareTo(f67398i) > 0) {
            return this.f67399a.hashCode();
        }
        long jLongValue = this.f67399a.longValue();
        return (int) (jLongValue ^ (jLongValue >>> 32));
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // yj.u
    public w k() {
        return w.INTEGER;
    }

    @Override // yj.r
    public BigInteger q() {
        return this.f67399a;
    }

    @Override // yj.r
    public long toLong() {
        return this.f67399a.longValue();
    }

    public String toString() {
        return g();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean v() {
        return super.v();
    }

    @Override // yj.p
    public boolean w() {
        return this.f67399a.compareTo(f67397h) >= 0 && this.f67399a.compareTo(f67398i) <= 0;
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean y() {
        return super.y();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean z() {
        return super.z();
    }
}
