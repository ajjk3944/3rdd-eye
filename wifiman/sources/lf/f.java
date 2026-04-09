package lf;

import Be.AbstractC2480o;
import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import lf.k;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;

/* loaded from: classes4.dex */
public abstract class f {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, l.class, "onEmptyPrimaryButtonClicked", "onEmptyPrimaryButtonClicked()V", 0);
        }

        public final void a() {
            ((l) this.receiver).p0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final k.b reason, final l vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        d.b bVar;
        d.b bVar2;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(reason, "reason");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1633968793);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(reason) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1633968793, i11, -1, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerEmptyUi (SpeedtestInternetServerPickerEmptyUi.kt:20)");
            }
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.e(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
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
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            d.b bVar3 = null;
            androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = o.j(eVarH, c6562a.d(interfaceC3540lR, i12).a().a().a(Y0.h.j(32)), c6562a.d(interfaceC3540lR, i12).a().b().d());
            s9.b bVarJ = N9.b.f16117a.J();
            boolean z10 = reason instanceof k.b.a;
            if (z10) {
                bVar = new d.b(AbstractC6780c.f53273A3);
            } else {
                if (!(reason instanceof k.b.C1945b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new d.b(AbstractC6780c.f53294D3);
            }
            if (z10) {
                bVar2 = new d.b(AbstractC6780c.f53626z3);
            } else {
                if (!(reason instanceof k.b.C1945b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = new d.b(AbstractC6780c.f53287C3);
            }
            if (!z10) {
                if (!(reason instanceof k.b.C1945b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar3 = new d.b(AbstractC6780c.f53280B3);
            }
            interfaceC3540lR.U(-1587071738);
            boolean z11 = (i11 & 896) == 256;
            Object objF = interfaceC3540lR.f();
            if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(vm);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2480o.f(eVarJ, bVarJ, bVar, bVar2, null, bVar3, (InterfaceC6824a) ((th.g) objF), null, null, interfaceC3540lR, 12582912, 272);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: lf.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return f.c(modifier, reason, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, k.b bVar, l lVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, bVar, lVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
