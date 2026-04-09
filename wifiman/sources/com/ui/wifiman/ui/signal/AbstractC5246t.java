package com.ui.wifiman.ui.signal;

import Be.AbstractC2480o;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import com.ui.wifiman.ui.signal.AbstractC5239l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6778a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;

/* renamed from: com.ui.wifiman.ui.signal.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5246t {

    /* renamed from: com.ui.wifiman.ui.signal.t$a */
    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, AbstractC5240m.class, "onUnavailablePrimaryButtonClicked", "onUnavailablePrimaryButtonClicked()V", 0);
        }

        public final void a() {
            ((AbstractC5240m) this.receiver).u0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, final AbstractC5239l.b reason, final AbstractC5240m vm, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC7929a interfaceC7929aC;
        d.b bVar;
        d.b bVar2;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(reason, "reason");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1560466787);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(reason) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(vm) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1560466787, i12, -1, "com.ui.wifiman.ui.signal.SignalTabFloorplanUiEmpty (SignalTabFloorplanUiEmpty.kt:22)");
            }
            d.b bVar3 = null;
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(eVar3, 0.0f, 1, null);
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.e(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarF);
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
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(eVarH, c6562a.d(interfaceC3540lR, i14).a().a().a(Y0.h.j(32)), c6562a.d(interfaceC3540lR, i14).a().b().d());
            boolean z10 = reason instanceof AbstractC5239l.b.AbstractC1612b.a;
            if (z10) {
                interfaceC7929aC = new c.a(AbstractC6778a.f53243n0, null, 2, null);
            } else {
                if (!(reason instanceof AbstractC5239l.b.a) && !(reason instanceof AbstractC5239l.b.AbstractC1612b.C1613b) && !(reason instanceof AbstractC5239l.b.AbstractC1612b.d) && !(reason instanceof AbstractC5239l.b.AbstractC1612b.c) && !(reason instanceof AbstractC5239l.b.AbstractC1612b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC7929aC = N9.b.f16117a.c();
            }
            boolean z11 = reason instanceof AbstractC5239l.b.a;
            if (z11) {
                bVar = new d.b(AbstractC6780c.f53597v2);
            } else {
                if (!(reason instanceof AbstractC5239l.b.AbstractC1612b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new d.b(AbstractC6780c.f53604w2);
            }
            if (z11) {
                bVar2 = new d.b(AbstractC6780c.f53590u2);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.d.a) {
                bVar2 = new d.b(AbstractC6780c.f53618y2);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.C1613b) {
                bVar2 = new d.b(AbstractC6780c.f53319H0);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.d.c) {
                bVar2 = new d.b(AbstractC6780c.f53430X0);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.d.C1614b) {
                bVar2 = new d.b(AbstractC6780c.f53417V0);
            } else if (z10) {
                bVar2 = new d.b(AbstractC6780c.f53298E0);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.c) {
                bVar2 = new d.b(AbstractC6780c.f53347L0);
            } else {
                if (!(reason instanceof AbstractC5239l.b.AbstractC1612b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = new d.b(AbstractC6780c.f53396S0);
            }
            if (z11) {
                bVar3 = new d.b(AbstractC6780c.f53576s2);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.d.a) {
                bVar3 = new d.b(AbstractC6780c.f53611x2);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.C1613b) {
                bVar3 = new d.b(AbstractC6780c.f53312G0);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.d.c) {
                bVar3 = new d.b(AbstractC6780c.f53424W0);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.d.C1614b) {
                bVar3 = new d.b(AbstractC6780c.f53410U0);
            } else if (z10) {
                bVar3 = new d.b(AbstractC6780c.f53291D0);
            } else if (reason instanceof AbstractC5239l.b.AbstractC1612b.c) {
                bVar3 = new d.b(AbstractC6780c.f53340K0);
            } else if (!(reason instanceof AbstractC5239l.b.AbstractC1612b.e)) {
                throw new NoWhenBranchMatchedException();
            }
            d.b bVar4 = bVar3;
            interfaceC3540lR.U(992429747);
            boolean z12 = (i12 & 896) == 256;
            Object objF = interfaceC3540lR.f();
            if (z12 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(vm);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2480o.f(eVarJ, interfaceC7929aC, bVar, bVar2, null, bVar4, (InterfaceC6824a) ((th.g) objF), null, null, interfaceC3540lR, 0, 400);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar2;
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.signal.s
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5246t.c(eVar4, reason, vm, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, AbstractC5239l.b bVar, AbstractC5240m abstractC5240m, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, bVar, abstractC5240m, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
