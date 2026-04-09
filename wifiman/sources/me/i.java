package Me;

import Be.AbstractC2487w;
import C0.C;
import E0.InterfaceC2629g;
import Ee.K;
import L0.C3174d;
import L0.U;
import Me.g;
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
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import s9.InterfaceC7929a;
import sa.AbstractC7930a;
import z.AbstractC8696t;
import z.C8680c;
import z.InterfaceC8675A;
import z.W;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public abstract class i {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f13143a;

        /* renamed from: Me.i$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0523a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13144a;

            static {
                int[] iArr = new int[g.a.values().length];
                try {
                    iArr[g.a.IDENTIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.a.UNIDENTIFIED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f13144a = iArr;
            }
        }

        a(g gVar) {
            this.f13143a = gVar;
        }

        public final void a(InterfaceC8675A FlowRow, InterfaceC3540l interfaceC3540l, int i10) {
            long jA;
            AbstractC6492s.i(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(786734619, i10, -1, "com.ui.wifiman.ui.discovery.component.DiscoveryResultLan.<anonymous>.<anonymous> (DiscoveryResultLan.kt:76)");
            }
            C3174d c3174dA = AbstractC7930a.a(this.f13143a.d(), interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            U uB = c6562a.c(interfaceC3540l, i11).b().b();
            int i12 = C0523a.f13144a[this.f13143a.e().ordinal()];
            if (i12 == 1) {
                interfaceC3540l.U(1506125087);
                jA = c6562a.a(interfaceC3540l, i11).f().a();
                interfaceC3540l.J();
            } else {
                if (i12 != 2) {
                    interfaceC3540l.U(1506122120);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(1506127775);
                jA = c6562a.a(interfaceC3540l, i11).f().b();
                interfaceC3540l.J();
            }
            a1.c(c3174dA, null, jA, 0L, null, null, null, 0L, null, null, 0L, t.f23567a.b(), false, 1, 0, null, null, uB, interfaceC3540l, 0, 3120, 120826);
            Iterator it = this.f13143a.c().iterator();
            while (it.hasNext()) {
                ((De.g) it.next()).c(interfaceC3540l, 0);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8675A) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final g item, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(item, "item");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1306186820);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(item) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1306186820, i11, -1, "com.ui.wifiman.ui.discovery.component.DiscoveryResultLan (DiscoveryResultLan.kt:56)");
            }
            float f10 = 4;
            androidx.compose.ui.e eVarJ = o.j(r.b(modifier, 0.0f, Y0.h.j(48), 1, null), Y0.h.j(16), Y0.h.j(f10));
            c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
            C8680c c8680c = C8680c.f66832a;
            C cB = W.b(c8680c.f(), interfaceC1752cI, interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            Z z10 = Z.f66823a;
            InterfaceC7929a interfaceC7929aA = item.a();
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            AbstractC2487w.b(interfaceC7929aA, r.v(aVar2, Y0.h.j(28)), null, null, null, 0.0f, 0L, interfaceC3540lR, 48, 62);
            a0.a(r.z(aVar2, Y0.h.j(12)), interfaceC3540lR, 6);
            androidx.compose.ui.e eVarA = z10.a(aVar2, 1.0f, true);
            float f11 = 8;
            AbstractC8696t.a(eVarA, c8680c.n(Y0.h.j(f11)), c8680c.n(Y0.h.j(f10)), 0, 0, null, b0.c.e(786734619, true, new a(item), interfaceC3540lR, 54), interfaceC3540lR, 1573296, 56);
            a0.a(r.z(aVar2, Y0.h.j(f11)), interfaceC3540lR, 6);
            C3174d c3174dA = AbstractC7930a.a(item.b(), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.c(c3174dA, null, c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i12).b().f(), interfaceC3540lR, 0, 3120, 120826);
            androidx.compose.ui.e eVarZ = r.z(aVar2, Y0.h.j(f11));
            interfaceC3540l2 = interfaceC3540lR;
            a0.a(eVarZ, interfaceC3540l2, 6);
            K.b(null, interfaceC3540l2, 0, 1);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Me.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.c(modifier, item, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, g gVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, gVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
