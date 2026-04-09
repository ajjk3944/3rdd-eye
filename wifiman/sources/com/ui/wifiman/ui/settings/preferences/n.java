package com.ui.wifiman.ui.settings.preferences;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import Yg.J;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.a0;

/* loaded from: classes4.dex */
public abstract class n {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f44696a;

        a(l lVar) {
            this.f44696a = lVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            C3174d c3174d;
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1688861555, i10, -1, "com.ui.wifiman.ui.settings.preferences.DirectConsoleConnectionExplanationUi.<anonymous> (DirectConsoleConnectionExplanationUi.kt:60)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            c.b bVarG = f0.c.f46573a.g();
            l lVar = this.f44696a;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarG, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(8)), interfaceC3540l, 6);
            s9.b bVarI = Pe.a.f18599a.i();
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(80));
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            AbstractC8049c.c(bVarI, eVarV, C6733v0.g(c6562a.a(interfaceC3540l, i11).a().b().b()), null, interfaceC3540l, 54, 4);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(16)), interfaceC3540l, 6);
            String str = (String) o1.b(lVar.n0(), null, interfaceC3540l, 0, 1).getValue();
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            if (str != null) {
                interfaceC3540l.U(1435086163);
                c3174d = uf.b.f62937a.a(str, AbstractC6780c.f53381Q, interfaceC3540l, 384);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(1435298885);
                c3174d = new C3174d(H0.f.a(AbstractC6780c.f53416V, interfaceC3540l, 0), null, null, 6, null);
                interfaceC3540l.J();
            }
            a1.c(c3174d, eVarK, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.d()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 130552);
            v0.b(null, interfaceC3540l, 0, 1);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.ui.wifiman.ui.settings.preferences.l r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.settings.preferences.n.b(com.ui.wifiman.ui.settings.preferences.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(l lVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(lVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
