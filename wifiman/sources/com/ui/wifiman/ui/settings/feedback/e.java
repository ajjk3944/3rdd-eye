package com.ui.wifiman.ui.settings.feedback;

import C0.C;
import E.g;
import E0.InterfaceC2629g;
import L0.S;
import L0.U;
import N.AbstractC3341q0;
import N.S0;
import N.T0;
import N.a1;
import R0.Q;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import T.t1;
import Y0.h;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import com.ui.wifiman.ui.settings.feedback.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f44626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.settings.feedback.a f44627b;

        /* renamed from: com.ui.wifiman.ui.settings.feedback.e$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1573a extends C6490p implements InterfaceC6824a {
            C1573a(Object obj) {
                super(0, obj, com.ui.wifiman.ui.settings.feedback.a.class, "onSubmitClicked", "onSubmitClicked()V", 0);
            }

            public final void a() {
                ((com.ui.wifiman.ui.settings.feedback.a) this.receiver).p0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(androidx.compose.ui.e eVar, com.ui.wifiman.ui.settings.feedback.a aVar) {
            this.f44626a = eVar;
            this.f44627b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3551q0 e() {
            return t1.d(new Q((String) null, 0L, (S) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J f(InterfaceC3551q0 interfaceC3551q0, com.ui.wifiman.ui.settings.feedback.a aVar, Q value) {
            AbstractC6492s.i(value, "value");
            interfaceC3551q0.setValue(value);
            aVar.o0(value.i());
            return J.f24997a;
        }

        public final void c(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-165815539, i10, -1, "com.ui.wifiman.ui.settings.feedback.AppFeedbackFormUi.<anonymous> (AppFeedbackFormUi.kt:49)");
            }
            androidx.compose.ui.e eVarH = r.h(this.f44626a, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = o.j(eVarH, c6562a.d(interfaceC3540l, i11).a().a().d(), c6562a.d(interfaceC3540l, i11).a().b().d());
            C8680c.f fVarN = C8680c.f66832a.n(h.j(16));
            final com.ui.wifiman.ui.settings.feedback.a aVar = this.f44627b;
            C cA = AbstractC8685h.a(fVarN, f0.c.f46573a.k(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarJ);
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
            a1.c(AbstractC7930a.a(new d.b(AbstractC6780c.f53559q), interfaceC3540l, 0), null, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 131066);
            Object[] objArr = new Object[0];
            InterfaceC4182k interfaceC4182kA = Q.f19415d.a();
            interfaceC3540l.U(532718494);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar3 = InterfaceC3540l.f21100a;
            if (objF == aVar3.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.settings.feedback.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.a.e();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            final InterfaceC3551q0 interfaceC3551q0D = AbstractC4174c.d(objArr, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540l, 3072, 4);
            e.a aVar4 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = c8688k.a(r.h(aVar4, 0.0f, 1, null), 1.0f, false);
            Q q10 = (Q) interfaceC3551q0D.getValue();
            U uB = c6562a.c(interfaceC3540l, i11).b().b();
            g gVarD = E.h.d(h.j(4));
            S0 s0F = T0.f14003a.f(c6562a.a(interfaceC3540l, i11).f().b(), 0L, 0L, c6562a.a(interfaceC3540l, i11).f().b(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c6562a.a(interfaceC3540l, i11).f().c(), 0L, interfaceC3540l, 0, 0, 48, 1572854);
            interfaceC3540l.U(532741627);
            boolean zT = interfaceC3540l.T(interfaceC3551q0D) | interfaceC3540l.T(aVar);
            Object objF2 = interfaceC3540l.f();
            if (zT || objF2 == aVar3.a()) {
                objF2 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.settings.feedback.d
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return e.a.f(interfaceC3551q0D, aVar, (Q) obj);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            AbstractC3341q0.a(q10, (InterfaceC6835l) objF2, eVarA, false, false, uB, null, f.f44628a.b(), null, null, false, null, null, null, false, 0, 15, null, gVarD, s0F, interfaceC3540l, 12582912, 1572864, 196440);
            androidx.compose.ui.e eVarH2 = r.h(aVar4, 0.0f, 1, null);
            String strA = H0.f.a(AbstractC6780c.f53545o, interfaceC3540l, 0);
            interfaceC3540l.U(532761101);
            boolean zT2 = interfaceC3540l.T(aVar);
            Object objF3 = interfaceC3540l.f();
            if (zT2 || objF3 == aVar3.a()) {
                objF3 = new C1573a(aVar);
                interfaceC3540l.K(objF3);
            }
            interfaceC3540l.J();
            w9.r.b(eVarH2, (InterfaceC6824a) ((th.g) objF3), ((Boolean) o1.b(aVar.n0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue(), false, null, null, strA, null, interfaceC3540l, 6, 184);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            c((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final com.ui.wifiman.ui.settings.feedback.a r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.settings.feedback.e.b(androidx.compose.ui.e, com.ui.wifiman.ui.settings.feedback.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, com.ui.wifiman.ui.settings.feedback.a aVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, aVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
