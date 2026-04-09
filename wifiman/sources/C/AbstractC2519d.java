package C;

import B.F;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;

/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2519d {

    /* renamed from: C.d$a */
    public static final class a implements F {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f1978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1979b;

        a(C c10, boolean z10) {
            this.f1978a = c10;
            this.f1979b = z10;
        }

        @Override // B.F
        public int a() {
            return this.f1978a.C().e() == w.q.Vertical ? Y0.r.f(this.f1978a.C().b()) : Y0.r.g(this.f1978a.C().b());
        }

        @Override // B.F
        public float b() {
            return y.a(this.f1978a);
        }

        @Override // B.F
        public int c() {
            return this.f1978a.C().f() + this.f1978a.C().c();
        }

        @Override // B.F
        public float d() {
            return D.g(this.f1978a.C(), this.f1978a.F());
        }

        @Override // B.F
        public J0.b e() {
            return this.f1979b ? new J0.b(this.f1978a.F(), 1) : new J0.b(1, this.f1978a.F());
        }

        @Override // B.F
        public Object f(int i10, InterfaceC5380e interfaceC5380e) {
            Object objZ = C.Z(this.f1978a, i10, 0.0f, interfaceC5380e, 2, null);
            return objZ == AbstractC5467b.g() ? objZ : J.f24997a;
        }
    }

    public static final F a(C c10, boolean z10) {
        return new a(c10, z10);
    }
}
