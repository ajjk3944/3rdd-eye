package F;

import C0.AbstractC2522b;
import C0.InterfaceC2535o;
import E0.InterfaceC2629g;
import I.N0;
import Ii.AbstractC3063k;
import L0.C3174d;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import M.InterfaceC3241j;
import R0.C3448a;
import R0.C3453f;
import R0.C3461n;
import R0.C3465s;
import R0.C3471y;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import T.z1;
import Zg.AbstractC3689v;
import android.view.KeyEvent;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.E1;
import androidx.compose.ui.platform.n1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import l0.C6533i;
import m0.AbstractC6713l0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import w.AbstractC8235B;
import w0.C8248b;
import y.InterfaceC8558m;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;

/* renamed from: F.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2723m {

    /* renamed from: F.m$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5371a = new a();

        a() {
            super(1);
        }

        public final void a(L0.M m10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L0.M) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f5372a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f5373b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1 f5374c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ R0.T f5375d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ M.G f5376e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3465s f5377f;

        /* renamed from: F.m$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f5378a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1 z1Var) {
                super(0);
                this.f5378a = z1Var;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AbstractC2723m.b(this.f5378a));
            }
        }

        /* renamed from: F.m$b$b, reason: collision with other inner class name */
        static final class C0226b implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E f5379a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0.T f5380b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ M.G f5381c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3465s f5382d;

            C0226b(E e10, R0.T t10, M.G g10, C3465s c3465s) {
                this.f5379a = e10;
                this.f5380b = t10;
                this.f5381c = g10;
                this.f5382d = c3465s;
            }

            @Override // Li.InterfaceC3221h
            public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                return b(((Boolean) obj).booleanValue(), interfaceC5380e);
            }

            public final Object b(boolean z10, InterfaceC5380e interfaceC5380e) {
                if (z10 && this.f5379a.e()) {
                    AbstractC2723m.q(this.f5380b, this.f5379a, this.f5381c.O(), this.f5382d, this.f5381c.J());
                } else {
                    AbstractC2723m.n(this.f5379a);
                }
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E e10, z1 z1Var, R0.T t10, M.G g10, C3465s c3465s, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f5373b = e10;
            this.f5374c = z1Var;
            this.f5375d = t10;
            this.f5376e = g10;
            this.f5377f = c3465s;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f5373b, this.f5374c, this.f5375d, this.f5376e, this.f5377f, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f5372a;
            try {
                if (i10 == 0) {
                    Yg.v.b(obj);
                    InterfaceC3220g interfaceC3220gO = o1.o(new a(this.f5374c));
                    C0226b c0226b = new C0226b(this.f5373b, this.f5375d, this.f5376e, this.f5377f);
                    this.f5372a = 1;
                    if (interfaceC3220gO.b(c0226b, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                AbstractC2723m.n(this.f5373b);
                return Yg.J.f24997a;
            } catch (Throwable th2) {
                AbstractC2723m.n(this.f5373b);
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: F.m$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M.G f5383a;

        /* renamed from: F.m$c$a */
        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M.G f5384a;

            public a(M.G g10) {
                this.f5384a = g10;
            }

            @Override // T.K
            public void dispose() {
                this.f5384a.R();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(M.G g10) {
            super(1);
            this.f5383a = g10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            return new a(this.f5383a);
        }
    }

    /* renamed from: F.m$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0.T f5386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ R0.Q f5387c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3465s f5388d;

        /* renamed from: F.m$d$a */
        public static final class a implements T.K {
            @Override // T.K
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(E e10, R0.T t10, R0.Q q10, C3465s c3465s) {
            super(1);
            this.f5385a = e10;
            this.f5386b = t10;
            this.f5387c = q10;
            this.f5388d = c3465s;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            if (this.f5385a.e()) {
                E e10 = this.f5385a;
                e10.E(W.f4951a.i(this.f5386b, this.f5387c, e10.n(), this.f5388d, this.f5385a.m(), this.f5385a.l()));
            }
            return new a();
        }
    }

    /* renamed from: F.m$e */
    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f5389a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f5390b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0.U f5391c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5392d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5393e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f5394f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ R0.Q f5395g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ R0.c0 f5396h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5397i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5398j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5399k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5400l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ D.b f5401m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ M.G f5402n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f5403o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f5404p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5405q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ R0.H f5406r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Y0.d f5407s;

        /* renamed from: F.m$e$a */
        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E f5408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L0.U f5409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f5410c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f5411d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ f0 f5412e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ R0.Q f5413f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ R0.c0 f5414g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f5415h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f5416i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f5417j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f5418k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ D.b f5419l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ M.G f5420m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f5421n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f5422o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f5423p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ R0.H f5424q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Y0.d f5425r;

            /* renamed from: F.m$e$a$a, reason: collision with other inner class name */
            static final class C0227a extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ M.G f5426a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ E f5427b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f5428c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f5429d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC6835l f5430e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ R0.Q f5431f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ R0.H f5432g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Y0.d f5433h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ int f5434i;

                /* renamed from: F.m$e$a$a$a, reason: collision with other inner class name */
                public static final class C0228a implements C0.C {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ E f5435a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6835l f5436b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ R0.Q f5437c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ R0.H f5438d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Y0.d f5439e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ int f5440f;

                    /* renamed from: F.m$e$a$a$a$a, reason: collision with other inner class name */
                    static final class C0229a extends AbstractC6494u implements InterfaceC6835l {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C0229a f5441a = new C0229a();

                        C0229a() {
                            super(1);
                        }

                        public final void a(t.a aVar) {
                        }

                        @Override // mh.InterfaceC6835l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((t.a) obj);
                            return Yg.J.f24997a;
                        }
                    }

                    C0228a(E e10, InterfaceC6835l interfaceC6835l, R0.Q q10, R0.H h10, Y0.d dVar, int i10) {
                        this.f5435a = e10;
                        this.f5436b = interfaceC6835l;
                        this.f5437c = q10;
                        this.f5438d = h10;
                        this.f5439e = dVar;
                        this.f5440f = i10;
                    }

                    @Override // C0.C
                    public C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
                        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
                        E e10 = this.f5435a;
                        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
                        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
                        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
                        try {
                            j0 j0VarJ = e10.j();
                            L0.M mF = j0VarJ != null ? j0VarJ.f() : null;
                            Yg.y yVarD = W.f4951a.d(this.f5435a.v(), j10, mVar.getLayoutDirection(), mF);
                            int iIntValue = ((Number) yVarD.a()).intValue();
                            int iIntValue2 = ((Number) yVarD.c()).intValue();
                            L0.M m10 = (L0.M) yVarD.d();
                            if (!AbstractC6492s.d(mF, m10)) {
                                this.f5435a.G(new j0(m10, null, j0VarJ != null ? j0VarJ.b() : null, 2, null));
                                this.f5436b.invoke(m10);
                                AbstractC2723m.o(this.f5435a, this.f5437c, this.f5438d);
                            }
                            this.f5435a.H(this.f5439e.x(this.f5440f == 1 ? T.a(m10.m(0)) : 0));
                            return mVar.v1(iIntValue, iIntValue2, Zg.U.k(Yg.z.a(AbstractC2522b.a(), Integer.valueOf(Math.round(m10.h()))), Yg.z.a(AbstractC2522b.b(), Integer.valueOf(Math.round(m10.k())))), C0229a.f5441a);
                        } finally {
                            aVar.m(gVarD, gVarF, interfaceC6835lH);
                        }
                    }

                    @Override // C0.C
                    public int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
                        this.f5435a.v().m(interfaceC2535o.getLayoutDirection());
                        return this.f5435a.v().c();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0227a(M.G g10, E e10, boolean z10, boolean z11, InterfaceC6835l interfaceC6835l, R0.Q q10, R0.H h10, Y0.d dVar, int i10) {
                    super(2);
                    this.f5426a = g10;
                    this.f5427b = e10;
                    this.f5428c = z10;
                    this.f5429d = z11;
                    this.f5430e = interfaceC6835l;
                    this.f5431f = q10;
                    this.f5432g = h10;
                    this.f5433h = dVar;
                    this.f5434i = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(T.InterfaceC3540l r11, int r12) {
                    /*
                        r10 = this;
                        r0 = r12 & 3
                        r1 = 2
                        if (r0 != r1) goto L11
                        boolean r0 = r11.v()
                        if (r0 != 0) goto Lc
                        goto L11
                    Lc:
                        r11.C()
                        goto L102
                    L11:
                        boolean r0 = T.AbstractC3546o.H()
                        if (r0 == 0) goto L20
                        r0 = -1
                        java.lang.String r1 = "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)"
                        r2 = -363167407(0xffffffffea5a8151, float:-6.6039127E25)
                        T.AbstractC3546o.Q(r2, r12, r0, r1)
                    L20:
                        F.m$e$a$a$a r12 = new F.m$e$a$a$a
                        F.E r4 = r10.f5427b
                        mh.l r5 = r10.f5430e
                        R0.Q r6 = r10.f5431f
                        R0.H r7 = r10.f5432g
                        Y0.d r8 = r10.f5433h
                        int r9 = r10.f5434i
                        r3 = r12
                        r3.<init>(r4, r5, r6, r7, r8, r9)
                        androidx.compose.ui.e$a r0 = androidx.compose.ui.e.f28771b0
                        r1 = 0
                        int r2 = T.AbstractC3536j.a(r11, r1)
                        T.x r3 = r11.G()
                        androidx.compose.ui.e r0 = androidx.compose.ui.c.e(r11, r0)
                        E0.g$a r4 = E0.InterfaceC2629g.f3916K
                        mh.a r5 = r4.a()
                        T.f r6 = r11.x()
                        if (r6 != 0) goto L50
                        T.AbstractC3536j.c()
                    L50:
                        r11.u()
                        boolean r6 = r11.o()
                        if (r6 == 0) goto L5d
                        r11.D(r5)
                        goto L60
                    L5d:
                        r11.I()
                    L60:
                        T.l r5 = T.E1.a(r11)
                        mh.p r6 = r4.e()
                        T.E1.c(r5, r12, r6)
                        mh.p r12 = r4.g()
                        T.E1.c(r5, r3, r12)
                        mh.p r12 = r4.b()
                        boolean r3 = r5.o()
                        if (r3 != 0) goto L8a
                        java.lang.Object r3 = r5.f()
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                        boolean r3 = kotlin.jvm.internal.AbstractC6492s.d(r3, r6)
                        if (r3 != 0) goto L98
                    L8a:
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                        r5.K(r3)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r5.Q(r2, r12)
                    L98:
                        mh.p r12 = r4.f()
                        T.E1.c(r5, r0, r12)
                        r11.R()
                        M.G r12 = r10.f5426a
                        F.E r0 = r10.f5427b
                        F.q r0 = r0.d()
                        F.q r2 = F.EnumC2727q.None
                        if (r0 == r2) goto Lcb
                        F.E r0 = r10.f5427b
                        C0.r r0 = r0.i()
                        if (r0 == 0) goto Lcb
                        F.E r0 = r10.f5427b
                        C0.r r0 = r0.i()
                        kotlin.jvm.internal.AbstractC6492s.f(r0)
                        boolean r0 = r0.M()
                        if (r0 == 0) goto Lcb
                        boolean r0 = r10.f5428c
                        if (r0 == 0) goto Lcb
                        r0 = 1
                        goto Lcc
                    Lcb:
                        r0 = r1
                    Lcc:
                        F.AbstractC2723m.h(r12, r0, r11, r1)
                        F.E r12 = r10.f5427b
                        F.q r12 = r12.d()
                        F.q r0 = F.EnumC2727q.Cursor
                        if (r12 != r0) goto Lf0
                        boolean r12 = r10.f5429d
                        if (r12 != 0) goto Lf0
                        boolean r12 = r10.f5428c
                        if (r12 == 0) goto Lf0
                        r12 = -2032274(0xffffffffffe0fd6e, float:NaN)
                        r11.U(r12)
                        M.G r12 = r10.f5426a
                        F.AbstractC2723m.e(r12, r11, r1)
                        r11.J()
                        goto Lf9
                    Lf0:
                        r12 = -1955394(0xffffffffffe229be, float:NaN)
                        r11.U(r12)
                        r11.J()
                    Lf9:
                        boolean r11 = T.AbstractC3546o.H()
                        if (r11 == 0) goto L102
                        T.AbstractC3546o.P()
                    L102:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: F.AbstractC2723m.e.a.C0227a.a(T.l, int):void");
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                    return Yg.J.f24997a;
                }
            }

            /* renamed from: F.m$e$a$b */
            static final class b extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ E f5442a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(E e10) {
                    super(0);
                    this.f5442a = e10;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final j0 invoke() {
                    return this.f5442a.j();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(E e10, L0.U u10, int i10, int i11, f0 f0Var, R0.Q q10, R0.c0 c0Var, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, D.b bVar, M.G g10, boolean z10, boolean z11, InterfaceC6835l interfaceC6835l, R0.H h10, Y0.d dVar) {
                super(2);
                this.f5408a = e10;
                this.f5409b = u10;
                this.f5410c = i10;
                this.f5411d = i11;
                this.f5412e = f0Var;
                this.f5413f = q10;
                this.f5414g = c0Var;
                this.f5415h = eVar;
                this.f5416i = eVar2;
                this.f5417j = eVar3;
                this.f5418k = eVar4;
                this.f5419l = bVar;
                this.f5420m = g10;
                this.f5421n = z10;
                this.f5422o = z11;
                this.f5423p = interfaceC6835l;
                this.f5424q = h10;
                this.f5425r = dVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2032502107, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                }
                androidx.compose.ui.e eVarA = F.r.a(androidx.compose.foundation.layout.r.k(androidx.compose.ui.e.f28771b0, this.f5408a.k(), 0.0f, 2, null), this.f5409b, this.f5410c, this.f5411d);
                f0 f0Var = this.f5412e;
                R0.Q q10 = this.f5413f;
                R0.c0 c0Var = this.f5414g;
                boolean zL = interfaceC3540l.l(this.f5408a);
                E e10 = this.f5408a;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new b(e10);
                    interfaceC3540l.K(objF);
                }
                M.D.a(androidx.compose.foundation.relocation.b.b(h0.a(e0.c(eVarA, f0Var, q10, c0Var, (InterfaceC6824a) objF).b0(this.f5415h).b0(this.f5416i), this.f5409b).b0(this.f5417j).b0(this.f5418k), this.f5419l), b0.c.e(-363167407, true, new C0227a(this.f5420m, this.f5408a, this.f5421n, this.f5422o, this.f5423p, this.f5413f, this.f5424q, this.f5425r, this.f5411d), interfaceC3540l, 54), interfaceC3540l, 48, 0);
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
        e(mh.q qVar, E e10, L0.U u10, int i10, int i11, f0 f0Var, R0.Q q10, R0.c0 c0Var, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, D.b bVar, M.G g10, boolean z10, boolean z11, InterfaceC6835l interfaceC6835l, R0.H h10, Y0.d dVar) {
            super(2);
            this.f5389a = qVar;
            this.f5390b = e10;
            this.f5391c = u10;
            this.f5392d = i10;
            this.f5393e = i11;
            this.f5394f = f0Var;
            this.f5395g = q10;
            this.f5396h = c0Var;
            this.f5397i = eVar;
            this.f5398j = eVar2;
            this.f5399k = eVar3;
            this.f5400l = eVar4;
            this.f5401m = bVar;
            this.f5402n = g10;
            this.f5403o = z10;
            this.f5404p = z11;
            this.f5405q = interfaceC6835l;
            this.f5406r = h10;
            this.f5407s = dVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-374338080, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
            }
            this.f5389a.s(b0.c.e(2032502107, true, new a(this.f5390b, this.f5391c, this.f5392d, this.f5393e, this.f5394f, this.f5395g, this.f5396h, this.f5397i, this.f5398j, this.f5399k, this.f5400l, this.f5401m, this.f5402n, this.f5403o, this.f5404p, this.f5405q, this.f5406r, this.f5407s), interfaceC3540l, 54), interfaceC3540l, 6);
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

    /* renamed from: F.m$f */
    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R0.Q f5443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5445c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L0.U f5446d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ R0.c0 f5447e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5448f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f5449g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f5450h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f5451i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f5452j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5453k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C3465s f5454l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C f5455m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f5456n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f5457o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ mh.q f5458p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f5459q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f5460r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f5461s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(R0.Q q10, InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, L0.U u10, R0.c0 c0Var, InterfaceC6835l interfaceC6835l2, InterfaceC8558m interfaceC8558m, AbstractC6713l0 abstractC6713l0, boolean z10, int i10, int i11, C3465s c3465s, C c10, boolean z11, boolean z12, mh.q qVar, int i12, int i13, int i14) {
            super(2);
            this.f5443a = q10;
            this.f5444b = interfaceC6835l;
            this.f5445c = eVar;
            this.f5446d = u10;
            this.f5447e = c0Var;
            this.f5448f = interfaceC6835l2;
            this.f5449g = interfaceC8558m;
            this.f5450h = abstractC6713l0;
            this.f5451i = z10;
            this.f5452j = i10;
            this.f5453k = i11;
            this.f5454l = c3465s;
            this.f5455m = c10;
            this.f5456n = z11;
            this.f5457o = z12;
            this.f5458p = qVar;
            this.f5459q = i12;
            this.f5460r = i13;
            this.f5461s = i14;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2723m.a(this.f5443a, this.f5444b, this.f5445c, this.f5446d, this.f5447e, this.f5448f, this.f5449g, this.f5450h, this.f5451i, this.f5452j, this.f5453k, this.f5454l, this.f5455m, this.f5456n, this.f5457o, this.f5458p, interfaceC3540l, L0.a(this.f5459q | 1), L0.a(this.f5460r), this.f5461s);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$g */
    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5462a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(E e10) {
            super(1);
            this.f5462a = e10;
        }

        public final void a(C0.r rVar) {
            j0 j0VarJ = this.f5462a.j();
            if (j0VarJ == null) {
                return;
            }
            j0VarJ.h(rVar);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C0.r) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$h */
    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5463a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0.Q f5464b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ R0.H f5465c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(E e10, R0.Q q10, R0.H h10) {
            super(1);
            this.f5463a = e10;
            this.f5464b = q10;
            this.f5465c = h10;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            j0 j0VarJ = this.f5463a.j();
            if (j0VarJ != null) {
                R0.Q q10 = this.f5464b;
                E e10 = this.f5463a;
                R0.H h10 = this.f5465c;
                W.f4951a.b(interfaceC7039f.k1().d(), q10, e10.q(), e10.c(), h10, j0VarJ.f(), e10.f(), e10.p());
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$i */
    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5468c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ R0.T f5469d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ R0.Q f5470e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3465s f5471f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ R0.H f5472g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ M.G f5473h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ii.N f5474i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ D.b f5475j;

        /* renamed from: F.m$i$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f5476a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ D.b f5477b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0.Q f5478c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ E f5479d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j0 f5480e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ R0.H f5481f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(D.b bVar, R0.Q q10, E e10, j0 j0Var, R0.H h10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f5477b = bVar;
                this.f5478c = q10;
                this.f5479d = e10;
                this.f5480e = j0Var;
                this.f5481f = h10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f5477b, this.f5478c, this.f5479d, this.f5480e, this.f5481f, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f5476a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    D.b bVar = this.f5477b;
                    R0.Q q10 = this.f5478c;
                    S sV = this.f5479d.v();
                    L0.M mF = this.f5480e.f();
                    R0.H h10 = this.f5481f;
                    this.f5476a = 1;
                    if (AbstractC2723m.m(bVar, q10, sV, mF, h10, this) == objG) {
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
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(E e10, boolean z10, boolean z11, R0.T t10, R0.Q q10, C3465s c3465s, R0.H h10, M.G g10, Ii.N n10, D.b bVar) {
            super(1);
            this.f5466a = e10;
            this.f5467b = z10;
            this.f5468c = z11;
            this.f5469d = t10;
            this.f5470e = q10;
            this.f5471f = c3465s;
            this.f5472g = h10;
            this.f5473h = g10;
            this.f5474i = n10;
            this.f5475j = bVar;
        }

        public final void a(k0.l lVar) {
            j0 j0VarJ;
            if (this.f5466a.e() == lVar.isFocused()) {
                return;
            }
            this.f5466a.C(lVar.isFocused());
            if (this.f5466a.e() && this.f5467b && !this.f5468c) {
                AbstractC2723m.q(this.f5469d, this.f5466a, this.f5470e, this.f5471f, this.f5472g);
            } else {
                AbstractC2723m.n(this.f5466a);
            }
            if (lVar.isFocused() && (j0VarJ = this.f5466a.j()) != null) {
                AbstractC3063k.d(this.f5474i, null, null, new a(this.f5475j, this.f5470e, this.f5466a, j0VarJ, this.f5472g, null), 3, null);
            }
            if (lVar.isFocused()) {
                return;
            }
            M.G.u(this.f5473h, null, 1, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k0.l) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$j */
    static final class j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E1 f5484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M.G f5485d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ R0.Q f5486e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ R0.H f5487f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(E e10, boolean z10, E1 e12, M.G g10, R0.Q q10, R0.H h10) {
            super(1);
            this.f5482a = e10;
            this.f5483b = z10;
            this.f5484c = e12;
            this.f5485d = g10;
            this.f5486e = q10;
            this.f5487f = h10;
        }

        public final void a(C0.r rVar) {
            this.f5482a.F(rVar);
            j0 j0VarJ = this.f5482a.j();
            if (j0VarJ != null) {
                j0VarJ.i(rVar);
            }
            if (this.f5483b) {
                if (this.f5482a.d() == EnumC2727q.Selection) {
                    if (this.f5482a.s() && this.f5484c.a()) {
                        this.f5485d.l0();
                    } else {
                        this.f5485d.R();
                    }
                    this.f5482a.M(M.H.c(this.f5485d, true));
                    this.f5482a.L(M.H.c(this.f5485d, false));
                    this.f5482a.J(L0.S.h(this.f5486e.h()));
                } else if (this.f5482a.d() == EnumC2727q.Cursor) {
                    this.f5482a.J(M.H.c(this.f5485d, true));
                }
                AbstractC2723m.o(this.f5482a, this.f5486e, this.f5487f);
                j0 j0VarJ2 = this.f5482a.j();
                if (j0VarJ2 != null) {
                    E e10 = this.f5482a;
                    R0.Q q10 = this.f5486e;
                    R0.H h10 = this.f5487f;
                    R0.Z zG = e10.g();
                    if (zG == null || !e10.e()) {
                        return;
                    }
                    W.f4951a.k(zG, q10, h10, j0VarJ2);
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C0.r) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$k */
    static final class k extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5488a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(E e10) {
            super(1);
            this.f5488a = e10;
        }

        public final void a(boolean z10) {
            this.f5488a.D(z10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$l */
    static final class l extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5489a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f5490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5492d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ M.G f5493e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ R0.H f5494f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(E e10, androidx.compose.ui.focus.o oVar, boolean z10, boolean z11, M.G g10, R0.H h10) {
            super(1);
            this.f5489a = e10;
            this.f5490b = oVar;
            this.f5491c = z10;
            this.f5492d = z11;
            this.f5493e = g10;
            this.f5494f = h10;
        }

        public final void a(long j10) {
            AbstractC2723m.r(this.f5489a, this.f5490b, !this.f5491c);
            if (this.f5489a.e() && this.f5492d) {
                if (this.f5489a.d() == EnumC2727q.Selection) {
                    this.f5493e.t(C6531g.d(j10));
                    return;
                }
                j0 j0VarJ = this.f5489a.j();
                if (j0VarJ != null) {
                    E e10 = this.f5489a;
                    W.f4951a.j(j10, j0VarJ, e10.n(), this.f5494f, e10.m());
                    if (e10.v().k().length() > 0) {
                        e10.B(EnumC2727q.Cursor);
                    }
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$m, reason: collision with other inner class name */
    static final class C0230m extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w.q f5495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0230m(w.q qVar) {
            super(0);
            this.f5495a = qVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke() {
            return new f0(this.f5495a, 0.0f, 2, null);
        }
    }

    /* renamed from: F.m$n */
    static final class n extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R0.a0 f5496a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0.Q f5497b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5498c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5499d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5500e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3465s f5501f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ E f5502g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ R0.H f5503h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ M.G f5504i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f5505j;

        /* renamed from: F.m$n$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M.G f5506a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M.G g10) {
                super(0);
                this.f5506a = g10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f5506a.T();
                return Boolean.TRUE;
            }
        }

        /* renamed from: F.m$n$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E f5507a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(E e10) {
                super(1);
                this.f5507a = e10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                boolean z10;
                if (this.f5507a.j() != null) {
                    j0 j0VarJ = this.f5507a.j();
                    AbstractC6492s.f(j0VarJ);
                    list.add(j0VarJ.f());
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* renamed from: F.m$n$c */
        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E f5508a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J0.w f5509b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(E e10, J0.w wVar) {
                super(1);
                this.f5508a = e10;
                this.f5509b = wVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C3174d c3174d) {
                Yg.J j10;
                R0.Z zG = this.f5508a.g();
                if (zG != null) {
                    E e10 = this.f5508a;
                    W.f4951a.g(AbstractC3689v.o(new C3453f(), new C3448a(c3174d, 1)), e10.n(), e10.m(), zG);
                    j10 = Yg.J.f24997a;
                } else {
                    j10 = null;
                }
                if (j10 == null) {
                    this.f5508a.m().invoke(new R0.Q(c3174d.k(), L0.T.a(c3174d.k().length()), (L0.S) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        /* renamed from: F.m$n$d */
        static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f5510a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f5511b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ E f5512c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ J0.w f5513d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ R0.Q f5514e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z10, boolean z11, E e10, J0.w wVar, R0.Q q10) {
                super(1);
                this.f5510a = z10;
                this.f5511b = z11;
                this.f5512c = e10;
                this.f5513d = wVar;
                this.f5514e = q10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C3174d c3174d) {
                Yg.J j10;
                if (this.f5510a || !this.f5511b) {
                    return Boolean.FALSE;
                }
                R0.Z zG = this.f5512c.g();
                if (zG != null) {
                    E e10 = this.f5512c;
                    W.f4951a.g(AbstractC3689v.o(new C3461n(), new C3448a(c3174d, 1)), e10.n(), e10.m(), zG);
                    j10 = Yg.J.f24997a;
                } else {
                    j10 = null;
                }
                if (j10 == null) {
                    R0.Q q10 = this.f5514e;
                    this.f5512c.m().invoke(new R0.Q(kotlin.text.t.K0(q10.i(), L0.S.n(q10.h()), L0.S.i(q10.h()), c3174d).toString(), L0.T.a(L0.S.n(q10.h()) + c3174d.length()), (L0.S) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        /* renamed from: F.m$n$e */
        static final class e extends AbstractC6494u implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R0.H f5515a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f5516b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0.Q f5517c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ M.G f5518d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ E f5519e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(R0.H h10, boolean z10, R0.Q q10, M.G g10, E e10) {
                super(3);
                this.f5515a = h10;
                this.f5516b = z10;
                this.f5517c = q10;
                this.f5518d = g10;
                this.f5519e = e10;
            }

            public final Boolean a(int i10, int i11, boolean z10) {
                if (!z10) {
                    i10 = this.f5515a.a(i10);
                }
                if (!z10) {
                    i11 = this.f5515a.a(i11);
                }
                boolean z11 = false;
                if (this.f5516b && (i10 != L0.S.n(this.f5517c.h()) || i11 != L0.S.i(this.f5517c.h()))) {
                    if (Math.min(i10, i11) < 0 || Math.max(i10, i11) > this.f5517c.f().length()) {
                        this.f5518d.x();
                    } else {
                        if (z10 || i10 == i11) {
                            this.f5518d.x();
                        } else {
                            M.G.w(this.f5518d, false, 1, null);
                        }
                        this.f5519e.m().invoke(new R0.Q(this.f5517c.f(), L0.T.b(i10, i11), (L0.S) null, 4, (DefaultConstructorMarker) null));
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        }

        /* renamed from: F.m$n$f */
        static final class f extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E f5520a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3465s f5521b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(E e10, C3465s c3465s) {
                super(0);
                this.f5520a = e10;
                this.f5521b = c3465s;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f5520a.l().invoke(R0.r.j(this.f5521b.e()));
                return Boolean.TRUE;
            }
        }

        /* renamed from: F.m$n$g */
        static final class g extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E f5522a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.o f5523b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f5524c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(E e10, androidx.compose.ui.focus.o oVar, boolean z10) {
                super(0);
                this.f5522a = e10;
                this.f5523b = oVar;
                this.f5524c = z10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                AbstractC2723m.r(this.f5522a, this.f5523b, !this.f5524c);
                return Boolean.TRUE;
            }
        }

        /* renamed from: F.m$n$h */
        static final class h extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M.G f5525a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(M.G g10) {
                super(0);
                this.f5525a = g10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                M.G.w(this.f5525a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* renamed from: F.m$n$i */
        static final class i extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M.G f5526a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(M.G g10) {
                super(0);
                this.f5526a = g10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                M.G.p(this.f5526a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* renamed from: F.m$n$j */
        static final class j extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M.G f5527a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(M.G g10) {
                super(0);
                this.f5527a = g10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f5527a.s();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(R0.a0 a0Var, R0.Q q10, boolean z10, boolean z11, boolean z12, C3465s c3465s, E e10, R0.H h10, M.G g10, androidx.compose.ui.focus.o oVar) {
            super(1);
            this.f5496a = a0Var;
            this.f5497b = q10;
            this.f5498c = z10;
            this.f5499d = z11;
            this.f5500e = z12;
            this.f5501f = c3465s;
            this.f5502g = e10;
            this.f5503h = h10;
            this.f5504i = g10;
            this.f5505j = oVar;
        }

        public final void a(J0.w wVar) {
            J0.t.c0(wVar, this.f5496a.b());
            J0.t.r0(wVar, this.f5497b.h());
            if (!this.f5498c) {
                J0.t.l(wVar);
            }
            if (this.f5499d) {
                J0.t.N(wVar);
            }
            boolean z10 = this.f5498c && !this.f5500e;
            J0.t.b0(wVar, z10);
            J0.t.u(wVar, null, new b(this.f5502g), 1, null);
            if (z10) {
                J0.t.q0(wVar, null, new c(this.f5502g, wVar), 1, null);
                J0.t.x(wVar, null, new d(this.f5500e, this.f5498c, this.f5502g, wVar, this.f5497b), 1, null);
            }
            J0.t.l0(wVar, null, new e(this.f5503h, this.f5498c, this.f5497b, this.f5504i, this.f5502g), 1, null);
            J0.t.C(wVar, this.f5501f.e(), null, new f(this.f5502g, this.f5501f), 2, null);
            J0.t.A(wVar, null, new g(this.f5502g, this.f5505j, this.f5500e), 1, null);
            J0.t.E(wVar, null, new h(this.f5504i), 1, null);
            if (!L0.S.h(this.f5497b.h()) && !this.f5499d) {
                J0.t.h(wVar, null, new i(this.f5504i), 1, null);
                if (this.f5498c && !this.f5500e) {
                    J0.t.j(wVar, null, new j(this.f5504i), 1, null);
                }
            }
            if (!this.f5498c || this.f5500e) {
                return;
            }
            J0.t.P(wVar, null, new a(this.f5504i), 1, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$o */
    static final class o extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f5529b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3465s f5530c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N0 f5531d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(E e10, androidx.compose.ui.focus.o oVar, C3465s c3465s, N0 n02) {
            super(0);
            this.f5528a = e10;
            this.f5529b = oVar;
            this.f5530c = c3465s;
            this.f5531d = n02;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            if (!this.f5528a.e()) {
                this.f5529b.f();
            }
            int iF = this.f5530c.f();
            C3471y.a aVar = C3471y.f19528b;
            if (!C3471y.n(iF, aVar.f()) && !C3471y.n(this.f5530c.f(), aVar.e())) {
                this.f5531d.k();
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: F.m$p */
    static final class p extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5532a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M.G f5533b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f5534c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5535d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(androidx.compose.ui.e eVar, M.G g10, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f5532a = eVar;
            this.f5533b = g10;
            this.f5534c = interfaceC6839p;
            this.f5535d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2723m.c(this.f5532a, this.f5533b, this.f5534c, interfaceC3540l, L0.a(this.f5535d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$q */
    static final class q extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M.G f5536a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5537b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(M.G g10, boolean z10, int i10) {
            super(2);
            this.f5536a = g10;
            this.f5537b = z10;
            this.f5538c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2723m.d(this.f5536a, this.f5537b, interfaceC3540l, L0.a(this.f5538c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$r */
    static final class r implements InterfaceC3241j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f5539a;

        r(long j10) {
            this.f5539a = j10;
        }

        @Override // M.InterfaceC3241j
        public final long a() {
            return this.f5539a;
        }
    }

    /* renamed from: F.m$s */
    static final class s extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f5540a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f5541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U f5542c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M.G f5543d;

        /* renamed from: F.m$s$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f5544a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f5545b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f5546c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ U f5547d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ M.G f5548e;

            /* renamed from: F.m$s$a$a, reason: collision with other inner class name */
            static final class C0231a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f5549a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC8567G f5550b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ U f5551c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0231a(InterfaceC8567G interfaceC8567G, U u10, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f5550b = interfaceC8567G;
                    this.f5551c = u10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0231a(this.f5550b, this.f5551c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f5549a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        InterfaceC8567G interfaceC8567G = this.f5550b;
                        U u10 = this.f5551c;
                        this.f5549a = 1;
                        if (H.c(interfaceC8567G, u10, this) == objG) {
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
                    return ((C0231a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: F.m$s$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f5552a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC8567G f5553b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ M.G f5554c;

                /* renamed from: F.m$s$a$b$a, reason: collision with other inner class name */
                static final class C0232a extends AbstractC6494u implements InterfaceC6835l {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ M.G f5555a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0232a(M.G g10) {
                        super(1);
                        this.f5555a = g10;
                    }

                    public final void a(long j10) {
                        this.f5555a.l0();
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((C6531g) obj).v());
                        return Yg.J.f24997a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(InterfaceC8567G interfaceC8567G, M.G g10, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f5553b = interfaceC8567G;
                    this.f5554c = g10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new b(this.f5553b, this.f5554c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f5552a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        InterfaceC8567G interfaceC8567G = this.f5553b;
                        C0232a c0232a = new C0232a(this.f5554c);
                        this.f5552a = 1;
                        if (AbstractC8235B.k(interfaceC8567G, null, null, null, c0232a, this, 7, null) == objG) {
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
                    return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC8567G interfaceC8567G, U u10, M.G g10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f5546c = interfaceC8567G;
                this.f5547d = u10;
                this.f5548e = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f5546c, this.f5547d, this.f5548e, interfaceC5380e);
                aVar.f5545b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f5544a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                Ii.N n10 = (Ii.N) this.f5545b;
                Ii.P p10 = Ii.P.UNDISPATCHED;
                AbstractC3063k.d(n10, null, p10, new C0231a(this.f5546c, this.f5547d, null), 1, null);
                AbstractC3063k.d(n10, null, p10, new b(this.f5546c, this.f5548e, null), 1, null);
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(U u10, M.G g10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f5542c = u10;
            this.f5543d = g10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            s sVar = new s(this.f5542c, this.f5543d, interfaceC5380e);
            sVar.f5541b = obj;
            return sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f5540a;
            if (i10 == 0) {
                Yg.v.b(obj);
                a aVar = new a((InterfaceC8567G) this.f5541b, this.f5542c, this.f5543d, null);
                this.f5540a = 1;
                if (Ii.O.g(aVar, this) == objG) {
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
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((s) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: F.m$t */
    static final class t extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f5556a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(long j10) {
            super(1);
            this.f5556a = j10;
        }

        public final void a(J0.w wVar) {
            wVar.b(M.w.d(), new M.v(EnumC2726p.Cursor, this.f5556a, M.u.Middle, true, null));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$u */
    static final class u extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M.G f5557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(M.G g10, int i10) {
            super(2);
            this.f5557a = g10;
            this.f5558b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2723m.e(this.f5557a, interfaceC3540l, L0.a(this.f5558b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.m$v */
    static final class v extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5559a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M.G f5560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(E e10, M.G g10) {
            super(1);
            this.f5559a = e10;
            this.f5560b = g10;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            if (this.f5559a.d() == EnumC2727q.Selection && AbstractC2732w.a(keyEvent)) {
                z10 = true;
                M.G.u(this.f5560b, null, 1, null);
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C8248b) obj).f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05bd A[PHI: r12 r36 r42
  0x05bd: PHI (r12v16 R0.s) = (r12v11 R0.s), (r12v17 R0.s) binds: [B:316:0x05bb, B:313:0x05ac] A[DONT_GENERATE, DONT_INLINE]
  0x05bd: PHI (r36v10 int) = (r36v7 int), (r36v12 int) binds: [B:316:0x05bb, B:313:0x05ac] A[DONT_GENERATE, DONT_INLINE]
  0x05bd: PHI (r42v3 int) = (r42v1 int), (r42v4 int) binds: [B:316:0x05bb, B:313:0x05ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:482:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.compose.ui.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(R0.Q r54, mh.InterfaceC6835l r55, androidx.compose.ui.e r56, L0.U r57, R0.c0 r58, mh.InterfaceC6835l r59, y.InterfaceC8558m r60, m0.AbstractC6713l0 r61, boolean r62, int r63, int r64, R0.C3465s r65, F.C r66, boolean r67, boolean r68, mh.q r69, T.InterfaceC3540l r70, int r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 2545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.AbstractC2723m.a(R0.Q, mh.l, androidx.compose.ui.e, L0.U, R0.c0, mh.l, y.m, m0.l0, boolean, int, int, R0.s, F.C, boolean, boolean, mh.q, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(z1 z1Var) {
        return ((Boolean) z1Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, M.G g10, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-20551815);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(g10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-20551815, i11, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), true);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = T.E1.a(interfaceC3540lR);
            T.E1.c(interfaceC3540lA, cH, aVar.e());
            T.E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            T.E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            AbstractC2721k.b(g10, interfaceC6839p, interfaceC3540lR, (i11 >> 3) & 126);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new p(eVar, g10, interfaceC6839p, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(M.G g10, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        j0 j0VarJ;
        L0.M mF;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(626339208);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(g10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(626339208, i11, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z10) {
                interfaceC3540lR.U(-1286242594);
                E eL = g10.L();
                L0.M m10 = null;
                if (eL != null && (j0VarJ = eL.j()) != null && (mF = j0VarJ.f()) != null) {
                    E eL2 = g10.L();
                    if (!(eL2 != null ? eL2.z() : true)) {
                        m10 = mF;
                    }
                }
                if (m10 == null) {
                    interfaceC3540lR.U(-1285984396);
                } else {
                    interfaceC3540lR.U(-1285984395);
                    if (L0.S.h(g10.O().h())) {
                        interfaceC3540lR.U(-1679637798);
                        interfaceC3540lR.J();
                    } else {
                        interfaceC3540lR.U(-1680616096);
                        int iB = g10.J().b(L0.S.n(g10.O().h()));
                        int iB2 = g10.J().b(L0.S.i(g10.O().h()));
                        W0.i iVarC = m10.c(iB);
                        W0.i iVarC2 = m10.c(Math.max(iB2 - 1, 0));
                        E eL3 = g10.L();
                        if (eL3 == null || !eL3.u()) {
                            interfaceC3540lR.U(-1679975078);
                            interfaceC3540lR.J();
                        } else {
                            interfaceC3540lR.U(-1680216289);
                            M.H.a(true, iVarC, g10, interfaceC3540lR, ((i11 << 6) & 896) | 6);
                            interfaceC3540lR.J();
                        }
                        E eL4 = g10.L();
                        if (eL4 == null || !eL4.t()) {
                            interfaceC3540lR.U(-1679655654);
                            interfaceC3540lR.J();
                        } else {
                            interfaceC3540lR.U(-1679895904);
                            M.H.a(false, iVarC2, g10, interfaceC3540lR, ((i11 << 6) & 896) | 6);
                            interfaceC3540lR.J();
                        }
                        interfaceC3540lR.J();
                    }
                    E eL5 = g10.L();
                    if (eL5 != null) {
                        if (g10.S()) {
                            eL5.K(false);
                        }
                        if (eL5.e()) {
                            if (eL5.s()) {
                                g10.l0();
                            } else {
                                g10.R();
                            }
                        }
                        Yg.J j10 = Yg.J.f24997a;
                    }
                }
                interfaceC3540lR.J();
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(651305535);
                interfaceC3540lR.J();
                g10.R();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new q(g10, z10, i10));
        }
    }

    public static final void e(M.G g10, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        C3174d c3174dN;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1436003720);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(g10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1436003720, i11, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            E eL = g10.L();
            if (eL == null || !eL.r() || (c3174dN = g10.N()) == null || c3174dN.length() <= 0) {
                interfaceC3540lR.U(-284257090);
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(-285446808);
                boolean zT = interfaceC3540lR.T(g10);
                Object objF = interfaceC3540lR.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = g10.r();
                    interfaceC3540lR.K(objF);
                }
                U u10 = (U) objF;
                long jB = g10.B((Y0.d) interfaceC3540lR.t(AbstractC3932k0.g()));
                boolean zJ = interfaceC3540lR.j(jB);
                Object objF2 = interfaceC3540lR.f();
                if (zJ || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new r(jB);
                    interfaceC3540lR.K(objF2);
                }
                InterfaceC3241j interfaceC3241j = (InterfaceC3241j) objF2;
                e.a aVar = androidx.compose.ui.e.f28771b0;
                boolean zL = interfaceC3540lR.l(u10) | interfaceC3540lR.l(g10);
                Object objF3 = interfaceC3540lR.f();
                if (zL || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new s(u10, g10, null);
                    interfaceC3540lR.K(objF3);
                }
                androidx.compose.ui.e eVarD = AbstractC8576P.d(aVar, u10, (InterfaceC6839p) objF3);
                boolean zJ2 = interfaceC3540lR.j(jB);
                Object objF4 = interfaceC3540lR.f();
                if (zJ2 || objF4 == InterfaceC3540l.f21100a.a()) {
                    objF4 = new t(jB);
                    interfaceC3540lR.K(objF4);
                }
                AbstractC2711a.a(interfaceC3241j, J0.m.c(eVarD, false, (InterfaceC6835l) objF4, 1, null), 0L, interfaceC3540lR, 0, 4);
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new u(g10, i10));
        }
    }

    public static final Object m(D.b bVar, R0.Q q10, S s10, L0.M m10, R0.H h10, InterfaceC5380e interfaceC5380e) {
        int iB = h10.b(L0.S.k(q10.h()));
        Object objA = bVar.a(iB < m10.l().j().length() ? m10.d(iB) : iB != 0 ? m10.d(iB - 1) : new C6533i(0.0f, 0.0f, 1.0f, Y0.r.f(X.b(s10.j(), s10.a(), s10.b(), null, 0, 24, null))), interfaceC5380e);
        return objA == AbstractC5467b.g() ? objA : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(E e10) {
        R0.Z zG = e10.g();
        if (zG != null) {
            W.f4951a.f(zG, e10.n(), e10.m());
        }
        e10.E(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(E e10, R0.Q q10, R0.H h10) {
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            j0 j0VarJ = e10.j();
            if (j0VarJ == null) {
                return;
            }
            R0.Z zG = e10.g();
            if (zG == null) {
                return;
            }
            C0.r rVarI = e10.i();
            if (rVarI == null) {
                return;
            }
            W.f4951a.e(q10, e10.v(), j0VarJ.f(), rVarI, zG, e10.e(), h10);
            Yg.J j10 = Yg.J.f24997a;
        } finally {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
        }
    }

    private static final androidx.compose.ui.e p(androidx.compose.ui.e eVar, E e10, M.G g10) {
        return androidx.compose.ui.input.key.a.b(eVar, new v(e10, g10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(R0.T t10, E e10, R0.Q q10, C3465s c3465s, R0.H h10) {
        e10.E(W.f4951a.h(t10, q10, e10.n(), c3465s, e10.m(), e10.l()));
        o(e10, q10, h10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(E e10, androidx.compose.ui.focus.o oVar, boolean z10) {
        n1 n1VarH;
        if (!e10.e()) {
            oVar.f();
        } else {
            if (!z10 || (n1VarH = e10.h()) == null) {
                return;
            }
            n1VarH.b();
        }
    }
}
