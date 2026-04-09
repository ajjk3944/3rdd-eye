package O;

import C0.C;
import E0.InterfaceC2629g;
import J0.m;
import J0.w;
import N.AbstractC3346t0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import T.z1;
import Yg.J;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6533i;
import m0.AbstractC6688Y;
import m0.U0;
import m0.W0;
import m0.k1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import o0.C7044k;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import r.AbstractC7521c;
import r.AbstractC7535j;
import r.G;
import r.r0;
import s.AbstractC7848i;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f16663a = Y0.h.j(40);

    /* renamed from: b, reason: collision with root package name */
    private static final E.g f16664b = E.h.g();

    /* renamed from: c, reason: collision with root package name */
    private static final float f16665c = Y0.h.j((float) 7.5d);

    /* renamed from: d, reason: collision with root package name */
    private static final float f16666d = Y0.h.j((float) 2.5d);

    /* renamed from: e, reason: collision with root package name */
    private static final float f16667e = Y0.h.j(10);

    /* renamed from: f, reason: collision with root package name */
    private static final float f16668f = Y0.h.j(5);

    /* renamed from: g, reason: collision with root package name */
    private static final float f16669g = Y0.h.j(6);

    /* renamed from: h, reason: collision with root package name */
    private static final r0 f16670h = AbstractC7535j.l(300, 0, G.d(), 2, null);

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16671a = new a();

        a() {
            super(1);
        }

        public final void a(w wVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((w) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O.g f16672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f16673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f16674c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ U0 f16675d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O.g gVar, z1 z1Var, long j10, U0 u02) {
            super(1);
            this.f16672a = gVar;
            this.f16673b = z1Var;
            this.f16674c = j10;
            this.f16675d = u02;
        }

        public final void a(InterfaceC7039f interfaceC7039f) throws Throwable {
            long j10;
            InterfaceC7037d interfaceC7037d;
            C6533i c6533i;
            O.a aVarA = c.a(this.f16672a.j());
            float fFloatValue = ((Number) this.f16673b.getValue()).floatValue();
            float fB = aVarA.b();
            long j11 = this.f16674c;
            U0 u02 = this.f16675d;
            long jD1 = interfaceC7039f.D1();
            InterfaceC7037d interfaceC7037dK1 = interfaceC7039f.k1();
            long jC = interfaceC7037dK1.c();
            interfaceC7037dK1.d().j();
            try {
                interfaceC7037dK1.e().i(fB, jD1);
                float fD1 = interfaceC7039f.d1(c.f16665c) + (interfaceC7039f.d1(c.f16666d) / 2.0f);
                c6533i = new C6533i(C6531g.m(AbstractC6538n.b(interfaceC7039f.c())) - fD1, C6531g.n(AbstractC6538n.b(interfaceC7039f.c())) - fD1, C6531g.m(AbstractC6538n.b(interfaceC7039f.c())) + fD1, C6531g.n(AbstractC6538n.b(interfaceC7039f.c())) + fD1);
            } catch (Throwable th2) {
                th = th2;
                j10 = jC;
                interfaceC7037d = interfaceC7037dK1;
            }
            try {
                InterfaceC7039f.p1(interfaceC7039f, j11, aVarA.d(), aVarA.a() - aVarA.d(), false, c6533i.p(), c6533i.m(), fFloatValue, new C7044k(interfaceC7039f.d1(c.f16666d), 0.0f, k1.f52924a.c(), 0, null, 26, null), null, 0, 768, null);
                c.k(interfaceC7039f, u02, c6533i, j11, fFloatValue, aVarA);
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(jC);
            } catch (Throwable th3) {
                th = th3;
                interfaceC7037d = interfaceC7037dK1;
                j10 = jC;
                interfaceC7037d.d().r();
                interfaceC7037d.f(j10);
                throw th;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((InterfaceC7039f) obj);
            return J.f24997a;
        }
    }

    /* renamed from: O.c$c, reason: collision with other inner class name */
    static final class C0597c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O.g f16676a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f16677b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f16678c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f16679d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0597c(O.g gVar, long j10, androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.f16676a = gVar;
            this.f16677b = j10;
            this.f16678c = eVar;
            this.f16679d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            c.b(this.f16676a, this.f16677b, this.f16678c, interfaceC3540l, L0.a(this.f16679d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O.g f16680a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(O.g gVar) {
            super(0);
            this.f16680a = gVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f16680a.j() < 1.0f ? 0.3f : 1.0f);
        }
    }

    static final class e extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f16681a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O.g f16682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, O.g gVar) {
            super(3);
            this.f16681a = j10;
            this.f16682b = gVar;
        }

        public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.c(z10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1853731063, i11, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:105)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarF = r.f(aVar, 0.0f, 1, null);
            f0.c cVarE = f0.c.f46573a.e();
            long j10 = this.f16681a;
            O.g gVar = this.f16682b;
            C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarF);
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
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            float fJ = Y0.h.j(Y0.h.j(c.f16665c + c.f16666d) * 2);
            if (z10) {
                interfaceC3540l.U(-1565983018);
                AbstractC3346t0.b(r.v(aVar, fJ), j10, c.f16666d, 0L, 0, interfaceC3540l, 390, 24);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-1565735297);
                c.b(gVar, j10, r.v(aVar, fJ), interfaceC3540l, 384);
                interfaceC3540l.J();
            }
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O.g f16684b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f16685c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f16686d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f16687e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f16688f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f16689g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f16690h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, O.g gVar, androidx.compose.ui.e eVar, long j10, long j11, boolean z11, int i10, int i11) {
            super(2);
            this.f16683a = z10;
            this.f16684b = gVar;
            this.f16685c = eVar;
            this.f16686d = j10;
            this.f16687e = j11;
            this.f16688f = z11;
            this.f16689g = i10;
            this.f16690h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            c.d(this.f16683a, this.f16684b, this.f16685c, this.f16686d, this.f16687e, this.f16688f, interfaceC3540l, L0.a(this.f16689g | 1), this.f16690h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16691a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O.g f16692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, O.g gVar) {
            super(0);
            this.f16691a = z10;
            this.f16692b = gVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f16691a || this.f16692b.i() > 0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O.a a(float f10) {
        float fMax = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * 5) / 3;
        float fAbs = Math.abs(f10) - 1.0f;
        float f11 = fAbs >= 0.0f ? fAbs : 0.0f;
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        float fPow = (((0.4f * fMax) - 0.25f) + (f11 - (((float) Math.pow(f11, 2)) / 4))) * 0.5f;
        float f12 = 360;
        return new O.a(fPow, fPow * f12, ((0.8f * fMax) + fPow) * f12, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(O.g gVar, long j10, androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-486016981);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(gVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.j(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(eVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-486016981, i11, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:134)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            Object obj = objF;
            if (objF == aVar.a()) {
                U0 u0A = AbstractC6688Y.a();
                u0A.h(W0.f52862a.a());
                interfaceC3540lR.K(u0A);
                obj = u0A;
            }
            U0 u02 = (U0) obj;
            boolean zT = interfaceC3540lR.T(gVar);
            Object objF2 = interfaceC3540lR.f();
            if (zT || objF2 == aVar.a()) {
                objF2 = o1.e(new d(gVar));
                interfaceC3540lR.K(objF2);
            }
            z1 z1VarD = AbstractC7521c.d(c((z1) objF2), f16670h, 0.0f, null, null, interfaceC3540lR, 48, 28);
            androidx.compose.ui.e eVarC = m.c(eVar, false, a.f16671a, 1, null);
            boolean zL = interfaceC3540lR.l(gVar) | interfaceC3540lR.T(z1VarD) | ((i11 & 112) == 32) | interfaceC3540lR.l(u02);
            Object objF3 = interfaceC3540lR.f();
            if (zL || objF3 == aVar.a()) {
                interfaceC3540l2 = interfaceC3540lR;
                b bVar = new b(gVar, z1VarD, j10, u02);
                interfaceC3540l2.K(bVar);
                objF3 = bVar;
            } else {
                interfaceC3540l2 = interfaceC3540lR;
            }
            AbstractC7848i.a(eVarC, (InterfaceC6835l) objF3, interfaceC3540l2, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new C0597c(gVar, j10, eVar, i10));
        }
    }

    private static final float c(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(boolean r29, O.g r30, androidx.compose.ui.e r31, long r32, long r34, boolean r36, T.InterfaceC3540l r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O.c.d(boolean, O.g, androidx.compose.ui.e, long, long, boolean, T.l, int, int):void");
    }

    private static final boolean e(z1 z1Var) {
        return ((Boolean) z1Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(InterfaceC7039f interfaceC7039f, U0 u02, C6533i c6533i, long j10, float f10, O.a aVar) {
        u02.a();
        u02.n(0.0f, 0.0f);
        float f11 = f16667e;
        u02.u(interfaceC7039f.d1(f11) * aVar.c(), 0.0f);
        u02.u((interfaceC7039f.d1(f11) * aVar.c()) / 2, interfaceC7039f.d1(f16668f) * aVar.c());
        u02.r(AbstractC6532h.a(((Math.min(c6533i.r(), c6533i.j()) / 2.0f) + C6531g.m(c6533i.i())) - ((interfaceC7039f.d1(f11) * aVar.c()) / 2.0f), C6531g.n(c6533i.i()) + (interfaceC7039f.d1(f16666d) / 2.0f)));
        u02.close();
        float fA = aVar.a();
        long jD1 = interfaceC7039f.D1();
        InterfaceC7037d interfaceC7037dK1 = interfaceC7039f.k1();
        long jC = interfaceC7037dK1.c();
        interfaceC7037dK1.d().j();
        try {
            interfaceC7037dK1.e().i(fA, jD1);
            InterfaceC7039f.C1(interfaceC7039f, u02, j10, f10, null, null, 0, 56, null);
        } finally {
            interfaceC7037dK1.d().r();
            interfaceC7037dK1.f(jC);
        }
    }
}
