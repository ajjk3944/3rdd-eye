package com.ui.wifiman.ui.teleport;

import Be.AbstractC2482q;
import Be.AbstractC2485u;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import android.content.res.Resources;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.a0;

/* loaded from: classes4.dex */
public abstract class O {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.o f44982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f44983b;

        /* renamed from: com.ui.wifiman.ui.teleport.O$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1626a extends C6490p implements InterfaceC6824a {
            C1626a(Object obj) {
                super(0, obj, M.class, "onAgreeClicked", "onAgreeClicked()V", 0);
            }

            public final void a() {
                ((M) this.receiver).o0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        a(androidx.compose.foundation.o oVar, M m10) {
            this.f44982a = oVar;
            this.f44983b = m10;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-407219601, i10, -1, "com.ui.wifiman.ui.teleport.TeleportVPNProfileUi.<anonymous> (TeleportVPNProfileUi.kt:35)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C8680c c8680c = C8680c.f66832a;
            float f10 = 8;
            C8680c.f fVarN = c8680c.n(Y0.h.j(f10));
            androidx.compose.foundation.o oVar = this.f44982a;
            M m10 = this.f44983b;
            c.a aVar2 = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(fVarN, aVar2.k(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            rf.z.e(androidx.compose.foundation.layout.o.k(eVarH2, c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null), new d.b(AbstractC6780c.f53550o4), interfaceC3540l, 0, 0);
            rf.z.c(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().c(), Y0.h.j(f10), c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 8, null), new d.b(AbstractC6780c.f53543n4), interfaceC3540l, 0, 0);
            androidx.compose.ui.e eVarD = androidx.compose.foundation.m.d(AbstractC2482q.c(c8688k.a(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), 1.0f, false), oVar, c6562a.a(interfaceC3540l, i11).e().a(), 0.0f, false, false, 28, null), oVar, false, null, false, 14, null);
            C0.C cA2 = AbstractC8685h.a(c8680c.g(), aVar2.k(), interfaceC3540l, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarD);
            InterfaceC6824a interfaceC6824aA2 = aVar3.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA2);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA2, cA2, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(16)), interfaceC3540l, 6);
            AbstractC2485u.d(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null), AbstractC7930a.b(new d.b(AbstractC6780c.f53466c4), interfaceC3540l, 0), c6562a.a(interfaceC3540l, i11).f().a(), interfaceC3540l, 0);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(40)), interfaceC3540l, 6);
            interfaceC3540l.R();
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().c(), c6562a.d(interfaceC3540l, i11).a().b().c());
            String strA = H0.f.a(AbstractC6780c.f53536m4, interfaceC3540l, 0);
            interfaceC3540l.U(537647587);
            boolean zT = interfaceC3540l.T(m10);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C1626a(m10);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            w9.r.b(eVarJ, (InterfaceC6824a) ((th.g) objF), false, false, null, null, strA, null, interfaceC3540l, 0, 188);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.ui.wifiman.ui.teleport.M r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.teleport.O.b(com.ui.wifiman.ui.teleport.M, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(M m10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(m10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
