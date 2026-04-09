package Oe;

import C0.C;
import E0.InterfaceC2629g;
import Fe.j;
import H0.f;
import N.a1;
import Oe.d;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import T.z1;
import Y0.h;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import sa.AbstractC7930a;
import th.g;
import xe.InterfaceC8511f;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.a0;

/* loaded from: classes4.dex */
public abstract class d {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Oe.b f17815a;

        a(Oe.b bVar) {
            this.f17815a = bVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1279502389, i10, -1, "com.ui.wifiman.ui.permission.PermissionExplanationUi.<anonymous> (PermissionExplanationUi.kt:36)");
            }
            j.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (s9.d) o1.b(this.f17815a.getTitle(), null, interfaceC3540l, 0, 1).getValue(), null, null, null, 0L, interfaceC3540l, 6, 60);
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

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Oe.b f17816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f17817b;

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {
            a(Object obj) {
                super(0, obj, Oe.b.class, "onActionButtonClicked", "onActionButtonClicked()V", 0);
            }

            public final void a() {
                ((Oe.b) this.receiver).q0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        b(Oe.b bVar, InterfaceC8511f.b bVar2) {
            this.f17816a = bVar;
            this.f17817b = bVar2;
        }

        private static final boolean c(z1 z1Var) {
            return ((Boolean) z1Var.getValue()).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J e(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            int i11;
            C6562a c6562a;
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1880721448, i10, -1, "com.ui.wifiman.ui.permission.PermissionExplanationUi.<anonymous> (PermissionExplanationUi.kt:43)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
            C6562a c6562a2 = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = o.k(eVarH, 0.0f, c6562a2.d(interfaceC3540l, i12).a().b().c(), 1, null);
            float f10 = 4;
            C8680c.f fVarN = C8680c.f66832a.n(h.j(f10));
            c.b bVarG = f0.c.f46573a.g();
            Oe.b bVar = this.f17816a;
            final InterfaceC8511f.b bVar2 = this.f17817b;
            C cA = AbstractC8685h.a(fVarN, bVarG, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
            a1.c(AbstractC7930a.a((s9.d) o1.b(bVar.o0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0), o.j(aVar, c6562a2.d(interfaceC3540l, i12).a().a().d(), h.j(f10)), c6562a2.a(interfaceC3540l, i12).f().b(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a2.c(interfaceC3540l, i12).b().a(), interfaceC3540l, 0, 0, 130552);
            a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
            z1 z1VarB = o1.b(bVar.n0(), null, interfaceC3540l, 0, 1);
            interfaceC3540l.U(-231961980);
            if (c(z1VarB)) {
                androidx.compose.ui.e eVarK2 = o.k(r.h(aVar, 0.0f, 1, null), c6562a2.d(interfaceC3540l, i12).a().a().c(), 0.0f, 2, null);
                String strA = f.a(AbstractC6780c.f53306F1, interfaceC3540l, 0);
                interfaceC3540l.U(-231951814);
                boolean zT = interfaceC3540l.T(bVar);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new a(bVar);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                i11 = i12;
                c6562a = c6562a2;
                w9.r.b(eVarK2, (InterfaceC6824a) ((g) objF), false, false, null, null, strA, null, interfaceC3540l, 0, 188);
            } else {
                i11 = i12;
                c6562a = c6562a2;
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarK3 = o.k(r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null);
            String strA2 = f.a(AbstractC6780c.f53313G1, interfaceC3540l, 0);
            interfaceC3540l.U(-231940831);
            boolean zT2 = interfaceC3540l.T(bVar2);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: Oe.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.b.e(bVar2);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            w9.o.c(eVarK3, (InterfaceC6824a) objF2, false, false, null, strA2, interfaceC3540l, 0, 28);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final Oe.b r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oe.d.b(androidx.compose.ui.e, Oe.b, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, Oe.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
