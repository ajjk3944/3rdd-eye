package A;

import B.F;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;

/* loaded from: classes.dex */
public abstract class e {

    public static final class a implements F {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B f83a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f84b;

        a(B b10, boolean z10) {
            this.f83a = b10;
            this.f84b = z10;
        }

        @Override // B.F
        public int a() {
            return this.f83a.w().e() == w.q.Vertical ? Y0.r.f(this.f83a.w().b()) : Y0.r.g(this.f83a.w().b());
        }

        @Override // B.F
        public float b() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f83a.r(), this.f83a.s());
        }

        @Override // B.F
        public int c() {
            return this.f83a.w().f() + this.f83a.w().c();
        }

        @Override // B.F
        public float d() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f83a.r(), this.f83a.s(), this.f83a.e());
        }

        @Override // B.F
        public J0.b e() {
            return this.f84b ? new J0.b(-1, 1) : new J0.b(1, -1);
        }

        @Override // B.F
        public Object f(int i10, InterfaceC5380e interfaceC5380e) {
            Object objK = B.K(this.f83a, i10, 0, interfaceC5380e, 2, null);
            return objK == AbstractC5467b.g() ? objK : J.f24997a;
        }
    }

    public static final F a(B b10, boolean z10) {
        return new a(b10, z10);
    }
}
