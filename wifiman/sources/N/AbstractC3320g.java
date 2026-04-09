package N;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.z1;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.C6733v0;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import s.C7846g;
import y.InterfaceC8558m;
import z.C8680c;

/* renamed from: N.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3320g {

    /* renamed from: N.g$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14421a = new a();

        a() {
            super(1);
        }

        public final void a(J0.w wVar) {
            J0.t.i0(wVar, J0.g.f9602b.a());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.g$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f14422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z.N f14423b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.q f14424c;

        /* renamed from: N.g$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z.N f14425a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ mh.q f14426b;

            /* renamed from: N.g$b$a$a, reason: collision with other inner class name */
            static final class C0555a extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z.N f14427a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ mh.q f14428b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0555a(z.N n10, mh.q qVar) {
                    super(2);
                    this.f14427a = n10;
                    this.f14428b = qVar;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-630330208, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:122)");
                    }
                    e.a aVar = androidx.compose.ui.e.f28771b0;
                    C3316e c3316e = C3316e.f14407a;
                    androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.a(aVar, c3316e.e(), c3316e.d()), this.f14427a);
                    C8680c.f fVarB = C8680c.f66832a.b();
                    c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
                    mh.q qVar = this.f14428b;
                    C0.C cB = z.W.b(fVarB, interfaceC1752cI, interfaceC3540l, 54);
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
                    E1.c(interfaceC3540lA, cB, aVar2.e());
                    E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
                    InterfaceC6839p interfaceC6839pB = aVar2.b();
                    if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                        interfaceC3540lA.K(Integer.valueOf(iA));
                        interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                    }
                    E1.c(interfaceC3540lA, eVarE, aVar2.f());
                    qVar.s(z.Z.f66823a, interfaceC3540l, 6);
                    interfaceC3540l.R();
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z.N n10, mh.q qVar) {
                super(2);
                this.f14425a = n10;
                this.f14426b = qVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1699085201, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:119)");
                }
                a1.a(C3319f0.f14419a.c(interfaceC3540l, 6).c(), b0.c.e(-630330208, true, new C0555a(this.f14425a, this.f14426b), interfaceC3540l, 54), interfaceC3540l, 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z1 z1Var, z.N n10, mh.q qVar) {
            super(2);
            this.f14422a = z1Var;
            this.f14423b = n10;
            this.f14424c = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(7524271, i10, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:118)");
            }
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(C6733v0.n(AbstractC3320g.b(this.f14422a)))), b0.c.e(-1699085201, true, new a(this.f14423b, this.f14424c), interfaceC3540l, 54), interfaceC3540l, T.I0.f20869i | 48);
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

    /* renamed from: N.g$c */
    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14430b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14431c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f14432d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3318f f14433e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1 f14434f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C7846g f14435g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC3314d f14436h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z.N f14437i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ mh.q f14438j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14439k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f14440l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC3318f interfaceC3318f, i1 i1Var, C7846g c7846g, InterfaceC3314d interfaceC3314d, z.N n10, mh.q qVar, int i10, int i11) {
            super(2);
            this.f14429a = interfaceC6824a;
            this.f14430b = eVar;
            this.f14431c = z10;
            this.f14432d = interfaceC8558m;
            this.f14433e = interfaceC3318f;
            this.f14434f = i1Var;
            this.f14435g = c7846g;
            this.f14436h = interfaceC3314d;
            this.f14437i = n10;
            this.f14438j = qVar;
            this.f14439k = i10;
            this.f14440l = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3320g.a(this.f14429a, this.f14430b, this.f14431c, this.f14432d, this.f14433e, this.f14434f, this.f14435g, this.f14436h, this.f14437i, this.f14438j, interfaceC3540l, T.L0.a(this.f14439k | 1), this.f14440l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(mh.InterfaceC6824a r40, androidx.compose.ui.e r41, boolean r42, y.InterfaceC8558m r43, N.InterfaceC3318f r44, m0.i1 r45, s.C7846g r46, N.InterfaceC3314d r47, z.N r48, mh.q r49, T.InterfaceC3540l r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3320g.a(mh.a, androidx.compose.ui.e, boolean, y.m, N.f, m0.i1, s.g, N.d, z.N, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    public static final void c(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC3318f interfaceC3318f, i1 i1Var, C7846g c7846g, InterfaceC3314d interfaceC3314d, z.N n10, mh.q qVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        androidx.compose.ui.e eVar2 = (i11 & 2) != 0 ? androidx.compose.ui.e.f28771b0 : eVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        InterfaceC8558m interfaceC8558m2 = (i11 & 8) != 0 ? null : interfaceC8558m;
        InterfaceC3318f interfaceC3318f2 = (i11 & 16) != 0 ? null : interfaceC3318f;
        i1 i1VarC = (i11 & 32) != 0 ? C3319f0.f14419a.b(interfaceC3540l, 6).c() : i1Var;
        C7846g c7846g2 = (i11 & 64) != 0 ? null : c7846g;
        InterfaceC3314d interfaceC3314dH = (i11 & 128) != 0 ? C3316e.f14407a.h(0L, 0L, 0L, interfaceC3540l, 3072, 7) : interfaceC3314d;
        z.N nF = (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? C3316e.f14407a.f() : n10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(288797557, i10, -1, "androidx.compose.material.TextButton (Button.kt:233)");
        }
        a(interfaceC6824a, eVar2, z11, interfaceC8558m2, interfaceC3318f2, i1VarC, c7846g2, interfaceC3314dH, nF, qVar, interfaceC3540l, i10 & 2147483646, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }
}
