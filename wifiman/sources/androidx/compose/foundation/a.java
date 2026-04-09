package androidx.compose.foundation;

import E0.A0;
import E0.AbstractC2635m;
import E0.InterfaceC2632j;
import E0.s0;
import E0.v0;
import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import Ii.Y;
import J0.t;
import J0.w;
import Y0.s;
import Yg.J;
import Yg.v;
import android.view.KeyEvent;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.InterfaceC6354b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s.AbstractC7850k;
import s.C7862x;
import s.C7864z;
import s.InterfaceC7836I;
import w.r;
import w0.AbstractC8250d;
import w0.C8247a;
import w0.InterfaceC8251e;
import y.AbstractC8557l;
import y.C8552g;
import y.C8553h;
import y.InterfaceC8558m;
import y.InterfaceC8560o;
import y0.AbstractC8576P;
import y0.AbstractC8596q;
import y0.C8593n;
import y0.EnumC8595p;
import y0.InterfaceC8567G;
import y0.InterfaceC8578S;

/* loaded from: classes.dex */
public abstract class a extends AbstractC2635m implements s0, InterfaceC8251e, InterfaceC6354b, v0, A0 {

    /* renamed from: H, reason: collision with root package name */
    public static final C1034a f27721H = new C1034a(null);

    /* renamed from: I, reason: collision with root package name */
    public static final int f27722I = 8;

    /* renamed from: A, reason: collision with root package name */
    private InterfaceC8560o.b f27723A;

    /* renamed from: B, reason: collision with root package name */
    private C8552g f27724B;

    /* renamed from: C, reason: collision with root package name */
    private final Map f27725C;

    /* renamed from: D, reason: collision with root package name */
    private long f27726D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC8558m f27727E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f27728F;

    /* renamed from: G, reason: collision with root package name */
    private final Object f27729G;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC8558m f27730p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC7836I f27731q;

    /* renamed from: r, reason: collision with root package name */
    private String f27732r;

    /* renamed from: s, reason: collision with root package name */
    private J0.g f27733s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27734t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC6824a f27735u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f27736v;

    /* renamed from: w, reason: collision with root package name */
    private final C7862x f27737w;

    /* renamed from: x, reason: collision with root package name */
    private final C7864z f27738x;

    /* renamed from: y, reason: collision with root package name */
    private InterfaceC8578S f27739y;

    /* renamed from: z, reason: collision with root package name */
    private InterfaceC2632j f27740z;

