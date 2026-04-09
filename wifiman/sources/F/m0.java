package F;

import L0.AbstractC3179i;
import L0.C3174d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.X0;
import T.o1;
import T.t1;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;
import m0.Q0;
import m0.U0;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import y.AbstractC8557l;
import y.InterfaceC8558m;
import y0.AbstractC8600u;
import y0.InterfaceC8599t;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f5561a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f5562b = t1.d(null, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    private C3174d f5563c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.compose.runtime.snapshots.k f5564d;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5565a = new a();

        a() {
            super(1);
        }

        public final void a(J0.w wVar) {
            J0.t.y(wVar);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3174d.c f5567b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.t1 f5568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3174d.c cVar, androidx.compose.ui.platform.t1 t1Var) {
            super(0);
            this.f5567b = cVar;
            this.f5568c = t1Var;
        }

        public final void a() {
            m0.this.o((AbstractC3179i) this.f5567b.g(), this.f5568c);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f5569a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F f5570b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f5571c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(F f10, InterfaceC8558m interfaceC8558m, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f5570b = f10;
            this.f5571c = interfaceC8558m;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f5570b, this.f5571c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f5569a;
            if (i10 == 0) {
                Yg.v.b(obj);
                F f10 = this.f5570b;
                InterfaceC8558m interfaceC8558m = this.f5571c;
                this.f5569a = 1;
                if (f10.e(interfaceC8558m, this) == objG) {
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
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3174d.c f5573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ F f5574c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3174d.c cVar, F f10) {
            super(1);
            this.f5573b = cVar;
            this.f5574c = f10;
        }

        public final void a(P p10) {
            L0.N nB;
            L0.N nB2;
            L0.N nB3;
            m0 m0Var = m0.this;
            L0.N nB4 = ((AbstractC3179i) this.f5573b.g()).b();
            L0.D dC = null;
            L0.D dP = m0Var.p(m0Var.p(nB4 != null ? nB4.d() : null, (!this.f5574c.f() || (nB3 = ((AbstractC3179i) this.f5573b.g()).b()) == null) ? null : nB3.a()), (!this.f5574c.g() || (nB2 = ((AbstractC3179i) this.f5573b.g()).b()) == null) ? null : nB2.b());
            if (this.f5574c.h() && (nB = ((AbstractC3179i) this.f5573b.g()).b()) != null) {
                dC = nB.c();
            }
            L0.D dP2 = m0Var.p(dP, dC);
            if (dP2 != null) {
                C3174d.c cVar = this.f5573b;
                p10.a(dP2, cVar.h(), cVar.f());
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P) obj);
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5576b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(2);
            this.f5576b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            m0.this.b(interfaceC3540l, L0.a(this.f5576b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5578b;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m0 f5579a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f5580b;

            public a(m0 m0Var, InterfaceC6835l interfaceC6835l) {
                this.f5579a = m0Var;
                this.f5580b = interfaceC6835l;
            }

            @Override // T.K
            public void dispose() {
                this.f5579a.f5564d.remove(this.f5580b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f5578b = interfaceC6835l;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            m0.this.f5564d.add(this.f5578b);
            return new a(m0.this, this.f5578b);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f5582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5583c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Object[] objArr, InterfaceC6835l interfaceC6835l, int i10) {
            super(2);
            this.f5582b = objArr;
            this.f5583c = interfaceC6835l;
            this.f5584d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            m0 m0Var = m0.this;
            Object[] objArr = this.f5582b;
            m0Var.c(Arrays.copyOf(objArr, objArr.length), this.f5583c, interfaceC3540l, L0.a(this.f5584d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3174d.c f5586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3174d.c cVar) {
            super(1);
            this.f5586b = cVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            i1 i1VarS = m0.this.s(this.f5586b);
            if (i1VarS != null) {
                cVar.I1(i1VarS);
                cVar.G(true);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return Yg.J.f24997a;
        }
    }

    public static final class i implements i1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U0 f5587a;

        i(U0 u02) {
            this.f5587a = u02;
        }

        @Override // m0.i1
        public Q0 a(long j10, Y0.t tVar, Y0.d dVar) {
            return new Q0.a(this.f5587a);
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {
        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            L0.L l10;
            C3174d c3174dM = m0.this.m();
            L0.M mN = m0.this.n();
            return Boolean.valueOf(AbstractC6492s.d(c3174dM, (mN == null || (l10 = mN.l()) == null) ? null : l10.j()));
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y0.p f5589a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Y0.p pVar) {
            super(0);
            this.f5589a = pVar;
        }

        public final long a() {
            return this.f5589a.i();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return Y0.n.b(a());
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f5590a = new l();

        l() {
            super(0);
        }

        public final long a() {
            return Y0.n.f24536b.a();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return Y0.n.b(a());
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f5591a = new m();

        m() {
            super(0);
        }

        public final long a() {
            return Y0.n.f24536b.a();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return Y0.n.b(a());
        }
    }

    public m0(C3174d c3174d) {
        L0.D d10;
        this.f5561a = c3174d;
        C3174d.a aVar = new C3174d.a(c3174d);
        List listD = c3174d.d(0, c3174d.length());
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3174d.c cVar = (C3174d.c) listD.get(i10);
            L0.N nB = ((AbstractC3179i) cVar.g()).b();
            if (nB != null && (d10 = nB.d()) != null) {
                aVar.c(d10, cVar.h(), cVar.f());
            }
        }
        this.f5563c = aVar.p();
        this.f5564d = o1.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Object[] objArr, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2083052099);
        int i11 = (i10 & 48) == 0 ? (interfaceC3540lR.l(interfaceC6835l) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        interfaceC3540lR.s(-416630839, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i11 |= interfaceC3540lR.l(obj) ? 4 : 0;
        }
        interfaceC3540lR.N();
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2083052099, i11, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:298)");
            }
            kotlin.jvm.internal.T t10 = new kotlin.jvm.internal.T(2);
            t10.a(interfaceC6835l);
            t10.b(objArr);
            Object[] objArrD = t10.d(new Object[t10.c()]);
            boolean zL = ((i11 & 112) == 32) | interfaceC3540lR.l(this);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new f(interfaceC6835l);
                interfaceC3540lR.K(objF);
            }
            T.O.d(objArrD, (InterfaceC6835l) objF, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new g(objArr, interfaceC6835l, i10));
        }
    }

    private final C3174d.c j(C3174d.c cVar, L0.M m10) {
        int iP = L0.M.p(m10, m10.n() - 1, false, 2, null);
        if (cVar.h() < iP) {
            return C3174d.c.e(cVar, null, 0, Math.min(cVar.f(), iP), null, 11, null);
        }
        return null;
    }

    private final androidx.compose.ui.e k(androidx.compose.ui.e eVar, C3174d.c cVar) {
        return androidx.compose.ui.graphics.b.a(eVar, new h(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(AbstractC3179i abstractC3179i, androidx.compose.ui.platform.t1 t1Var) {
        if (abstractC3179i instanceof AbstractC3179i.b) {
            abstractC3179i.a();
            try {
                t1Var.a(((AbstractC3179i.b) abstractC3179i).c());
            } catch (IllegalArgumentException unused) {
            }
        } else if (abstractC3179i instanceof AbstractC3179i.a) {
            abstractC3179i.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L0.D p(L0.D d10, L0.D d11) {
        L0.D dY;
        return (d10 == null || (dY = d10.y(d11)) == null) ? d11 : dY;
    }

    private final U0 q(C3174d.c cVar) {
        L0.M mN;
        U0 u0Z = null;
        if (((Boolean) l().invoke()).booleanValue() && (mN = n()) != null) {
            C3174d.c cVarJ = j(cVar, mN);
            if (cVarJ == null) {
                return null;
            }
            u0Z = mN.z(cVarJ.h(), cVarJ.f());
            C6533i c6533iD = mN.d(cVarJ.h());
            u0Z.r(C6531g.u(AbstractC6532h.a(mN.q(cVarJ.h()) == mN.q(cVarJ.f() + (-1)) ? Math.min(mN.d(cVarJ.f() - 1).k(), c6533iD.k()) : 0.0f, c6533iD.n())));
        }
        return u0Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i1 s(C3174d.c cVar) {
        U0 u0Q = q(cVar);
        if (u0Q != null) {
            return new i(u0Q);
        }
        return null;
    }

    private final androidx.compose.ui.e t(androidx.compose.ui.e eVar, final C3174d.c cVar) {
        return eVar.b0(new s0(new t0() { // from class: F.l0
            @Override // F.t0
            public final q0 a(r0 r0Var) {
                return m0.u(this.f5369a, cVar, r0Var);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 u(m0 m0Var, C3174d.c cVar, r0 r0Var) {
        L0.M mN = m0Var.n();
        if (mN == null) {
            return r0Var.a(0, 0, l.f5590a);
        }
        C3174d.c cVarJ = m0Var.j(cVar, mN);
        if (cVarJ == null) {
            return r0Var.a(0, 0, m.f5591a);
        }
        Y0.p pVarB = Y0.q.b(mN.z(cVarJ.h(), cVarJ.f()).getBounds());
        return r0Var.a(pVarB.j(), pVarB.e(), new k(pVarB));
    }

    public final void b(InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        L0.D d10;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1154651354);
        int i12 = 2;
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1154651354, i11, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:200)");
            }
            androidx.compose.ui.platform.t1 t1Var = (androidx.compose.ui.platform.t1) interfaceC3540lR.t(AbstractC3932k0.s());
            C3174d c3174d = this.f5563c;
            List listD = c3174d.d(0, c3174d.length());
            int size = listD.size();
            int i13 = 0;
            while (i13 < size) {
                C3174d.c cVar = (C3174d.c) listD.get(i13);
                if (cVar.h() != cVar.f()) {
                    interfaceC3540lR.U(1385536272);
                    Object objF = interfaceC3540lR.f();
                    InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                    if (objF == aVar.a()) {
                        objF = AbstractC8557l.a();
                        interfaceC3540lR.K(objF);
                    }
                    InterfaceC8558m interfaceC8558m = (InterfaceC8558m) objF;
                    androidx.compose.ui.e eVarC = J0.m.c(AbstractC8600u.b(androidx.compose.foundation.h.b(t(k(androidx.compose.ui.e.f28771b0, cVar), cVar), interfaceC8558m, false, i12, null), InterfaceC8599t.f66323a.b(), false, i12, null), false, a.f5565a, 1, null);
                    boolean zL = interfaceC3540lR.l(this) | interfaceC3540lR.T(cVar) | interfaceC3540lR.l(t1Var);
                    Object objF2 = interfaceC3540lR.f();
                    if (zL || objF2 == aVar.a()) {
                        objF2 = new b(cVar, t1Var);
                        interfaceC3540lR.K(objF2);
                    }
                    androidx.compose.foundation.layout.d.a(androidx.compose.foundation.d.e(eVarC, interfaceC8558m, null, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? null : null, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null, (InterfaceC6824a) objF2), interfaceC3540lR, 0);
                    if (n0.b(((AbstractC3179i) cVar.g()).b())) {
                        interfaceC3540lR.U(1388165134);
                        interfaceC3540lR.J();
                    } else {
                        interfaceC3540lR.U(1386296950);
                        Object objF3 = interfaceC3540lR.f();
                        if (objF3 == aVar.a()) {
                            objF3 = new F();
                            interfaceC3540lR.K(objF3);
                        }
                        F f10 = (F) objF3;
                        Object objF4 = interfaceC3540lR.f();
                        if (objF4 == aVar.a()) {
                            d10 = null;
                            objF4 = new c(f10, interfaceC8558m, null);
                            interfaceC3540lR.K(objF4);
                        } else {
                            d10 = null;
                        }
                        T.O.f(interfaceC8558m, (InterfaceC6839p) objF4, interfaceC3540lR, 6);
                        Boolean boolValueOf = Boolean.valueOf(f10.g());
                        Boolean boolValueOf2 = Boolean.valueOf(f10.f());
                        Boolean boolValueOf3 = Boolean.valueOf(f10.h());
                        L0.N nB = ((AbstractC3179i) cVar.g()).b();
                        L0.D d11 = nB != null ? nB.d() : d10;
                        L0.N nB2 = ((AbstractC3179i) cVar.g()).b();
                        L0.D dA = nB2 != null ? nB2.a() : d10;
                        L0.N nB3 = ((AbstractC3179i) cVar.g()).b();
                        L0.D dB = nB3 != null ? nB3.b() : d10;
                        L0.N nB4 = ((AbstractC3179i) cVar.g()).b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, d11, dA, dB, nB4 != null ? nB4.c() : d10};
                        boolean zL2 = interfaceC3540lR.l(this) | interfaceC3540lR.T(cVar);
                        Object objF5 = interfaceC3540lR.f();
                        if (zL2 || objF5 == aVar.a()) {
                            objF5 = new d(cVar, f10);
                            interfaceC3540lR.K(objF5);
                        }
                        c(objArr, (InterfaceC6835l) objF5, interfaceC3540lR, (i11 << 6) & 896);
                        interfaceC3540lR.J();
                    }
                    interfaceC3540lR.J();
                } else {
                    interfaceC3540lR.U(1388179022);
                    interfaceC3540lR.J();
                }
                i13++;
                i12 = 2;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new e(i10));
        }
    }

    public final C3174d i() {
        C3174d c3174dP;
        if (this.f5564d.isEmpty()) {
            c3174dP = this.f5563c;
        } else {
            C3174d.a aVar = new C3174d.a(0, 1, null);
            aVar.g(this.f5561a);
            P p10 = new P(aVar);
            androidx.compose.runtime.snapshots.k kVar = this.f5564d;
            int size = kVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((InterfaceC6835l) kVar.get(i10)).invoke(p10);
            }
            c3174dP = aVar.p();
        }
        this.f5563c = c3174dP;
        return c3174dP;
    }

    public final InterfaceC6824a l() {
        return new j();
    }

    public final C3174d m() {
        return this.f5563c;
    }

    public final L0.M n() {
        return (L0.M) this.f5562b.getValue();
    }

    public final void r(L0.M m10) {
        this.f5562b.setValue(m10);
    }
}
