package If;

import E0.InterfaceC2629g;
import If.AbstractC3042w;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import W0.j;
import android.content.res.Resources;
import androidx.compose.ui.e;
import f0.c;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.Y;
import z.Z;
import z.a0;
import z9.AbstractC8722b;

/* renamed from: If.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3042w {

    /* renamed from: If.w$a */
    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9214a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3035o f9215b;

        /* renamed from: If.w$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0379a extends C6490p implements InterfaceC6824a {
            C0379a(Object obj) {
                super(0, obj, AbstractC3035o.class, "onFwUpdateClicked", "onFwUpdateClicked()V", 0);
            }

            public final void a() {
                ((AbstractC3035o) this.receiver).s0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        a(boolean z10, AbstractC3035o abstractC3035o) {
            this.f9214a = z10;
            this.f9215b = abstractC3035o;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(909433375, i10, -1, "com.ui.wifiman.ui.wmw.ButtonsContainer.<anonymous>.<anonymous> (WmwStatusPopupConnected.kt:248)");
            }
            if (this.f9214a) {
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                String strA = H0.f.a(AbstractC6780c.f53366N5, interfaceC3540l, 0);
                AbstractC3035o abstractC3035o = this.f9215b;
                interfaceC3540l.U(-345554684);
                boolean zT = interfaceC3540l.T(abstractC3035o);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C0379a(abstractC3035o);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                w9.r.b(eVarH, (InterfaceC6824a) ((th.g) objF), false, false, null, null, strA, null, interfaceC3540l, 6, 188);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: If.w$b */
    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3035o f9216a;

        b(AbstractC3035o abstractC3035o) {
            this.f9216a = abstractC3035o;
        }

        public final void a(InterfaceC8687j StatusContainerColumn, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(StatusContainerColumn, "$this$StatusContainerColumn");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-758105250, i10, -1, "com.ui.wifiman.ui.wmw.StatusContainer.<anonymous>.<anonymous>.<anonymous> (WmwStatusPopupConnected.kt:180)");
            }
            Yg.J j10 = null;
            C3034n c3034n = (C3034n) o1.b(this.f9216a.n0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(1312042231);
            if (c3034n != null) {
                c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
                C8680c.e eVarC = C8680c.f66832a.c();
                e.a aVar = androidx.compose.ui.e.f28771b0;
                C0.C cB = z.W.b(eVarC, interfaceC1752cI, interfaceC3540l, 54);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
                Jf.d.c(androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(20)), c3034n.b(), c3034n.a(), interfaceC3540l, 6, 0);
                a0.a(androidx.compose.foundation.layout.r.z(aVar, Y0.h.j(4)), interfaceC3540l, 6);
                String str = String.format(H0.f.a(AbstractC6780c.f53606w4, interfaceC3540l, 0), Arrays.copyOf(new Object[]{Integer.valueOf(AbstractC7137b.e(c3034n.b() * 100.0f))}, 1));
                AbstractC6492s.h(str, "format(...)");
                a1.b(str, aVar, Jf.a.f10046a.a(c3034n.b(), interfaceC3540l, 48), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).b().a(), interfaceC3540l, 48, 0, 65528);
                interfaceC3540l.R();
                j10 = Yg.J.f24997a;
            }
            interfaceC3540l.J();
            if (j10 == null) {
                AbstractC3042w.r(null, new d.b(AbstractC6780c.f53627z4), W0.j.f23523b.b(), interfaceC3540l, 0, 1);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: If.w$c */
    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3035o f9217a;

        c(AbstractC3035o abstractC3035o) {
            this.f9217a = abstractC3035o;
        }

        public final void a(InterfaceC8687j StatusContainerColumn, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(StatusContainerColumn, "$this$StatusContainerColumn");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1630270535, i10, -1, "com.ui.wifiman.ui.wmw.StatusContainer.<anonymous>.<anonymous>.<anonymous> (WmwStatusPopupConnected.kt:210)");
            }
            s9.d bVar = (s9.d) o1.b(this.f9217a.p0(), null, interfaceC3540l, 0, 1).getValue();
            if (bVar == null) {
                bVar = new d.b(AbstractC6780c.f53627z4);
            }
            AbstractC3042w.r(null, bVar, W0.j.f23523b.f(), interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: If.w$d */
    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3035o f9218a;

        d(AbstractC3035o abstractC3035o) {
            this.f9218a = abstractC3035o;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(AbstractC3035o abstractC3035o) {
            abstractC3035o.r0();
            return Yg.J.f24997a;
        }

        public final void b(InterfaceC8687j StatusContainerColumn, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(StatusContainerColumn, "$this$StatusContainerColumn");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-554005402, i10, -1, "com.ui.wifiman.ui.wmw.StatusContainer.<anonymous>.<anonymous>.<anonymous> (WmwStatusPopupConnected.kt:221)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            interfaceC3540l.U(1312102947);
            boolean zT = interfaceC3540l.T(this.f9218a);
            final AbstractC3035o abstractC3035o = this.f9218a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: If.x
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC3042w.d.c(abstractC3035o);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarD = androidx.compose.foundation.d.d(aVar, false, null, null, (InterfaceC6824a) objF, 7, null);
            String strB = AbstractC7930a.b(new d.b(AbstractC6780c.f53352L5), interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.b(strB, eVarD, c6562a.a(interfaceC3540l, i11).a().b().f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65528);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    private static final void h(final androidx.compose.ui.e eVar, final AbstractC3035o abstractC3035o, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-126606767);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(abstractC3035o) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-126606767, i11, -1, "com.ui.wifiman.ui.wmw.ButtonsContainer (WmwStatusPopupConnected.kt:239)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(4)), f0.c.f46573a.g(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            boolean zBooleanValue = ((Boolean) o1.b(abstractC3035o.o0(), null, interfaceC3540lR, 0, 1).getValue()).booleanValue();
            AbstractC7385d.d(c8688k, zBooleanValue, null, null, null, null, b0.c.e(909433375, true, new a(zBooleanValue, abstractC3035o), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.q
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3042w.i(eVar, abstractC3035o, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, AbstractC3035o abstractC3035o, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(eVar, abstractC3035o, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final void j(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1179834586);
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
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1179834586, i12, -1, "com.ui.wifiman.ui.wmw.ConnectedState (WmwStatusPopupConnected.kt:123)");
            }
            C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(10)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
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
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            Be.E.b(null, c6562a.a(interfaceC3540lR, i14).a().d().f(), interfaceC3540lR, 0, 1);
            androidx.compose.ui.e eVar4 = eVar3;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(new d.b(AbstractC6780c.f53367O), interfaceC3540lR, 0), androidx.compose.ui.e.f28771b0, c6562a.a(interfaceC3540lR, i14).a().d().f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i14).b().a(), interfaceC3540l2, 48, 3072, 122872);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.u
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3042w.k(eVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J k(androidx.compose.ui.e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        j(eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final void l(final androidx.compose.ui.e eVar, final AbstractC3035o abstractC3035o, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-461597474);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(abstractC3035o) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-461597474, i11, -1, "com.ui.wifiman.ui.wmw.StatusContainer (WmwStatusPopupConnected.kt:145)");
            }
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(16));
            c.a aVar = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(fVarN, aVar.g(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            C8680c.f fVarN2 = c8680c.n(Y0.h.j(8));
            c.b bVarG = aVar.g();
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            C0.C cA2 = AbstractC8685h.a(fVarN2, bVarG, interfaceC3540lR, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, aVar3);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cA2, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            C3174d c3174dA = AbstractC7930a.a((s9.d) o1.b(abstractC3035o.q0(), null, interfaceC3540lR, 0, 1).getValue(), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            L0.U uB = c6562a.c(interfaceC3540lR, i12).a().b();
            long jA = c6562a.a(interfaceC3540lR, i12).f().a();
            j.a aVar4 = W0.j.f23523b;
            a1.c(c3174dA, aVar3, jA, 0L, null, null, null, 0L, null, W0.j.h(aVar4.a()), 0L, 0, false, 0, 0, null, null, uB, interfaceC3540lR, 48, 0, 130552);
            interfaceC3540l2 = interfaceC3540lR;
            j(null, interfaceC3540l2, 0, 1);
            interfaceC3540l2.R();
            AbstractC8722b.b(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), 0L, 0.0f, 0.0f, 0.0f, interfaceC3540l2, 6, 30);
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null);
            C0.C cB = z.W.b(c8680c.f(), aVar.l(), interfaceC3540l2, 0);
            int iA3 = AbstractC3536j.a(interfaceC3540l2, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l2.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l2, eVarH);
            InterfaceC6824a interfaceC6824aA3 = aVar2.a();
            if (interfaceC3540l2.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l2.u();
            if (interfaceC3540l2.o()) {
                interfaceC3540l2.D(interfaceC6824aA3);
            } else {
                interfaceC3540l2.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540l2);
            E1.c(interfaceC3540lA3, cB, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            Z z10 = Z.f66823a;
            n(Y.b(z10, aVar3, 1.0f, false, 2, null), new d.b(AbstractC6780c.f53345K5), aVar4.f(), aVar.k(), b0.c.e(-758105250, true, new b(abstractC3035o), interfaceC3540l2, 54), interfaceC3540l2, 27648, 0);
            n(Y.b(z10, aVar3, 1.0f, false, 2, null), new d.b(AbstractC6780c.f53422V5), aVar4.f(), aVar.k(), b0.c.e(1630270535, true, new c(abstractC3035o), interfaceC3540l2, 54), interfaceC3540l2, 27648, 0);
            n(Y.b(z10, aVar3, 1.0f, false, 2, null), new d.b(AbstractC6780c.f53360N), aVar4.b(), aVar.j(), b0.c.e(-554005402, true, new d(abstractC3035o), interfaceC3540l2, 54), interfaceC3540l2, 27648, 0);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.r
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3042w.m(eVar, abstractC3035o, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(androidx.compose.ui.e eVar, AbstractC3035o abstractC3035o, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        l(eVar, abstractC3035o, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final void n(androidx.compose.ui.e eVar, final s9.d dVar, final int i10, final c.b bVar, final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i11, final int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1713348959);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= interfaceC3540lR.T(dVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= interfaceC3540lR.i(i10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= interfaceC3540lR.T(bVar) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= interfaceC3540lR.l(qVar) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        int i15 = i13;
        if ((i15 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1713348959, i15, -1, "com.ui.wifiman.ui.wmw.StatusContainerColumn (WmwStatusPopupConnected.kt:109)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(2)), bVar, interfaceC3540lR, 6 | (((((i15 & 14) | 48) | ((i15 >> 3) & 896)) >> 3) & 112));
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            p(null, dVar, i10, interfaceC3540lR, i15 & 1008, 1);
            qVar.s(c8688k, interfaceC3540lR, Integer.valueOf(6 | ((i15 >> 9) & 112)));
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: If.s
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3042w.o(eVar4, dVar, i10, bVar, qVar, i11, i12, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(androidx.compose.ui.e eVar, s9.d dVar, int i10, c.b bVar, mh.q qVar, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        n(eVar, dVar, i10, bVar, qVar, interfaceC3540l, L0.a(i11 | 1), i12);
        return Yg.J.f24997a;
    }

    private static final void p(androidx.compose.ui.e eVar, final s9.d dVar, final int i10, InterfaceC3540l interfaceC3540l, final int i11, final int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1528275653);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= interfaceC3540lR.T(dVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= interfaceC3540lR.i(i10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i13 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1528275653, i13, -1, "com.ui.wifiman.ui.wmw.StatusContainerLabel (WmwStatusPopupConnected.kt:72)");
            }
            C3174d c3174dA = AbstractC7930a.a(dVar, interfaceC3540lR, (i13 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            int i16 = ((i13 << 3) & 112) | ((i13 << 21) & 1879048192);
            androidx.compose.ui.e eVar4 = eVar3;
            a1.c(c3174dA, eVar4, c6562a.a(interfaceC3540lR, i15).f().c(), 0L, null, null, null, 0L, null, W0.j.h(i10), 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i15).b().a(), interfaceC3540lR, i16, 3120, 120312);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar5 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: If.v
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3042w.q(eVar5, dVar, i10, i11, i12, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J q(androidx.compose.ui.e eVar, s9.d dVar, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        p(eVar, dVar, i10, interfaceC3540l, L0.a(i11 | 1), i12);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(androidx.compose.ui.e eVar, final s9.d dVar, final int i10, InterfaceC3540l interfaceC3540l, final int i11, final int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1204603243);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= interfaceC3540lR.T(dVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= interfaceC3540lR.i(i10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i13 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1204603243, i13, -1, "com.ui.wifiman.ui.wmw.StatusContainerTextValue (WmwStatusPopupConnected.kt:89)");
            }
            C3174d c3174dA = AbstractC7930a.a(dVar, interfaceC3540lR, (i13 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            int i16 = ((i13 << 3) & 112) | ((i13 << 21) & 1879048192);
            androidx.compose.ui.e eVar4 = eVar3;
            a1.c(c3174dA, eVar4, c6562a.a(interfaceC3540lR, i15).f().a(), 0L, null, null, null, 0L, null, W0.j.h(i10), 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i15).b().a(), interfaceC3540lR, i16, 3120, 120312);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar5 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: If.t
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3042w.s(eVar5, dVar, i10, i11, i12, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J s(androidx.compose.ui.e eVar, s9.d dVar, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        r(eVar, dVar, i10, interfaceC3540l, L0.a(i11 | 1), i12);
        return Yg.J.f24997a;
    }

    public static final void t(final androidx.compose.ui.e modifier, final AbstractC3035o vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1768711837);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1768711837, i12, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupConnected (WmwStatusPopupConnected.kt:263)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(16)), f0.c.f46573a.g(), interfaceC3540lR, 54);
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            com.ubnt.usurvey.product.r rVarA = com.ubnt.usurvey.product.s.a(com.ubnt.usurvey.product.l.WM_W_d64);
            AbstractC6492s.f(rVarA);
            c.a aVar2 = new c.a(rVarA.a(), null, 2, null);
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC8049c.e(aVar2, androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.o.k(eVarH, 0.0f, c6562a.d(interfaceC3540lR, i13).a().a().c(), 1, null), L.b(EnumC3021a.CONNECTED)), null, null, null, null, null, 0.0f, null, interfaceC3540lR, 0, 254);
            int i14 = i12 & 112;
            l(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), c6562a.d(interfaceC3540l2, i13).a().a().a(Y0.h.j(42)), 0.0f, 2, null), vm, interfaceC3540l2, i14);
            h(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), c6562a.d(interfaceC3540l2, i13).a().a().c(), 0.0f, 2, null), vm, interfaceC3540l2, i14);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.p
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3042w.u(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J u(androidx.compose.ui.e eVar, AbstractC3035o abstractC3035o, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        t(eVar, abstractC3035o, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
