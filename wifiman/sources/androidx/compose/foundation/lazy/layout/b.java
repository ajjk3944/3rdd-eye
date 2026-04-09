package androidx.compose.foundation.lazy.layout;

import Ii.AbstractC3063k;
import Ii.N;
import T.InterfaceC3551q0;
import T.t1;
import Y0.n;
import Y0.o;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6486l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.InterfaceC6671H0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;
import p0.C7182c;
import r.C7517a;
import r.H;
import r.u0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: s, reason: collision with root package name */
    public static final a f28264s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f28265t = 8;

    /* renamed from: u, reason: collision with root package name */
    private static final long f28266u = o.a(MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID);

    /* renamed from: a, reason: collision with root package name */
    private final N f28267a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6671H0 f28268b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6824a f28269c;

    /* renamed from: d, reason: collision with root package name */
    private H f28270d;

    /* renamed from: e, reason: collision with root package name */
    private H f28271e;

    /* renamed from: f, reason: collision with root package name */
    private H f28272f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28273g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3551q0 f28274h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3551q0 f28275i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3551q0 f28276j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3551q0 f28277k;

    /* renamed from: l, reason: collision with root package name */
    private long f28278l;

    /* renamed from: m, reason: collision with root package name */
    private long f28279m;

    /* renamed from: n, reason: collision with root package name */
    private C7182c f28280n;

    /* renamed from: o, reason: collision with root package name */
    private final C7517a f28281o;

    /* renamed from: p, reason: collision with root package name */
    private final C7517a f28282p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3551q0 f28283q;

    /* renamed from: r, reason: collision with root package name */
    private long f28284r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f28266u;
        }

        private a() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.b$b, reason: collision with other inner class name */
    static final class C1049b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28285a;

        C1049b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new C1049b(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28285a;
            if (i10 == 0) {
                v.b(obj);
                C7517a c7517a = b.this.f28282p;
                Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                this.f28285a = 1;
                if (c7517a.t(fC, this) == objG) {
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
            return ((C1049b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28287a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28288b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f28289c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ H f28290d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7182c f28291e;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7182c f28292a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f28293b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7182c c7182c, b bVar) {
                super(1);
                this.f28292a = c7182c;
                this.f28293b = bVar;
            }

            public final void a(C7517a c7517a) {
                this.f28292a.J(((Number) c7517a.m()).floatValue());
                this.f28293b.f28269c.invoke();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C7517a) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, b bVar, H h10, C7182c c7182c, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f28288b = z10;
            this.f28289c = bVar;
            this.f28290d = h10;
            this.f28291e = c7182c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f28288b, this.f28289c, this.f28290d, this.f28291e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28287a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    if (this.f28288b) {
                        C7517a c7517a = this.f28289c.f28282p;
                        Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                        this.f28287a = 1;
                        if (c7517a.t(fC, this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                        this.f28289c.z(false);
                        return J.f24997a;
                    }
                    v.b(obj);
                }
                C7517a c7517a2 = this.f28289c.f28282p;
                Float fC2 = kotlin.coroutines.jvm.internal.b.c(1.0f);
                H h10 = this.f28290d;
                a aVar = new a(this.f28291e, this.f28289c);
                this.f28287a = 2;
                if (C7517a.f(c7517a2, fC2, h10, null, aVar, this, 4, null) == objG) {
                    return objG;
                }
                this.f28289c.z(false);
                return J.f24997a;
            } catch (Throwable th2) {
                this.f28289c.z(false);
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28294a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f28296c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7182c f28297d;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7182c f28298a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f28299b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7182c c7182c, b bVar) {
                super(1);
                this.f28298a = c7182c;
                this.f28299b = bVar;
            }

            public final void a(C7517a c7517a) {
                this.f28298a.J(((Number) c7517a.m()).floatValue());
                this.f28299b.f28269c.invoke();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C7517a) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H h10, C7182c c7182c, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f28296c = h10;
            this.f28297d = c7182c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new d(this.f28296c, this.f28297d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28294a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    C7517a c7517a = b.this.f28282p;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                    H h10 = this.f28296c;
                    a aVar = new a(this.f28297d, b.this);
                    this.f28294a = 1;
                    if (C7517a.f(c7517a, fC, h10, null, aVar, this, 4, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                b.this.A(true);
                b.this.B(false);
                return J.f24997a;
            } catch (Throwable th2) {
                b.this.B(false);
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f28300a;

        /* renamed from: b, reason: collision with root package name */
        int f28301b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ H f28303d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f28304e;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f28305a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f28306b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, long j10) {
                super(1);
                this.f28305a = bVar;
                this.f28306b = j10;
            }

            public final void a(C7517a c7517a) {
                this.f28305a.H(n.k(((n) c7517a.m()).n(), this.f28306b));
                this.f28305a.f28269c.invoke();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C7517a) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(H h10, long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f28303d = h10;
            this.f28304e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new e(this.f28303d, this.f28304e, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r11.f28301b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                Yg.v.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                goto Laa
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                java.lang.Object r1 = r11.f28300a
                r.H r1 = (r.H) r1
                Yg.v.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                goto L67
            L23:
                Yg.v.b(r12)
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r12 == 0) goto L41
                r.H r12 = r11.f28303d     // Catch: java.util.concurrent.CancellationException -> Lb5
                boolean r1 = r12 instanceof r.C7532h0     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r1 == 0) goto L3b
                r.h0 r12 = (r.C7532h0) r12     // Catch: java.util.concurrent.CancellationException -> Lb5
                goto L3f
            L3b:
                r.h0 r12 = B.AbstractC2452p.a()     // Catch: java.util.concurrent.CancellationException -> Lb5
            L3f:
                r1 = r12
                goto L44
            L41:
                r.H r12 = r11.f28303d     // Catch: java.util.concurrent.CancellationException -> Lb5
                goto L3f
            L44:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r12 != 0) goto L70
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                long r4 = r11.f28304e     // Catch: java.util.concurrent.CancellationException -> Lb5
                Y0.n r4 = Y0.n.b(r4)     // Catch: java.util.concurrent.CancellationException -> Lb5
                r11.f28300a = r1     // Catch: java.util.concurrent.CancellationException -> Lb5
                r11.f28301b = r3     // Catch: java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r12 = r12.t(r4, r11)     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r12 != r0) goto L67
                return r0
            L67:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                mh.a r12 = androidx.compose.foundation.lazy.layout.b.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> Lb5
            L70:
                r5 = r1
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r12 = r12.m()     // Catch: java.util.concurrent.CancellationException -> Lb5
                Y0.n r12 = (Y0.n) r12     // Catch: java.util.concurrent.CancellationException -> Lb5
                long r3 = r12.n()     // Catch: java.util.concurrent.CancellationException -> Lb5
                long r6 = r11.f28304e     // Catch: java.util.concurrent.CancellationException -> Lb5
                long r3 = Y0.n.k(r3, r6)     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                Y0.n r1 = Y0.n.b(r3)     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b$e$a r7 = new androidx.compose.foundation.lazy.layout.b$e$a     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b r6 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r7.<init>(r6, r3)     // Catch: java.util.concurrent.CancellationException -> Lb5
                r3 = 0
                r11.f28300a = r3     // Catch: java.util.concurrent.CancellationException -> Lb5
                r11.f28301b = r2     // Catch: java.util.concurrent.CancellationException -> Lb5
                r6 = 0
                r9 = 4
                r10 = 0
                r3 = r12
                r4 = r1
                r8 = r11
                java.lang.Object r12 = r.C7517a.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r12 != r0) goto Laa
                return r0
            Laa:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r0 = 0
                androidx.compose.foundation.lazy.layout.b.h(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b.j(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lb5
            Lb5:
                Yg.J r12 = Yg.J.f24997a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class f extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28307a;

        f(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new f(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28307a;
            if (i10 == 0) {
                v.b(obj);
                C7517a c7517a = b.this.f28281o;
                n nVarB = n.b(n.f24536b.a());
                this.f28307a = 1;
                if (c7517a.t(nVarB, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            b.this.H(n.f24536b.a());
            b.this.G(false);
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class g extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28309a;

        g(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new g(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28309a;
            if (i10 == 0) {
                v.b(obj);
                C7517a c7517a = b.this.f28281o;
                this.f28309a = 1;
                if (c7517a.u(this) == objG) {
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
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class h extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28311a;

        h(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new h(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28311a;
            if (i10 == 0) {
                v.b(obj);
                C7517a c7517a = b.this.f28282p;
                this.f28311a = 1;
                if (c7517a.u(this) == objG) {
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
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class i extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28313a;

        i(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new i(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28313a;
            if (i10 == 0) {
                v.b(obj);
                C7517a c7517a = b.this.f28282p;
                this.f28313a = 1;
                if (c7517a.u(this) == objG) {
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
            return ((i) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public b(N n10, InterfaceC6671H0 interfaceC6671H0, InterfaceC6824a interfaceC6824a) {
        this.f28267a = n10;
        this.f28268b = interfaceC6671H0;
        this.f28269c = interfaceC6824a;
        Boolean bool = Boolean.FALSE;
        this.f28274h = t1.d(bool, null, 2, null);
        this.f28275i = t1.d(bool, null, 2, null);
        this.f28276j = t1.d(bool, null, 2, null);
        this.f28277k = t1.d(bool, null, 2, null);
        long j10 = f28266u;
        this.f28278l = j10;
        n.a aVar = n.f24536b;
        this.f28279m = aVar.a();
        this.f28280n = interfaceC6671H0 != null ? interfaceC6671H0.b() : null;
        this.f28281o = new C7517a(n.b(aVar.a()), u0.d(aVar), null, null, 12, null);
        this.f28282p = new C7517a(Float.valueOf(1.0f), u0.f(C6486l.f51726a), null, null, 12, null);
        this.f28283q = t1.d(n.b(aVar.a()), null, 2, null);
        this.f28284r = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z10) {
        this.f28277k.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(boolean z10) {
        this.f28276j.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean z10) {
        this.f28274h.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j10) {
        this.f28283q.setValue(n.b(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z10) {
        this.f28275i.setValue(Boolean.valueOf(z10));
    }

    public final void C(H h10) {
        this.f28270d = h10;
    }

    public final void D(H h10) {
        this.f28272f = h10;
    }

    public final void E(long j10) {
        this.f28279m = j10;
    }

    public final void F(long j10) {
        this.f28284r = j10;
    }

    public final void I(H h10) {
        this.f28271e = h10;
    }

    public final void J(long j10) {
        this.f28278l = j10;
    }

    public final void k() {
        C7182c c7182c = this.f28280n;
        H h10 = this.f28270d;
        if (t() || h10 == null || c7182c == null) {
            if (v()) {
                if (c7182c != null) {
                    c7182c.J(1.0f);
                }
                AbstractC3063k.d(this.f28267a, null, null, new C1049b(null), 3, null);
                return;
            }
            return;
        }
        z(true);
        boolean zV = v();
        boolean z10 = !zV;
        if (!zV) {
            c7182c.J(0.0f);
        }
        AbstractC3063k.d(this.f28267a, null, null, new c(z10, this, h10, c7182c, null), 3, null);
    }

    public final void l() {
        C7182c c7182c = this.f28280n;
        H h10 = this.f28272f;
        if (c7182c == null || v() || h10 == null) {
            return;
        }
        B(true);
        AbstractC3063k.d(this.f28267a, null, null, new d(h10, c7182c, null), 3, null);
    }

    public final void m(long j10, boolean z10) {
        H h10 = this.f28271e;
        if (h10 == null) {
            return;
        }
        long jK = n.k(r(), j10);
        H(jK);
        G(true);
        this.f28273g = z10;
        AbstractC3063k.d(this.f28267a, null, null, new e(h10, jK, null), 3, null);
    }

    public final void n() {
        if (w()) {
            AbstractC3063k.d(this.f28267a, null, null, new f(null), 3, null);
        }
    }

    public final long o() {
        return this.f28279m;
    }

    public final C7182c p() {
        return this.f28280n;
    }

    public final long q() {
        return this.f28284r;
    }

    public final long r() {
        return ((n) this.f28283q.getValue()).n();
    }

    public final long s() {
        return this.f28278l;
    }

    public final boolean t() {
        return ((Boolean) this.f28275i.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.f28277k.getValue()).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) this.f28276j.getValue()).booleanValue();
    }

    public final boolean w() {
        return ((Boolean) this.f28274h.getValue()).booleanValue();
    }

    public final boolean x() {
        return this.f28273g;
    }

    public final void y() {
        InterfaceC6671H0 interfaceC6671H0;
        if (w()) {
            G(false);
            AbstractC3063k.d(this.f28267a, null, null, new g(null), 3, null);
        }
        if (t()) {
            z(false);
            AbstractC3063k.d(this.f28267a, null, null, new h(null), 3, null);
        }
        if (v()) {
            B(false);
            AbstractC3063k.d(this.f28267a, null, null, new i(null), 3, null);
        }
        this.f28273g = false;
        H(n.f24536b.a());
        this.f28278l = f28266u;
        C7182c c7182c = this.f28280n;
        if (c7182c != null && (interfaceC6671H0 = this.f28268b) != null) {
            interfaceC6671H0.a(c7182c);
        }
        this.f28280n = null;
        this.f28270d = null;
        this.f28272f = null;
        this.f28271e = null;
    }
}
