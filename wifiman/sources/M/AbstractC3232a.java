package M;

import E0.InterfaceC2629g;
import F.EnumC2726p;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.I0;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.w1;
import j0.C6233d;
import j0.C6237h;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6697d0;
import m0.AbstractC6721p0;
import m0.AbstractC6735w0;
import m0.AbstractC6737x0;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.J0;
import m0.K0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.C7034a;
import o0.InterfaceC7036c;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import z.C8680c;
import z.W;
import z.Z;
import z.a0;

/* renamed from: M.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3232a {

    /* renamed from: M.a$a, reason: collision with other inner class name */
    static final class C0483a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3241j f12152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0.c f12153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f12154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12155d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0483a(InterfaceC3241j interfaceC3241j, f0.c cVar, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f12152a = interfaceC3241j;
            this.f12153b = cVar;
            this.f12154c = interfaceC6839p;
            this.f12155d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3232a.a(this.f12152a, this.f12153b, this.f12154c, interfaceC3540l, L0.a(this.f12155d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: M.a$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w1 f12156a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12157b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12158c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12159d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3241j f12160e;

        /* renamed from: M.a$b$a, reason: collision with other inner class name */
        static final class C0484a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f12161a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f12162b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f12163c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3241j f12164d;

            /* renamed from: M.a$b$a$a, reason: collision with other inner class name */
            static final class C0485a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3241j f12165a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0485a(InterfaceC3241j interfaceC3241j) {
                    super(0);
                    this.f12165a = interfaceC3241j;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(AbstractC6532h.c(this.f12165a.a()));
                }
            }

            /* renamed from: M.a$b$a$b, reason: collision with other inner class name */
            static final class C0486b extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3241j f12166a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0486b(InterfaceC3241j interfaceC3241j) {
                    super(0);
                    this.f12166a = interfaceC3241j;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(AbstractC6532h.c(this.f12166a.a()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0484a(long j10, boolean z10, androidx.compose.ui.e eVar, InterfaceC3241j interfaceC3241j) {
                super(2);
                this.f12161a = j10;
                this.f12162b = z10;
                this.f12163c = eVar;
                this.f12164d = interfaceC3241j;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1426434671, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
                }
                if (this.f12161a != 9205357640488583168L) {
                    interfaceC3540l.U(-837727128);
                    C8680c.e eVarB = this.f12162b ? C8680c.a.f66841a.b() : C8680c.a.f66841a.a();
                    androidx.compose.ui.e eVarR = androidx.compose.foundation.layout.r.r(this.f12163c, Y0.k.h(this.f12161a), Y0.k.g(this.f12161a), 0.0f, 0.0f, 12, null);
                    InterfaceC3241j interfaceC3241j = this.f12164d;
                    boolean z10 = this.f12162b;
                    C0.C cB = W.b(eVarB, f0.c.f46573a.l(), interfaceC3540l, 0);
                    int iA = AbstractC3536j.a(interfaceC3540l, 0);
                    InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                    androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarR);
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
                    E1.c(interfaceC3540lA, cB, aVar.e());
                    E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                    InterfaceC6839p interfaceC6839pB = aVar.b();
                    if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                        interfaceC3540lA.K(Integer.valueOf(iA));
                        interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                    }
                    E1.c(interfaceC3540lA, eVarE, aVar.f());
                    Z z11 = Z.f66823a;
                    e.a aVar2 = androidx.compose.ui.e.f28771b0;
                    boolean zL = interfaceC3540l.l(interfaceC3241j);
                    Object objF = interfaceC3540l.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0485a(interfaceC3241j);
                        interfaceC3540l.K(objF);
                    }
                    AbstractC3232a.c(aVar2, (InterfaceC6824a) objF, z10, interfaceC3540l, 6);
                    interfaceC3540l.R();
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(-836867312);
                    androidx.compose.ui.e eVar = this.f12163c;
                    boolean zL2 = interfaceC3540l.l(this.f12164d);
                    InterfaceC3241j interfaceC3241j2 = this.f12164d;
                    Object objF2 = interfaceC3540l.f();
                    if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new C0486b(interfaceC3241j2);
                        interfaceC3540l.K(objF2);
                    }
                    AbstractC3232a.c(eVar, (InterfaceC6824a) objF2, this.f12162b, interfaceC3540l, 0);
                    interfaceC3540l.J();
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w1 w1Var, long j10, boolean z10, androidx.compose.ui.e eVar, InterfaceC3241j interfaceC3241j) {
            super(2);
            this.f12156a = w1Var;
            this.f12157b = j10;
            this.f12158c = z10;
            this.f12159d = eVar;
            this.f12160e = interfaceC3241j;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(280174801, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)");
            }
            AbstractC3561w.a(AbstractC3932k0.t().d(this.f12156a), b0.c.e(-1426434671, true, new C0484a(this.f12157b, this.f12158c, this.f12159d, this.f12160e), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
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

    /* renamed from: M.a$c */
    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3241j f12167a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12168b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ W0.i f12169c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12170d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12171e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12172f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12173g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12174h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3241j interfaceC3241j, boolean z10, W0.i iVar, boolean z11, long j10, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.f12167a = interfaceC3241j;
            this.f12168b = z10;
            this.f12169c = iVar;
            this.f12170d = z11;
            this.f12171e = j10;
            this.f12172f = eVar;
            this.f12173g = i10;
            this.f12174h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3232a.b(this.f12167a, this.f12168b, this.f12169c, this.f12170d, this.f12171e, this.f12172f, interfaceC3540l, L0.a(this.f12173g | 1), this.f12174h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: M.a$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3241j f12175a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12176b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3241j interfaceC3241j, boolean z10, boolean z11) {
            super(1);
            this.f12175a = interfaceC3241j;
            this.f12176b = z10;
            this.f12177c = z11;
        }

        public final void a(J0.w wVar) {
            long jA = this.f12175a.a();
            wVar.b(w.d(), new v(this.f12176b ? EnumC2726p.SelectionStart : EnumC2726p.SelectionEnd, jA, this.f12177c ? u.Left : u.Right, AbstractC6532h.c(jA), null));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: M.a$e */
    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12178a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f12179b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12180c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12181d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, boolean z10, int i10) {
            super(2);
            this.f12178a = eVar;
            this.f12179b = interfaceC6824a;
            this.f12180c = z10;
            this.f12181d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3232a.c(this.f12178a, this.f12179b, this.f12180c, interfaceC3540l, L0.a(this.f12181d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: M.a$f */
    static final class f extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f12182a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12183b;

        /* renamed from: M.a$f$a, reason: collision with other inner class name */
        static final class C0487a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f12184a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f12185b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f12186c;

            /* renamed from: M.a$f$a$a, reason: collision with other inner class name */
            static final class C0488a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f12187a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f12188b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ J0 f12189c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractC6735w0 f12190d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0488a(InterfaceC6824a interfaceC6824a, boolean z10, J0 j02, AbstractC6735w0 abstractC6735w0) {
                    super(1);
                    this.f12187a = interfaceC6824a;
                    this.f12188b = z10;
                    this.f12189c = j02;
                    this.f12190d = abstractC6735w0;
                }

                public final void a(InterfaceC7036c interfaceC7036c) {
                    interfaceC7036c.X1();
                    if (((Boolean) this.f12187a.invoke()).booleanValue()) {
                        if (!this.f12188b) {
                            InterfaceC7039f.Y(interfaceC7036c, this.f12189c, 0L, 0.0f, null, this.f12190d, 0, 46, null);
                            return;
                        }
                        J0 j02 = this.f12189c;
                        AbstractC6735w0 abstractC6735w0 = this.f12190d;
                        long jD1 = interfaceC7036c.D1();
                        InterfaceC7037d interfaceC7037dK1 = interfaceC7036c.k1();
                        long jC = interfaceC7037dK1.c();
                        interfaceC7037dK1.d().j();
                        try {
                            interfaceC7037dK1.e().f(-1.0f, 1.0f, jD1);
                            InterfaceC7039f.Y(interfaceC7036c, j02, 0L, 0.0f, null, abstractC6735w0, 0, 46, null);
                        } finally {
                            interfaceC7037dK1.d().r();
                            interfaceC7037dK1.f(jC);
                        }
                    }
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC7036c) obj);
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0487a(long j10, InterfaceC6824a interfaceC6824a, boolean z10) {
                super(1);
                this.f12184a = j10;
                this.f12185b = interfaceC6824a;
                this.f12186c = z10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6237h invoke(C6233d c6233d) {
                return c6233d.p(new C0488a(this.f12185b, this.f12186c, AbstractC3232a.d(c6233d, C6537m.i(c6233d.c()) / 2.0f), AbstractC6735w0.a.b(AbstractC6735w0.f52966b, this.f12184a, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC6824a interfaceC6824a, boolean z10) {
            super(3);
            this.f12182a = interfaceC6824a;
            this.f12183b = z10;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-196777734);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-196777734, i10, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)");
            }
            long jB = ((K) interfaceC3540l.t(L.b())).b();
            boolean zJ = interfaceC3540l.j(jB) | interfaceC3540l.T(this.f12182a) | interfaceC3540l.c(this.f12183b);
            InterfaceC6824a interfaceC6824a = this.f12182a;
            boolean z10 = this.f12183b;
            Object objF = interfaceC3540l.f();
            if (zJ || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C0487a(jB, interfaceC6824a, z10);
                interfaceC3540l.K(objF);
            }
            androidx.compose.ui.e eVarC = androidx.compose.ui.draw.b.c(eVar, (InterfaceC6835l) objF);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarC;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final void a(InterfaceC3241j interfaceC3241j, f0.c cVar, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC3540lR.T(interfaceC3241j) : interfaceC3540lR.l(interfaceC3241j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(476043083, i11, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)");
            }
            boolean z10 = false;
            boolean z11 = (i11 & 112) == 32;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && interfaceC3540lR.T(interfaceC3241j))) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object objF = interfaceC3540lR.f();
            if (z12 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C3239h(cVar, interfaceC3241j);
                interfaceC3540lR.K(objF);
            }
            androidx.compose.ui.window.b.a((C3239h) objF, null, new androidx.compose.ui.window.r(false, false, false, null, true, false, 15, null), interfaceC6839p, interfaceC3540lR, ((i11 << 3) & 7168) | 384, 2);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new C0483a(interfaceC3241j, cVar, interfaceC6839p, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(M.InterfaceC3241j r18, boolean r19, W0.i r20, boolean r21, long r22, androidx.compose.ui.e r24, T.InterfaceC3540l r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M.AbstractC3232a.b(M.j, boolean, W0.i, boolean, long, androidx.compose.ui.e, T.l, int, int):void");
    }

    public static final void c(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6824a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2111672474, i11, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)");
            }
            a0.a(e(androidx.compose.foundation.layout.r.w(eVar, w.c(), w.b()), interfaceC6824a, z10), interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new e(eVar, interfaceC6824a, z10, i10));
        }
    }

    public static final J0 d(C6233d c6233d, float f10) {
        int iCeil = ((int) Math.ceil(f10)) * 2;
        C3238g c3238g = C3238g.f12203a;
        J0 j0C = c3238g.c();
        InterfaceC6717n0 interfaceC6717n0A = c3238g.a();
        C7034a c7034aB = c3238g.b();
        if (j0C == null || interfaceC6717n0A == null || iCeil > j0C.getWidth() || iCeil > j0C.getHeight()) {
            j0C = m0.L0.b(iCeil, iCeil, K0.f52822b.a(), false, null, 24, null);
            c3238g.f(j0C);
            interfaceC6717n0A = AbstractC6721p0.a(j0C);
            c3238g.d(interfaceC6717n0A);
        }
        J0 j02 = j0C;
        InterfaceC6717n0 interfaceC6717n0 = interfaceC6717n0A;
        if (c7034aB == null) {
            c7034aB = new C7034a();
            c3238g.e(c7034aB);
        }
        C7034a c7034a = c7034aB;
        Y0.t layoutDirection = c6233d.getLayoutDirection();
        long jA = AbstractC6538n.a(j02.getWidth(), j02.getHeight());
        C7034a.C1996a c1996aB = c7034a.B();
        Y0.d dVarA = c1996aB.a();
        Y0.t tVarB = c1996aB.b();
        InterfaceC6717n0 interfaceC6717n0C = c1996aB.c();
        long jD = c1996aB.d();
        C7034a.C1996a c1996aB2 = c7034a.B();
        c1996aB2.j(c6233d);
        c1996aB2.k(layoutDirection);
        c1996aB2.i(interfaceC6717n0);
        c1996aB2.l(jA);
        interfaceC6717n0.j();
        InterfaceC7039f.u0(c7034a, C6733v0.f52951b.a(), 0L, c7034a.c(), 0.0f, null, null, AbstractC6697d0.f52884a.a(), 58, null);
        InterfaceC7039f.u0(c7034a, AbstractC6737x0.d(4278190080L), C6531g.f52335b.c(), AbstractC6538n.a(f10, f10), 0.0f, null, null, 0, 120, null);
        InterfaceC7039f.P1(c7034a, AbstractC6737x0.d(4278190080L), f10, AbstractC6532h.a(f10, f10), 0.0f, null, null, 0, 120, null);
        interfaceC6717n0.r();
        C7034a.C1996a c1996aB3 = c7034a.B();
        c1996aB3.j(dVarA);
        c1996aB3.k(tVarB);
        c1996aB3.i(interfaceC6717n0C);
        c1996aB3.l(jD);
        return j02;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, boolean z10) {
        return androidx.compose.ui.c.c(eVar, null, new f(interfaceC6824a, z10), 1, null);
    }
}
