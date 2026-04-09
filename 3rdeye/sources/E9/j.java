package E9;

import A9.C0599r0;
import A9.E;
import C9.u;
import D9.C;
import D9.InterfaceC0645g;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: Combine.kt */
@h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public C0599r0 f1521l;

    /* renamed from: m, reason: collision with root package name */
    public int f1522m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f1523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f1524o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C f1525p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0645g<Object> f1526q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PHSplashActivity.b.a.C0433a f1527r;

    /* compiled from: Combine.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Throwable, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C0599r0 f1528g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0599r0 c0599r0) {
            super(1);
            this.f1528g = c0599r0;
        }

        @Override // p9.l
        public final C1992A invoke(Throwable th) {
            C0599r0 c0599r0 = this.f1528g;
            if (c0599r0.isActive()) {
                c0599r0.v(new E9.a(c0599r0));
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: Combine.kt */
    @h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<C1992A, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f1529l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C f1530m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4350h f1531n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f1532o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C9.t f1533p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0645g<Object> f1534q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ PHSplashActivity.b.a.C0433a f1535r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C0599r0 f1536s;

        /* compiled from: Combine.kt */
        public static final class a<T> implements InterfaceC0645g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4350h f1537b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f1538c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C9.t f1539d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0645g<Object> f1540e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ PHSplashActivity.b.a.C0433a f1541f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ C0599r0 f1542g;

            /* compiled from: Combine.kt */
            @h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {126, 129, 129}, m = "invokeSuspend")
            /* renamed from: E9.j$b$a$a, reason: collision with other inner class name */
            public static final class C0022a extends h9.i implements p9.p<C1992A, InterfaceC4347e<? super C1992A>, Object> {

                /* renamed from: l, reason: collision with root package name */
                public InterfaceC0645g f1543l;

                /* renamed from: m, reason: collision with root package name */
                public int f1544m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ C9.t f1545n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0645g<Object> f1546o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ PHSplashActivity.b.a.C0433a f1547p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ Object f1548q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C0599r0 f1549r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0022a(C9.t tVar, InterfaceC0645g interfaceC0645g, PHSplashActivity.b.a.C0433a c0433a, Object obj, C0599r0 c0599r0, InterfaceC4347e interfaceC4347e) {
                    super(2, interfaceC4347e);
                    this.f1545n = tVar;
                    this.f1546o = interfaceC0645g;
                    this.f1547p = c0433a;
                    this.f1548q = obj;
                    this.f1549r = c0599r0;
                }

                @Override // h9.AbstractC4424a
                public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                    C0599r0 c0599r0 = this.f1549r;
                    return new C0022a(this.f1545n, this.f1546o, this.f1547p, this.f1548q, c0599r0, interfaceC4347e);
                }

                @Override // p9.p
                public final Object invoke(C1992A c1992a, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                    return ((C0022a) create(c1992a, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
                
                    if (r1.emit(r7, r6) != r0) goto L35;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // h9.AbstractC4424a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        g9.a r0 = g9.a.COROUTINE_SUSPENDED
                        int r1 = r6.f1544m
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L2a
                        if (r1 == r5) goto L22
                        if (r1 == r4) goto L1c
                        if (r1 != r3) goto L14
                        b9.n.b(r7)
                        goto L75
                    L14:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1c:
                        D9.g r1 = r6.f1543l
                        b9.n.b(r7)
                        goto L6a
                    L22:
                        b9.n.b(r7)
                        C9.k r7 = (C9.k) r7
                        java.lang.Object r7 = r7.f1005a
                        goto L38
                    L2a:
                        b9.n.b(r7)
                        r6.f1544m = r5
                        C9.t r7 = r6.f1545n
                        java.lang.Object r7 = r7.f(r6)
                        if (r7 != r0) goto L38
                        goto L74
                    L38:
                        boolean r1 = r7 instanceof C9.k.b
                        if (r1 == 0) goto L54
                        C9.k$b r7 = (C9.k.b) r7
                        boolean r0 = r7 instanceof C9.k.a
                        if (r0 == 0) goto L45
                        C9.k$a r7 = (C9.k.a) r7
                        goto L46
                    L45:
                        r7 = r2
                    L46:
                        if (r7 == 0) goto L4a
                        java.lang.Throwable r2 = r7.f1006a
                    L4a:
                        if (r2 != 0) goto L53
                        E9.a r2 = new E9.a
                        A9.r0 r7 = r6.f1549r
                        r2.<init>(r7)
                    L53:
                        throw r2
                    L54:
                        F9.y r1 = E9.c.f1489b
                        if (r7 != r1) goto L59
                        r7 = r2
                    L59:
                        D9.g<java.lang.Object> r1 = r6.f1546o
                        r6.f1543l = r1
                        r6.f1544m = r4
                        com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$b$a$a r4 = r6.f1547p
                        java.lang.Object r5 = r6.f1548q
                        java.lang.Object r7 = r4.invoke(r5, r7, r6)
                        if (r7 != r0) goto L6a
                        goto L74
                    L6a:
                        r6.f1543l = r2
                        r6.f1544m = r3
                        java.lang.Object r7 = r1.emit(r7, r6)
                        if (r7 != r0) goto L75
                    L74:
                        return r0
                    L75:
                        b9.A r7 = b9.C1992A.f18074a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: E9.j.b.a.C0022a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* compiled from: Combine.kt */
            @h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", l = {125}, m = "emit")
            /* renamed from: E9.j$b$a$b, reason: collision with other inner class name */
            public static final class C0023b extends h9.c {

                /* renamed from: l, reason: collision with root package name */
                public /* synthetic */ Object f1550l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ a<T> f1551m;

                /* renamed from: n, reason: collision with root package name */
                public int f1552n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0023b(a<? super T> aVar, InterfaceC4347e<? super C0023b> interfaceC4347e) {
                    super(interfaceC4347e);
                    this.f1551m = aVar;
                }

                @Override // h9.AbstractC4424a
                public final Object invokeSuspend(Object obj) {
                    this.f1550l = obj;
                    this.f1552n |= RecyclerView.UNDEFINED_DURATION;
                    return this.f1551m.emit(null, this);
                }
            }

            public a(InterfaceC4350h interfaceC4350h, Object obj, C9.t tVar, InterfaceC0645g interfaceC0645g, PHSplashActivity.b.a.C0433a c0433a, C0599r0 c0599r0) {
                this.f1537b = interfaceC4350h;
                this.f1538c = obj;
                this.f1539d = tVar;
                this.f1540e = interfaceC0645g;
                this.f1541f = c0433a;
                this.f1542g = c0599r0;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // D9.InterfaceC0645g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r12, f9.InterfaceC4347e<? super b9.C1992A> r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof E9.j.b.a.C0023b
                    if (r0 == 0) goto L13
                    r0 = r13
                    E9.j$b$a$b r0 = (E9.j.b.a.C0023b) r0
                    int r1 = r0.f1552n
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1552n = r1
                    goto L18
                L13:
                    E9.j$b$a$b r0 = new E9.j$b$a$b
                    r0.<init>(r11, r13)
                L18:
                    java.lang.Object r13 = r0.f1550l
                    g9.a r1 = g9.a.COROUTINE_SUSPENDED
                    int r2 = r0.f1552n
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    b9.n.b(r13)
                    goto L50
                L27:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L2f:
                    b9.n.b(r13)
                    b9.A r13 = b9.C1992A.f18074a
                    E9.j$b$a$a r4 = new E9.j$b$a$a
                    A9.r0 r9 = r11.f1542g
                    C9.t r5 = r11.f1539d
                    com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$b$a$a r7 = r11.f1541f
                    D9.g<java.lang.Object> r6 = r11.f1540e
                    r10 = 0
                    r8 = r12
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    r0.f1552n = r3
                    f9.h r12 = r11.f1537b
                    java.lang.Object r2 = r11.f1538c
                    java.lang.Object r12 = A2.l.I(r12, r13, r2, r4, r0)
                    if (r12 != r1) goto L50
                    return r1
                L50:
                    b9.A r12 = b9.C1992A.f18074a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: E9.j.b.a.emit(java.lang.Object, f9.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C c10, InterfaceC4350h interfaceC4350h, Object obj, C9.t tVar, InterfaceC0645g interfaceC0645g, PHSplashActivity.b.a.C0433a c0433a, C0599r0 c0599r0, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f1530m = c10;
            this.f1531n = interfaceC4350h;
            this.f1532o = obj;
            this.f1533p = tVar;
            this.f1534q = interfaceC0645g;
            this.f1535r = c0433a;
            this.f1536s = c0599r0;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f1530m, this.f1531n, this.f1532o, this.f1533p, this.f1534q, this.f1535r, this.f1536s, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(C1992A c1992a, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((b) create(c1992a, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f1529l;
            if (i == 0) {
                b9.n.b(obj);
                a aVar2 = new a(this.f1531n, this.f1532o, this.f1533p, this.f1534q, this.f1535r, this.f1536s);
                this.f1529l = 1;
                C c10 = this.f1530m;
                c10.getClass();
                if (C.i(c10, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: Combine.kt */
    @h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {86}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<u<? super Object>, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f1553l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f1554m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C f1555n;

        /* compiled from: Combine.kt */
        public static final class a<T> implements InterfaceC0645g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u<Object> f1556b;

            /* compiled from: Combine.kt */
            @h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", l = {87}, m = "emit")
            /* renamed from: E9.j$c$a$a, reason: collision with other inner class name */
            public static final class C0024a extends h9.c {

                /* renamed from: l, reason: collision with root package name */
                public /* synthetic */ Object f1557l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ a<T> f1558m;

                /* renamed from: n, reason: collision with root package name */
                public int f1559n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0024a(a<? super T> aVar, InterfaceC4347e<? super C0024a> interfaceC4347e) {
                    super(interfaceC4347e);
                    this.f1558m = aVar;
                }

                @Override // h9.AbstractC4424a
                public final Object invokeSuspend(Object obj) {
                    this.f1557l = obj;
                    this.f1559n |= RecyclerView.UNDEFINED_DURATION;
                    return this.f1558m.emit(null, this);
                }
            }

            public a(u<Object> uVar) {
                this.f1556b = uVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // D9.InterfaceC0645g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, f9.InterfaceC4347e<? super b9.C1992A> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof E9.j.c.a.C0024a
                    if (r0 == 0) goto L13
                    r0 = r6
                    E9.j$c$a$a r0 = (E9.j.c.a.C0024a) r0
                    int r1 = r0.f1559n
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1559n = r1
                    goto L18
                L13:
                    E9.j$c$a$a r0 = new E9.j$c$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f1557l
                    g9.a r1 = g9.a.COROUTINE_SUSPENDED
                    int r2 = r0.f1559n
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    b9.n.b(r6)
                    goto L47
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    b9.n.b(r6)
                    C9.u<java.lang.Object> r6 = r4.f1556b
                    C9.t r6 = r6.B()
                    if (r5 != 0) goto L3c
                    F9.y r5 = E9.c.f1489b
                L3c:
                    r0.f1559n = r3
                    C9.b r6 = r6.f1003e
                    java.lang.Object r5 = r6.m(r0, r5)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    b9.A r5 = b9.C1992A.f18074a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: E9.j.c.a.emit(java.lang.Object, f9.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C c10, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f1555n = c10;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            c cVar = new c(this.f1555n, interfaceC4347e);
            cVar.f1554m = obj;
            return cVar;
        }

        @Override // p9.p
        public final Object invoke(u<? super Object> uVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((c) create(uVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f1553l;
            if (i == 0) {
                b9.n.b(obj);
                a aVar2 = new a((u) this.f1554m);
                this.f1553l = 1;
                C c10 = this.f1555n;
                c10.getClass();
                if (C.i(c10, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C c10, C c11, InterfaceC0645g interfaceC0645g, PHSplashActivity.b.a.C0433a c0433a, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1524o = c10;
        this.f1525p = c11;
        this.f1526q = interfaceC0645g;
        this.f1527r = c0433a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        j jVar = new j(this.f1524o, this.f1525p, this.f1526q, this.f1527r, interfaceC4347e);
        jVar.f1523n = obj;
        return jVar;
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((j) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0017, blocks: (B:6:0x0013, B:31:0x009b, B:36:0x00a3), top: B:41:0x0013 }] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r1 = r18
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r2 = r1.f1522m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L25
            if (r2 != r4) goto L1d
            A9.r0 r2 = r1.f1521l
            java.lang.Object r0 = r1.f1523n
            r4 = r0
            C9.w r4 = (C9.w) r4
            b9.n.b(r19)     // Catch: java.lang.Throwable -> L17 E9.a -> L1a
            goto L8a
        L17:
            r0 = move-exception
            goto La4
        L1a:
            r0 = move-exception
            goto L9b
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L25:
            b9.n.b(r19)
            java.lang.Object r2 = r1.f1523n
            A9.E r2 = (A9.E) r2
            E9.j$c r5 = new E9.j$c
            D9.C r6 = r1.f1524o
            r5.<init>(r6, r3)
            f9.i r6 = f9.C4351i.f37871b
            C9.a r7 = C9.a.SUSPEND
            A9.G r8 = A9.G.DEFAULT
            r9 = 4
            r10 = 0
            C9.b r7 = C9.j.a(r10, r9, r7)
            f9.h r6 = A9.C0609x.b(r2, r6)
            C9.t r13 = new C9.t
            r13.<init>(r6, r7)
            r8.invoke(r5, r13, r13)
            A9.r0 r5 = A9.C0572d0.a()
            E9.j$a r6 = new E9.j$a
            r6.<init>(r5)
            r13.b(r6)
            f9.h r11 = r2.k0()     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            java.lang.Object r12 = F9.A.b(r11)     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            f9.h r2 = r2.k0()     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            f9.h r2 = r2.plus(r5)     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            b9.A r6 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            E9.j$b r9 = new E9.j$b     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            D9.C r10 = r1.f1525p     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            D9.g<java.lang.Object> r14 = r1.f1526q     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$b$a$a r15 = r1.f1527r     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            r17 = 0
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L93 E9.a -> L97
            r1.f1523n = r13     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            r1.f1521l = r5     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            r1.f1522m = r4     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            java.lang.Object r4 = F9.A.b(r2)     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            java.lang.Object r2 = A2.l.I(r2, r6, r4, r9, r1)     // Catch: java.lang.Throwable -> L93 E9.a -> L95
            if (r2 != r0) goto L89
            return r0
        L89:
            r4 = r13
        L8a:
            r4.c(r3)
            goto La0
        L8e:
            r4 = r13
            goto La4
        L90:
            r2 = r5
            r4 = r13
            goto L9b
        L93:
            r0 = move-exception
            goto L8e
        L95:
            r0 = move-exception
            goto L90
        L97:
            r0 = move-exception
            r5 = r16
            goto L90
        L9b:
            java.lang.Object r5 = r0.f1484b     // Catch: java.lang.Throwable -> L17
            if (r5 != r2) goto La3
            goto L8a
        La0:
            b9.A r0 = b9.C1992A.f18074a
            return r0
        La3:
            throw r0     // Catch: java.lang.Throwable -> L17
        La4:
            r4.c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E9.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
