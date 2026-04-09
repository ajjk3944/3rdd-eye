package zj;

import java.math.BigInteger;
import yj.n;
import yj.p;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class i extends b implements yj.k {

    /* renamed from: a, reason: collision with root package name */
    private final long f67406a;

    public i(long j10) {
        this.f67406a = j10;
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
        p pVarX = uVar.x();
        return pVarX.w() && this.f67406a == pVarX.toLong();
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.C(this.f67406a);
    }

    @Override // yj.u
    public String g() {
        return Long.toString(this.f67406a);
    }

    public int hashCode() {
        long j10 = this.f67406a;
        return (-2147483648L > j10 || j10 > 2147483647L) ? (int) (j10 ^ (j10 >>> 32)) : (int) j10;
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
        return BigInteger.valueOf(this.f67406a);
    }

    @Override // yj.r
    public long toLong() {
        return this.f67406a;
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
        return true;
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
