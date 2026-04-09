package androidx.compose.foundation.gestures;

import E0.AbstractC2631i;
import E0.AbstractC2635m;
import E0.InterfaceC2630h;
import E0.s0;
import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import Ki.g;
import Ki.j;
import Ki.k;
import Y0.z;
import Yg.J;
import Yg.v;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.w1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;
import w.q;
import y.C8546a;
import y.C8547b;
import y.InterfaceC8558m;
import y0.AbstractC8576P;
import y0.C8593n;
import y0.C8604y;
import y0.EnumC8595p;
import y0.InterfaceC8567G;
import y0.InterfaceC8578S;
import z0.C8706d;

/* loaded from: classes.dex */
public abstract class b extends AbstractC2635m implements s0, InterfaceC2630h {

    /* renamed from: p, reason: collision with root package name */
    private q f27875p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC6835l f27876q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27877r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC8558m f27878s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC6835l f27879t = new a();

    /* renamed from: u, reason: collision with root package name */
    private g f27880u;

    /* renamed from: v, reason: collision with root package name */
    private C8547b f27881v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27882w;

    /* renamed from: x, reason: collision with root package name */
    private InterfaceC8578S f27883x;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C8604y c8604y) {
            return (Boolean) b.this.T2().invoke(c8604y);
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.b$b, reason: collision with other inner class name */
    static final class C1041b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27885a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27886b;

        /* renamed from: androidx.compose.foundation.gestures.b$b$a */
        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f27888a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f27889b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f27890c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f27891d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ mh.q f27892e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f27893f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f27894g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f27895h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f27896i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, InterfaceC8567G interfaceC8567G, mh.q qVar, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f27890c = bVar;
                this.f27891d = interfaceC8567G;
                this.f27892e = qVar;
                this.f27893f = interfaceC6835l;
                this.f27894g = interfaceC6824a;
                this.f27895h = interfaceC6824a2;
                this.f27896i = interfaceC6839p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f27890c, this.f27891d, this.f27892e, this.f27893f, this.f27894g, this.f27895h, this.f27896i, interfaceC5380e);
                aVar.f27889b = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r12.f27888a
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r12.f27889b
                    Ii.N r0 = (Ii.N) r0
                    Yg.v.b(r13)     // Catch: java.util.concurrent.CancellationException -> L13
                    goto L5d
                L13:
                    r13 = move-exception
                    goto L46
                L15:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1d:
                    Yg.v.b(r13)
                    java.lang.Object r13 = r12.f27889b
                    Ii.N r13 = (Ii.N) r13
                    androidx.compose.foundation.gestures.b r1 = r12.f27890c     // Catch: java.util.concurrent.CancellationException -> L42
                    w.q r8 = androidx.compose.foundation.gestures.b.K2(r1)     // Catch: java.util.concurrent.CancellationException -> L42
                    y0.G r3 = r12.f27891d     // Catch: java.util.concurrent.CancellationException -> L42
                    mh.q r4 = r12.f27892e     // Catch: java.util.concurrent.CancellationException -> L42
                    mh.l r5 = r12.f27893f     // Catch: java.util.concurrent.CancellationException -> L42
                    mh.a r6 = r12.f27894g     // Catch: java.util.concurrent.CancellationException -> L42
                    mh.a r7 = r12.f27895h     // Catch: java.util.concurrent.CancellationException -> L42
                    mh.p r9 = r12.f27896i     // Catch: java.util.concurrent.CancellationException -> L42
                    r12.f27889b = r13     // Catch: java.util.concurrent.CancellationException -> L42
                    r12.f27888a = r2     // Catch: java.util.concurrent.CancellationException -> L42
                    r10 = r12
                    java.lang.Object r13 = w.j.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L42
                    if (r13 != r0) goto L5d
                    return r0
                L42:
                    r0 = move-exception
                    r11 = r0
                    r0 = r13
                    r13 = r11
                L46:
                    androidx.compose.foundation.gestures.b r1 = r12.f27890c
                    Ki.g r1 = androidx.compose.foundation.gestures.b.J2(r1)
                    if (r1 == 0) goto L57
                    androidx.compose.foundation.gestures.a$a r2 = androidx.compose.foundation.gestures.a.C1040a.f27871a
                    java.lang.Object r1 = r1.k(r2)
                    Ki.k.b(r1)
                L57:
                    boolean r0 = Ii.O.i(r0)
                    if (r0 == 0) goto L60
                L5d:
                    Yg.J r13 = Yg.J.f24997a
                    return r13
                L60:
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.C1041b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$b, reason: collision with other inner class name */
        static final class C1042b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8706d f27897a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f27898b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1042b(C8706d c8706d, b bVar) {
                super(2);
                this.f27897a = c8706d;
                this.f27898b = bVar;
            }

            public final void a(C8604y c8604y, long j10) {
                z0.e.c(this.f27897a, c8604y);
                g gVar = this.f27898b.f27880u;
                if (gVar != null) {
                    k.b(gVar.k(new a.b(j10, null)));
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C8604y) obj, ((C6531g) obj2).v());
                return J.f24997a;
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$c */
        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f27899a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar) {
                super(0);
                this.f27899a = bVar;
            }

            public final void a() {
                g gVar = this.f27899a.f27880u;
                if (gVar != null) {
                    k.b(gVar.k(a.C1040a.f27871a));
                }
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$d */
        static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8706d f27900a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f27901b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C8706d c8706d, b bVar) {
                super(1);
                this.f27900a = c8706d;
                this.f27901b = bVar;
            }

            public final void a(C8604y c8604y) {
                z0.e.c(this.f27900a, c8604y);
                float f10 = ((w1) AbstractC2631i.a(this.f27901b, AbstractC3932k0.t())).f();
                long jB = this.f27900a.b(z.a(f10, f10));
                this.f27900a.e();
                g gVar = this.f27901b.f27880u;
                if (gVar != null) {
                    k.b(gVar.k(new a.d(w.l.l(jB), null)));
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C8604y) obj);
                return J.f24997a;
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$e */
        static final class e extends AbstractC6494u implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f27902a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C8706d f27903b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, C8706d c8706d) {
                super(3);
                this.f27902a = bVar;
                this.f27903b = c8706d;
            }

            public final void a(C8604y c8604y, C8604y c8604y2, long j10) {
                if (((Boolean) this.f27902a.T2().invoke(c8604y)).booleanValue()) {
                    if (!this.f27902a.f27882w) {
                        if (this.f27902a.f27880u == null) {
                            this.f27902a.f27880u = j.b(MPv3.MAX_MESSAGE_ID, null, null, 6, null);
                        }
                        this.f27902a.c3();
                    }
                    z0.e.c(this.f27903b, c8604y);
                    long jQ = C6531g.q(c8604y2.h(), j10);
                    g gVar = this.f27902a.f27880u;
                    if (gVar != null) {
                        k.b(gVar.k(new a.c(jQ, null)));
                    }
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((C8604y) obj, (C8604y) obj2, ((C6531g) obj3).v());
                return J.f24997a;
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$f */
        static final class f extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f27904a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(b bVar) {
                super(0);
                this.f27904a = bVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(!this.f27904a.b3());
            }
        }

        C1041b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            C1041b c1041b = b.this.new C1041b(interfaceC5380e);
            c1041b.f27886b = obj;
            return c1041b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27885a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f27886b;
                C8706d c8706d = new C8706d();
                a aVar = new a(b.this, interfaceC8567G, new e(b.this, c8706d), new d(c8706d, b.this), new c(b.this), new f(b.this), new C1042b(c8706d, b.this), null);
                this.f27885a = 1;
                if (O.g(aVar, this) == objG) {
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
            return ((C1041b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27905a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27906b;

        /* renamed from: d, reason: collision with root package name */
        int f27908d;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27906b = obj;
            this.f27908d |= PduHandle.NONE;
            return b.this.Y2(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27909a;

        /* renamed from: b, reason: collision with root package name */
        Object f27910b;

        /* renamed from: c, reason: collision with root package name */
        Object f27911c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27912d;

        /* renamed from: f, reason: collision with root package name */
        int f27914f;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27912d = obj;
            this.f27914f |= PduHandle.NONE;
            return b.this.Z2(null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27915a;

        /* renamed from: b, reason: collision with root package name */
        Object f27916b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27917c;

        /* renamed from: e, reason: collision with root package name */
        int f27919e;

        e(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27917c = obj;
            this.f27919e |= PduHandle.NONE;
            return b.this.a3(null, this);
        }
    }

    static final class f extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f27920a;

        /* renamed from: b, reason: collision with root package name */
        Object f27921b;

        /* renamed from: c, reason: collision with root package name */
        int f27922c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f27923d;

        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            Object f27925a;

            /* renamed from: b, reason: collision with root package name */
            int f27926b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f27927c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f27928d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f27929e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.jvm.internal.N n10, b bVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f27928d = n10;
                this.f27929e = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f27928d, this.f27929e, interfaceC5380e);
                aVar.f27927c = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r5.f27926b
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r5.f27925a
                    kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                    java.lang.Object r3 = r5.f27927c
                    mh.l r3 = (mh.InterfaceC6835l) r3
                    Yg.v.b(r6)
                    goto L58
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1f:
                    Yg.v.b(r6)
                    java.lang.Object r6 = r5.f27927c
                    mh.l r6 = (mh.InterfaceC6835l) r6
                    r3 = r6
                L27:
                    kotlin.jvm.internal.N r6 = r5.f27928d
                    java.lang.Object r6 = r6.f51689a
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.d
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.C1040a
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.b
                    r4 = 0
                    if (r1 == 0) goto L3b
                    androidx.compose.foundation.gestures.a$b r6 = (androidx.compose.foundation.gestures.a.b) r6
                    goto L3c
                L3b:
                    r6 = r4
                L3c:
                    if (r6 == 0) goto L41
                    r3.invoke(r6)
                L41:
                    kotlin.jvm.internal.N r1 = r5.f27928d
                    androidx.compose.foundation.gestures.b r6 = r5.f27929e
                    Ki.g r6 = androidx.compose.foundation.gestures.b.J2(r6)
                    if (r6 == 0) goto L5b
                    r5.f27927c = r3
                    r5.f27925a = r1
                    r5.f27926b = r2
                    java.lang.Object r6 = r6.c(r5)
                    if (r6 != r0) goto L58
                    return r0
                L58:
                    r4 = r6
                    androidx.compose.foundation.gestures.a r4 = (androidx.compose.foundation.gestures.a) r4
                L5b:
                    r1.f51689a = r4
                    goto L27
                L5e:
                    Yg.J r6 = Yg.J.f24997a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC6835l, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        f(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            f fVar = b.this.new f(interfaceC5380e);
            fVar.f27923d = obj;
            return fVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:34|35|(1:37)|14|57|38|(2:44|(2:46|(1:48)))(2:40|(1:42))) */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
        
            r1 = r4;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008d -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d4 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00db -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ea -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fa -> B:11:0x0027). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public b(InterfaceC6835l interfaceC6835l, boolean z10, InterfaceC8558m interfaceC8558m, q qVar) {
        this.f27875p = qVar;
        this.f27876q = interfaceC6835l;
        this.f27877r = z10;
        this.f27878s = interfaceC8558m;
    }

    private final InterfaceC8578S V2() {
        return AbstractC8576P.a(new C1041b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y2(dh.InterfaceC5380e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.b.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.b$c r0 = (androidx.compose.foundation.gestures.b.c) r0
            int r1 = r0.f27908d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27908d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$c r0 = new androidx.compose.foundation.gestures.b$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27906b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f27908d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f27905a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Yg.v.b(r6)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            Yg.v.b(r6)
            y.b r6 = r5.f27881v
            if (r6 == 0) goto L55
            y.m r2 = r5.f27878s
            if (r2 == 0) goto L50
            y.a r4 = new y.a
            r4.<init>(r6)
            r0.f27905a = r5
            r0.f27908d = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r6 = 0
            r0.f27881v = r6
            goto L56
        L55:
            r0 = r5
        L56:
            Y0.y$a r6 = Y0.y.f24558b
            long r1 = r6.a()
            r0.X2(r1)
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.Y2(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z2(androidx.compose.foundation.gestures.a.c r7, dh.InterfaceC5380e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.b.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.b$d r0 = (androidx.compose.foundation.gestures.b.d) r0
            int r1 = r0.f27914f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27914f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$d r0 = new androidx.compose.foundation.gestures.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27912d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f27914f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f27911c
            y.b r7 = (y.C8547b) r7
            java.lang.Object r1 = r0.f27910b
            androidx.compose.foundation.gestures.a$c r1 = (androidx.compose.foundation.gestures.a.c) r1
            java.lang.Object r0 = r0.f27909a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Yg.v.b(r8)
            goto L85
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f27910b
            androidx.compose.foundation.gestures.a$c r7 = (androidx.compose.foundation.gestures.a.c) r7
            java.lang.Object r2 = r0.f27909a
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            Yg.v.b(r8)
            goto L6a
        L4c:
            Yg.v.b(r8)
            y.b r8 = r6.f27881v
            if (r8 == 0) goto L69
            y.m r2 = r6.f27878s
            if (r2 == 0) goto L69
            y.a r5 = new y.a
            r5.<init>(r8)
            r0.f27909a = r6
            r0.f27910b = r7
            r0.f27914f = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            r2 = r6
        L6a:
            y.b r8 = new y.b
            r8.<init>()
            y.m r4 = r2.f27878s
            if (r4 == 0) goto L88
            r0.f27909a = r2
            r0.f27910b = r7
            r0.f27911c = r8
            r0.f27914f = r3
            java.lang.Object r0 = r4.a(r8, r0)
            if (r0 != r1) goto L82
            return r1
        L82:
            r1 = r7
            r7 = r8
            r0 = r2
        L85:
            r8 = r7
            r2 = r0
            r7 = r1
        L88:
            r2.f27881v = r8
            long r7 = r7.a()
            r2.W2(r7)
            Yg.J r7 = Yg.J.f24997a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.Z2(androidx.compose.foundation.gestures.a$c, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a3(androidx.compose.foundation.gestures.a.d r6, dh.InterfaceC5380e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.b.e
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.b$e r0 = (androidx.compose.foundation.gestures.b.e) r0
            int r1 = r0.f27919e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27919e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$e r0 = new androidx.compose.foundation.gestures.b$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27917c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f27919e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f27916b
            androidx.compose.foundation.gestures.a$d r6 = (androidx.compose.foundation.gestures.a.d) r6
            java.lang.Object r0 = r0.f27915a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Yg.v.b(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            Yg.v.b(r7)
            y.b r7 = r5.f27881v
            if (r7 == 0) goto L5b
            y.m r2 = r5.f27878s
            if (r2 == 0) goto L56
            y.c r4 = new y.c
            r4.<init>(r7)
            r0.f27915a = r5
            r0.f27916b = r6
            r0.f27919e = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            r7 = 0
            r0.f27881v = r7
            goto L5c
        L5b:
            r0 = r5
        L5c:
            long r6 = r6.a()
            r0.X2(r6)
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.a3(androidx.compose.foundation.gestures.a$d, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c3() {
        this.f27882w = true;
        AbstractC3063k.d(d2(), null, null, new f(null), 3, null);
    }

    @Override // E0.s0
    public void C0() {
        InterfaceC8578S interfaceC8578S = this.f27883x;
        if (interfaceC8578S != null) {
            interfaceC8578S.C0();
        }
    }

    public final void R2() {
        C8547b c8547b = this.f27881v;
        if (c8547b != null) {
            InterfaceC8558m interfaceC8558m = this.f27878s;
            if (interfaceC8558m != null) {
                interfaceC8558m.c(new C8546a(c8547b));
            }
            this.f27881v = null;
        }
    }

    public abstract Object S2(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e);

    protected final InterfaceC6835l T2() {
        return this.f27876q;
    }

    protected final boolean U2() {
        return this.f27877r;
    }

    public abstract void W2(long j10);

    public abstract void X2(long j10);

    public abstract boolean b3();

    public final void d3(InterfaceC6835l interfaceC6835l, boolean z10, InterfaceC8558m interfaceC8558m, q qVar, boolean z11) {
        InterfaceC8578S interfaceC8578S;
        this.f27876q = interfaceC6835l;
        boolean z12 = true;
        if (this.f27877r != z10) {
            this.f27877r = z10;
            if (!z10) {
                R2();
                InterfaceC8578S interfaceC8578S2 = this.f27883x;
                if (interfaceC8578S2 != null) {
                    G2(interfaceC8578S2);
                }
                this.f27883x = null;
            }
            z11 = true;
        }
        if (!AbstractC6492s.d(this.f27878s, interfaceC8558m)) {
            R2();
            this.f27878s = interfaceC8558m;
        }
        if (this.f27875p != qVar) {
            this.f27875p = qVar;
        } else {
            z12 = z11;
        }
        if (!z12 || (interfaceC8578S = this.f27883x) == null) {
            return;
        }
        interfaceC8578S.Z1();
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        this.f27882w = false;
        R2();
    }

    @Override // E0.s0
    public void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        if (this.f27877r && this.f27883x == null) {
            this.f27883x = (InterfaceC8578S) D2(V2());
        }
        InterfaceC8578S interfaceC8578S = this.f27883x;
        if (interfaceC8578S != null) {
            interfaceC8578S.s0(c8593n, enumC8595p, j10);
        }
    }
}
