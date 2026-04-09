package N;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import j0.AbstractC6234e;
import j0.AbstractC6240k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.C6733v0;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.AbstractC7844e;
import s.C7846g;
import y.InterfaceC8558m;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;

/* loaded from: classes.dex */
public abstract class O0 {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f13863b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f13865d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7846g f13866e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f13867f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13868g;

        /* renamed from: N.O0$a$a, reason: collision with other inner class name */
        static final class C0544a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C0544a f13869a = new C0544a();

            C0544a() {
                super(1);
            }

            public final void a(J0.w wVar) {
                J0.t.Z(wVar, true);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((J0.w) obj);
                return Yg.J.f24997a;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f13870a;

            b(InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f13870a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                return ((b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, i1 i1Var, long j10, float f10, C7846g c7846g, float f11, InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f13862a = eVar;
            this.f13863b = i1Var;
            this.f13864c = j10;
            this.f13865d = f10;
            this.f13866e = c7846g;
            this.f13867f = f11;
            this.f13868g = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1822160838, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:114)");
            }
            androidx.compose.ui.e eVarD = AbstractC8576P.d(J0.m.b(O0.e(this.f13862a, this.f13863b, O0.f(this.f13864c, (M) interfaceC3540l.t(N.d()), this.f13865d, interfaceC3540l, 0), this.f13866e, this.f13867f), false, C0544a.f13869a), Yg.J.f24997a, new b(null));
            InterfaceC6839p interfaceC6839p = this.f13868g;
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), true);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarD);
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
            interfaceC6839p.invoke(interfaceC3540l, 0);
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

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13871a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f13872b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13873c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13874d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7846g f13875e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f13876f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13877g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13878h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13879i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, i1 i1Var, long j10, long j11, C7846g c7846g, float f10, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f13871a = eVar;
            this.f13872b = i1Var;
            this.f13873c = j10;
            this.f13874d = j11;
            this.f13875e = c7846g;
            this.f13876f = f10;
            this.f13877g = interfaceC6839p;
            this.f13878h = i10;
            this.f13879i = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            O0.a(this.f13871a, this.f13872b, this.f13873c, this.f13874d, this.f13875e, this.f13876f, this.f13877g, interfaceC3540l, T.L0.a(this.f13878h | 1), this.f13879i);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13880a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f13881b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13882c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f13883d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7846g f13884e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f13885f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f13886g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f13887h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13888i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13889j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, i1 i1Var, long j10, float f10, C7846g c7846g, float f11, InterfaceC8558m interfaceC8558m, boolean z10, InterfaceC6824a interfaceC6824a, InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f13880a = eVar;
            this.f13881b = i1Var;
            this.f13882c = j10;
            this.f13883d = f10;
            this.f13884e = c7846g;
            this.f13885f = f11;
            this.f13886g = interfaceC8558m;
            this.f13887h = z10;
            this.f13888i = interfaceC6824a;
            this.f13889j = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2031491085, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:224)");
            }
            androidx.compose.ui.e eVarB = androidx.compose.foundation.d.b(O0.e(AbstractC3313c0.d(this.f13880a), this.f13881b, O0.f(this.f13882c, (M) interfaceC3540l.t(N.d()), this.f13883d, interfaceC3540l, 0), this.f13884e, this.f13885f), this.f13886g, A0.g(false, 0.0f, 0L, interfaceC3540l, 0, 7), this.f13887h, null, null, this.f13888i, 24, null);
            InterfaceC6839p interfaceC6839p = this.f13889j;
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), true);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarB);
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
            interfaceC6839p.invoke(interfaceC3540l, 0);
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

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13892c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1 f13893d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13894e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13895f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C7846g f13896g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f13897h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f13898i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13899j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f13900k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13901l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, boolean z10, i1 i1Var, long j10, long j11, C7846g c7846g, float f10, InterfaceC8558m interfaceC8558m, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f13890a = interfaceC6824a;
            this.f13891b = eVar;
            this.f13892c = z10;
            this.f13893d = i1Var;
            this.f13894e = j10;
            this.f13895f = j11;
            this.f13896g = c7846g;
            this.f13897h = f10;
            this.f13898i = interfaceC8558m;
            this.f13899j = interfaceC6839p;
            this.f13900k = i10;
            this.f13901l = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            O0.b(this.f13890a, this.f13891b, this.f13892c, this.f13893d, this.f13894e, this.f13895f, this.f13896g, this.f13897h, this.f13898i, this.f13899j, interfaceC3540l, T.L0.a(this.f13900k | 1), this.f13901l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r26, m0.i1 r27, long r28, long r30, s.C7846g r32, float r33, mh.InterfaceC6839p r34, T.InterfaceC3540l r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.O0.a(androidx.compose.ui.e, m0.i1, long, long, s.g, float, mh.p, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(mh.InterfaceC6824a r28, androidx.compose.ui.e r29, boolean r30, m0.i1 r31, long r32, long r34, s.C7846g r36, float r37, y.InterfaceC8558m r38, mh.InterfaceC6839p r39, T.InterfaceC3540l r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.O0.b(mh.a, androidx.compose.ui.e, boolean, m0.i1, long, long, s.g, float, y.m, mh.p, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, i1 i1Var, long j10, C7846g c7846g, float f10) {
        return AbstractC6234e.a(androidx.compose.foundation.b.c(AbstractC6240k.b(eVar, f10, i1Var, false, 0L, 0L, 24, null).b0(c7846g != null ? AbstractC7844e.e(androidx.compose.ui.e.f28771b0, c7846g, i1Var) : androidx.compose.ui.e.f28771b0), j10, i1Var), i1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j10, M m10, float f10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1561611256, i10, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:495)");
        }
        if (!C6733v0.m(j10, C3319f0.f14419a.a(interfaceC3540l, 6).n()) || m10 == null) {
            interfaceC3540l.U(1082239839);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(1082171732);
            j10 = m10.a(j10, f10, interfaceC3540l, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & 896));
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return j10;
    }
}