    /* renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name */
    public static final class C1034a {
        public /* synthetic */ C1034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1034a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            a.this.W2().invoke();
            return Boolean.TRUE;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27742a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f27743b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8552g f27744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC8558m interfaceC8558m, C8552g c8552g, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27743b = interfaceC8558m;
            this.f27744c = c8552g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f27743b, this.f27744c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27742a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8558m interfaceC8558m = this.f27743b;
                C8552g c8552g = this.f27744c;
                this.f27742a = 1;
                if (interfaceC8558m.a(c8552g, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f27746b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8553h f27747c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC8558m interfaceC8558m, C8553h c8553h, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27746b = interfaceC8558m;
            this.f27747c = c8553h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f27746b, this.f27747c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27745a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8558m interfaceC8558m = this.f27746b;
                C8553h c8553h = this.f27747c;
                this.f27745a = 1;
                if (interfaceC8558m.a(c8553h, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        boolean f27748a;

        /* renamed from: b, reason: collision with root package name */
        int f27749b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f27750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f27751d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f27752e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f27753f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f27754g;

        /* renamed from: androidx.compose.foundation.a$e$a, reason: collision with other inner class name */
        static final class C1035a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            Object f27755a;

            /* renamed from: b, reason: collision with root package name */
            int f27756b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f27757c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f27758d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC8558m f27759e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1035a(a aVar, long j10, InterfaceC8558m interfaceC8558m, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f27757c = aVar;
                this.f27758d = j10;
                this.f27759e = interfaceC8558m;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1035a(this.f27757c, this.f27758d, this.f27759e, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC8560o.b bVar;
                Object objG = AbstractC5467b.g();
                int i10 = this.f27756b;
                if (i10 == 0) {
                    v.b(obj);
                    if (this.f27757c.R2()) {
                        long jA = AbstractC7850k.a();
                        this.f27756b = 1;
                        if (Y.a(jA, this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (InterfaceC8560o.b) this.f27755a;
                        v.b(obj);
                        this.f27757c.f27723A = bVar;
                        return J.f24997a;
                    }
                    v.b(obj);
                }
                InterfaceC8560o.b bVar2 = new InterfaceC8560o.b(this.f27758d, null);
                InterfaceC8558m interfaceC8558m = this.f27759e;
                this.f27755a = bVar2;
                this.f27756b = 2;
                if (interfaceC8558m.a(bVar2, this) == objG) {
                    return objG;
                }
                bVar = bVar2;
                this.f27757c.f27723A = bVar;
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1035a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r rVar, long j10, InterfaceC8558m interfaceC8558m, a aVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27751d = rVar;
            this.f27752e = j10;
            this.f27753f = interfaceC8558m;
            this.f27754g = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            e eVar = new e(this.f27751d, this.f27752e, this.f27753f, this.f27754g, interfaceC5380e);
            eVar.f27750c = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27760a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8560o.b f27762c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC8560o.b bVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27762c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new f(this.f27762c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27760a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8558m interfaceC8558m = a.this.f27730p;
                if (interfaceC8558m != null) {
                    InterfaceC8560o.b bVar = this.f27762c;
                    this.f27760a = 1;
                    if (interfaceC8558m.a(bVar, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27763a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8560o.b f27765c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC8560o.b bVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27765c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new g(this.f27765c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27763a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8558m interfaceC8558m = a.this.f27730p;
                if (interfaceC8558m != null) {
                    InterfaceC8560o.c cVar = new InterfaceC8560o.c(this.f27765c);
                    this.f27763a = 1;
                    if (interfaceC8558m.a(cVar, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27766a;

        h(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new h(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f27766a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            a.this.T2();
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27768a;

        i(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new i(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f27768a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            a.this.U2();
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((i) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27770a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27771b;

        j(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            j jVar = a.this.new j(interfaceC5380e);
            jVar.f27771b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27770a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f27771b;
                a aVar = a.this;
                this.f27770a = 1;
                if (aVar.Q2(interfaceC8567G, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((j) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public /* synthetic */ a(InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8558m, interfaceC7836I, z10, str, gVar, interfaceC6824a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R2() {
        return androidx.compose.foundation.d.i(this) || AbstractC7850k.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2() {
        if (this.f27724B == null) {
            C8552g c8552g = new C8552g();
            InterfaceC8558m interfaceC8558m = this.f27730p;
            if (interfaceC8558m != null) {
                AbstractC3063k.d(d2(), null, null, new c(interfaceC8558m, c8552g, null), 3, null);
            }
            this.f27724B = c8552g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2() {
        C8552g c8552g = this.f27724B;
        if (c8552g != null) {
            C8553h c8553h = new C8553h(c8552g);
            InterfaceC8558m interfaceC8558m = this.f27730p;
            if (interfaceC8558m != null) {
                AbstractC3063k.d(d2(), null, null, new d(interfaceC8558m, c8553h, null), 3, null);
            }
            this.f27724B = null;
        }
    }

    private final void Y2() {
        InterfaceC7836I interfaceC7836I;
        if (this.f27740z == null && (interfaceC7836I = this.f27731q) != null) {
            if (this.f27730p == null) {
                this.f27730p = AbstractC8557l.a();
            }
            this.f27738x.J2(this.f27730p);
            InterfaceC8558m interfaceC8558m = this.f27730p;
            AbstractC6492s.f(interfaceC8558m);
            InterfaceC2632j interfaceC2632jA = interfaceC7836I.a(interfaceC8558m);
            D2(interfaceC2632jA);
            this.f27740z = interfaceC2632jA;
        }
    }

    private final boolean a3() {
        return this.f27727E == null && this.f27731q != null;
    }

    @Override // E0.s0
    public final void C0() {
        C8552g c8552g;
        InterfaceC8558m interfaceC8558m = this.f27730p;
        if (interfaceC8558m != null && (c8552g = this.f27724B) != null) {
            interfaceC8558m.c(new C8553h(c8552g));
        }
        this.f27724B = null;
        InterfaceC8578S interfaceC8578S = this.f27739y;
        if (interfaceC8578S != null) {
            interfaceC8578S.C0();
        }
    }

    @Override // k0.InterfaceC6354b
    public final void J1(k0.l lVar) {
        if (lVar.isFocused()) {
            Y2();
        }
        if (this.f27734t) {
            this.f27738x.J1(lVar);
        }
    }

    public void P2(w wVar) {
    }

    @Override // w0.InterfaceC8251e
    public final boolean Q(KeyEvent keyEvent) {
        return false;
    }

    public abstract Object Q2(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e);

    @Override // E0.v0
    public final boolean S1() {
        return true;
    }

    protected final void S2() {
        InterfaceC8558m interfaceC8558m = this.f27730p;
        if (interfaceC8558m != null) {
            InterfaceC8560o.b bVar = this.f27723A;
            if (bVar != null) {
                interfaceC8558m.c(new InterfaceC8560o.a(bVar));
            }
            C8552g c8552g = this.f27724B;
            if (c8552g != null) {
                interfaceC8558m.c(new C8553h(c8552g));
            }
            Iterator it = this.f27725C.values().iterator();
            while (it.hasNext()) {
                interfaceC8558m.c(new InterfaceC8560o.a((InterfaceC8560o.b) it.next()));
            }
        }
        this.f27723A = null;
        this.f27724B = null;
        this.f27725C.clear();
    }

    protected final boolean V2() {
        return this.f27734t;
    }

    @Override // E0.A0
    public Object W() {
        return this.f27729G;
    }

    protected final InterfaceC6824a W2() {
        return this.f27735u;
    }

    protected final Object X2(r rVar, long j10, InterfaceC5380e interfaceC5380e) {
        Object objG;
        InterfaceC8558m interfaceC8558m = this.f27730p;
        return (interfaceC8558m == null || (objG = O.g(new e(rVar, j10, interfaceC8558m, this, null), interfaceC5380e)) != AbstractC5467b.g()) ? J.f24997a : objG;
    }

    protected final J Z2() {
        InterfaceC8578S interfaceC8578S = this.f27739y;
        if (interfaceC8578S == null) {
            return null;
        }
        interfaceC8578S.Z1();
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void b3(y.InterfaceC8558m r3, s.InterfaceC7836I r4, boolean r5, java.lang.String r6, J0.g r7, mh.InterfaceC6824a r8) {
        /*
            r2 = this;
            y.m r0 = r2.f27727E
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.S2()
            r2.f27727E = r3
            r2.f27730p = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            s.I r0 = r2.f27731q
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r4)
            if (r0 != 0) goto L1e
            r2.f27731q = r4
            r3 = r1
        L1e:
            boolean r4 = r2.f27734t
            if (r4 == r5) goto L41
            if (r5 == 0) goto L2f
            s.x r4 = r2.f27737w
            r2.D2(r4)
            s.z r4 = r2.f27738x
            r2.D2(r4)
            goto L3c
        L2f:
            s.x r4 = r2.f27737w
            r2.G2(r4)
            s.z r4 = r2.f27738x
            r2.G2(r4)
            r2.S2()
        L3c:
            E0.w0.b(r2)
            r2.f27734t = r5
        L41:
            java.lang.String r4 = r2.f27732r
            boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r6)
            if (r4 != 0) goto L4e
            r2.f27732r = r6
            E0.w0.b(r2)
        L4e:
            J0.g r4 = r2.f27733s
            boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r7)
            if (r4 != 0) goto L5b
            r2.f27733s = r7
            E0.w0.b(r2)
        L5b:
            r2.f27735u = r8
            boolean r4 = r2.f27728F
            boolean r5 = r2.a3()
            if (r4 == r5) goto L72
            boolean r4 = r2.a3()
            r2.f27728F = r4
            if (r4 != 0) goto L72
            E0.j r4 = r2.f27740z
            if (r4 != 0) goto L72
            goto L73
        L72:
            r1 = r3
        L73:
            if (r1 == 0) goto L88
            E0.j r3 = r2.f27740z
            if (r3 != 0) goto L7d
            boolean r4 = r2.f27728F
            if (r4 != 0) goto L88
        L7d:
            if (r3 == 0) goto L82
            r2.G2(r3)
        L82:
            r3 = 0
            r2.f27740z = r3
            r2.Y2()
        L88:
            s.z r3 = r2.f27738x
            y.m r4 = r2.f27730p
            r3.J2(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.b3(y.m, s.I, boolean, java.lang.String, J0.g, mh.a):void");
    }

    @Override // androidx.compose.ui.e.c
    public final boolean i2() {
        return this.f27736v;
    }

    @Override // androidx.compose.ui.e.c
    public final void n2() {
        if (!this.f27728F) {
            Y2();
        }
        if (this.f27734t) {
            D2(this.f27737w);
            D2(this.f27738x);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void o2() {
        S2();
        if (this.f27727E == null) {
            this.f27730p = null;
        }
        InterfaceC2632j interfaceC2632j = this.f27740z;
        if (interfaceC2632j != null) {
            G2(interfaceC2632j);
        }
        this.f27740z = null;
    }

    @Override // E0.v0
    public final void q(w wVar) {
        J0.g gVar = this.f27733s;
        if (gVar != null) {
            AbstractC6492s.f(gVar);
            t.i0(wVar, gVar.n());
        }
        t.z(wVar, this.f27732r, new b());
        if (this.f27734t) {
            this.f27738x.q(wVar);
        } else {
            t.l(wVar);
        }
        P2(wVar);
    }

    @Override // w0.InterfaceC8251e
    public final boolean r0(KeyEvent keyEvent) {
        Y2();
        if (this.f27734t && AbstractC7850k.f(keyEvent)) {
            if (this.f27725C.containsKey(C8247a.m(AbstractC8250d.a(keyEvent)))) {
                return false;
            }
            InterfaceC8560o.b bVar = new InterfaceC8560o.b(this.f27726D, null);
            this.f27725C.put(C8247a.m(AbstractC8250d.a(keyEvent)), bVar);
            if (this.f27730p != null) {
                AbstractC3063k.d(d2(), null, null, new f(bVar, null), 3, null);
            }
        } else {
            if (!this.f27734t || !AbstractC7850k.b(keyEvent)) {
                return false;
            }
            InterfaceC8560o.b bVar2 = (InterfaceC8560o.b) this.f27725C.remove(C8247a.m(AbstractC8250d.a(keyEvent)));
            if (bVar2 != null && this.f27730p != null) {
                AbstractC3063k.d(d2(), null, null, new g(bVar2, null), 3, null);
            }
            this.f27735u.invoke();
        }
        return true;
    }

    @Override // E0.s0
    public final void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        long jB = s.b(j10);
        this.f27726D = AbstractC6532h.a(Y0.n.h(jB), Y0.n.i(jB));
        Y2();
        if (this.f27734t && enumC8595p == EnumC8595p.Main) {
            int iF = c8593n.f();
            AbstractC8596q.a aVar = AbstractC8596q.f66307a;
            if (AbstractC8596q.i(iF, aVar.a())) {
                AbstractC3063k.d(d2(), null, null, new h(null), 3, null);
            } else if (AbstractC8596q.i(iF, aVar.b())) {
                AbstractC3063k.d(d2(), null, null, new i(null), 3, null);
            }
        }
        if (this.f27739y == null) {
            this.f27739y = (InterfaceC8578S) D2(AbstractC8576P.a(new j(null)));
        }
        InterfaceC8578S interfaceC8578S = this.f27739y;
        if (interfaceC8578S != null) {
            interfaceC8578S.s0(c8593n, enumC8595p, j10);
        }
    }

    private a(InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
        this.f27730p = interfaceC8558m;
        this.f27731q = interfaceC7836I;
        this.f27732r = str;
        this.f27733s = gVar;
        this.f27734t = z10;
        this.f27735u = interfaceC6824a;
        this.f27737w = new C7862x();
        this.f27738x = new C7864z(this.f27730p);
        this.f27725C = new LinkedHashMap();
        this.f27726D = C6531g.f52335b.c();
        this.f27727E = this.f27730p;
        this.f27728F = a3();
        this.f27729G = f27721H;
    }
}
