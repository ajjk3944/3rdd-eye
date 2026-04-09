package zj;

import yj.n;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class f extends b implements yj.h {

    /* renamed from: b, reason: collision with root package name */
    public static final yj.h f67400b = new f(true);

    /* renamed from: c, reason: collision with root package name */
    public static final yj.h f67401c = new f(false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f67402a;

    private f(boolean z10) {
        this.f67402a = z10;
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

    @Override // zj.b, yj.u
    /* renamed from: R */
    public yj.h M() {
        return this;
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
        return uVar.H() && this.f67402a == uVar.M().s();
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.s(this.f67402a);
    }

    @Override // yj.u
    public String g() {
        return Boolean.toString(this.f67402a);
    }

    public int hashCode() {
        return this.f67402a ? 1231 : 1237;
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // yj.u
    public w k() {
        return w.BOOLEAN;
    }

    @Override // yj.c
    public boolean s() {
        return this.f67402a;
    }

    public String toString() {
        return g();
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
