package F9;

import E0.InterfaceC2629g;
import F9.M;
import L0.C3174d;
import N.AbstractC3312c;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes3.dex */
public abstract class M {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6081a;

        a(String str) {
            this.f6081a = str;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1350578324, i10, -1, "com.ui.core.ui.component.settings.UiSettingsDropdown.<anonymous> (UiSettingsDropdown.kt:104)");
            }
            G9.e.b(this.f6081a, androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), interfaceC3540l, 48, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D9.o f6082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f6083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f6084c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6085d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ci.c f6086e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f6087f;

        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ci.c f6088a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f6089b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ D9.o f6090c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f6091d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ mh.q f6092e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f6093f;

            /* renamed from: F9.M$b$a$a, reason: collision with other inner class name */
            static final class C0241a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ mh.q f6094a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f6095b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f6096c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Object f6097d;

                C0241a(mh.q qVar, Object obj, int i10, Object obj2) {
                    this.f6094a = qVar;
                    this.f6095b = obj;
                    this.f6096c = i10;
                    this.f6097d = obj2;
                }

                public final void a(z.Y DropdownMenuItem, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(DropdownMenuItem, "$this$DropdownMenuItem");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(711185810, i10, -1, "com.ui.core.ui.component.settings.UiSettingsDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSettingsDropdown.kt:86)");
                    }
                    androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.D(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, false, 3, null), Y0.h.j(32), 0.0f, 2, null);
                    C3174d c3174d = (C3174d) this.f6094a.s(this.f6095b, interfaceC3540l, Integer.valueOf((this.f6096c >> 18) & 8));
                    int iB = W0.t.f23567a.b();
                    int iA = W0.j.f23523b.a();
                    interfaceC3540l.U(-1741911160);
                    long jE = AbstractC6492s.d(this.f6097d, this.f6095b) ? C6733v0.f52951b.e() : C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c();
                    interfaceC3540l.J();
                    a1.c(c3174d, eVarK, jE, 0L, null, null, null, 0L, null, W0.j.h(iA), 0L, iB, false, 0, 0, null, null, null, interfaceC3540l, 48, 48, 259576);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return Yg.J.f24997a;
                }
            }

            a(Ci.c cVar, Object obj, D9.o oVar, InterfaceC6835l interfaceC6835l, mh.q qVar, int i10) {
                this.f6088a = cVar;
                this.f6089b = obj;
                this.f6090c = oVar;
                this.f6091d = interfaceC6835l;
                this.f6092e = qVar;
                this.f6093f = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J c(D9.o oVar, InterfaceC6835l interfaceC6835l, Object obj) {
                oVar.c();
                interfaceC6835l.invoke(obj);
                return Yg.J.f24997a;
            }

            public final void b(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(493405762, i10, -1, "com.ui.core.ui.component.settings.UiSettingsDropdown.<anonymous>.<anonymous> (UiSettingsDropdown.kt:68)");
                }
                androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.o.i(androidx.compose.foundation.m.d(androidx.compose.foundation.layout.i.b(androidx.compose.ui.e.f28771b0, z.J.Max), androidx.compose.foundation.m.a(0, interfaceC3540l, 0, 1), false, null, false, 14, null), Y0.h.j(16));
                Ci.c cVar = this.f6088a;
                Object obj = this.f6089b;
                final D9.o oVar = this.f6090c;
                final InterfaceC6835l interfaceC6835l = this.f6091d;
                mh.q qVar = this.f6092e;
                int i11 = this.f6093f;
                C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarI);
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
                interfaceC3540l.U(2021722974);
                for (final Object obj2 : cVar) {
                    e.a aVar2 = androidx.compose.ui.e.f28771b0;
                    interfaceC3540l.U(2021728050);
                    long jF = AbstractC6492s.d(obj, obj2) ? C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().f() : C6733v0.f52951b.e();
                    interfaceC3540l.J();
                    androidx.compose.ui.e eVarC = androidx.compose.foundation.b.c(aVar2, jF, E.h.d(Y0.h.j(6)));
                    interfaceC3540l.U(1246878284);
                    boolean zT = interfaceC3540l.T(oVar) | interfaceC3540l.T(interfaceC6835l) | interfaceC3540l.l(obj2);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: F9.N
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return M.b.a.c(oVar, interfaceC6835l, obj2);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC3312c.b((InterfaceC6824a) objF, eVarC, false, null, null, b0.c.e(711185810, true, new C0241a(qVar, obj2, i11, obj), interfaceC3540l, 54), interfaceC3540l, ImageMetadata.EDGE_MODE, 28);
                    i11 = i11;
                }
                interfaceC3540l.J();
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        b(D9.o oVar, mh.q qVar, Object obj, int i10, Ci.c cVar, InterfaceC6835l interfaceC6835l) {
            this.f6082a = oVar;
            this.f6083b = qVar;
            this.f6084c = obj;
            this.f6085d = i10;
            this.f6086e = cVar;
            this.f6087f = interfaceC6835l;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1370278004, i10, -1, "com.ui.core.ui.component.settings.UiSettingsDropdown.<anonymous> (UiSettingsDropdown.kt:61)");
            }
            G9.k.b(D9.k.s(androidx.compose.ui.e.f28771b0, this.f6082a), (C3174d) this.f6083b.s(this.f6084c, interfaceC3540l, Integer.valueOf((this.f6085d >> 18) & 8)), this.f6082a.d(), 0, 0, interfaceC3540l, 0, 24);
            D9.o oVar = this.f6082a;
            D9.k.j(oVar, null, null, null, 0L, null, 0.0f, b0.c.e(493405762, true, new a(this.f6086e, this.f6084c, oVar, this.f6087f, this.f6083b, this.f6085d), interfaceC3540l, 54), interfaceC3540l, 12582912, 126);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r36, final java.lang.String r37, s9.b r38, java.lang.String r39, final Ci.c r40, final mh.q r41, final java.lang.Object r42, final mh.InterfaceC6835l r43, mh.InterfaceC6824a r44, boolean r45, java.lang.String r46, T.InterfaceC3540l r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.M.c(androidx.compose.ui.e, java.lang.String, s9.b, java.lang.String, Ci.c, mh.q, java.lang.Object, mh.l, mh.a, boolean, java.lang.String, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(D9.o oVar) {
        oVar.f();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, String str, s9.b bVar, String str2, Ci.c cVar, mh.q qVar, Object obj, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, String str3, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        c(eVar, str, bVar, str2, cVar, qVar, obj, interfaceC6835l, interfaceC6824a, z10, str3, interfaceC3540l, L0.a(i10 | 1), L0.a(i11), i12);
        return Yg.J.f24997a;
    }
}
