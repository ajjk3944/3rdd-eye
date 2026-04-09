package o0;

import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;
import m0.InterfaceC6717n0;
import m0.M0;
import m0.U0;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7035b {

    /* renamed from: o0.b$a */
    public static final class a implements InterfaceC7041h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7037d f55032a;

        a(InterfaceC7037d interfaceC7037d) {
            this.f55032a = interfaceC7037d;
        }

        @Override // o0.InterfaceC7041h
        public void a(float[] fArr) {
            this.f55032a.d().n(fArr);
        }

        @Override // o0.InterfaceC7041h
        public void b(float f10, float f11, float f12, float f13, int i10) {
            this.f55032a.d().b(f10, f11, f12, f13, i10);
        }

        @Override // o0.InterfaceC7041h
        public void c(float f10, float f11) {
            this.f55032a.d().c(f10, f11);
        }

        @Override // o0.InterfaceC7041h
        public void d(U0 u02, int i10) {
            this.f55032a.d().d(u02, i10);
        }

        @Override // o0.InterfaceC7041h
        public void f(float f10, float f11, long j10) {
            InterfaceC6717n0 interfaceC6717n0D = this.f55032a.d();
            interfaceC6717n0D.c(C6531g.m(j10), C6531g.n(j10));
            interfaceC6717n0D.e(f10, f11);
            interfaceC6717n0D.c(-C6531g.m(j10), -C6531g.n(j10));
        }

        @Override // o0.InterfaceC7041h
        public void g(float f10, float f11, float f12, float f13) {
            InterfaceC6717n0 interfaceC6717n0D = this.f55032a.d();
            InterfaceC7037d interfaceC7037d = this.f55032a;
            long jA = AbstractC6538n.a(C6537m.i(j()) - (f12 + f10), C6537m.g(j()) - (f13 + f11));
            if (!(C6537m.i(jA) >= 0.0f && C6537m.g(jA) >= 0.0f)) {
                M0.a("Width and height must be greater than or equal to zero");
            }
            interfaceC7037d.f(jA);
            interfaceC6717n0D.c(f10, f11);
        }

        @Override // o0.InterfaceC7041h
        public void i(float f10, long j10) {
            InterfaceC6717n0 interfaceC6717n0D = this.f55032a.d();
            interfaceC6717n0D.c(C6531g.m(j10), C6531g.n(j10));
            interfaceC6717n0D.f(f10);
            interfaceC6717n0D.c(-C6531g.m(j10), -C6531g.n(j10));
        }

        public long j() {
            return this.f55032a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7041h b(InterfaceC7037d interfaceC7037d) {
        return new a(interfaceC7037d);
    }
}
