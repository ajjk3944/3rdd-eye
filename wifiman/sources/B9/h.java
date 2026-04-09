package B9;

import B9.b;
import B9.h;
import C0.C;
import E0.InterfaceC2629g;
import N.Z;
import N.a1;
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
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import s9.InterfaceC7929a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes3.dex */
public abstract class h {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f1260a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC7929a f1261b;

        /* renamed from: B9.h$a$a, reason: collision with other inner class name */
        static final class C0051a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC7929a f1262a;

            C0051a(InterfaceC7929a interfaceC7929a) {
                this.f1262a = interfaceC7929a;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2127236668, i10, -1, "com.ui.core.ui.component.list.UiContentCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiContentCard.kt:107)");
                }
                InterfaceC7929a interfaceC7929a = this.f1262a;
                if (interfaceC7929a instanceof s9.b) {
                    interfaceC3540l.U(749309916);
                    AbstractC8049c.c((s9.b) this.f1262a, r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(24)), null, null, interfaceC3540l, 48, 6);
                    interfaceC3540l.J();
                } else if (interfaceC7929a instanceof s9.c) {
                    interfaceC3540l.U(749315580);
                    AbstractC8049c.e(this.f1262a, r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(24)), null, null, null, null, null, 0.0f, null, interfaceC3540l, 48, 254);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(1754103672);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        a(InterfaceC6824a interfaceC6824a, InterfaceC7929a interfaceC7929a) {
            this.f1260a = interfaceC6824a;
            this.f1261b = interfaceC7929a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC6824a interfaceC6824a) {
            if (interfaceC6824a != null) {
                interfaceC6824a.invoke();
            }
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1729299872, i10, -1, "com.ui.core.ui.component.list.UiContentCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiContentCard.kt:103)");
            }
            interfaceC3540l.U(-612371159);
            boolean zT = interfaceC3540l.T(this.f1260a);
            final InterfaceC6824a interfaceC6824a = this.f1260a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: B9.g
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return h.a.c(interfaceC6824a);
                    }
                };
                interfaceC3540l.K(objF);
            }
            InterfaceC6824a interfaceC6824a2 = (InterfaceC6824a) objF;
            interfaceC3540l.J();
            Z.a(interfaceC6824a2, null, this.f1260a != null, null, b0.c.e(2127236668, true, new C0051a(this.f1261b), interfaceC3540l, 54), interfaceC3540l, 24576, 10);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f1263a;

        b(q qVar) {
            this.f1263a = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1000484225, i10, -1, "com.ui.core.ui.component.list.UiContentCard.<anonymous>.<anonymous> (UiContentCard.kt:150)");
            }
            androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            q qVar = this.f1263a;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
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
            qVar.s(C8688k.f66923a, interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    private static final void e(final B9.b bVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(926453458);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(926453458, i11, -1, "com.ui.core.ui.component.list.Compose (UiContentCard.kt:166)");
            }
            if (!(bVar instanceof b.a)) {
                interfaceC3540lR.U(212616936);
                interfaceC3540lR.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540lR.U(212618524);
            g(((b.a) bVar).a(), interfaceC3540lR, 0);
            interfaceC3540lR.J();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: B9.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.f(bVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(B9.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        e(bVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    private static final void g(final String str, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1314111293);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1314111293, i11, -1, "com.ui.core.ui.component.list.Description (UiContentCard.kt:179)");
            }
            androidx.compose.ui.e eVarK = o.k(androidx.compose.ui.e.f28771b0, Y0.h.j(8), 0.0f, 2, null);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            a1.b(str, eVarK, c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i12).b().f(), interfaceC3540l2, (i11 & 14) | 48, 0, 65528);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: B9.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.h(str, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(String str, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        g(str, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3 A[PHI: r24
  0x00f3: PHI (r24v12 int) = (r24v4 int), (r24v7 int), (r24v8 int) binds: [B:78:0x00f1, B:86:0x0107, B:85:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(androidx.compose.ui.e r41, java.lang.String r42, java.lang.String r43, s9.InterfaceC7929a r44, mh.InterfaceC6824a r45, mh.InterfaceC6824a r46, B9.b r47, B9.b r48, final mh.q r49, T.InterfaceC3540l r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B9.h.i(androidx.compose.ui.e, java.lang.String, java.lang.String, s9.a, mh.a, mh.a, B9.b, B9.b, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(androidx.compose.ui.e eVar, String str, String str2, InterfaceC7929a interfaceC7929a, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, B9.b bVar, B9.b bVar2, q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        i(eVar, str, str2, interfaceC7929a, interfaceC6824a, interfaceC6824a2, bVar, bVar2, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
