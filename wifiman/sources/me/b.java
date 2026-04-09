package Me;

import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.AbstractC3309a0;
import N.AbstractC3346t0;
import N.O0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import W0.t;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import r.AbstractC7521c;
import r0.AbstractC7554d;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.C8680c;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class b {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f13119a;

        a(float f10) {
            this.f13119a = f10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1333964946, i10, -1, "com.ui.wifiman.ui.discovery.component.DiscoveryProgressContainer.<anonymous> (DiscoveryProgressContainer.kt:41)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarB = androidx.compose.animation.f.b(o.j(r.b(aVar, 0.0f, Y0.h.j(52), 1, null), Y0.h.j(16), Y0.h.j(12)), null, null, 3, null);
            c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
            C8680c.f fVarN = C8680c.f66832a.n(Y0.h.j(8));
            float f10 = this.f13119a;
            C cB = W.b(fVarN, interfaceC1752cI, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarB);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            if (f10 < 1.0f) {
                interfaceC3540l.U(-1403493402);
                AbstractC3346t0.a(((Number) AbstractC7521c.d(f10, null, 0.0f, "discovery progress", null, interfaceC3540l, 3072, 22).getValue()).floatValue(), r.v(aVar, Y0.h.j(24)), 0L, Y0.h.j(1), 0L, 0, interfaceC3540l, 3120, 52);
                C3174d c3174dA = AbstractC7930a.a(new d.b(AbstractC6780c.f53609x0), interfaceC3540l, 0);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                a1.c(c3174dA, null, c6562a.a(interfaceC3540l, i11).f().c(), 0L, null, null, null, 0L, null, null, 0L, t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540l, i11).b().f(), interfaceC3540l, 0, 3120, 120826);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-1402875572);
                androidx.compose.ui.e eVarV = r.v(aVar, Y0.h.j(24));
                AbstractC7554d abstractC7554dI = AbstractC8049c.i(N9.b.f16117a.o(), interfaceC3540l, 0);
                int i12 = AbstractC6780c.f53602w0;
                String strB = AbstractC7930a.b(new d.b(i12), interfaceC3540l, 0);
                C6562a c6562a2 = C6562a.f52458a;
                int i13 = C6562a.f52459b;
                AbstractC3309a0.a(abstractC7554dI, strB, eVarV, c6562a2.a(interfaceC3540l, i13).a().d().f(), interfaceC3540l, 384, 0);
                a1.c(AbstractC7930a.a(new d.b(i12), interfaceC3540l, 0), null, c6562a2.a(interfaceC3540l, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, t.f23567a.b(), false, 1, 0, null, null, c6562a2.c(interfaceC3540l, i13).b().f(), interfaceC3540l, 0, 3120, 120826);
                interfaceC3540l.J();
            }
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final float f10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(408186198);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(408186198, i11, -1, "com.ui.wifiman.ui.discovery.component.DiscoveryProgressContainer (DiscoveryProgressContainer.kt:35)");
            }
            O0.a(modifier, E.h.d(Y0.h.j(50)), 0L, 0L, null, Y0.h.j(6), b0.c.e(1333964946, true, new a(f10), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 1769472, 28);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Me.a
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return b.c(modifier, f10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, float f10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, f10, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
