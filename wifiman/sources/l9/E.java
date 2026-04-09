package L9;

import E0.InterfaceC2629g;
import L9.AbstractC3198d;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import androidx.compose.ui.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import sa.AbstractC7930a;
import t9.AbstractC8046b;
import z.C8680c;
import z.W;
import z.Y;
import z.Z;

/* loaded from: classes3.dex */
public abstract class E {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3198d f11289a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f11290b;

        a(AbstractC3198d abstractC3198d, InterfaceC6824a interfaceC6824a) {
            this.f11289a = abstractC3198d;
            this.f11290b = interfaceC6824a;
        }

        public final void a(Y Container, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(Container, "$this$Container");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-449614347, i10, -1, "com.ui.core.ui.component.toolbar.Draw.<anonymous> (UiToolbar.kt:61)");
            }
            AbstractC3198d abstractC3198d = this.f11289a;
            if (abstractC3198d instanceof AbstractC3198d.a) {
                interfaceC3540l.U(745365040);
                z.c(N9.b.f16117a.h().g(new d.b(AbstractC8046b.f61866a)), M9.i.g(androidx.compose.ui.e.f28771b0, "ui_toolbar_back"), 0L, false, this.f11290b, interfaceC3540l, 0, 12);
                interfaceC3540l.J();
            } else if (abstractC3198d instanceof AbstractC3198d.b) {
                interfaceC3540l.U(745779262);
                z.c(N9.b.f16117a.s().g(new d.b(AbstractC8046b.f61867b)), M9.i.g(androidx.compose.ui.e.f28771b0, "ui_toolbar_close"), 0L, false, this.f11290b, interfaceC3540l, 0, 12);
                interfaceC3540l.J();
            } else if (abstractC3198d instanceof AbstractC3198d.c.b) {
                interfaceC3540l.U(746184680);
                O.c(AbstractC7930a.b(((AbstractC3198d.c.b) this.f11289a).b(), interfaceC3540l, 0), M9.i.g(androidx.compose.ui.e.f28771b0, "ui_toolbar_custom_text"), ((AbstractC3198d.c.b) this.f11289a).a(), this.f11290b, interfaceC3540l, 0, 0);
                interfaceC3540l.J();
            } else {
                if (!(abstractC3198d instanceof AbstractC3198d.c.a)) {
                    interfaceC3540l.U(578232557);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(578281000);
                ((AbstractC3198d.c.a) this.f11289a).a().invoke(interfaceC3540l, 0);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f11291a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f11292b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f11293c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11294d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z.N f11295e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f11296f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f11297g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f11298h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC3198d f11299i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f11300j;

        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f11301a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f11302b;

            a(String str, long j10) {
                this.f11301a = str;
                this.f11302b = j10;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1299745838, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbar.<anonymous>.<anonymous> (UiToolbar.kt:129)");
                }
                String str = this.f11301a;
                if (str != null) {
                    T.b(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0, 0, this.f11302b, str, interfaceC3540l, 6, 6);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* renamed from: L9.E$b$b, reason: collision with other inner class name */
        static final class C0446b implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3198d f11303a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f11304b;

            C0446b(AbstractC3198d abstractC3198d, InterfaceC6824a interfaceC6824a) {
                this.f11303a = abstractC3198d;
                this.f11304b = interfaceC6824a;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1357728111, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbar.<anonymous>.<anonymous> (UiToolbar.kt:138)");
                }
                AbstractC3198d abstractC3198d = this.f11303a;
                if (abstractC3198d != null) {
                    E.g(abstractC3198d, this.f11304b, interfaceC3540l, 0);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        b(androidx.compose.ui.e eVar, mh.q qVar, long j10, float f10, z.N n10, float f11, String str, long j11, AbstractC3198d abstractC3198d, InterfaceC6824a interfaceC6824a) {
            this.f11291a = eVar;
            this.f11292b = qVar;
            this.f11293c = j10;
            this.f11294d = f10;
            this.f11295e = n10;
            this.f11296f = f11;
            this.f11297g = str;
            this.f11298h = j11;
            this.f11299i = abstractC3198d;
            this.f11300j = interfaceC6824a;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-483765862, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbar.<anonymous> (UiToolbar.kt:123)");
            }
            AbstractC3211q.r(this.f11291a, b0.c.e(1299745838, true, new a(this.f11297g, this.f11298h), interfaceC3540l, 54), b0.c.e(1357728111, true, new C0446b(this.f11299i, this.f11300j), interfaceC3540l, 54), this.f11292b, this.f11293c, this.f11294d, 0L, this.f11295e, this.f11296f, interfaceC3540l, 432, 64);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    private static final void e(final AbstractC3198d abstractC3198d, final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1043148960);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(abstractC3198d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(qVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1043148960, i11, -1, "com.ui.core.ui.component.toolbar.Container (UiToolbar.kt:47)");
            }
            if ((abstractC3198d instanceof AbstractC3198d.a) || (abstractC3198d instanceof AbstractC3198d.b)) {
                interfaceC3540lR.U(-1708291752);
                H.f11313a.c(qVar, interfaceC3540lR, ((i11 >> 3) & 14) | 48, 0);
                interfaceC3540lR.J();
            } else if (abstractC3198d instanceof AbstractC3198d.c.b) {
                interfaceC3540lR.U(-1708288648);
                H.f11313a.e(qVar, interfaceC3540lR, ((i11 >> 3) & 14) | 48, 0);
                interfaceC3540lR.J();
            } else {
                if (!(abstractC3198d instanceof AbstractC3198d.c.a)) {
                    interfaceC3540lR.U(-1708296753);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(-1708286405);
                int i12 = (i11 << 6) & 7168;
                e.a aVar = androidx.compose.ui.e.f28771b0;
                C0.C cB = W.b(C8680c.f66832a.f(), f0.c.f46573a.l(), interfaceC3540lR, 0);
                int iA = AbstractC3536j.a(interfaceC3540lR, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, aVar);
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
                E1.c(interfaceC3540lA, cB, aVar2.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
                InterfaceC6839p interfaceC6839pB = aVar2.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar2.f());
                qVar.s(Z.f66823a, interfaceC3540lR, Integer.valueOf(((i12 >> 6) & 112) | 6));
                interfaceC3540lR.R();
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: L9.D
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return E.f(abstractC3198d, qVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(AbstractC3198d abstractC3198d, mh.q qVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        e(abstractC3198d, qVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void g(final AbstractC3198d abstractC3198d, final InterfaceC6824a onNavigationClicked, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(abstractC3198d, "<this>");
        AbstractC6492s.i(onNavigationClicked, "onNavigationClicked");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-557794361);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(abstractC3198d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(onNavigationClicked) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-557794361, i11, -1, "com.ui.core.ui.component.toolbar.Draw (UiToolbar.kt:59)");
            }
            e(abstractC3198d, b0.c.e(-449614347, true, new a(abstractC3198d, onNavigationClicked), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: L9.C
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return E.h(abstractC3198d, onNavigationClicked, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(AbstractC3198d abstractC3198d, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        g(abstractC3198d, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(androidx.compose.ui.e r27, java.lang.String r28, L9.AbstractC3198d r29, mh.InterfaceC6824a r30, mh.q r31, long r32, long r34, long r36, float r38, z.N r39, float r40, T.InterfaceC3540l r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L9.E.i(androidx.compose.ui.e, java.lang.String, L9.d, mh.a, mh.q, long, long, long, float, z.N, float, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j() {
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J k(androidx.compose.ui.e eVar, String str, AbstractC3198d abstractC3198d, InterfaceC6824a interfaceC6824a, mh.q qVar, long j10, long j11, long j12, float f10, z.N n10, float f11, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        i(eVar, str, abstractC3198d, interfaceC6824a, qVar, j10, j11, j12, f10, n10, f11, interfaceC3540l, L0.a(i10 | 1), L0.a(i11), i12);
        return Yg.J.f24997a;
    }
}
