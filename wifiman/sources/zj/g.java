package zj;

import yj.n;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class g extends b implements yj.j {

    /* renamed from: a, reason: collision with root package name */
    private final double f67403a;

    public g(double d10) {
        this.f67403a = d10;
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

    @Override // zj.b, yj.u
    /* renamed from: T */
    public yj.j A() {
        return this;
    }

    @Override // zj.b
    /* renamed from: U */
    public /* bridge */ /* synthetic */ yj.k x() {
        return super.x();
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
        return uVar.N() && this.f67403a == uVar.A().m();
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.v(this.f67403a);
    }

    @Override // yj.u
    public String g() {
        return (Double.isNaN(this.f67403a) || Double.isInfinite(this.f67403a)) ? "null" : Double.toString(this.f67403a);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f67403a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // yj.u
    public w k() {
        return w.FLOAT;
    }

    @Override // yj.r
    public double m() {
        return this.f67403a;
    }

    public String toString() {
        return Double.toString(this.f67403a);
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean v() {
        return super.v();
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
