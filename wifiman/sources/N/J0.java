package N;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.z1;
import Zg.AbstractC3689v;
import a1.AbstractC3750a;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.InterfaceC3925i;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import r.AbstractC7519b;
import r.AbstractC7535j;
import r.C7517a;
import r.InterfaceC7533i;

/* loaded from: classes.dex */
public abstract class J0 {

    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f13757a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f13758b;

        /* renamed from: N.J0$a$a, reason: collision with other inner class name */
        static final class C0540a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: N.J0$a$a$a, reason: collision with other inner class name */
            static final class C0541a extends AbstractC6494u implements InterfaceC6824a {
                C0541a(H0 h02) {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    throw null;
                }
            }

            C0540a(H0 h02) {
                super(1);
            }

            public final void a(J0.w wVar) {
                J0.t.f0(wVar, J0.e.f9593b.b());
                J0.t.n(wVar, null, new C0541a(null), 1, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((J0.w) obj);
                return Yg.J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S f13759a;

            /* renamed from: N.J0$a$b$a, reason: collision with other inner class name */
            static final class C0542a extends AbstractC6494u implements InterfaceC6835l {
                C0542a(H0 h02) {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Q q10) {
                    return Boolean.valueOf(AbstractC6492s.d(q10.c(), null));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(H0 h02, S s10) {
                super(0);
                this.f13759a = s10;
            }

            public final void a() {
                if (AbstractC6492s.d(null, this.f13759a.a())) {
                    return;
                }
                AbstractC3689v.K(this.f13759a.b(), new C0542a(null));
                T.J0 j0C = this.f13759a.c();
                if (j0C != null) {
                    j0C.invalidate();
                }
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H0 h02, H0 h03, List list, S s10) {
            super(3);
            this.f13757a = list;
            this.f13758b = s10;
        }

        public final void a(InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.l(interfaceC6839p) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1471040642, i11, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:274)");
            }
            boolean zD = AbstractC6492s.d(null, null);
            int i12 = zD ? 150 : 75;
            int i13 = (!zD || AbstractC3750a.b(this.f13757a).size() == 1) ? 0 : 75;
            r.r0 r0VarK = AbstractC7535j.k(i12, i13, r.G.d());
            boolean zL = interfaceC3540l.l(null) | interfaceC3540l.l(this.f13758b);
            S s10 = this.f13758b;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new b(null, s10);
                interfaceC3540l.K(objF);
            }
            z1 z1VarF = J0.f(r0VarK, zD, (InterfaceC6824a) objF, interfaceC3540l, 0, 0);
            z1 z1VarG = J0.g(AbstractC7535j.k(i12, i13, r.G.c()), zD, interfaceC3540l, 0);
            androidx.compose.ui.e eVarC = androidx.compose.ui.graphics.b.c(androidx.compose.ui.e.f28771b0, ((Number) z1VarG.getValue()).floatValue(), ((Number) z1VarG.getValue()).floatValue(), ((Number) z1VarF.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean zL2 = interfaceC3540l.l(null);
            Object objF2 = interfaceC3540l.f();
            if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new C0540a(null);
                interfaceC3540l.K(objF2);
            }
            androidx.compose.ui.e eVarC2 = J0.m.c(eVarC, false, (InterfaceC6835l) objF2, 1, null);
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarC2);
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
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            interfaceC6839p.invoke(interfaceC3540l, Integer.valueOf(i11 & 14));
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC6839p) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f13760a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(mh.q qVar, H0 h02) {
            super(2);
            this.f13760a = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2041982076, i10, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:327)");
            }
            mh.q qVar = this.f13760a;
            AbstractC6492s.f(null);
            qVar.s(null, interfaceC3540l, 0);
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

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f13762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13763c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13764d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(H0 h02, androidx.compose.ui.e eVar, mh.q qVar, int i10, int i11) {
            super(2);
            this.f13761a = eVar;
            this.f13762b = qVar;
            this.f13763c = i10;
            this.f13764d = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            J0.a(null, this.f13761a, this.f13762b, interfaceC3540l, T.L0.a(this.f13763c | 1), this.f13764d);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3925i f13766b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H0 h02, InterfaceC3925i interfaceC3925i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13766b = interfaceC3925i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(null, this.f13766b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            int i10 = this.f13765a;
            if (i10 == 0) {
                Yg.v.b(obj);
                return Yg.J.f24997a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            throw null;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K0 f13767a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13768b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.q f13769c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13770d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13771e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K0 k02, androidx.compose.ui.e eVar, mh.q qVar, int i10, int i11) {
            super(2);
            this.f13767a = k02;
            this.f13768b = eVar;
            this.f13769c = qVar;
            this.f13770d = i10;
            this.f13771e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            J0.b(this.f13767a, this.f13768b, this.f13769c, interfaceC3540l, T.L0.a(this.f13770d | 1), this.f13771e);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f13772a = new f();

        f() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7517a f13774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13775c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f13776d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13777e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C7517a c7517a, boolean z10, InterfaceC7533i interfaceC7533i, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13774b = c7517a;
            this.f13775c = z10;
            this.f13776d = interfaceC7533i;
            this.f13777e = interfaceC6824a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new g(this.f13774b, this.f13775c, this.f13776d, this.f13777e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13773a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7517a c7517a = this.f13774b;
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.f13775c ? 1.0f : 0.0f);
                InterfaceC7533i interfaceC7533i = this.f13776d;
                this.f13773a = 1;
                if (C7517a.f(c7517a, fC, interfaceC7533i, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            this.f13777e.invoke();
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7517a f13779b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13780c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f13781d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C7517a c7517a, boolean z10, InterfaceC7533i interfaceC7533i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13779b = c7517a;
            this.f13780c = z10;
            this.f13781d = interfaceC7533i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new h(this.f13779b, this.f13780c, this.f13781d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13778a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7517a c7517a = this.f13779b;
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.f13780c ? 1.0f : 0.8f);
                InterfaceC7533i interfaceC7533i = this.f13781d;
                this.f13778a = 1;
                if (C7517a.f(c7517a, fC, interfaceC7533i, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf A[LOOP:2: B:78:0x01bd->B:79:0x01bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(N.H0 r17, androidx.compose.ui.e r18, mh.q r19, T.InterfaceC3540l r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.J0.a(N.H0, androidx.compose.ui.e, mh.q, T.l, int, int):void");
    }

    public static final void b(K0 k02, androidx.compose.ui.e eVar, mh.q qVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(431012348);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(k02) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(qVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                qVar = C3340q.f14653a.a();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(431012348, i12, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:157)");
            }
            k02.a();
            InterfaceC3925i interfaceC3925i = (InterfaceC3925i) interfaceC3540lR.t(AbstractC3932k0.c());
            boolean zL = interfaceC3540lR.l(null) | interfaceC3540lR.l(interfaceC3925i);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new d(null, interfaceC3925i, null);
                interfaceC3540lR.K(objF);
            }
            T.O.f(null, (InterfaceC6839p) objF, interfaceC3540lR, 0);
            k02.a();
            a(null, eVar, qVar, interfaceC3540lR, i12 & 1008, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        mh.q qVar2 = qVar;
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new e(k02, eVar2, qVar2, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1 f(InterfaceC7533i interfaceC7533i, boolean z10, InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 4) != 0) {
            interfaceC6824a = f.f13772a;
        }
        InterfaceC6824a interfaceC6824a2 = interfaceC6824a;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1016418159, i10, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:353)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = AbstractC7519b.b(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            interfaceC3540l.K(objF);
        }
        C7517a c7517a = (C7517a) objF;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zL = interfaceC3540l.l(c7517a) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.c(z10)) || (i10 & 48) == 32) | interfaceC3540l.l(interfaceC7533i) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.T(interfaceC6824a2)) || (i10 & 384) == 256);
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == aVar.a()) {
            Object gVar = new g(c7517a, z10, interfaceC7533i, interfaceC6824a2, null);
            interfaceC3540l.K(gVar);
            objF2 = gVar;
        }
        T.O.f(boolValueOf, (InterfaceC6839p) objF2, interfaceC3540l, (i10 >> 3) & 14);
        z1 z1VarG = c7517a.g();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1 g(InterfaceC7533i interfaceC7533i, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(2003504988, i10, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:366)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = AbstractC7519b.b(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            interfaceC3540l.K(objF);
        }
        C7517a c7517a = (C7517a) objF;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zL = interfaceC3540l.l(c7517a) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.c(z10)) || (i10 & 48) == 32) | interfaceC3540l.l(interfaceC7533i);
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == aVar.a()) {
            objF2 = new h(c7517a, z10, interfaceC7533i, null);
            interfaceC3540l.K(objF2);
        }
        T.O.f(boolValueOf, (InterfaceC6839p) objF2, interfaceC3540l, (i10 >> 3) & 14);
        z1 z1VarG = c7517a.g();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarG;
    }
}
