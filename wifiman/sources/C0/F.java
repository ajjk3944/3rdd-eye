package C0;

import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f2118a = new F();

    private static final class a implements B {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2534n f2119a;

        /* renamed from: b, reason: collision with root package name */
        private final c f2120b;

        /* renamed from: c, reason: collision with root package name */
        private final d f2121c;

        public a(InterfaceC2534n interfaceC2534n, c cVar, d dVar) {
            this.f2119a = interfaceC2534n;
            this.f2120b = cVar;
            this.f2121c = dVar;
        }

        @Override // C0.InterfaceC2534n
        public int R(int i10) {
            return this.f2119a.R(i10);
        }

        @Override // C0.InterfaceC2534n
        public int S(int i10) {
            return this.f2119a.S(i10);
        }

        @Override // C0.B
        public androidx.compose.ui.layout.t T(long j10) {
            d dVar = this.f2121c;
            d dVar2 = d.Width;
            int iL = javax.jmdns.impl.constants.d.CLASS_MASK;
            if (dVar == dVar2) {
                int iS = this.f2120b == c.Max ? this.f2119a.S(Y0.b.k(j10)) : this.f2119a.R(Y0.b.k(j10));
                if (Y0.b.g(j10)) {
                    iL = Y0.b.k(j10);
                }
                return new b(iS, iL);
            }
            int iS2 = this.f2120b == c.Max ? this.f2119a.s(Y0.b.l(j10)) : this.f2119a.s0(Y0.b.l(j10));
            if (Y0.b.h(j10)) {
                iL = Y0.b.l(j10);
            }
            return new b(iL, iS2);
        }

        @Override // C0.InterfaceC2534n
        public Object b() {
            return this.f2119a.b();
        }

        @Override // C0.InterfaceC2534n
        public int s(int i10) {
            return this.f2119a.s(i10);
        }

        @Override // C0.InterfaceC2534n
        public int s0(int i10) {
            return this.f2119a.s0(i10);
        }
    }

    private static final class b extends androidx.compose.ui.layout.t {
        public b(int i10, int i11) {
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

    private enum c {
        Min,
        Max
    }

    private enum d {
        Width,
        Height
    }

    private F() {
    }

    public final int a(x xVar, InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return xVar.b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), new a(interfaceC2534n, c.Max, d.Height), Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(x xVar, InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return xVar.b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), new a(interfaceC2534n, c.Max, d.Width), Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(x xVar, InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return xVar.b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), new a(interfaceC2534n, c.Min, d.Height), Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(x xVar, InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return xVar.b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), new a(interfaceC2534n, c.Min, d.Width), Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
