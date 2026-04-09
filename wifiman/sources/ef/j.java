package ef;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import Yg.J;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import ef.AbstractC5459a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import vf.C8224d;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class j {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5461c f46418a;

        a(AbstractC5461c abstractC5461c) {
            this.f46418a = abstractC5461c;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1513771943, i10, -1, "com.ui.wifiman.ui.speed.speedfactor.SpeedFactorExplanationUi.<anonymous> (SpeedFactorExplanationUi.kt:50)");
            }
            Fe.j.c(null, (s9.d) o1.b(this.f46418a.getTitle(), null, interfaceC3540l, 0, 1).getValue(), null, null, null, 0L, interfaceC3540l, 0, 61);
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
        final /* synthetic */ AbstractC5461c f46419a;

        /* synthetic */ class a extends C6490p implements InterfaceC6835l {
            a(Object obj) {
                super(1, obj, AbstractC5461c.class, "onManageInUnifiClicked", "onManageInUnifiClicked(Ljava/lang/String;)V", 0);
            }

            public final void a(String p02) {
                AbstractC6492s.i(p02, "p0");
                ((AbstractC5461c) this.receiver).p0(p02);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return J.f24997a;
            }
        }

        /* renamed from: ef.j$b$b, reason: collision with other inner class name */
        /* synthetic */ class C1748b extends C6490p implements InterfaceC6835l {
            C1748b(Object obj) {
                super(1, obj, AbstractC5461c.class, "onManageInUnifiClicked", "onManageInUnifiClicked(Ljava/lang/String;)V", 0);
            }

            public final void a(String p02) {
                AbstractC6492s.i(p02, "p0");
                ((AbstractC5461c) this.receiver).p0(p02);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return J.f24997a;
            }
        }

        b(AbstractC5461c abstractC5461c) {
            this.f46419a = abstractC5461c;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(99390620, i10, -1, "com.ui.wifiman.ui.speed.speedfactor.SpeedFactorExplanationUi.<anonymous> (SpeedFactorExplanationUi.kt:56)");
            }
            androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C8680c.f fVarN = C8680c.f66832a.n(Y0.h.j(16));
            AbstractC5461c abstractC5461c = this.f46419a;
            C cA = AbstractC8685h.a(fVarN, f0.c.f46573a.k(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            interfaceC3540l.U(1772632105);
            for (AbstractC5459a abstractC5459a : (Iterable) o1.b(abstractC5461c.n0(), null, interfaceC3540l, 0, 1).getValue()) {
                if (abstractC5459a instanceof AbstractC5459a.b) {
                    interfaceC3540l.U(-62262729);
                    androidx.compose.ui.e eVarK = o.k(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().d(), 0.0f, 2, null);
                    AbstractC5459a.b bVar = (AbstractC5459a.b) abstractC5459a;
                    interfaceC3540l.U(-62254319);
                    boolean zT = interfaceC3540l.T(abstractC5461c);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new a(abstractC5461c);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    j.i(eVarK, bVar, (InterfaceC6835l) ((th.g) objF), interfaceC3540l, 0, 0);
                    interfaceC3540l.J();
                } else {
                    if (!(abstractC5459a instanceof AbstractC5459a.C1744a)) {
                        interfaceC3540l.U(-62264745);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-62250410);
                    androidx.compose.ui.e eVarK2 = o.k(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().d(), 0.0f, 2, null);
                    AbstractC5459a.C1744a c1744a = (AbstractC5459a.C1744a) abstractC5459a;
                    interfaceC3540l.U(-62242031);
                    boolean zT2 = interfaceC3540l.T(abstractC5461c);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new C1748b(abstractC5461c);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    j.g(eVarK2, c1744a, (InterfaceC6835l) ((th.g) objF2), interfaceC3540l, 0, 0);
                    interfaceC3540l.J();
                }
            }
            interfaceC3540l.J();
            v0.b(null, interfaceC3540l, 0, 1);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(androidx.compose.ui.e r35, final ef.AbstractC5459a.C1744a r36, final mh.InterfaceC6835l r37, T.InterfaceC3540l r38, final int r39, final int r40) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.j.g(androidx.compose.ui.e, ef.a$a, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(androidx.compose.ui.e eVar, AbstractC5459a.C1744a c1744a, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) throws Resources.NotFoundException {
        g(eVar, c1744a, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(androidx.compose.ui.e eVar, final AbstractC5459a.b bVar, final InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1255449313);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(bVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6835l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1255449313, i12, -1, "com.ui.wifiman.ui.speed.speedfactor.IssueTextual (SpeedFactorExplanationUi.kt:129)");
            }
            k(eVar, bVar.a(), bVar.b(), W0.j.f23523b.a(), interfaceC6835l, interfaceC3540lR, (i12 & 14) | ((i12 << 6) & 57344), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final androidx.compose.ui.e eVar2 = eVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: ef.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.j(eVar2, bVar, interfaceC6835l, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(androidx.compose.ui.e eVar, AbstractC5459a.b bVar, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        i(eVar, bVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void k(androidx.compose.ui.e r43, final java.lang.String r44, final s9.d r45, final int r46, final mh.InterfaceC6835l r47, T.InterfaceC3540l r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.j.k(androidx.compose.ui.e, java.lang.String, s9.d, int, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(androidx.compose.ui.e eVar, String str, s9.d dVar, int i10, InterfaceC6835l interfaceC6835l, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        k(eVar, str, dVar, i10, interfaceC6835l, interfaceC3540l, L0.a(i11 | 1), i12);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8224d.a m(int i10, String str) {
        AbstractC6492s.i(str, "<unused var>");
        return new C8224d.a("manage_in_unifi", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(C3174d c3174d, InterfaceC6835l interfaceC6835l, String str, int i10) {
        if (((C3174d.c) AbstractC3689v.s0(c3174d.j("manage_in_unifi", i10, i10))) != null) {
            interfaceC6835l.invoke(str);
        }
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(final androidx.compose.ui.e r11, final ef.AbstractC5461c r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.j.o(androidx.compose.ui.e, ef.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(androidx.compose.ui.e eVar, AbstractC5461c abstractC5461c, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        o(eVar, abstractC5461c, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
