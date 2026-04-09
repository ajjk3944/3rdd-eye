package T;

import Ii.AbstractC3059i;
import Ii.AbstractC3070n0;
import Ii.C3073p;
import Ii.InterfaceC3069n;
import Ii.InterfaceC3091y0;
import Li.AbstractC3222i;
import Yg.AbstractC3663g;
import Yg.u;
import Zg.AbstractC3689v;
import androidx.compose.runtime.ComposeRuntimeError;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.snapshots.h;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class N0 extends AbstractC3550q {

    /* renamed from: a, reason: collision with root package name */
    private long f20899a;

    /* renamed from: b, reason: collision with root package name */
    private final C3532h f20900b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20901c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3091y0 f20902d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f20903e;

    /* renamed from: f, reason: collision with root package name */
    private final List f20904f;

    /* renamed from: g, reason: collision with root package name */
    private List f20905g;

    /* renamed from: h, reason: collision with root package name */
    private o.I f20906h;

    /* renamed from: i, reason: collision with root package name */
    private final V.b f20907i;

    /* renamed from: j, reason: collision with root package name */
    private final List f20908j;

    /* renamed from: k, reason: collision with root package name */
    private final List f20909k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f20910l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f20911m;

    /* renamed from: n, reason: collision with root package name */
    private List f20912n;

    /* renamed from: o, reason: collision with root package name */
    private Set f20913o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC3069n f20914p;

    /* renamed from: q, reason: collision with root package name */
    private int f20915q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20916r;

    /* renamed from: s, reason: collision with root package name */
    private b f20917s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20918t;

    /* renamed from: u, reason: collision with root package name */
    private final Li.z f20919u;

    /* renamed from: v, reason: collision with root package name */
    private final Ii.A f20920v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC5384i f20921w;

    /* renamed from: x, reason: collision with root package name */
    private final c f20922x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f20897y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f20898z = 8;

    /* renamed from: A, reason: collision with root package name */
    private static final Li.z f20895A = Li.P.a(W.a.b());

    /* renamed from: B, reason: collision with root package name */
    private static final AtomicReference f20896B = new AtomicReference(Boolean.FALSE);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c cVar) {
            W.f fVar;
            W.f fVarAdd;
            do {
                fVar = (W.f) N0.f20895A.getValue();
                fVarAdd = fVar.add((Object) cVar);
                if (fVar == fVarAdd) {
                    return;
                }
            } while (!N0.f20895A.c(fVar, fVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c cVar) {
            W.f fVar;
            W.f fVarRemove;
            do {
                fVar = (W.f) N0.f20895A.getValue();
                fVarRemove = fVar.remove((Object) cVar);
                if (fVar == fVarRemove) {
                    return;
                }
            } while (!N0.f20895A.c(fVar, fVarRemove));
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f20923a;

        /* renamed from: b, reason: collision with root package name */
        private final Exception f20924b;

        public b(boolean z10, Exception exc) {
            this.f20923a = z10;
            this.f20924b = exc;
        }

        public Exception a() {
            return this.f20924b;
        }
    }

    private final class c {
        public c() {
        }
    }

    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        public final void a() {
            InterfaceC3069n interfaceC3069nA0;
            Object obj = N0.this.f20901c;
            N0 n02 = N0.this;
            synchronized (obj) {
                interfaceC3069nA0 = n02.a0();
                if (((d) n02.f20919u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw AbstractC3070n0.a("Recomposer shutdown; frame clock awaiter will never resume", n02.f20903e);
                }
            }
            if (interfaceC3069nA0 != null) {
                u.a aVar = Yg.u.f25017b;
                interfaceC3069nA0.resumeWith(Yg.u.c(Yg.J.f24997a));
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N0 f20928a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Throwable f20929b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N0 n02, Throwable th2) {
                super(1);
                this.f20928a = n02;
                this.f20929b = th2;
            }

            public final void a(Throwable th2) {
                Object obj = this.f20928a.f20901c;
                N0 n02 = this.f20928a;
                Throwable th3 = this.f20929b;
                synchronized (obj) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                AbstractC3663g.a(th3, th2);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    n02.f20903e = th3;
                    n02.f20919u.setValue(d.ShutDown);
                    Yg.J j10 = Yg.J.f24997a;
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Yg.J.f24997a;
            }
        }

        f() {
            super(1);
        }

        public final void a(Throwable th2) {
            InterfaceC3069n interfaceC3069n;
            InterfaceC3069n interfaceC3069n2;
            CancellationException cancellationExceptionA = AbstractC3070n0.a("Recomposer effect job completed", th2);
            Object obj = N0.this.f20901c;
            N0 n02 = N0.this;
            synchronized (obj) {
                try {
                    InterfaceC3091y0 interfaceC3091y0 = n02.f20902d;
                    interfaceC3069n = null;
                    if (interfaceC3091y0 != null) {
                        n02.f20919u.setValue(d.ShuttingDown);
                        if (n02.f20916r) {
                            if (n02.f20914p != null) {
                                interfaceC3069n2 = n02.f20914p;
                            }
                            n02.f20914p = null;
                            interfaceC3091y0.invokeOnCompletion(new a(n02, th2));
                            interfaceC3069n = interfaceC3069n2;
                        } else {
                            interfaceC3091y0.cancel(cancellationExceptionA);
                        }
                        interfaceC3069n2 = null;
                        n02.f20914p = null;
                        interfaceC3091y0.invokeOnCompletion(new a(n02, th2));
                        interfaceC3069n = interfaceC3069n2;
                    } else {
                        n02.f20903e = cancellationExceptionA;
                        n02.f20919u.setValue(d.ShutDown);
                        Yg.J j10 = Yg.J.f24997a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (interfaceC3069n != null) {
                u.a aVar = Yg.u.f25017b;
                interfaceC3069n.resumeWith(Yg.u.c(Yg.J.f24997a));
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f20930a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20931b;

        g(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            g gVar = new g(interfaceC5380e);
            gVar.f20931b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f20930a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((d) this.f20931b) == d.ShutDown);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, InterfaceC5380e interfaceC5380e) {
            return ((g) create(dVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o.I f20932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f20933b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(o.I i10, E e10) {
            super(0);
            this.f20932a = i10;
            this.f20933b = e10;
        }

        public final void a() {
            o.I i10 = this.f20932a;
            E e10 = this.f20933b;
            Object[] objArr = i10.f54929b;
            long[] jArr = i10.f54928a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            e10.n(objArr[(i11 << 3) + i13]);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f20934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(E e10) {
            super(1);
            this.f20934a = e10;
        }

        public final void a(Object obj) {
            this.f20934a.a(obj);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Yg.J.f24997a;
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f20935a;

        /* renamed from: b, reason: collision with root package name */
        int f20936b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f20937c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.q f20939e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3530g0 f20940f;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f20941a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f20942b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ mh.q f20943c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3530g0 f20944d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(mh.q qVar, InterfaceC3530g0 interfaceC3530g0, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f20943c = qVar;
                this.f20944d = interfaceC3530g0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f20943c, this.f20944d, interfaceC5380e);
                aVar.f20942b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f20941a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    Ii.N n10 = (Ii.N) this.f20942b;
                    mh.q qVar = this.f20943c;
                    InterfaceC3530g0 interfaceC3530g0 = this.f20944d;
                    this.f20941a = 1;
                    if (qVar.s(n10, interfaceC3530g0, this) == objG) {
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

        static final class b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N0 f20945a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(N0 n02) {
                super(2);
                this.f20945a = n02;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.util.Set r20, androidx.compose.runtime.snapshots.g r21) {
                /*
                    r19 = this;
                    r1 = r19
                    r0 = r20
                    r2 = 1
                    T.N0 r3 = r1.f20945a
                    java.lang.Object r3 = T.N0.G(r3)
                    T.N0 r4 = r1.f20945a
                    monitor-enter(r3)
                    Li.z r5 = T.N0.J(r4)     // Catch: java.lang.Throwable -> L74
                    java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L74
                    T.N0$d r5 = (T.N0.d) r5     // Catch: java.lang.Throwable -> L74
                    T.N0$d r6 = T.N0.d.Idle     // Catch: java.lang.Throwable -> L74
                    int r5 = r5.compareTo(r6)     // Catch: java.lang.Throwable -> L74
                    if (r5 < 0) goto Lb3
                    o.I r5 = T.N0.F(r4)     // Catch: java.lang.Throwable -> L74
                    boolean r6 = r0 instanceof V.d     // Catch: java.lang.Throwable -> L74
                    if (r6 == 0) goto L88
                    V.d r0 = (V.d) r0     // Catch: java.lang.Throwable -> L74
                    o.T r0 = r0.b()     // Catch: java.lang.Throwable -> L74
                    java.lang.Object[] r6 = r0.f54929b     // Catch: java.lang.Throwable -> L74
                    long[] r0 = r0.f54928a     // Catch: java.lang.Throwable -> L74
                    int r7 = r0.length     // Catch: java.lang.Throwable -> L74
                    int r7 = r7 + (-2)
                    if (r7 < 0) goto Lae
                    r9 = 0
                L38:
                    r10 = r0[r9]     // Catch: java.lang.Throwable -> L74
                    long r12 = ~r10     // Catch: java.lang.Throwable -> L74
                    r14 = 7
                    long r12 = r12 << r14
                    long r12 = r12 & r10
                    r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r12 = r12 & r14
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 == 0) goto L84
                    int r12 = r9 - r7
                    int r12 = ~r12     // Catch: java.lang.Throwable -> L74
                    int r12 = r12 >>> 31
                    r13 = 8
                    int r12 = 8 - r12
                    r14 = 0
                L52:
                    if (r14 >= r12) goto L81
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r10
                    r17 = 128(0x80, double:6.3E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto L7c
                    int r15 = r9 << 3
                    int r15 = r15 + r14
                    r15 = r6[r15]     // Catch: java.lang.Throwable -> L74
                    boolean r8 = r15 instanceof d0.AbstractC5280l     // Catch: java.lang.Throwable -> L74
                    if (r8 == 0) goto L76
                    r8 = r15
                    d0.l r8 = (d0.AbstractC5280l) r8     // Catch: java.lang.Throwable -> L74
                    int r13 = androidx.compose.runtime.snapshots.e.a(r2)     // Catch: java.lang.Throwable -> L74
                    boolean r8 = r8.p(r13)     // Catch: java.lang.Throwable -> L74
                    if (r8 != 0) goto L76
                    goto L79
                L74:
                    r0 = move-exception
                    goto Lc3
                L76:
                    r5.h(r15)     // Catch: java.lang.Throwable -> L74
                L79:
                    r8 = 8
                    goto L7d
                L7c:
                    r8 = r13
                L7d:
                    long r10 = r10 >> r8
                    int r14 = r14 + r2
                    r13 = r8
                    goto L52
                L81:
                    r8 = r13
                    if (r12 != r8) goto Lae
                L84:
                    if (r9 == r7) goto Lae
                    int r9 = r9 + r2
                    goto L38
                L88:
                    java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L74
                    java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L74
                L8e:
                    boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L74
                    if (r6 == 0) goto Lae
                    java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L74
                    boolean r7 = r6 instanceof d0.AbstractC5280l     // Catch: java.lang.Throwable -> L74
                    if (r7 == 0) goto Laa
                    r7 = r6
                    d0.l r7 = (d0.AbstractC5280l) r7     // Catch: java.lang.Throwable -> L74
                    int r8 = androidx.compose.runtime.snapshots.e.a(r2)     // Catch: java.lang.Throwable -> L74
                    boolean r7 = r7.p(r8)     // Catch: java.lang.Throwable -> L74
                    if (r7 != 0) goto Laa
                    goto L8e
                Laa:
                    r5.h(r6)     // Catch: java.lang.Throwable -> L74
                    goto L8e
                Lae:
                    Ii.n r0 = T.N0.t(r4)     // Catch: java.lang.Throwable -> L74
                    goto Lb4
                Lb3:
                    r0 = 0
                Lb4:
                    monitor-exit(r3)
                    if (r0 == 0) goto Lc2
                    Yg.u$a r2 = Yg.u.f25017b
                    Yg.J r2 = Yg.J.f24997a
                    java.lang.Object r2 = Yg.u.c(r2)
                    r0.resumeWith(r2)
                Lc2:
                    return
                Lc3:
                    monitor-exit(r3)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: T.N0.j.b.a(java.util.Set, androidx.compose.runtime.snapshots.g):void");
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Set) obj, (androidx.compose.runtime.snapshots.g) obj2);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(mh.q qVar, InterfaceC3530g0 interfaceC3530g0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f20939e = qVar;
            this.f20940f = interfaceC3530g0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            j jVar = N0.this.new j(this.f20939e, this.f20940f, interfaceC5380e);
            jVar.f20937c = obj;
            return jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: T.N0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((j) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        Object f20946a;

        /* renamed from: b, reason: collision with root package name */
        Object f20947b;

        /* renamed from: c, reason: collision with root package name */
        Object f20948c;

        /* renamed from: d, reason: collision with root package name */
        Object f20949d;

        /* renamed from: e, reason: collision with root package name */
        Object f20950e;

        /* renamed from: f, reason: collision with root package name */
        Object f20951f;

        /* renamed from: g, reason: collision with root package name */
        Object f20952g;

        /* renamed from: h, reason: collision with root package name */
        Object f20953h;

        /* renamed from: i, reason: collision with root package name */
        int f20954i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f20955j;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N0 f20957a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o.I f20958b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o.I f20959c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List f20960d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List f20961e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ o.I f20962f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f20963g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ o.I f20964h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Set f20965i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N0 n02, o.I i10, o.I i11, List list, List list2, o.I i12, List list3, o.I i13, Set set) {
                super(1);
                this.f20957a = n02;
                this.f20958b = i10;
                this.f20959c = i11;
                this.f20960d = list;
                this.f20961e = list2;
                this.f20962f = i12;
                this.f20963g = list3;
                this.f20964h = i13;
                this.f20965i = set;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:205:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:218:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:222:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x01a2  */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v33 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(long r28) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 893
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: T.N0.k.a.a(long):void");
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                a(((Number) obj).longValue());
                return Yg.J.f24997a;
            }
        }

        k(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void E(List list, N0 n02) {
            list.clear();
            synchronized (n02.f20901c) {
                try {
                    List list2 = n02.f20909k;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((C3541l0) list2.get(i10));
                    }
                    n02.f20909k.clear();
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void v(T.N0 r23, java.util.List r24, java.util.List r25, java.util.List r26, o.I r27, o.I r28, o.I r29, o.I r30) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: T.N0.k.v(T.N0, java.util.List, java.util.List, java.util.List, o.I, o.I, o.I, o.I):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
        /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0139 -> B:23:0x0142). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0151 -> B:24:0x014d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: T.N0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.q
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(Ii.N n10, InterfaceC3530g0 interfaceC3530g0, InterfaceC5380e interfaceC5380e) {
            k kVar = N0.this.new k(interfaceC5380e);
            kVar.f20955j = interfaceC3530g0;
            return kVar.invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f20966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o.I f20967b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(E e10, o.I i10) {
            super(1);
            this.f20966a = e10;
            this.f20967b = i10;
        }

        public final void a(Object obj) {
            this.f20966a.n(obj);
            o.I i10 = this.f20967b;
            if (i10 != null) {
                i10.h(obj);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Yg.J.f24997a;
        }
    }

    public N0(InterfaceC5384i interfaceC5384i) {
        C3532h c3532h = new C3532h(new e());
        this.f20900b = c3532h;
        this.f20901c = new Object();
        this.f20904f = new ArrayList();
        this.f20906h = new o.I(0, 1, null);
        this.f20907i = new V.b(new E[16], 0);
        this.f20908j = new ArrayList();
        this.f20909k = new ArrayList();
        this.f20910l = new LinkedHashMap();
        this.f20911m = new LinkedHashMap();
        this.f20919u = Li.P.a(d.Inactive);
        Ii.A a10 = Ii.A0.a((InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O));
        a10.invokeOnCompletion(new f());
        this.f20920v = a10;
        this.f20921w = interfaceC5384i.plus(c3532h).plus(a10);
        this.f20922x = new c();
    }

    private final InterfaceC6835l A0(E e10, o.I i10) {
        return new l(e10, i10);
    }

    private final void V(E e10) {
        this.f20904f.add(e10);
        this.f20905g = null;
    }

    private final void W(androidx.compose.runtime.snapshots.b bVar) {
        try {
            if (bVar.C() instanceof h.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            bVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X(InterfaceC5380e interfaceC5380e) {
        C3073p c3073p;
        if (h0()) {
            return Yg.J.f24997a;
        }
        C3073p c3073p2 = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p2.A();
        synchronized (this.f20901c) {
            if (h0()) {
                c3073p = c3073p2;
            } else {
                this.f20914p = c3073p2;
                c3073p = null;
            }
        }
        if (c3073p != null) {
            u.a aVar = Yg.u.f25017b;
            c3073p.resumeWith(Yg.u.c(Yg.J.f24997a));
        }
        Object objU = c3073p2.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : Yg.J.f24997a;
    }

    private final void Z() {
        this.f20904f.clear();
        this.f20905g = AbstractC3689v.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3069n a0() {
        d dVar;
        int i10 = 0;
        int i11 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (((d) this.f20919u.getValue()).compareTo(d.ShuttingDown) <= 0) {
            Z();
            this.f20906h = new o.I(i10, i11, defaultConstructorMarker);
            this.f20907i.h();
            this.f20908j.clear();
            this.f20909k.clear();
            this.f20912n = null;
            InterfaceC3069n interfaceC3069n = this.f20914p;
            if (interfaceC3069n != null) {
                InterfaceC3069n.a.a(interfaceC3069n, null, 1, null);
            }
            this.f20914p = null;
            this.f20917s = null;
            return null;
        }
        if (this.f20917s != null) {
            dVar = d.Inactive;
        } else if (this.f20902d == null) {
            this.f20906h = new o.I(i10, i11, defaultConstructorMarker);
            this.f20907i.h();
            dVar = f0() ? d.InactivePendingWork : d.Inactive;
        } else {
            dVar = (this.f20907i.u() || this.f20906h.e() || !this.f20908j.isEmpty() || !this.f20909k.isEmpty() || this.f20915q > 0 || f0()) ? d.PendingWork : d.Idle;
        }
        this.f20919u.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        InterfaceC3069n interfaceC3069n2 = this.f20914p;
        this.f20914p = null;
        return interfaceC3069n2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        int i10;
        List listL;
        synchronized (this.f20901c) {
            try {
                if (this.f20910l.isEmpty()) {
                    listL = AbstractC3689v.l();
                } else {
                    List listY = AbstractC3689v.y(this.f20910l.values());
                    this.f20910l.clear();
                    listL = new ArrayList(listY.size());
                    int size = listY.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C3541l0 c3541l0 = (C3541l0) listY.get(i11);
                        listL.add(Yg.z.a(c3541l0, this.f20911m.get(c3541l0)));
                    }
                    this.f20911m.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = listL.size();
        for (i10 = 0; i10 < size2; i10++) {
            Yg.s sVar = (Yg.s) listL.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0() {
        boolean zF0;
        synchronized (this.f20901c) {
            zF0 = f0();
        }
        return zF0;
    }

    private final boolean f0() {
        return !this.f20918t && this.f20900b.k();
    }

    private final boolean g0() {
        return this.f20907i.u() || f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h0() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f20901c
            monitor-enter(r0)
            o.I r1 = r2.f20906h     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            V.b r1 = r2.f20907i     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.u()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r2.f0()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            r1 = 0
            goto L1f
        L1c:
            r1 = move-exception
            goto L21
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r0)
            return r1
        L21:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T.N0.h0():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List i0() {
        List listL = this.f20905g;
        if (listL == null) {
            List list = this.f20904f;
            listL = list.isEmpty() ? AbstractC3689v.l() : new ArrayList(list);
            this.f20905g = listL;
        }
        return listL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j0() {
        boolean z10;
        synchronized (this.f20901c) {
            z10 = this.f20916r;
        }
        if (z10) {
            Iterator it = this.f20920v.getChildren().iterator();
            while (it.hasNext()) {
                if (((InterfaceC3091y0) it.next()).isActive()) {
                }
            }
            return false;
        }
        return true;
    }

    private final void m0(E e10) {
        synchronized (this.f20901c) {
            List list = this.f20909k;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC6492s.d(((C3541l0) list.get(i10)).b(), e10)) {
                    Yg.J j10 = Yg.J.f24997a;
                    ArrayList arrayList = new ArrayList();
                    n0(arrayList, this, e10);
                    while (!arrayList.isEmpty()) {
                        o0(arrayList, null);
                        n0(arrayList, this, e10);
                    }
                    return;
                }
            }
        }
    }

    private static final void n0(List list, N0 n02, E e10) {
        list.clear();
        synchronized (n02.f20901c) {
            try {
                Iterator it = n02.f20909k.iterator();
                while (it.hasNext()) {
                    C3541l0 c3541l0 = (C3541l0) it.next();
                    if (AbstractC6492s.d(c3541l0.b(), e10)) {
                        list.add(c3541l0);
                        it.remove();
                    }
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        r1 = r7.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        if (r6 >= r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (((Yg.s) r7.get(r6)).j() == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        if (r8 >= r6) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        r9 = (Yg.s) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if (r9.j() != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        r9 = (T.C3541l0) r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        if (r9 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f8, code lost:
    
        r6 = r13.f20901c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fa, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        Zg.AbstractC3689v.C(r13.f20909k, r1);
        r1 = Yg.J.f24997a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        if (r8 >= r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0115, code lost:
    
        r9 = r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        if (((Yg.s) r9).j() == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0122, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List o0(java.util.List r14, o.I r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.N0.o0(java.util.List, o.I):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E p0(E e10, o.I i10) {
        Set set;
        if (e10.l() || e10.isDisposed() || ((set = this.f20913o) != null && set.contains(e10))) {
            return null;
        }
        androidx.compose.runtime.snapshots.b bVarO = androidx.compose.runtime.snapshots.g.f28632e.o(s0(e10), A0(e10, i10));
        try {
            androidx.compose.runtime.snapshots.g gVarL = bVarO.l();
            if (i10 != null) {
                try {
                    if (i10.e()) {
                        e10.b(new h(i10, e10));
                    }
                } catch (Throwable th2) {
                    bVarO.s(gVarL);
                    throw th2;
                }
            }
            boolean zU = e10.u();
            bVarO.s(gVarL);
            if (zU) {
                return e10;
            }
            return null;
        } finally {
            W(bVarO);
        }
    }

    private final void q0(Exception exc, E e10, boolean z10) throws Exception {
        int i10 = 0;
        if (!((Boolean) f20896B.get()).booleanValue() || (exc instanceof ComposeRuntimeError)) {
            synchronized (this.f20901c) {
                b bVar = this.f20917s;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.f20917s = new b(false, exc);
                Yg.J j10 = Yg.J.f24997a;
            }
            throw exc;
        }
        synchronized (this.f20901c) {
            try {
                AbstractC3514b.f("Error was captured in composition while live edit was enabled.", exc);
                this.f20908j.clear();
                this.f20907i.h();
                this.f20906h = new o.I(i10, 1, null);
                this.f20909k.clear();
                this.f20910l.clear();
                this.f20911m.clear();
                this.f20917s = new b(z10, exc);
                if (e10 != null) {
                    v0(e10);
                }
                a0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* synthetic */ void r0(N0 n02, Exception exc, E e10, boolean z10, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            e10 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        n02.q0(exc, e10, z10);
    }

    private final InterfaceC6835l s0(E e10) {
        return new i(e10);
    }

    private final Object t0(mh.q qVar, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f20900b, new j(qVar, AbstractC3535i0.a(interfaceC5380e.getContext()), null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u0() {
        List listI0;
        boolean zG0;
        int i10 = 1;
        synchronized (this.f20901c) {
            if (this.f20906h.d()) {
                return g0();
            }
            Set setA = V.e.a(this.f20906h);
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i11 = 0;
            this.f20906h = new o.I(i11, i10, defaultConstructorMarker);
            synchronized (this.f20901c) {
                listI0 = i0();
            }
            try {
                int size = listI0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((E) listI0.get(i12)).i(setA);
                    if (((d) this.f20919u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f20901c) {
                    this.f20906h = new o.I(i11, i10, defaultConstructorMarker);
                    Yg.J j10 = Yg.J.f24997a;
                }
                synchronized (this.f20901c) {
                    if (a0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zG0 = g0();
                }
                return zG0;
            } catch (Throwable th2) {
                synchronized (this.f20901c) {
                    this.f20906h.i(setA);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(E e10) {
        List arrayList = this.f20912n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f20912n = arrayList;
        }
        if (!arrayList.contains(e10)) {
            arrayList.add(e10);
        }
        x0(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(InterfaceC3091y0 interfaceC3091y0) {
        synchronized (this.f20901c) {
            Throwable th2 = this.f20903e;
            if (th2 != null) {
                throw th2;
            }
            if (((d) this.f20919u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.f20902d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.f20902d = interfaceC3091y0;
            a0();
        }
    }

    private final void x0(E e10) {
        this.f20904f.remove(e10);
        this.f20905g = null;
    }

    public final void Y() {
        synchronized (this.f20901c) {
            try {
                if (((d) this.f20919u.getValue()).compareTo(d.Idle) >= 0) {
                    this.f20919u.setValue(d.ShuttingDown);
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        InterfaceC3091y0.a.b(this.f20920v, null, 1, null);
    }

    @Override // T.AbstractC3550q
    public void a(E e10, InterfaceC6839p interfaceC6839p) throws Exception {
        boolean zL = e10.l();
        try {
            g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
            androidx.compose.runtime.snapshots.b bVarO = aVar.o(s0(e10), A0(e10, null));
            try {
                androidx.compose.runtime.snapshots.g gVarL = bVarO.l();
                try {
                    e10.r(interfaceC6839p);
                    Yg.J j10 = Yg.J.f24997a;
                    if (!zL) {
                        aVar.g();
                    }
                    synchronized (this.f20901c) {
                        if (((d) this.f20919u.getValue()).compareTo(d.ShuttingDown) > 0 && !i0().contains(e10)) {
                            V(e10);
                        }
                    }
                    try {
                        m0(e10);
                        try {
                            e10.k();
                            e10.d();
                            if (zL) {
                                return;
                            }
                            aVar.g();
                        } catch (Exception e11) {
                            r0(this, e11, null, false, 6, null);
                        }
                    } catch (Exception e12) {
                        q0(e12, e10, true);
                    }
                } finally {
                    bVarO.s(gVarL);
                }
            } finally {
                W(bVarO);
            }
        } catch (Exception e13) {
            q0(e13, e10, true);
        }
    }

    @Override // T.AbstractC3550q
    public boolean c() {
        return ((Boolean) f20896B.get()).booleanValue();
    }

    public final long c0() {
        return this.f20899a;
    }

    @Override // T.AbstractC3550q
    public boolean d() {
        return false;
    }

    public final Li.N d0() {
        return this.f20919u;
    }

    @Override // T.AbstractC3550q
    public boolean e() {
        return false;
    }

    @Override // T.AbstractC3550q
    public int g() {
        return 1000;
    }

    @Override // T.AbstractC3550q
    public InterfaceC5384i h() {
        return this.f20921w;
    }

    @Override // T.AbstractC3550q
    public void j(C3541l0 c3541l0) {
        InterfaceC3069n interfaceC3069nA0;
        synchronized (this.f20901c) {
            this.f20909k.add(c3541l0);
            interfaceC3069nA0 = a0();
        }
        if (interfaceC3069nA0 != null) {
            u.a aVar = Yg.u.f25017b;
            interfaceC3069nA0.resumeWith(Yg.u.c(Yg.J.f24997a));
        }
    }

    @Override // T.AbstractC3550q
    public void k(E e10) {
        InterfaceC3069n interfaceC3069nA0;
        synchronized (this.f20901c) {
            if (this.f20907i.i(e10)) {
                interfaceC3069nA0 = null;
            } else {
                this.f20907i.b(e10);
                interfaceC3069nA0 = a0();
            }
        }
        if (interfaceC3069nA0 != null) {
            u.a aVar = Yg.u.f25017b;
            interfaceC3069nA0.resumeWith(Yg.u.c(Yg.J.f24997a));
        }
    }

    public final Object k0(InterfaceC5380e interfaceC5380e) {
        Object objY = AbstractC3222i.y(d0(), new g(null), interfaceC5380e);
        return objY == AbstractC5467b.g() ? objY : Yg.J.f24997a;
    }

    @Override // T.AbstractC3550q
    public AbstractC3539k0 l(C3541l0 c3541l0) {
        AbstractC3539k0 abstractC3539k0;
        synchronized (this.f20901c) {
            abstractC3539k0 = (AbstractC3539k0) this.f20911m.remove(c3541l0);
        }
        return abstractC3539k0;
    }

    public final void l0() {
        synchronized (this.f20901c) {
            this.f20918t = true;
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    @Override // T.AbstractC3550q
    public void m(Set set) {
    }

    @Override // T.AbstractC3550q
    public void o(E e10) {
        synchronized (this.f20901c) {
            try {
                Set linkedHashSet = this.f20913o;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f20913o = linkedHashSet;
                }
                linkedHashSet.add(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // T.AbstractC3550q
    public void r(E e10) {
        synchronized (this.f20901c) {
            x0(e10);
            this.f20907i.x(e10);
            this.f20908j.remove(e10);
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    public final void y0() {
        InterfaceC3069n interfaceC3069nA0;
        synchronized (this.f20901c) {
            if (this.f20918t) {
                this.f20918t = false;
                interfaceC3069nA0 = a0();
            } else {
                interfaceC3069nA0 = null;
            }
        }
        if (interfaceC3069nA0 != null) {
            u.a aVar = Yg.u.f25017b;
            interfaceC3069nA0.resumeWith(Yg.u.c(Yg.J.f24997a));
        }
    }

    public final Object z0(InterfaceC5380e interfaceC5380e) {
        Object objT0 = t0(new k(null), interfaceC5380e);
        return objT0 == AbstractC5467b.g() ? objT0 : Yg.J.f24997a;
    }
}
