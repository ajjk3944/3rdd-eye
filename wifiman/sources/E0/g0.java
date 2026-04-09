package E0;

import C0.AbstractC2521a;
import C0.InterfaceC2523c;
import C0.InterfaceC2524d;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f3935a = new g0();

    public interface a {
        C0.D a(InterfaceC2524d interfaceC2524d, C0.B b10, long j10);
    }

    private static final class b implements C0.B {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2534n f3936a;

        /* renamed from: b, reason: collision with root package name */
        private final d f3937b;

        /* renamed from: c, reason: collision with root package name */
        private final e f3938c;

        public b(InterfaceC2534n interfaceC2534n, d dVar, e eVar) {
            this.f3936a = interfaceC2534n;
            this.f3937b = dVar;
            this.f3938c = eVar;
        }

        @Override // C0.InterfaceC2534n
        public int R(int i10) {
            return this.f3936a.R(i10);
        }

        @Override // C0.InterfaceC2534n
        public int S(int i10) {
            return this.f3936a.S(i10);
        }

        @Override // C0.B
        public androidx.compose.ui.layout.t T(long j10) {
            e eVar = this.f3938c;
            e eVar2 = e.Width;
            int iL = javax.jmdns.impl.constants.d.CLASS_MASK;
            if (eVar == eVar2) {
                int iS = this.f3937b == d.Max ? this.f3936a.S(Y0.b.k(j10)) : this.f3936a.R(Y0.b.k(j10));
                if (Y0.b.g(j10)) {
                    iL = Y0.b.k(j10);
                }
                return new c(iS, iL);
            }
            int iS2 = this.f3937b == d.Max ? this.f3936a.s(Y0.b.l(j10)) : this.f3936a.s0(Y0.b.l(j10));
            if (Y0.b.h(j10)) {
                iL = Y0.b.l(j10);
            }
            return new c(iL, iS2);
        }

        @Override // C0.InterfaceC2534n
        public Object b() {
            return this.f3936a.b();
        }

        @Override // C0.InterfaceC2534n
        public int s(int i10) {
            return this.f3936a.s(i10);
        }

        @Override // C0.InterfaceC2534n
        public int s0(int i10) {
            return this.f3936a.s0(i10);
        }
    }

    private static final class c extends androidx.compose.ui.layout.t {
        public c(int i10, int i11) {
            Q0(Y0.s.a(i10, i11));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.t
        public void K0(long j10, float f10, InterfaceC6835l interfaceC6835l) {
        }

        @Override // C0.E
        public int X(AbstractC2521a abstractC2521a) {
            return PduHandle.NONE;
        }
    }

    private enum d {
        Min,
        Max
    }

    private enum e {
        Width,
        Height
    }

    public interface f {
        C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10);
    }

    private g0() {
    }

    public final int a(a aVar, InterfaceC2523c interfaceC2523c, InterfaceC2534n interfaceC2534n, int i10) {
        return aVar.a(new androidx.compose.ui.layout.a(interfaceC2523c, interfaceC2523c.getLayoutDirection()), new b(interfaceC2534n, d.Max, e.Height), Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(f fVar, InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return fVar.b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), new b(interfaceC2534n, d.Max, e.Height), Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int c(a aVar, InterfaceC2523c interfaceC2523c, InterfaceC2534n interfaceC2534n, int i10) {
        return aVar.a(new androidx.compose.ui.layout.a(interfaceC2523c, interfaceC2523c.getLayoutDirection()), new b(interfaceC2534n, d.Max, e.Width), Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int d(f fVar, InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return fVar.b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), new b(interfaceC2534n, d.Max, e.Width), Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int e(a aVar, InterfaceC2523c interfaceC2523c, InterfaceC2534n interfaceC2534n, int i10) {
        return aVar.a(new androidx.compose.ui.layout.a(interfaceC2523c, interfaceC2523c.getLayoutDirection()), new b(interfaceC2534n, d.Min, e.Height), Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int f(f fVar, InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return fVar.b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), new b(interfaceC2534n, d.Min, e.Height), Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int g(a aVar, InterfaceC2523c interfaceC2523c, InterfaceC2534n interfaceC2534n, int i10) {
        return aVar.a(new androidx.compose.ui.layout.a(interfaceC2523c, interfaceC2523c.getLayoutDirection()), new b(interfaceC2534n, d.Min, e.Width), Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int h(f fVar, InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return fVar.b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), new b(interfaceC2534n, d.Min, e.Width), Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
