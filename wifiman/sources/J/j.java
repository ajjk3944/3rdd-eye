package J;

import C0.AbstractC2538s;
import F.EnumC2726p;
import F.U;
import F.V;
import I.G0;
import I.R0;
import I.X0;
import I.l1;
import I.m1;
import I.o1;
import I.p1;
import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import Ii.P;
import L0.C3174d;
import L0.S;
import L0.T;
import Li.AbstractC3222i;
import Li.InterfaceC3221h;
import M.InterfaceC3240i;
import T.InterfaceC3551q0;
import T.t1;
import Yg.J;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.platform.InterfaceC3923h0;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.s1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.M;
import l0.AbstractC6532h;
import l0.AbstractC6534j;
import l0.C6531g;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import sh.AbstractC7978m;
import u0.AbstractC8124b;
import u0.InterfaceC8123a;
import w.AbstractC8235B;
import y.InterfaceC8555j;
import y.InterfaceC8558m;
import y.InterfaceC8560o;
import y0.C8604y;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final o1 f9408a;

    /* renamed from: b, reason: collision with root package name */
    private final l1 f9409b;

    /* renamed from: c, reason: collision with root package name */
    private Y0.d f9410c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9411d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9412e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9413f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9414g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC8123a f9415h;

    /* renamed from: i, reason: collision with root package name */
    private q1 f9416i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3923h0 f9417j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3551q0 f9418k = t1.d(Boolean.TRUE, null, 2, null);

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC6824a f9419l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3551q0 f9420m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3551q0 f9421n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3551q0 f9422o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3551q0 f9423p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3551q0 f9424q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3551q0 f9425r;

    /* renamed from: s, reason: collision with root package name */
    private M.x f9426s;

    /* renamed from: t, reason: collision with root package name */
    private int f9427t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC8560o.b f9428u;

    static final class A extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9429a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9430b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8567G f9432d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9433e;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9434a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9435b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f9436c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9435b = jVar;
                this.f9436c = interfaceC8567G;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f9435b, this.f9436c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9434a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    j jVar = this.f9435b;
                    InterfaceC8567G interfaceC8567G = this.f9436c;
                    this.f9434a = 1;
                    if (jVar.O(interfaceC8567G, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9437a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f9438b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f9439c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f9440d;

            static final class a implements J.c {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f9441a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f9442b;

                a(j jVar, boolean z10) {
                    this.f9441a = jVar;
                    this.f9442b = z10;
                }

                @Override // J.c
                public final void a(long j10) {
                    this.f9441a.k0();
                    j jVar = this.f9441a;
                    boolean z10 = this.f9442b;
                    jVar.F0(z10 ? EnumC2726p.SelectionStart : EnumC2726p.SelectionEnd, M.w.a(jVar.Y(z10)));
                }
            }

            /* renamed from: J.j$A$b$b, reason: collision with other inner class name */
            static final class C0381b extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f9443a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0381b(j jVar) {
                    super(0);
                    this.f9443a = jVar;
                }

                public final void a() {
                    this.f9443a.D();
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC8567G interfaceC8567G, j jVar, boolean z10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9438b = interfaceC8567G;
                this.f9439c = jVar;
                this.f9440d = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f9438b, this.f9439c, this.f9440d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9437a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    InterfaceC8567G interfaceC8567G = this.f9438b;
                    a aVar = new a(this.f9439c, this.f9440d);
                    C0381b c0381b = new C0381b(this.f9439c);
                    this.f9437a = 1;
                    if (J.b.a(interfaceC8567G, aVar, c0381b, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9444a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9445b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f9446c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f9447d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(j jVar, InterfaceC8567G interfaceC8567G, boolean z10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9445b = jVar;
                this.f9446c = interfaceC8567G;
                this.f9447d = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new c(this.f9445b, this.f9446c, this.f9447d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9444a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    j jVar = this.f9445b;
                    InterfaceC8567G interfaceC8567G = this.f9446c;
                    boolean z10 = this.f9447d;
                    this.f9444a = 1;
                    if (jVar.L(interfaceC8567G, z10, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(InterfaceC8567G interfaceC8567G, boolean z10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f9432d = interfaceC8567G;
            this.f9433e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            A a10 = j.this.new A(this.f9432d, this.f9433e, interfaceC5380e);
            a10.f9430b = obj;
            return a10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9429a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            N n10 = (N) this.f9430b;
            P p10 = P.UNDISPATCHED;
            AbstractC3063k.d(n10, null, p10, new a(j.this, this.f9432d, null), 1, null);
            AbstractC3063k.d(n10, null, p10, new b(this.f9432d, j.this, this.f9433e, null), 1, null);
            return AbstractC3063k.d(n10, null, p10, new c(j.this, this.f9432d, this.f9433e, null), 1, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((A) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final class B extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J.n f9449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f9450c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(J.n nVar, j jVar) {
            super(0);
            this.f9449b = nVar;
            this.f9450c = jVar;
        }

        public final void a() {
            j.F(this.f9450c, false, 1, null);
            j.this.I0(this.f9449b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final class C extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J.n f9452b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f9453c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(J.n nVar, j jVar) {
            super(0);
            this.f9452b = nVar;
            this.f9453c = jVar;
        }

        public final void a() {
            this.f9453c.o0();
            j.this.I0(this.f9452b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final class D extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J.n f9455b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f9456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(J.n nVar, j jVar) {
            super(0);
            this.f9455b = nVar;
            this.f9456c = jVar;
        }

        public final void a() {
            this.f9456c.H();
            j.this.I0(this.f9455b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final class E extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J.n f9458b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f9459c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(J.n nVar, j jVar) {
            super(0);
            this.f9458b = nVar;
            this.f9459c = jVar;
        }

        public final void a() {
            this.f9459c.r0();
            j.this.I0(this.f9458b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* renamed from: J.j$a, reason: case insensitive filesystem */
    public enum EnumC3094a {
        None,
        Touch,
        Mouse
    }

    /* renamed from: J.j$b, reason: case insensitive filesystem */
    private final class C3095b implements InterfaceC3240i {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6824a f9460a;

        /* renamed from: b, reason: collision with root package name */
        private int f9461b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f9462c = C6531g.f52335b.b();

        /* renamed from: J.j$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f9464a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10) {
                super(0);
                this.f9464a = j10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Mouse.onDrag " + ((Object) C6531g.t(this.f9464a));
            }
        }

        /* renamed from: J.j$b$b, reason: collision with other inner class name */
        static final class C0382b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0382b f9465a = new C0382b();

            C0382b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Mouse.onDragDone";
            }
        }

        /* renamed from: J.j$b$c */
        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f9466a = new c();

            c() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Mouse.onExtend";
            }
        }

        /* renamed from: J.j$b$d */
        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f9467a = new d();

            d() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Mouse.onExtendDrag";
            }
        }

        /* renamed from: J.j$b$e */
        static final class e extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f9468a = new e();

            e() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Mouse.onStart";
            }
        }

        public C3095b(InterfaceC6824a interfaceC6824a) {
            this.f9460a = interfaceC6824a;
        }

        private final long f(long j10, M.r rVar, boolean z10) {
            Integer numValueOf = Integer.valueOf(this.f9461b);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : j.this.f9409b.h(this.f9462c, false);
            int iH = j.this.f9409b.h(j10, false);
            j jVar = j.this;
            long jG0 = jVar.G0(jVar.f9408a.l(), iIntValue, iH, false, rVar, false, z10);
            if (this.f9461b == -1 && !S.h(jG0)) {
                this.f9461b = S.n(jG0);
            }
            if (S.m(jG0)) {
                jG0 = J.k.d(jG0);
            }
            j.this.f9408a.y(jG0);
            j.this.I0(J.n.Selection);
            return jG0;
        }

        @Override // M.InterfaceC3240i
        public boolean a(long j10) {
            J.k.c(d.f9467a);
            return true;
        }

        @Override // M.InterfaceC3240i
        public boolean b(long j10, M.r rVar) {
            if (!j.this.f9411d || j.this.f9408a.l().length() == 0) {
                return false;
            }
            J.k.c(new a(j10));
            f(j10, rVar, false);
            return true;
        }

        @Override // M.InterfaceC3240i
        public boolean c(long j10, M.r rVar) {
            if (!j.this.f9411d || j.this.f9408a.l().length() == 0) {
                return false;
            }
            J.k.c(e.f9468a);
            j.this.t0(EnumC3094a.Mouse);
            this.f9460a.invoke();
            j.this.f9427t = -1;
            this.f9461b = -1;
            this.f9462c = j10;
            this.f9461b = S.n(f(j10, rVar, true));
            return true;
        }

        @Override // M.InterfaceC3240i
        public void d() {
            J.k.c(C0382b.f9465a);
            j.this.t0(EnumC3094a.None);
        }

        @Override // M.InterfaceC3240i
        public boolean e(long j10) {
            J.k.c(c.f9466a);
            return true;
        }
    }

    /* renamed from: J.j$c, reason: case insensitive filesystem */
    private final class C3096c implements U {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6824a f9469a;

        /* renamed from: b, reason: collision with root package name */
        private int f9470b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f9471c;

        /* renamed from: d, reason: collision with root package name */
        private long f9472d;

        /* renamed from: e, reason: collision with root package name */
        private EnumC2726p f9473e;

        /* renamed from: J.j$c$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f9475a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10) {
                super(0);
                this.f9475a = j10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Touch.onDrag at " + ((Object) C6531g.t(this.f9475a));
            }
        }

        /* renamed from: J.j$c$b */
        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f9476a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Touch.onDragStop";
            }
        }

        /* renamed from: J.j$c$c, reason: collision with other inner class name */
        static final class C0383c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f9477a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0383c(long j10) {
                super(0);
                this.f9477a = j10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Touch.onDragStart after longPress at " + ((Object) C6531g.t(this.f9477a));
            }
        }

        public C3096c(InterfaceC6824a interfaceC6824a) {
            this.f9469a = interfaceC6824a;
            C6531g.a aVar = C6531g.f52335b;
            this.f9471c = aVar.b();
            this.f9472d = aVar.c();
            this.f9473e = EnumC2726p.SelectionEnd;
        }

        private final void f() {
            if (AbstractC6532h.c(this.f9471c)) {
                J.k.c(b.f9476a);
                j.this.D();
                this.f9470b = -1;
                C6531g.a aVar = C6531g.f52335b;
                this.f9471c = aVar.b();
                this.f9472d = aVar.c();
                j.this.f9427t = -1;
                j.this.t0(EnumC3094a.None);
                this.f9469a.invoke();
            }
        }

        @Override // F.U
        public void a() {
            f();
        }

        @Override // F.U
        public void b(long j10) {
        }

        @Override // F.U
        public void c(long j10) {
            if (j.this.f9411d) {
                J.k.c(new C0383c(j10));
                j.this.F0(this.f9473e, j10);
                j.this.z0(false);
                j.this.t0(EnumC3094a.Touch);
                this.f9471c = j10;
                this.f9472d = C6531g.f52335b.c();
                j.this.f9427t = -1;
                if (j.this.f9409b.k(j10)) {
                    if (j.this.f9408a.l().length() == 0) {
                        return;
                    }
                    int i10 = l1.i(j.this.f9409b, j10, false, 2, null);
                    long jH0 = j.H0(j.this, new H.h(j.this.f9408a.l(), S.f11103b.a(), null, null, 12, null), i10, i10, false, M.r.f12223a.o(), false, false, 96, null);
                    j.this.f9408a.y(jH0);
                    j.this.I0(J.n.Selection);
                    this.f9470b = S.n(jH0);
                    return;
                }
                int i11 = l1.i(j.this.f9409b, j10, false, 2, null);
                InterfaceC8123a interfaceC8123a = j.this.f9415h;
                if (interfaceC8123a != null) {
                    interfaceC8123a.a(AbstractC8124b.f62666a.b());
                }
                j.this.f9408a.q(i11);
                j.this.z0(true);
                j.this.I0(J.n.Cursor);
            }
        }

        @Override // F.U
        public void d() {
        }

        @Override // F.U
        public void e(long j10) {
            int iIntValue;
            int iH;
            M.r rVarO;
            if (!j.this.f9411d || j.this.f9408a.l().length() == 0) {
                return;
            }
            long jR = C6531g.r(this.f9472d, j10);
            this.f9472d = jR;
            long jR2 = C6531g.r(this.f9471c, jR);
            J.k.c(new a(jR2));
            if (this.f9470b >= 0 || j.this.f9409b.k(jR2)) {
                Integer numValueOf = Integer.valueOf(this.f9470b);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : j.this.f9409b.h(this.f9471c, false);
                iH = j.this.f9409b.h(jR2, false);
                if (this.f9470b < 0 && iIntValue == iH) {
                    return;
                }
                rVarO = M.r.f12223a.o();
                j.this.I0(J.n.Selection);
            } else {
                iIntValue = l1.i(j.this.f9409b, this.f9471c, false, 2, null);
                iH = l1.i(j.this.f9409b, jR2, false, 2, null);
                rVarO = iIntValue == iH ? M.r.f12223a.m() : M.r.f12223a.o();
            }
            int i10 = iIntValue;
            int i11 = iH;
            M.r rVar = rVarO;
            long jF = j.this.f9408a.l().f();
            j jVar = j.this;
            long jH0 = j.H0(jVar, jVar.f9408a.l(), i10, i11, false, rVar, false, false, 64, null);
            if (this.f9470b == -1 && !S.h(jH0)) {
                this.f9470b = S.n(jH0);
            }
            if (S.m(jH0)) {
                jH0 = J.k.d(jH0);
            }
            if (!S.g(jH0, jF)) {
                EnumC2726p enumC2726p = (S.n(jH0) == S.n(jF) || S.i(jH0) != S.i(jF)) ? ((S.n(jH0) != S.n(jF) || S.i(jH0) == S.i(jF)) && ((float) (S.n(jH0) + S.i(jH0))) / 2.0f <= ((float) (S.n(jF) + S.i(jF))) / 2.0f) ? EnumC2726p.SelectionStart : EnumC2726p.SelectionEnd : EnumC2726p.SelectionStart;
                this.f9473e = enumC2726p;
            }
            if (S.h(jF) || !S.h(jH0)) {
                j.this.f9408a.y(jH0);
            }
            j.this.F0(this.f9473e, jR2);
        }

        @Override // F.U
        public void onCancel() {
            f();
        }
    }

    /* renamed from: J.j$d, reason: case insensitive filesystem */
    public /* synthetic */ class C3097d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9478a;

        static {
            int[] iArr = new int[G0.values().length];
            try {
                iArr[G0.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G0.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G0.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G0.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9478a = iArr;
        }
    }

    /* renamed from: J.j$e, reason: case insensitive filesystem */
    static final class C3098e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9479a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9480b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8567G f9482d;

        /* renamed from: J.j$e$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9483a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9484b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f9485c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9484b = jVar;
                this.f9485c = interfaceC8567G;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f9484b, this.f9485c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9483a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    j jVar = this.f9484b;
                    InterfaceC8567G interfaceC8567G = this.f9485c;
                    this.f9483a = 1;
                    if (jVar.O(interfaceC8567G, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: J.j$e$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9486a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9487b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f9488c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9487b = jVar;
                this.f9488c = interfaceC8567G;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f9487b, this.f9488c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9486a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    j jVar = this.f9487b;
                    InterfaceC8567G interfaceC8567G = this.f9488c;
                    this.f9486a = 1;
                    if (jVar.J(interfaceC8567G, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: J.j$e$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9489a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f9490b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f9491c;

            /* renamed from: J.j$e$c$a */
            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f9492a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(1);
                    this.f9492a = jVar;
                }

                public final void a(long j10) {
                    j jVar = this.f9492a;
                    J.n nVarF0 = jVar.f0();
                    J.n nVar = J.n.Cursor;
                    if (nVarF0 == nVar) {
                        nVar = J.n.None;
                    }
                    jVar.B0(nVar);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C6531g) obj).v());
                    return J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC8567G interfaceC8567G, j jVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9490b = interfaceC8567G;
                this.f9491c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new c(this.f9490b, this.f9491c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9489a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    InterfaceC8567G interfaceC8567G = this.f9490b;
                    a aVar = new a(this.f9491c);
                    this.f9489a = 1;
                    if (AbstractC8235B.k(interfaceC8567G, null, null, null, aVar, this, 7, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3098e(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f9482d = interfaceC8567G;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            C3098e c3098e = j.this.new C3098e(this.f9482d, interfaceC5380e);
            c3098e.f9480b = obj;
            return c3098e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9479a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            N n10 = (N) this.f9480b;
            P p10 = P.UNDISPATCHED;
            AbstractC3063k.d(n10, null, p10, new a(j.this, this.f9482d, null), 1, null);
            AbstractC3063k.d(n10, null, p10, new b(j.this, this.f9482d, null), 1, null);
            return AbstractC3063k.d(n10, null, p10, new c(this.f9482d, j.this, null), 1, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((C3098e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9493a;

        /* renamed from: b, reason: collision with root package name */
        Object f9494b;

        /* renamed from: c, reason: collision with root package name */
        Object f9495c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f9496d;

        /* renamed from: f, reason: collision with root package name */
        int f9498f;

        f(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9496d = obj;
            this.f9498f |= PduHandle.NONE;
            return j.this.J(null, this);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f9499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f9500b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M f9501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(M m10, j jVar, M m11) {
            super(1);
            this.f9499a = m10;
            this.f9500b = jVar;
            this.f9501c = m11;
        }

        public final void a(long j10) {
            this.f9499a.f51688a = M.w.a(this.f9500b.T().f());
            this.f9501c.f51688a = C6531g.f52335b.c();
            this.f9500b.w0(true);
            this.f9500b.k0();
            this.f9500b.F0(EnumC2726p.Cursor, this.f9499a.f51688a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f9502a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f9503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f9504c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(M m10, M m11, j jVar) {
            super(0);
            this.f9502a = m10;
            this.f9503b = m11;
            this.f9504c = jVar;
        }

        public final void a() {
            j.K(this.f9502a, this.f9503b, this.f9504c);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f9505a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f9506b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f9507c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(M m10, M m11, j jVar) {
            super(0);
            this.f9505a = m10;
            this.f9506b = m11;
            this.f9507c = jVar;
        }

        public final void a() {
            j.K(this.f9505a, this.f9506b, this.f9507c);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* renamed from: J.j$j, reason: collision with other inner class name */
    static final class C0384j extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f9508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f9509b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M f9510c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0384j(M m10, j jVar, M m11) {
            super(2);
            this.f9508a = m10;
            this.f9509b = jVar;
            this.f9510c = m11;
        }

        public final void a(C8604y c8604y, long j10) {
            M m10 = this.f9508a;
            m10.f51688a = C6531g.r(m10.f51688a, j10);
            this.f9509b.F0(EnumC2726p.Cursor, C6531g.r(this.f9510c.f51688a, this.f9508a.f51688a));
            j jVar = this.f9509b;
            if (jVar.q0(jVar.X())) {
                c8604y.a();
                InterfaceC8123a interfaceC8123a = this.f9509b.f9415h;
                if (interfaceC8123a != null) {
                    interfaceC8123a.a(AbstractC8124b.f62666a.b());
                }
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C8604y) obj, ((C6531g) obj2).v());
            return J.f24997a;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9511a;

        /* renamed from: b, reason: collision with root package name */
        Object f9512b;

        /* renamed from: c, reason: collision with root package name */
        Object f9513c;

        /* renamed from: d, reason: collision with root package name */
        Object f9514d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f9515e;

        /* renamed from: g, reason: collision with root package name */
        int f9517g;

        k(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9515e = obj;
            this.f9517g |= PduHandle.NONE;
            return j.this.L(null, false, this);
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f9518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f9519b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9520c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC2726p f9521d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ M f9522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(M m10, j jVar, boolean z10, EnumC2726p enumC2726p, M m11) {
            super(1);
            this.f9518a = m10;
            this.f9519b = jVar;
            this.f9520c = z10;
            this.f9521d = enumC2726p;
            this.f9522e = m11;
        }

        public final void a(long j10) {
            this.f9518a.f51688a = M.w.a(this.f9519b.Y(this.f9520c));
            this.f9519b.F0(this.f9521d, this.f9518a.f51688a);
            this.f9522e.f51688a = C6531g.f52335b.c();
            this.f9519b.f9427t = -1;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return J.f24997a;
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f9523a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f9524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M f9525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(M m10, j jVar, M m11) {
            super(0);
            this.f9523a = m10;
            this.f9524b = jVar;
            this.f9525c = m11;
        }

        public final void a() {
            j.M(this.f9523a, this.f9524b, this.f9525c);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class n extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f9526a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f9527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M f9528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(M m10, j jVar, M m11) {
            super(0);
            this.f9526a = m10;
            this.f9527b = jVar;
            this.f9528c = m11;
        }

        public final void a() {
            j.M(this.f9526a, this.f9527b, this.f9528c);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f9529a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f9530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC2726p f9531c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M f9532d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9533e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(M m10, j jVar, EnumC2726p enumC2726p, M m11, boolean z10) {
            super(2);
            this.f9529a = m10;
            this.f9530b = jVar;
            this.f9531c = enumC2726p;
            this.f9532d = m11;
            this.f9533e = z10;
        }

        public final void a(C8604y c8604y, long j10) {
            M m10 = this.f9529a;
            m10.f51688a = C6531g.r(m10.f51688a, j10);
            L0.M mF = this.f9530b.f9409b.f();
            if (mF == null) {
                return;
            }
            this.f9530b.F0(this.f9531c, C6531g.r(this.f9532d.f51688a, this.f9529a.f51688a));
            int iX = this.f9533e ? mF.x(this.f9530b.X()) : S.n(this.f9530b.f9408a.l().f());
            int i10 = this.f9533e ? S.i(this.f9530b.f9408a.l().f()) : mF.x(this.f9530b.X());
            long jF = this.f9530b.f9408a.l().f();
            j jVar = this.f9530b;
            long jH0 = j.H0(jVar, jVar.f9408a.l(), iX, i10, this.f9533e, M.r.f12223a.l(), false, false, 96, null);
            if (S.h(jF) || !S.h(jH0)) {
                this.f9530b.f9408a.y(jH0);
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C8604y) obj, ((C6531g) obj2).v());
            return J.f24997a;
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC2726p f9535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(EnumC2726p enumC2726p) {
            super(0);
            this.f9535b = enumC2726p;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Selection Handle drag cancelled for draggingHandle: " + j.this.V() + " definedOn: " + this.f9535b;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f9536a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9537b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f9538c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f9539d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f9540e;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9541a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f9542b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ w.r f9543c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ j f9544d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f9545e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC8558m f9546f;

            /* renamed from: J.j$q$a$a, reason: collision with other inner class name */
            static final class C0385a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                Object f9547a;

                /* renamed from: b, reason: collision with root package name */
                int f9548b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ j f9549c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f9550d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC8558m f9551e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0385a(j jVar, long j10, InterfaceC8558m interfaceC8558m, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f9549c = jVar;
                    this.f9550d = j10;
                    this.f9551e = interfaceC8558m;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0385a(this.f9549c, this.f9550d, this.f9551e, interfaceC5380e);
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = eh.AbstractC5467b.g()
                        int r1 = r7.f9548b
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r4) goto L1f
                        if (r1 != r3) goto L17
                        java.lang.Object r0 = r7.f9547a
                        y.o$b r0 = (y.InterfaceC8560o.b) r0
                        Yg.v.b(r8)
                        goto L5f
                    L17:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1f:
                        java.lang.Object r1 = r7.f9547a
                        J.j r1 = (J.j) r1
                        Yg.v.b(r8)
                        goto L47
                    L27:
                        Yg.v.b(r8)
                        J.j r8 = r7.f9549c
                        y.o$b r8 = J.j.i(r8)
                        if (r8 == 0) goto L4a
                        y.m r1 = r7.f9551e
                        J.j r5 = r7.f9549c
                        y.o$a r6 = new y.o$a
                        r6.<init>(r8)
                        r7.f9547a = r5
                        r7.f9548b = r4
                        java.lang.Object r8 = r1.a(r6, r7)
                        if (r8 != r0) goto L46
                        return r0
                    L46:
                        r1 = r5
                    L47:
                        J.j.t(r1, r2)
                    L4a:
                        y.o$b r8 = new y.o$b
                        long r4 = r7.f9550d
                        r8.<init>(r4, r2)
                        y.m r1 = r7.f9551e
                        r7.f9547a = r8
                        r7.f9548b = r3
                        java.lang.Object r1 = r1.a(r8, r7)
                        if (r1 != r0) goto L5e
                        return r0
                    L5e:
                        r0 = r8
                    L5f:
                        J.j r8 = r7.f9549c
                        J.j.t(r8, r0)
                        Yg.J r8 = Yg.J.f24997a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: J.j.q.a.C0385a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C0385a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w.r rVar, j jVar, long j10, InterfaceC8558m interfaceC8558m, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9543c = rVar;
                this.f9544d = jVar;
                this.f9545e = j10;
                this.f9546f = interfaceC8558m;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f9543c, this.f9544d, this.f9545e, this.f9546f, interfaceC5380e);
                aVar.f9542b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9541a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    AbstractC3063k.d((N) this.f9542b, null, null, new C0385a(this.f9544d, this.f9545e, this.f9546f, null), 3, null);
                    w.r rVar = this.f9543c;
                    this.f9541a = 1;
                    obj = rVar.q0(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        this.f9544d.f9428u = null;
                        return J.f24997a;
                    }
                    Yg.v.b(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC8560o.b bVar = this.f9544d.f9428u;
                if (bVar != null) {
                    InterfaceC8558m interfaceC8558m = this.f9546f;
                    InterfaceC8555j cVar = zBooleanValue ? new InterfaceC8560o.c(bVar) : new InterfaceC8560o.a(bVar);
                    this.f9541a = 2;
                    if (interfaceC8558m.a(cVar, this) == objG) {
                        return objG;
                    }
                }
                this.f9544d.f9428u = null;
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(InterfaceC8558m interfaceC8558m, j jVar, InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
            this.f9539d = interfaceC8558m;
            this.f9540e = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f9536a;
            if (i10 == 0) {
                Yg.v.b(obj);
                w.r rVar = (w.r) this.f9537b;
                long j10 = this.f9538c;
                InterfaceC8558m interfaceC8558m = this.f9539d;
                if (interfaceC8558m != null) {
                    a aVar = new a(rVar, this.f9540e, j10, interfaceC8558m, null);
                    this.f9536a = 1;
                    if (O.g(aVar, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        public final Object n(w.r rVar, long j10, InterfaceC5380e interfaceC5380e) {
            q qVar = new q(this.f9539d, this.f9540e, interfaceC5380e);
            qVar.f9537b = rVar;
            qVar.f9538c = j10;
            return qVar.invokeSuspend(J.f24997a);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return n((w.r) obj, ((C6531g) obj2).v(), (InterfaceC5380e) obj3);
        }
    }

    static final class r extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f9552a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f9553b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f9554c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f9555a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "onTapTextField";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(InterfaceC6824a interfaceC6824a, j jVar, InterfaceC6824a interfaceC6824a2) {
            super(1);
            this.f9552a = interfaceC6824a;
            this.f9553b = jVar;
            this.f9554c = interfaceC6824a2;
        }

        public final void a(long j10) {
            J.k.c(a.f9555a);
            this.f9552a.invoke();
            if (this.f9553b.f9411d && this.f9553b.i0()) {
                if (!this.f9553b.f9412e) {
                    this.f9554c.invoke();
                    if (this.f9553b.f9408a.l().length() > 0) {
                        this.f9553b.z0(true);
                    }
                }
                this.f9553b.I0(J.n.None);
                long jB = this.f9553b.f9409b.b(j10);
                j jVar = this.f9553b;
                jVar.q0(m1.b(jVar.f9409b, jB));
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return J.f24997a;
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        int f9556b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9557c;

        s(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            s sVar = j.this.new s(interfaceC5380e);
            sVar.f9557c = obj;
            return sVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r4.f9556b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.f9557c
                y0.b r1 = (y0.InterfaceC8581b) r1
                Yg.v.b(r5)
                goto L30
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                Yg.v.b(r5)
                java.lang.Object r5 = r4.f9557c
                y0.b r5 = (y0.InterfaceC8581b) r5
                r1 = r5
            L23:
                y0.p r5 = y0.EnumC8595p.Initial
                r4.f9557c = r1
                r4.f9556b = r2
                java.lang.Object r5 = r1.A1(r5, r4)
                if (r5 != r0) goto L30
                return r0
            L30:
                y0.n r5 = (y0.C8593n) r5
                J.j r3 = J.j.this
                boolean r5 = M.t.j(r5)
                r5 = r5 ^ r2
                r3.w0(r5)
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: J.j.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((s) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9559a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9560b;

        /* renamed from: d, reason: collision with root package name */
        int f9562d;

        t(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9560b = obj;
            this.f9562d |= PduHandle.NONE;
            return j.this.l0(this);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9563a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9564b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9566a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9567b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9567b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f9567b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9566a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    j jVar = this.f9567b;
                    this.f9566a = 1;
                    if (jVar.m0(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9568a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9569b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9569b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f9569b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f9568a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    j jVar = this.f9569b;
                    this.f9568a = 1;
                    if (jVar.n0(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        u(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            u uVar = j.this.new u(interfaceC5380e);
            uVar.f9564b = obj;
            return uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9563a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            N n10 = (N) this.f9564b;
            AbstractC3063k.d(n10, null, null, new a(j.this, null), 3, null);
            return AbstractC3063k.d(n10, null, null, new b(j.this, null), 3, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((u) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class v extends AbstractC6494u implements InterfaceC6824a {
        v() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H.h invoke() {
            return j.this.f9408a.l();
        }
    }

    /* synthetic */ class w extends C6490p implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final w f9571a = new w();

        w() {
            super(2, H.h.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(H.h hVar, CharSequence charSequence) {
            return Boolean.valueOf(hVar.a(charSequence));
        }
    }

    static final class x implements InterfaceC3221h {
        x() {
        }

        @Override // Li.InterfaceC3221h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object a(H.h hVar, InterfaceC5380e interfaceC5380e) {
            j.this.z0(false);
            j.this.I0(J.n.None);
            return J.f24997a;
        }
    }

    static final class y extends AbstractC6494u implements InterfaceC6824a {
        y() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6533i invoke() {
            C6533i c6533iT;
            boolean zH = S.h(j.this.f9408a.l().f());
            if (((!zH || j.this.f0() != J.n.Cursor) && (zH || j.this.f0() != J.n.Selection)) || j.this.V() != null || !j.this.j0()) {
                return C6533i.f52340e.a();
            }
            C0.r rVarE0 = j.this.e0();
            C6533i c6533iB = rVarE0 != null ? M.A.b(rVarE0) : null;
            if (c6533iB == null) {
                return C6533i.f52340e.a();
            }
            C0.r rVarE02 = j.this.e0();
            C6531g c6531gD = rVarE02 != null ? C6531g.d(rVarE02.o0(c6533iB.p())) : null;
            AbstractC6492s.f(c6531gD);
            C6533i c6533iB2 = AbstractC6534j.b(c6531gD.v(), c6533iB.m());
            C6533i c6533iQ = j.this.Q();
            C6533i c6533i = c6533iB2.v(c6533iQ) ? c6533iQ : null;
            return (c6533i == null || (c6533iT = c6533i.t(c6533iB2)) == null) ? C6533i.f52340e.a() : c6533iT;
        }
    }

    static final class z implements InterfaceC3221h {
        z() {
        }

        @Override // Li.InterfaceC3221h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object a(C6533i c6533i, InterfaceC5380e interfaceC5380e) {
            if (AbstractC6492s.d(c6533i, C6533i.f52340e.a())) {
                j.this.g0();
            } else {
                j.this.C0(c6533i);
            }
            return J.f24997a;
        }
    }

    public j(o1 o1Var, l1 l1Var, Y0.d dVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f9408a = o1Var;
        this.f9409b = l1Var;
        this.f9410c = dVar;
        this.f9411d = z10;
        this.f9412e = z11;
        this.f9413f = z12;
        this.f9414g = z13;
        C6531g.a aVar = C6531g.f52335b;
        this.f9420m = t1.d(C6531g.d(aVar.b()), null, 2, null);
        this.f9421n = t1.d(C6531g.d(aVar.b()), null, 2, null);
        this.f9422o = t1.d(null, null, 2, null);
        this.f9423p = t1.d(EnumC3094a.None, null, 2, null);
        this.f9424q = t1.d(Boolean.FALSE, null, 2, null);
        this.f9425r = t1.d(J.n.None, null, 2, null);
        this.f9427t = -1;
    }

    private final void A0(long j10) {
        this.f9420m.setValue(C6531g.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(J.n nVar) {
        this.f9425r.setValue(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(C6533i c6533i) {
        q1 q1Var = this.f9416i;
        if (q1Var != null) {
            boolean z10 = z();
            J.n nVar = J.n.None;
            q1Var.b(c6533i, !z10 ? null : new B(nVar, this), !B() ? null : new C(nVar, this), !A() ? null : new D(nVar, this), !C() ? null : new E(J.n.Selection, this));
        }
    }

    public static /* synthetic */ void F(j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        jVar.E(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long G0(H.h hVar, int i10, int i11, boolean z10, M.r rVar, boolean z11, boolean z12) {
        InterfaceC8123a interfaceC8123a;
        S sB = S.b(hVar.f());
        long jR = sB.r();
        if (z12 || (!z11 && S.h(jR))) {
            sB = null;
        }
        long jD0 = d0(i10, i11, sB, z10, rVar);
        if (S.g(jD0, hVar.f())) {
            return jD0;
        }
        boolean z13 = S.m(jD0) != S.m(hVar.f()) && S.g(T.b(S.i(jD0), S.n(jD0)), hVar.f());
        if (j0() && !z13 && (interfaceC8123a = this.f9415h) != null) {
            interfaceC8123a.a(AbstractC8124b.f62666a.b());
        }
        return jD0;
    }

    static /* synthetic */ long H0(j jVar, H.h hVar, int i10, int i11, boolean z10, M.r rVar, boolean z11, boolean z12, int i12, Object obj) {
        return jVar.G0(hVar, i10, i11, z10, rVar, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? false : z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J(y0.InterfaceC8567G r10, dh.InterfaceC5380e r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof J.j.f
            if (r0 == 0) goto L14
            r0 = r11
            J.j$f r0 = (J.j.f) r0
            int r1 = r0.f9498f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9498f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            J.j$f r0 = new J.j$f
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f9496d
            java.lang.Object r0 = eh.AbstractC5467b.g()
            int r1 = r6.f9498f
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L39
            java.lang.Object r10 = r6.f9495c
            kotlin.jvm.internal.M r10 = (kotlin.jvm.internal.M) r10
            java.lang.Object r0 = r6.f9494b
            kotlin.jvm.internal.M r0 = (kotlin.jvm.internal.M) r0
            java.lang.Object r1 = r6.f9493a
            J.j r1 = (J.j) r1
            Yg.v.b(r11)     // Catch: java.lang.Throwable -> L37
            goto L87
        L37:
            r11 = move-exception
            goto L92
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            Yg.v.b(r11)
            kotlin.jvm.internal.M r11 = new kotlin.jvm.internal.M
            r11.<init>()
            l0.g$a r1 = l0.C6531g.f52335b
            long r3 = r1.b()
            r11.f51688a = r3
            kotlin.jvm.internal.M r7 = new kotlin.jvm.internal.M
            r7.<init>()
            long r3 = r1.b()
            r7.f51688a = r3
            J.j$g r3 = new J.j$g     // Catch: java.lang.Throwable -> L8d
            r3.<init>(r11, r9, r7)     // Catch: java.lang.Throwable -> L8d
            J.j$h r4 = new J.j$h     // Catch: java.lang.Throwable -> L8d
            r4.<init>(r11, r7, r9)     // Catch: java.lang.Throwable -> L8d
            J.j$i r5 = new J.j$i     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r11, r7, r9)     // Catch: java.lang.Throwable -> L8d
            J.j$j r8 = new J.j$j     // Catch: java.lang.Throwable -> L8d
            r8.<init>(r7, r9, r11)     // Catch: java.lang.Throwable -> L8d
            r6.f9493a = r9     // Catch: java.lang.Throwable -> L8d
            r6.f9494b = r11     // Catch: java.lang.Throwable -> L8d
            r6.f9495c = r7     // Catch: java.lang.Throwable -> L8d
            r6.f9498f = r2     // Catch: java.lang.Throwable -> L8d
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.lang.Object r10 = w.j.e(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8d
            if (r10 != r0) goto L84
            return r0
        L84:
            r1 = r9
            r0 = r11
            r10 = r7
        L87:
            K(r0, r10, r1)
            Yg.J r10 = Yg.J.f24997a
            return r10
        L8d:
            r10 = move-exception
            r1 = r9
            r0 = r11
            r11 = r10
            r10 = r7
        L92:
            K(r0, r10, r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: J.j.J(y0.G, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(M m10, M m11, j jVar) {
        if (AbstractC6532h.c(m10.f51688a)) {
            C6531g.a aVar = C6531g.f52335b;
            m10.f51688a = aVar.b();
            m11.f51688a = aVar.b();
            jVar.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(y0.InterfaceC8567G r18, boolean r19, dh.InterfaceC5380e r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J.j.L(y0.G, boolean, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(M m10, j jVar, M m11) {
        if (AbstractC6532h.c(m10.f51688a)) {
            jVar.D();
            C6531g.a aVar = C6531g.f52335b;
            m10.f51688a = aVar.b();
            m11.f51688a = aVar.c();
            jVar.f9427t = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6533i Q() {
        float fN;
        C6533i c6533iE;
        C6533i c6533iE2;
        H.h hVarL = this.f9408a.l();
        if (S.h(hVarL.f())) {
            C6533i c6533iT = T();
            C0.r rVarE0 = e0();
            return AbstractC6534j.b(rVarE0 != null ? rVarE0.o0(c6533iT.p()) : C6531g.f52335b.c(), c6533iT.m());
        }
        C0.r rVarE02 = e0();
        long jO0 = rVarE02 != null ? rVarE02.o0(Y(true)) : C6531g.f52335b.c();
        C0.r rVarE03 = e0();
        long jO02 = rVarE03 != null ? rVarE03.o0(Y(false)) : C6531g.f52335b.c();
        C0.r rVarE04 = e0();
        float fN2 = 0.0f;
        if (rVarE04 != null) {
            L0.M mF = this.f9409b.f();
            fN = C6531g.n(rVarE04.o0(AbstractC6532h.a(0.0f, (mF == null || (c6533iE2 = mF.e(S.n(hVarL.f()))) == null) ? 0.0f : c6533iE2.n())));
        } else {
            fN = 0.0f;
        }
        C0.r rVarE05 = e0();
        if (rVarE05 != null) {
            L0.M mF2 = this.f9409b.f();
            fN2 = C6531g.n(rVarE05.o0(AbstractC6532h.a(0.0f, (mF2 == null || (c6533iE = mF2.e(S.i(hVarL.f()))) == null) ? 0.0f : c6533iE.n())));
        }
        return new C6533i(Math.min(C6531g.m(jO0), C6531g.m(jO02)), Math.min(fN, fN2), Math.max(C6531g.m(jO0), C6531g.m(jO02)), Math.max(C6531g.n(jO0), C6531g.n(jO02)));
    }

    private final long R() {
        C0.r rVarE0 = e0();
        return rVarE0 != null ? AbstractC2538s.f(rVarE0) : C6531g.f52335b.b();
    }

    private final boolean W() {
        return this.f9411d && !this.f9412e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Y(boolean z10) {
        L0.M mF = this.f9409b.f();
        if (mF == null) {
            return C6531g.f52335b.c();
        }
        long jF = this.f9408a.l().f();
        return M.M.b(mF, z10 ? S.n(jF) : S.i(jF), z10, S.m(jF));
    }

    private final long Z() {
        return ((C6531g) this.f9421n.getValue()).v();
    }

    private final boolean b0() {
        return ((Boolean) this.f9424q.getValue()).booleanValue();
    }

    private final long c0() {
        return ((C6531g) this.f9420m.getValue()).v();
    }

    private final long d0(int i10, int i11, S s10, boolean z10, M.r rVar) {
        L0.M mF = this.f9409b.f();
        if (mF == null) {
            return S.f11103b.a();
        }
        if (s10 == null && AbstractC6492s.d(rVar, M.r.f12223a.k())) {
            return T.b(i10, i11);
        }
        M.x xVarC = M.y.c(mF, i10, i11, this.f9427t, s10 != null ? s10.r() : S.f11103b.a(), s10 == null, z10);
        if (s10 != null && !xVarC.j(this.f9426s)) {
            return s10.r();
        }
        long jF = rVar.a(xVarC).f();
        this.f9426s = xVarC;
        if (!z10) {
            i10 = i11;
        }
        this.f9427t = i10;
        return jF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0.r e0() {
        C0.r rVarJ = this.f9409b.j();
        if (rVarJ == null || !rVarJ.M()) {
            return null;
        }
        return rVarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J.n f0() {
        return (J.n) this.f9425r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        q1 q1Var;
        q1 q1Var2 = this.f9416i;
        if ((q1Var2 != null ? q1Var2.a() : null) != s1.Shown || (q1Var = this.f9416i) == null) {
            return;
        }
        q1Var.c();
    }

    private final boolean h0() {
        C6533i c6533iB;
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            long jF = T().f();
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            C0.r rVarE0 = e0();
            if (rVarE0 == null || (c6533iB = M.A.b(rVarE0)) == null) {
                return false;
            }
            return M.A.a(c6533iB, jF);
        } catch (Throwable th2) {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        A0(R());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m0(InterfaceC5380e interfaceC5380e) {
        Object objB = AbstractC3222i.q(AbstractC3222i.o(T.o1.o(new v()), w.f9571a), 1).b(new x(), interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n0(InterfaceC5380e interfaceC5380e) {
        Object objB = T.o1.o(new y()).b(new z(), interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }

    private final void p0() {
        C3174d c3174dA;
        String strK;
        InterfaceC3923h0 interfaceC3923h0 = this.f9417j;
        if (interfaceC3923h0 == null || (c3174dA = interfaceC3923h0.a()) == null || (strK = c3174dA.k()) == null) {
            return;
        }
        o1.u(this.f9408a, strK, false, K.c.NeverMerge, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q0(long j10) {
        int iX;
        int iN;
        L0.M mF = this.f9409b.f();
        if (mF == null || (iX = mF.x(j10)) == -1) {
            return false;
        }
        o1 o1Var = this.f9408a;
        long jN = o1Var.n(iX);
        long jP = o1Var.p(jN);
        int i10 = C3097d.f9478a[((S.h(jN) && S.h(jP)) ? G0.Untransformed : (S.h(jN) || S.h(jP)) ? (!S.h(jN) || S.h(jP)) ? G0.Deletion : G0.Insertion : G0.Replacement).ordinal()];
        X0 x02 = null;
        if (i10 == 1 || i10 == 2) {
            iN = S.n(jN);
        } else if (i10 == 3) {
            x02 = R0.b(j10, mF.e(S.n(jP)), mF.e(S.i(jP))) < 0 ? new X0(p1.Start) : new X0(p1.End);
            iN = S.n(jN);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iN = R0.b(j10, mF.e(S.n(jP)), mF.e(S.i(jP))) < 0 ? S.n(jN) : S.i(jN);
        }
        long jA = T.a(iN);
        if (S.g(jA, this.f9408a.k().f()) && (x02 == null || AbstractC6492s.d(x02, this.f9408a.j()))) {
            return false;
        }
        this.f9408a.z(jA);
        if (x02 != null) {
            this.f9408a.A(x02);
        }
        return true;
    }

    private final void x0(long j10) {
        this.f9421n.setValue(C6531g.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(boolean z10) {
        this.f9424q.setValue(Boolean.valueOf(z10));
    }

    public final boolean A() {
        return (S.h(this.f9408a.l().f()) || !W() || this.f9414g) ? false : true;
    }

    public final boolean B() {
        if (!W()) {
            return false;
        }
        InterfaceC3923h0 interfaceC3923h0 = this.f9417j;
        if (interfaceC3923h0 != null && interfaceC3923h0.c()) {
            return true;
        }
        InterfaceC6824a interfaceC6824a = this.f9419l;
        if (interfaceC6824a != null) {
            AbstractC5487d.a(interfaceC6824a.invoke());
        }
        return false;
    }

    public final boolean C() {
        return S.j(this.f9408a.l().f()) != this.f9408a.l().length();
    }

    public final void D() {
        u0(null);
        C6531g.a aVar = C6531g.f52335b;
        x0(aVar.b());
        A0(aVar.b());
    }

    public final Object D0(InterfaceC8567G interfaceC8567G, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
        Object objN = M.t.n(interfaceC8567G, new C3095b(interfaceC6824a), new C3096c(interfaceC6824a), interfaceC5380e);
        return objN == AbstractC5467b.g() ? objN : J.f24997a;
    }

    public final void E(boolean z10) {
        H.h hVarL = this.f9408a.l();
        if (S.h(hVarL.f())) {
            return;
        }
        InterfaceC3923h0 interfaceC3923h0 = this.f9417j;
        if (interfaceC3923h0 != null) {
            interfaceC3923h0.b(new C3174d(H.i.a(hVarL).toString(), null, null, 6, null));
        }
        if (z10) {
            this.f9408a.f();
        }
    }

    public final void E0(InterfaceC8123a interfaceC8123a, InterfaceC3923h0 interfaceC3923h0, q1 q1Var, Y0.d dVar, boolean z10, boolean z11, boolean z12) {
        if (!z10) {
            g0();
        }
        this.f9415h = interfaceC8123a;
        this.f9417j = interfaceC3923h0;
        this.f9416i = q1Var;
        this.f9410c = dVar;
        this.f9411d = z10;
        this.f9412e = z11;
        this.f9414g = z12;
    }

    public final void F0(EnumC2726p enumC2726p, long j10) {
        u0(enumC2726p);
        x0(j10);
    }

    public final Object G(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new C3098e(interfaceC8567G, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public final void H() {
        H.h hVarL = this.f9408a.l();
        if (S.h(hVarL.f())) {
            return;
        }
        InterfaceC3923h0 interfaceC3923h0 = this.f9417j;
        if (interfaceC3923h0 != null) {
            interfaceC3923h0.b(new C3174d(H.i.a(hVarL).toString(), null, null, 6, null));
        }
        this.f9408a.h();
    }

    public final void I() {
        if (!S.h(this.f9408a.l().f())) {
            this.f9408a.e();
        }
        z0(false);
        I0(J.n.None);
    }

    public final void I0(J.n nVar) {
        B0(nVar);
    }

    public final Object N(InterfaceC8567G interfaceC8567G, InterfaceC8558m interfaceC8558m, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC5380e interfaceC5380e) {
        Object objI = AbstractC8235B.i(interfaceC8567G, new q(interfaceC8558m, this, null), new r(interfaceC6824a, this, interfaceC6824a2), interfaceC5380e);
        return objI == AbstractC5467b.g() ? objI : J.f24997a;
    }

    public final Object O(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
        Object objP = interfaceC8567G.P(new s(null), interfaceC5380e);
        return objP == AbstractC5467b.g() ? objP : J.f24997a;
    }

    public final void P() {
        g0();
        this.f9416i = null;
        this.f9417j = null;
        this.f9415h = null;
    }

    public final d S(boolean z10) {
        H.h hVarL = this.f9408a.l();
        boolean zB0 = b0();
        boolean z11 = U() == EnumC3094a.None;
        EnumC2726p enumC2726pV = V();
        if (zB0 && z11 && S.h(hVarL.f()) && hVarL.h() && hVarL.length() > 0 && (enumC2726pV == EnumC2726p.Cursor || h0())) {
            return new d(true, z10 ? T().f() : C6531g.f52335b.b(), W0.i.Ltr, false, null);
        }
        return d.f9371e.a();
    }

    public final C6533i T() {
        L0.M mF = this.f9409b.f();
        if (mF == null) {
            return C6533i.f52340e.a();
        }
        H.h hVarL = this.f9408a.l();
        if (!S.h(hVarL.f())) {
            return C6533i.f52340e.a();
        }
        C6533i c6533iE = mF.e(S.n(hVarL.f()));
        float fD1 = this.f9410c.d1(V.b());
        float fK = mF.l().d() == Y0.t.Ltr ? c6533iE.k() + (fD1 / 2) : c6533iE.l() - (fD1 / 2);
        float f10 = fD1 / 2;
        float fC = AbstractC7978m.c(AbstractC7978m.f(fK, Y0.r.g(mF.B()) - f10), f10);
        return new C6533i(fC - f10, c6533iE.n(), fC + f10, c6533iE.e());
    }

    public final EnumC3094a U() {
        return (EnumC3094a) this.f9423p.getValue();
    }

    public final EnumC2726p V() {
        return (EnumC2726p) this.f9422o.getValue();
    }

    public final long X() {
        return AbstractC6532h.d(Z()) ? C6531g.f52335b.b() : AbstractC6532h.d(c0()) ? m1.b(this.f9409b, Z()) : C6531g.r(Z(), C6531g.q(c0(), R()));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final J.d a0(boolean r14, boolean r15) {
        /*
            r13 = this;
            if (r14 == 0) goto L5
            F.p r0 = F.EnumC2726p.SelectionStart
            goto L7
        L5:
            F.p r0 = F.EnumC2726p.SelectionEnd
        L7:
            I.l1 r1 = r13.f9409b
            L0.M r1 = r1.f()
            if (r1 != 0) goto L16
            J.d$a r14 = J.d.f9371e
            J.d r14 = r14.a()
            return r14
        L16:
            I.o1 r2 = r13.f9408a
            H.h r2 = r2.l()
            long r2 = r2.f()
            boolean r4 = L0.S.h(r2)
            if (r4 == 0) goto L2d
            J.d$a r14 = J.d.f9371e
            J.d r14 = r14.a()
            return r14
        L2d:
            long r4 = r13.Y(r14)
            J.j$a r6 = r13.U()
            J.j$a r7 = J.j.EnumC3094a.None
            r8 = 1
            r9 = 0
            if (r6 != r7) goto L57
            F.p r6 = r13.V()
            if (r6 == r0) goto L55
            C0.r r0 = r13.e0()
            if (r0 == 0) goto L52
            l0.i r0 = M.A.b(r0)
            if (r0 == 0) goto L52
            boolean r0 = M.A.a(r0, r4)
            goto L53
        L52:
            r0 = r9
        L53:
            if (r0 == 0) goto L57
        L55:
            r0 = r8
            goto L58
        L57:
            r0 = r9
        L58:
            if (r0 != 0) goto L61
            J.d$a r14 = J.d.f9371e
            J.d r14 = r14.a()
            return r14
        L61:
            I.o1 r0 = r13.f9408a
            H.h r0 = r0.l()
            boolean r0 = r0.h()
            if (r0 != 0) goto L74
            J.d$a r14 = J.d.f9371e
            J.d r14 = r14.a()
            return r14
        L74:
            if (r14 == 0) goto L7b
            int r14 = L0.S.n(r2)
            goto L84
        L7b:
            int r14 = L0.S.i(r2)
            int r14 = r14 - r8
            int r14 = java.lang.Math.max(r14, r9)
        L84:
            W0.i r10 = r1.c(r14)
            boolean r11 = L0.S.m(r2)
            if (r15 == 0) goto La0
            C0.r r14 = r13.e0()
            if (r14 == 0) goto L9e
            l0.i r14 = M.A.b(r14)
            if (r14 == 0) goto L9e
            long r4 = I.m1.a(r4, r14)
        L9e:
            r8 = r4
            goto La7
        La0:
            l0.g$a r14 = l0.C6531g.f52335b
            long r4 = r14.b()
            goto L9e
        La7:
            J.d r14 = new J.d
            r7 = 1
            r12 = 0
            r6 = r14
            r6.<init>(r7, r8, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: J.j.a0(boolean, boolean):J.d");
    }

    public final boolean i0() {
        return this.f9413f;
    }

    public final boolean j0() {
        return ((Boolean) this.f9418k.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l0(dh.InterfaceC5380e r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof J.j.t
            if (r0 == 0) goto L13
            r0 = r6
            J.j$t r0 = (J.j.t) r0
            int r1 = r0.f9562d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9562d = r1
            goto L18
        L13:
            J.j$t r0 = new J.j$t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9560b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f9562d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f9559a
            J.j r0 = (J.j) r0
            Yg.v.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L2e:
            r6 = move-exception
            goto L60
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            Yg.v.b(r6)
            J.j$u r6 = new J.j$u     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            r0.f9559a = r5     // Catch: java.lang.Throwable -> L5e
            r0.f9562d = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = Ii.O.g(r6, r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            r0.z0(r3)
            J.n r6 = r0.f0()
            J.n r1 = J.n.None
            if (r6 == r1) goto L5b
            r0.g0()
        L5b:
            Yg.J r6 = Yg.J.f24997a
            return r6
        L5e:
            r6 = move-exception
            r0 = r5
        L60:
            r0.z0(r3)
            J.n r1 = r0.f0()
            J.n r2 = J.n.None
            if (r1 == r2) goto L6e
            r0.g0()
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: J.j.l0(dh.e):java.lang.Object");
    }

    public final void o0() {
        InterfaceC6824a interfaceC6824a = this.f9419l;
        if (interfaceC6824a != null) {
            AbstractC5487d.a(interfaceC6824a.invoke());
        }
        p0();
    }

    public final void r0() {
        this.f9408a.x();
    }

    public final Object s0(InterfaceC8567G interfaceC8567G, boolean z10, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new A(interfaceC8567G, z10, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public final void t0(EnumC3094a enumC3094a) {
        this.f9423p.setValue(enumC3094a);
    }

    public final void u0(EnumC2726p enumC2726p) {
        this.f9422o.setValue(enumC2726p);
    }

    public final void v0(boolean z10) {
        this.f9413f = z10;
    }

    public final void w0(boolean z10) {
        this.f9418k.setValue(Boolean.valueOf(z10));
    }

    public final void y0(InterfaceC6824a interfaceC6824a) {
        this.f9419l = interfaceC6824a;
    }

    public final boolean z() {
        return (S.h(this.f9408a.l().f()) || this.f9414g) ? false : true;
    }
}
