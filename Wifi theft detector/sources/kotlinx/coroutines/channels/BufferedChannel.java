package kotlinx.coroutines.channels;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.r;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import kotlinx.coroutines.u2;
import l9.q;
import y8.s;

/* loaded from: classes4.dex */
public class BufferedChannel implements kotlinx.coroutines.channels.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f22245d = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f22246e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f22247f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f22248g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22249h = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22250i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22251j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22252k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22253l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f22254a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.l f22255b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final q f22256c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public final class a implements c, u2 {

        /* renamed from: a, reason: collision with root package name */
        public Object f22257a = BufferedChannelKt.f22279p;

        /* renamed from: b, reason: collision with root package name */
        public kotlinx.coroutines.p f22258b;

        public a() {
        }

        @Override // kotlinx.coroutines.u2
        public void a(z zVar, int i10) {
            kotlinx.coroutines.p pVar = this.f22258b;
            if (pVar != null) {
                pVar.a(zVar, i10);
            }
        }

        @Override // kotlinx.coroutines.channels.c
        public Object b(c9.c cVar) {
            BufferedChannel bufferedChannel = BufferedChannel.this;
            g gVar = (g) BufferedChannel.W().get(bufferedChannel);
            while (!bufferedChannel.k0()) {
                long andIncrement = BufferedChannel.X().getAndIncrement(bufferedChannel);
                int i10 = BufferedChannelKt.f22265b;
                long j10 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (gVar.f22569c != j10) {
                    g gVarN = bufferedChannel.N(j10, gVar);
                    if (gVarN == null) {
                        continue;
                    } else {
                        gVar = gVarN;
                    }
                }
                Object objV0 = bufferedChannel.V0(gVar, i11, andIncrement, null);
                if (objV0 == BufferedChannelKt.f22276m) {
                    throw new IllegalStateException("unreachable");
                }
                if (objV0 != BufferedChannelKt.f22278o) {
                    if (objV0 == BufferedChannelKt.f22277n) {
                        return f(gVar, i11, andIncrement, cVar);
                    }
                    gVar.b();
                    this.f22257a = objV0;
                    return d9.a.a(true);
                }
                if (andIncrement < bufferedChannel.c0()) {
                    gVar.b();
                }
            }
            return d9.a.a(g());
        }

        public final Object f(g gVar, int i10, long j10, c9.c cVar) throws Throwable {
            Boolean boolA;
            g gVarN;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            kotlinx.coroutines.p pVarB = r.b(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
            try {
                this.f22258b = pVarB;
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object objV0 = bufferedChannel.V0(gVar, i10, j10, this);
                if (objV0 == BufferedChannelKt.f22276m) {
                    bufferedChannel.C0(this, gVar, i10);
                } else {
                    l9.l lVarA = null;
                    if (objV0 == BufferedChannelKt.f22278o) {
                        if (j10 < bufferedChannel.c0()) {
                            gVar.b();
                        }
                        g gVar2 = (g) BufferedChannel.W().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.k0()) {
                                h();
                                break;
                            }
                            long andIncrement = BufferedChannel.X().getAndIncrement(bufferedChannel);
                            int i11 = BufferedChannelKt.f22265b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (gVar2.f22569c != j11) {
                                gVarN = bufferedChannel.N(j11, gVar2);
                                if (gVarN == null) {
                                }
                            } else {
                                gVarN = gVar2;
                            }
                            Object objV02 = bufferedChannel.V0(gVarN, i12, andIncrement, this);
                            if (objV02 == BufferedChannelKt.f22276m) {
                                bufferedChannel.C0(this, gVarN, i12);
                                break;
                            }
                            if (objV02 == BufferedChannelKt.f22278o) {
                                if (andIncrement < bufferedChannel.c0()) {
                                    gVarN.b();
                                }
                                gVar2 = gVarN;
                            } else {
                                if (objV02 == BufferedChannelKt.f22277n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                gVarN.b();
                                this.f22257a = objV02;
                                this.f22258b = null;
                                boolA = d9.a.a(true);
                                l9.l lVar = bufferedChannel.f22255b;
                                if (lVar != null) {
                                    lVarA = OnUndeliveredElementKt.a(lVar, objV02, pVarB.getContext());
                                }
                            }
                        }
                    } else {
                        gVar.b();
                        this.f22257a = objV0;
                        this.f22258b = null;
                        boolA = d9.a.a(true);
                        l9.l lVar2 = bufferedChannel.f22255b;
                        if (lVar2 != null) {
                            lVarA = OnUndeliveredElementKt.a(lVar2, objV0, pVarB.getContext());
                        }
                    }
                    pVarB.y(boolA, lVarA);
                }
                Object objW = pVarB.w();
                if (objW == kotlin.coroutines.intrinsics.a.f()) {
                    d9.e.c(cVar);
                }
                return objW;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                pVarB.N();
                throw th3;
            }
        }

        public final boolean g() throws Throwable {
            this.f22257a = BufferedChannelKt.z();
            Throwable thS = BufferedChannel.this.S();
            if (thS == null) {
                return false;
            }
            throw b0.a(thS);
        }

        public final void h() {
            kotlinx.coroutines.p pVar = this.f22258b;
            kotlin.jvm.internal.p.b(pVar);
            this.f22258b = null;
            this.f22257a = BufferedChannelKt.z();
            Throwable thS = BufferedChannel.this.S();
            if (thS == null) {
                Result.Companion companion = Result.INSTANCE;
                pVar.resumeWith(Result.b(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                pVar.resumeWith(Result.b(kotlin.c.a(thS)));
            }
        }

        public final boolean i(Object obj) {
            kotlinx.coroutines.p pVar = this.f22258b;
            kotlin.jvm.internal.p.b(pVar);
            this.f22258b = null;
            this.f22257a = obj;
            Boolean bool = Boolean.TRUE;
            l9.l lVar = BufferedChannel.this.f22255b;
            return BufferedChannelKt.B(pVar, bool, lVar != null ? OnUndeliveredElementKt.a(lVar, obj, pVar.getContext()) : null);
        }

        public final void j() {
            kotlinx.coroutines.p pVar = this.f22258b;
            kotlin.jvm.internal.p.b(pVar);
            this.f22258b = null;
            this.f22257a = BufferedChannelKt.z();
            Throwable thS = BufferedChannel.this.S();
            if (thS == null) {
                Result.Companion companion = Result.INSTANCE;
                pVar.resumeWith(Result.b(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                pVar.resumeWith(Result.b(kotlin.c.a(thS)));
            }
        }

        @Override // kotlinx.coroutines.channels.c
        public Object next() throws Throwable {
            Object obj = this.f22257a;
            if (obj == BufferedChannelKt.f22279p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f22257a = BufferedChannelKt.f22279p;
            if (obj != BufferedChannelKt.z()) {
                return obj;
            }
            throw b0.a(BufferedChannel.this.V());
        }
    }

    public BufferedChannel(int i10, l9.l lVar) {
        this.f22254a = i10;
        this.f22255b = lVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = BufferedChannelKt.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = Q();
        g gVar = new g(0L, null, this, 3);
        this.sendSegment$volatile = gVar;
        this.receiveSegment$volatile = gVar;
        if (o0()) {
            gVar = BufferedChannelKt.f22264a;
            kotlin.jvm.internal.p.c(gVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = gVar;
        this.f22256c = lVar != null ? new q() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
            {
                super(3);
            }

            @Override // l9.q
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l9.l invoke(final kotlinx.coroutines.selects.h hVar, Object obj, final Object obj2) {
                final BufferedChannel bufferedChannel = this.this$0;
                return new l9.l() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // l9.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        invoke((Throwable) obj3);
                        return s.f25199a;
                    }

                    public final void invoke(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        if (obj2 != BufferedChannelKt.z()) {
                            OnUndeliveredElementKt.b(bufferedChannel.f22255b, obj2, hVar.getContext());
                        }
                    }
                };
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.f22282s;
    }

    public static /* synthetic */ Object F0(BufferedChannel bufferedChannel, c9.c cVar) throws Throwable {
        g gVar;
        g gVar2 = (g) W().get(bufferedChannel);
        while (!bufferedChannel.k0()) {
            long andIncrement = X().getAndIncrement(bufferedChannel);
            int i10 = BufferedChannelKt.f22265b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (gVar2.f22569c != j10) {
                g gVarN = bufferedChannel.N(j10, gVar2);
                if (gVarN == null) {
                    continue;
                } else {
                    gVar = gVarN;
                }
            } else {
                gVar = gVar2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object objV0 = bufferedChannel2.V0(gVar, i11, andIncrement, null);
            if (objV0 == BufferedChannelKt.f22276m) {
                throw new IllegalStateException("unexpected");
            }
            if (objV0 != BufferedChannelKt.f22278o) {
                if (objV0 == BufferedChannelKt.f22277n) {
                    return bufferedChannel2.I0(gVar, i11, andIncrement, cVar);
                }
                gVar.b();
                return objV0;
            }
            if (andIncrement < bufferedChannel2.c0()) {
                gVar.b();
            }
            bufferedChannel = bufferedChannel2;
            gVar2 = gVar;
        }
        throw b0.a(bufferedChannel.V());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object G0(kotlinx.coroutines.channels.BufferedChannel r13, c9.c r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.c.b(r14)
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.e) r14
            java.lang.Object r13 = r14.k()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.c.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = g()
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.g r14 = (kotlinx.coroutines.channels.g) r14
        L46:
            boolean r1 = r13.k0()
            if (r1 == 0) goto L57
            kotlinx.coroutines.channels.e$b r14 = kotlinx.coroutines.channels.e.f22291b
            java.lang.Throwable r13 = r13.S()
            java.lang.Object r13 = r14.a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = h()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f22265b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f22569c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            kotlinx.coroutines.channels.g r1 = d(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = y(r7, r8, r9, r10, r12)
            r1 = r7
            kotlinx.coroutines.internal.c0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.r()
            if (r13 == r14) goto Lb6
            kotlinx.coroutines.internal.c0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.h()
            if (r13 != r14) goto L9b
            long r13 = r1.c0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.b()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            kotlinx.coroutines.internal.c0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.s()
            if (r13 != r14) goto Lac
            r6.label = r2
            r2 = r8
            java.lang.Object r13 = r1.H0(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.b()
            kotlinx.coroutines.channels.e$b r14 = kotlinx.coroutines.channels.e.f22291b
            java.lang.Object r13 = r14.c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.G0(kotlinx.coroutines.channels.BufferedChannel, c9.c):java.lang.Object");
    }

    public static /* synthetic */ Object O0(BufferedChannel bufferedChannel, Object obj, c9.c cVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g gVar;
        g gVar2 = (g) a0().get(bufferedChannel);
        while (true) {
            long andIncrement = b0().getAndIncrement(bufferedChannel);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM0 = bufferedChannel.m0(andIncrement);
            int i10 = BufferedChannelKt.f22265b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (gVar2.f22569c != j11) {
                g gVarO = bufferedChannel.O(j11, gVar2);
                if (gVarO != null) {
                    gVar = gVarO;
                } else if (zM0) {
                    Object objY0 = bufferedChannel.y0(obj, cVar);
                    if (objY0 == kotlin.coroutines.intrinsics.a.f()) {
                        return objY0;
                    }
                }
            } else {
                gVar = gVar2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object obj2 = obj;
            int iX0 = bufferedChannel2.X0(gVar, i11, obj2, j10, null, zM0);
            if (iX0 == 0) {
                gVar.b();
                break;
            }
            if (iX0 == 1) {
                break;
            }
            if (iX0 != 2) {
                if (iX0 == 3) {
                    Object objP0 = bufferedChannel2.P0(gVar, i11, obj2, j10, cVar);
                    if (objP0 == kotlin.coroutines.intrinsics.a.f()) {
                        return objP0;
                    }
                } else if (iX0 != 4) {
                    if (iX0 == 5) {
                        gVar.b();
                    }
                    bufferedChannel = bufferedChannel2;
                    gVar2 = gVar;
                    obj = obj2;
                } else {
                    if (j10 < bufferedChannel2.Y()) {
                        gVar.b();
                    }
                    Object objY02 = bufferedChannel2.y0(obj2, cVar);
                    if (objY02 == kotlin.coroutines.intrinsics.a.f()) {
                        return objY02;
                    }
                }
            } else if (zM0) {
                gVar.s();
                Object objY03 = bufferedChannel2.y0(obj2, cVar);
                if (objY03 == kotlin.coroutines.intrinsics.a.f()) {
                    return objY03;
                }
            }
        }
        return s.f25199a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater W() {
        return f22250i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater X() {
        return f22246e;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater a0() {
        return f22249h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater b0() {
        return f22245d;
    }

    public static /* synthetic */ void g0(BufferedChannel bufferedChannel, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bufferedChannel.f0(j10);
    }

    @Override // kotlinx.coroutines.channels.o
    public boolean A(Throwable th) {
        return G(th, false);
    }

    public void A0() {
    }

    @Override // kotlinx.coroutines.channels.o
    public boolean B() {
        return m0(f22245d.get(this));
    }

    public void B0() {
    }

    public final boolean C(long j10) {
        return j10 < Q() || j10 < Y() + ((long) this.f22254a);
    }

    public final void C0(u2 u2Var, g gVar, int i10) {
        B0();
        u2Var.a(gVar, i10);
    }

    public boolean D(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return G(th, true);
    }

    public final void D0(u2 u2Var, g gVar, int i10) {
        u2Var.a(gVar, i10 + BufferedChannelKt.f22265b);
    }

    public final void E(g gVar, long j10) {
        Object objB = kotlinx.coroutines.internal.k.b(null, 1, null);
        loop0: while (gVar != null) {
            for (int i10 = BufferedChannelKt.f22265b - 1; -1 < i10; i10--) {
                if ((gVar.f22569c * BufferedChannelKt.f22265b) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object objA = gVar.A(i10);
                    if (objA != null && objA != BufferedChannelKt.f22268e) {
                        if (!(objA instanceof p)) {
                            if (!(objA instanceof u2)) {
                                break;
                            }
                            if (gVar.u(i10, objA, BufferedChannelKt.z())) {
                                objB = kotlinx.coroutines.internal.k.c(objB, objA);
                                gVar.B(i10, true);
                                break;
                            }
                        } else {
                            if (gVar.u(i10, objA, BufferedChannelKt.z())) {
                                objB = kotlinx.coroutines.internal.k.c(objB, ((p) objA).f22300a);
                                gVar.B(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (gVar.u(i10, objA, BufferedChannelKt.z())) {
                            gVar.s();
                            break;
                        }
                    }
                }
            }
            gVar = (g) gVar.g();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                L0((u2) objB);
                return;
            }
            kotlin.jvm.internal.p.c(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                L0((u2) arrayList.get(size));
            }
        }
    }

    public final Object E0(Object obj, Object obj2) {
        return e.b(obj2 == BufferedChannelKt.z() ? e.f22291b.a(S()) : e.f22291b.c(obj2));
    }

    public final g F() {
        Object obj = f22251j.get(this);
        g gVar = (g) f22249h.get(this);
        if (gVar.f22569c > ((g) obj).f22569c) {
            obj = gVar;
        }
        g gVar2 = (g) f22250i.get(this);
        if (gVar2.f22569c > ((g) obj).f22569c) {
            obj = gVar2;
        }
        return (g) kotlinx.coroutines.internal.d.b((kotlinx.coroutines.internal.e) obj);
    }

    public boolean G(Throwable th, boolean z10) {
        if (z10) {
            q0();
        }
        boolean zA = t.a.a(f22252k, this, BufferedChannelKt.f22282s, th);
        if (z10) {
            r0();
        } else {
            s0();
        }
        J();
        u0();
        if (zA) {
            h0();
        }
        return zA;
    }

    public final void H(long j10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        K0(I(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H0(kotlinx.coroutines.channels.g r11, int r12, long r13, c9.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.H0(kotlinx.coroutines.channels.g, int, long, c9.c):java.lang.Object");
    }

    public final g I(long j10) {
        g gVarF = F();
        if (n0()) {
            long jP0 = p0(gVarF);
            if (jP0 != -1) {
                K(jP0);
            }
        }
        E(gVarF, j10);
        return gVarF;
    }

    public final Object I0(g gVar, int i10, long j10, c9.c cVar) {
        g gVar2;
        kotlinx.coroutines.p pVarB = r.b(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        try {
            Object objV0 = V0(gVar, i10, j10, pVarB);
            if (objV0 == BufferedChannelKt.f22276m) {
                C0(pVarB, gVar, i10);
            } else {
                l9.l lVarA = null;
                lVarA = null;
                if (objV0 == BufferedChannelKt.f22278o) {
                    if (j10 < c0()) {
                        gVar.b();
                    }
                    g gVar3 = (g) W().get(this);
                    while (true) {
                        if (k0()) {
                            w0(pVarB);
                            break;
                        }
                        long andIncrement = X().getAndIncrement(this);
                        int i11 = BufferedChannelKt.f22265b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (gVar3.f22569c != j11) {
                            g gVarN = N(j11, gVar3);
                            if (gVarN != null) {
                                gVar2 = gVarN;
                            }
                        } else {
                            gVar2 = gVar3;
                        }
                        objV0 = V0(gVar2, i12, andIncrement, pVarB);
                        g gVar4 = gVar2;
                        if (objV0 == BufferedChannelKt.f22276m) {
                            kotlinx.coroutines.p pVar = androidx.activity.o.a(pVarB) ? pVarB : null;
                            if (pVar != null) {
                                C0(pVar, gVar4, i12);
                            }
                        } else if (objV0 == BufferedChannelKt.f22278o) {
                            if (andIncrement < c0()) {
                                gVar4.b();
                            }
                            gVar3 = gVar4;
                        } else {
                            if (objV0 == BufferedChannelKt.f22277n) {
                                throw new IllegalStateException("unexpected");
                            }
                            gVar4.b();
                            l9.l lVar = this.f22255b;
                            if (lVar != null) {
                                lVarA = OnUndeliveredElementKt.a(lVar, objV0, pVarB.getContext());
                            }
                        }
                    }
                } else {
                    gVar.b();
                    l9.l lVar2 = this.f22255b;
                    if (lVar2 != null) {
                        lVarA = OnUndeliveredElementKt.a(lVar2, objV0, pVarB.getContext());
                    }
                }
                pVarB.y(objV0, lVarA);
            }
            Object objW = pVarB.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objW;
        } catch (Throwable th) {
            pVarB.N();
            throw th;
        }
    }

    public final void J() {
        B();
    }

    public final void J0(kotlinx.coroutines.selects.h hVar, Object obj) {
        g gVar;
        g gVar2 = (g) W().get(this);
        while (!k0()) {
            long andIncrement = X().getAndIncrement(this);
            int i10 = BufferedChannelKt.f22265b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (gVar2.f22569c != j10) {
                g gVarN = N(j10, gVar2);
                if (gVarN == null) {
                    continue;
                } else {
                    gVar = gVarN;
                }
            } else {
                gVar = gVar2;
            }
            kotlinx.coroutines.selects.h hVar2 = hVar;
            Object objV0 = V0(gVar, i11, andIncrement, hVar2);
            gVar2 = gVar;
            if (objV0 == BufferedChannelKt.f22276m) {
                u2 u2Var = hVar2 instanceof u2 ? (u2) hVar2 : null;
                if (u2Var != null) {
                    C0(u2Var, gVar2, i11);
                    return;
                }
                return;
            }
            if (objV0 != BufferedChannelKt.f22278o) {
                if (objV0 == BufferedChannelKt.f22277n) {
                    throw new IllegalStateException("unexpected");
                }
                gVar2.b();
                hVar2.e(objV0);
                return;
            }
            if (andIncrement < c0()) {
                gVar2.b();
            }
            hVar = hVar2;
        }
        x0(hVar);
    }

    public final void K(long j10) {
        g gVarN;
        UndeliveredElementException undeliveredElementExceptionD;
        g gVar = (g) f22250i.get(this);
        while (true) {
            long j11 = f22246e.get(this);
            if (j10 < Math.max(this.f22254a + j11, Q())) {
                return;
            }
            if (f22246e.compareAndSet(this, j11, 1 + j11)) {
                int i10 = BufferedChannelKt.f22265b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (gVar.f22569c != j12) {
                    gVarN = N(j12, gVar);
                    if (gVarN == null) {
                        continue;
                    }
                } else {
                    gVarN = gVar;
                }
                Object objV0 = V0(gVarN, i11, j11, null);
                if (objV0 != BufferedChannelKt.f22278o) {
                    gVarN.b();
                    l9.l lVar = this.f22255b;
                    if (lVar != null && (undeliveredElementExceptionD = OnUndeliveredElementKt.d(lVar, objV0, null, 2, null)) != null) {
                        throw undeliveredElementExceptionD;
                    }
                } else if (j11 < c0()) {
                    gVarN.b();
                }
                gVar = gVarN;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (kotlinx.coroutines.channels.g) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(kotlinx.coroutines.channels.g r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r11 = this;
            l9.l r0 = r11.f22255b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.k.b(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.f22265b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f22569c
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.f22265b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.A(r4)
            kotlinx.coroutines.internal.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f22267d
            if (r8 != r9) goto L48
            long r9 = r11.Y()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            kotlinx.coroutines.internal.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r12.u(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.z(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.c(r0, r5, r1)
        L40:
            r12.v(r4)
            r12.s()
            goto Laf
        L48:
            kotlinx.coroutines.internal.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof kotlinx.coroutines.u2
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.p
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            kotlinx.coroutines.internal.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.p()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            kotlinx.coroutines.internal.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.Y()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.p
            if (r9 == 0) goto L80
            r9 = r8
            kotlinx.coroutines.channels.p r9 = (kotlinx.coroutines.channels.p) r9
            kotlinx.coroutines.u2 r9 = r9.f22300a
            goto L83
        L80:
            r9 = r8
            kotlinx.coroutines.u2 r9 = (kotlinx.coroutines.u2) r9
        L83:
            kotlinx.coroutines.internal.c0 r10 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r12.u(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.z(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.c(r0, r5, r1)
        L97:
            java.lang.Object r3 = kotlinx.coroutines.internal.k.c(r3, r9)
            r12.v(r4)
            r12.s()
            goto Laf
        La2:
            kotlinx.coroutines.internal.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r12.u(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.s()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            kotlinx.coroutines.internal.e r12 = r12.g()
            kotlinx.coroutines.channels.g r12 = (kotlinx.coroutines.channels.g) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            kotlinx.coroutines.u2 r3 = (kotlinx.coroutines.u2) r3
            r11.M0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.p.c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            kotlinx.coroutines.u2 r0 = (kotlinx.coroutines.u2) r0
            r11.M0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.K0(kotlinx.coroutines.channels.g):void");
    }

    public final void L() {
        if (o0()) {
            return;
        }
        g gVar = (g) f22251j.get(this);
        while (true) {
            long andIncrement = f22247f.getAndIncrement(this);
            int i10 = BufferedChannelKt.f22265b;
            long j10 = andIncrement / i10;
            if (c0() <= andIncrement) {
                if (gVar.f22569c < j10 && gVar.e() != null) {
                    t0(j10, gVar);
                }
                g0(this, 0L, 1, null);
                return;
            }
            if (gVar.f22569c != j10) {
                g gVarM = M(j10, gVar, andIncrement);
                if (gVarM == null) {
                    continue;
                } else {
                    gVar = gVarM;
                }
            }
            if (T0(gVar, (int) (andIncrement % i10), andIncrement)) {
                g0(this, 0L, 1, null);
                return;
            }
            g0(this, 0L, 1, null);
        }
    }

    public final void L0(u2 u2Var) {
        N0(u2Var, true);
    }

    public final g M(long j10, g gVar, long j11) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22251j;
        l9.p pVar = (l9.p) BufferedChannelKt.y();
        loop0: while (true) {
            objC = kotlinx.coroutines.internal.d.c(gVar, j10, pVar);
            if (!a0.c(objC)) {
                z zVarB = a0.b(objC);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f22569c >= zVarB.f22569c) {
                        break loop0;
                    }
                    if (!zVarB.t()) {
                        break;
                    }
                    if (t.a.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                        if (zVar.o()) {
                            zVar.m();
                        }
                    } else if (zVarB.o()) {
                        zVarB.m();
                    }
                }
            } else {
                break;
            }
        }
        if (a0.c(objC)) {
            J();
            t0(j10, gVar);
            g0(this, 0L, 1, null);
            return null;
        }
        g gVar2 = (g) a0.b(objC);
        if (gVar2.f22569c <= j10) {
            return gVar2;
        }
        long j12 = gVar2.f22569c;
        int i10 = BufferedChannelKt.f22265b;
        if (f22247f.compareAndSet(this, j11 + 1, j12 * i10)) {
            f0((gVar2.f22569c * i10) - j11);
        } else {
            g0(this, 0L, 1, null);
        }
        return null;
    }

    public final void M0(u2 u2Var) {
        N0(u2Var, false);
    }

    public final g N(long j10, g gVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22250i;
        l9.p pVar = (l9.p) BufferedChannelKt.y();
        loop0: while (true) {
            objC = kotlinx.coroutines.internal.d.c(gVar, j10, pVar);
            if (!a0.c(objC)) {
                z zVarB = a0.b(objC);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f22569c >= zVarB.f22569c) {
                        break loop0;
                    }
                    if (!zVarB.t()) {
                        break;
                    }
                    if (t.a.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                        if (zVar.o()) {
                            zVar.m();
                        }
                    } else if (zVarB.o()) {
                        zVarB.m();
                    }
                }
            } else {
                break;
            }
        }
        if (a0.c(objC)) {
            J();
            if (gVar.f22569c * BufferedChannelKt.f22265b < c0()) {
                gVar.b();
            }
            return null;
        }
        g gVar2 = (g) a0.b(objC);
        if (!o0() && j10 <= Q() / BufferedChannelKt.f22265b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22251j;
            while (true) {
                z zVar2 = (z) atomicReferenceFieldUpdater2.get(this);
                if (zVar2.f22569c >= gVar2.f22569c || !gVar2.t()) {
                    break;
                }
                if (t.a.a(atomicReferenceFieldUpdater2, this, zVar2, gVar2)) {
                    if (zVar2.o()) {
                        zVar2.m();
                    }
                } else if (gVar2.o()) {
                    gVar2.m();
                }
            }
        }
        long j11 = gVar2.f22569c;
        if (j11 <= j10) {
            return gVar2;
        }
        int i10 = BufferedChannelKt.f22265b;
        Z0(j11 * i10);
        if (gVar2.f22569c * i10 < c0()) {
            gVar2.b();
        }
        return null;
    }

    public final void N0(u2 u2Var, boolean z10) {
        if (u2Var instanceof kotlinx.coroutines.o) {
            c9.c cVar = (c9.c) u2Var;
            Result.Companion companion = Result.INSTANCE;
            cVar.resumeWith(Result.b(kotlin.c.a(z10 ? V() : Z())));
        } else if (u2Var instanceof m) {
            kotlinx.coroutines.p pVar = ((m) u2Var).f22299a;
            Result.Companion companion2 = Result.INSTANCE;
            pVar.resumeWith(Result.b(e.b(e.f22291b.a(S()))));
        } else if (u2Var instanceof a) {
            ((a) u2Var).j();
        } else {
            if (u2Var instanceof kotlinx.coroutines.selects.h) {
                ((kotlinx.coroutines.selects.h) u2Var).h(this, BufferedChannelKt.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + u2Var).toString());
        }
    }

    public final g O(long j10, g gVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22249h;
        l9.p pVar = (l9.p) BufferedChannelKt.y();
        loop0: while (true) {
            objC = kotlinx.coroutines.internal.d.c(gVar, j10, pVar);
            if (!a0.c(objC)) {
                z zVarB = a0.b(objC);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f22569c >= zVarB.f22569c) {
                        break loop0;
                    }
                    if (!zVarB.t()) {
                        break;
                    }
                    if (t.a.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                        if (zVar.o()) {
                            zVar.m();
                        }
                    } else if (zVarB.o()) {
                        zVarB.m();
                    }
                }
            } else {
                break;
            }
        }
        if (a0.c(objC)) {
            J();
            if (gVar.f22569c * BufferedChannelKt.f22265b < Y()) {
                gVar.b();
            }
            return null;
        }
        g gVar2 = (g) a0.b(objC);
        long j11 = gVar2.f22569c;
        if (j11 <= j10) {
            return gVar2;
        }
        int i10 = BufferedChannelKt.f22265b;
        a1(j11 * i10);
        if (gVar2.f22569c * i10 < Y()) {
            gVar2.b();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P0(kotlinx.coroutines.channels.g r17, int r18, java.lang.Object r19, long r20, c9.c r22) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.P0(kotlinx.coroutines.channels.g, int, java.lang.Object, long, c9.c):java.lang.Object");
    }

    public final long Q() {
        return f22247f.get(this);
    }

    public final boolean Q0(long j10) {
        if (m0(j10)) {
            return false;
        }
        return !C(j10 & 1152921504606846975L);
    }

    public final boolean R0(Object obj, Object obj2) {
        if (obj instanceof kotlinx.coroutines.selects.h) {
            return ((kotlinx.coroutines.selects.h) obj).h(this, obj2);
        }
        if (obj instanceof m) {
            kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            m mVar = (m) obj;
            kotlinx.coroutines.p pVar = mVar.f22299a;
            e eVarB = e.b(e.f22291b.c(obj2));
            l9.l lVar = this.f22255b;
            return BufferedChannelKt.B(pVar, eVarB, lVar != null ? OnUndeliveredElementKt.a(lVar, obj2, mVar.f22299a.getContext()) : null);
        }
        if (obj instanceof a) {
            kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof kotlinx.coroutines.o) {
            kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.o oVar = (kotlinx.coroutines.o) obj;
            l9.l lVar2 = this.f22255b;
            return BufferedChannelKt.B(oVar, obj2, lVar2 != null ? OnUndeliveredElementKt.a(lVar2, obj2, oVar.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Throwable S() {
        return (Throwable) f22252k.get(this);
    }

    public final boolean S0(Object obj, g gVar, int i10) {
        if (obj instanceof kotlinx.coroutines.o) {
            kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.C((kotlinx.coroutines.o) obj, s.f25199a, null, 2, null);
        }
        if (!(obj instanceof kotlinx.coroutines.selects.h)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        TrySelectDetailedResult trySelectDetailedResultB = ((SelectImplementation) obj).B(this, s.f25199a);
        if (trySelectDetailedResultB == TrySelectDetailedResult.f22655b) {
            gVar.v(i10);
        }
        return trySelectDetailedResultB == TrySelectDetailedResult.f22654a;
    }

    public final boolean T0(g gVar, int i10, long j10) {
        Object objA = gVar.A(i10);
        if (!(objA instanceof u2) || j10 < f22246e.get(this) || !gVar.u(i10, objA, BufferedChannelKt.f22270g)) {
            return U0(gVar, i10, j10);
        }
        if (S0(objA, gVar, i10)) {
            gVar.E(i10, BufferedChannelKt.f22267d);
            return true;
        }
        gVar.E(i10, BufferedChannelKt.f22273j);
        gVar.B(i10, false);
        return false;
    }

    public final boolean U0(g gVar, int i10, long j10) {
        while (true) {
            Object objA = gVar.A(i10);
            if (objA instanceof u2) {
                if (j10 < f22246e.get(this)) {
                    if (gVar.u(i10, objA, new p((u2) objA))) {
                        return true;
                    }
                } else if (gVar.u(i10, objA, BufferedChannelKt.f22270g)) {
                    if (S0(objA, gVar, i10)) {
                        gVar.E(i10, BufferedChannelKt.f22267d);
                        return true;
                    }
                    gVar.E(i10, BufferedChannelKt.f22273j);
                    gVar.B(i10, false);
                    return false;
                }
            } else {
                if (objA == BufferedChannelKt.f22273j) {
                    return false;
                }
                if (objA == null) {
                    if (gVar.u(i10, objA, BufferedChannelKt.f22268e)) {
                        return true;
                    }
                } else {
                    if (objA == BufferedChannelKt.f22267d || objA == BufferedChannelKt.f22271h || objA == BufferedChannelKt.f22272i || objA == BufferedChannelKt.f22274k || objA == BufferedChannelKt.z()) {
                        return true;
                    }
                    if (objA != BufferedChannelKt.f22269f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objA).toString());
                    }
                }
            }
        }
    }

    public final Throwable V() {
        Throwable thS = S();
        return thS == null ? new ClosedReceiveChannelException("Channel was closed") : thS;
    }

    public final Object V0(g gVar, int i10, long j10, Object obj) {
        Object objA = gVar.A(i10);
        if (objA == null) {
            if (j10 >= (f22245d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.f22277n;
                }
                if (gVar.u(i10, objA, obj)) {
                    L();
                    return BufferedChannelKt.f22276m;
                }
            }
        } else if (objA == BufferedChannelKt.f22267d && gVar.u(i10, objA, BufferedChannelKt.f22272i)) {
            L();
            return gVar.C(i10);
        }
        return W0(gVar, i10, j10, obj);
    }

    public final Object W0(g gVar, int i10, long j10, Object obj) {
        while (true) {
            Object objA = gVar.A(i10);
            if (objA == null || objA == BufferedChannelKt.f22268e) {
                if (j10 < (f22245d.get(this) & 1152921504606846975L)) {
                    if (gVar.u(i10, objA, BufferedChannelKt.f22271h)) {
                        L();
                        return BufferedChannelKt.f22278o;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.f22277n;
                    }
                    if (gVar.u(i10, objA, obj)) {
                        L();
                        return BufferedChannelKt.f22276m;
                    }
                }
            } else {
                if (objA != BufferedChannelKt.f22267d) {
                    if (objA != BufferedChannelKt.f22273j && objA != BufferedChannelKt.f22271h) {
                        if (objA == BufferedChannelKt.z()) {
                            L();
                            return BufferedChannelKt.f22278o;
                        }
                        if (objA != BufferedChannelKt.f22270g && gVar.u(i10, objA, BufferedChannelKt.f22269f)) {
                            boolean z10 = objA instanceof p;
                            if (z10) {
                                objA = ((p) objA).f22300a;
                            }
                            if (S0(objA, gVar, i10)) {
                                gVar.E(i10, BufferedChannelKt.f22272i);
                                L();
                                return gVar.C(i10);
                            }
                            gVar.E(i10, BufferedChannelKt.f22273j);
                            gVar.B(i10, false);
                            if (z10) {
                                L();
                            }
                            return BufferedChannelKt.f22278o;
                        }
                    }
                    return BufferedChannelKt.f22278o;
                }
                if (gVar.u(i10, objA, BufferedChannelKt.f22272i)) {
                    L();
                    return gVar.C(i10);
                }
            }
        }
    }

    public final int X0(g gVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        gVar.F(i10, obj);
        if (z10) {
            return Y0(gVar, i10, obj, j10, obj2, z10);
        }
        Object objA = gVar.A(i10);
        if (objA == null) {
            if (C(j10)) {
                if (gVar.u(i10, null, BufferedChannelKt.f22267d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (gVar.u(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objA instanceof u2) {
            gVar.v(i10);
            if (R0(objA, obj)) {
                gVar.E(i10, BufferedChannelKt.f22272i);
                A0();
                return 0;
            }
            if (gVar.w(i10, BufferedChannelKt.f22274k) == BufferedChannelKt.f22274k) {
                return 5;
            }
            gVar.B(i10, true);
            return 5;
        }
        return Y0(gVar, i10, obj, j10, obj2, z10);
    }

    public final long Y() {
        return f22246e.get(this);
    }

    public final int Y0(g gVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objA = gVar.A(i10);
            if (objA == null) {
                if (!C(j10) || z10) {
                    if (z10) {
                        if (gVar.u(i10, null, BufferedChannelKt.f22273j)) {
                            gVar.B(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (gVar.u(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (gVar.u(i10, null, BufferedChannelKt.f22267d)) {
                    return 1;
                }
            } else {
                if (objA != BufferedChannelKt.f22268e) {
                    if (objA == BufferedChannelKt.f22274k) {
                        gVar.v(i10);
                        return 5;
                    }
                    if (objA == BufferedChannelKt.f22271h) {
                        gVar.v(i10);
                        return 5;
                    }
                    if (objA == BufferedChannelKt.z()) {
                        gVar.v(i10);
                        J();
                        return 4;
                    }
                    gVar.v(i10);
                    if (objA instanceof p) {
                        objA = ((p) objA).f22300a;
                    }
                    if (R0(objA, obj)) {
                        gVar.E(i10, BufferedChannelKt.f22272i);
                        A0();
                        return 0;
                    }
                    if (gVar.w(i10, BufferedChannelKt.f22274k) != BufferedChannelKt.f22274k) {
                        gVar.B(i10, true);
                    }
                    return 5;
                }
                if (gVar.u(i10, objA, BufferedChannelKt.f22267d)) {
                    return 1;
                }
            }
        }
    }

    public final Throwable Z() {
        Throwable thS = S();
        return thS == null ? new ClosedSendChannelException("Channel was closed") : thS;
    }

    public final void Z0(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22246e;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f22246e.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.n
    public final void a(CancellationException cancellationException) {
        D(cancellationException);
    }

    public final void a1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22245d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f22245d.compareAndSet(this, j11, BufferedChannelKt.w(j12, (int) (j11 >> 60))));
    }

    @Override // kotlinx.coroutines.channels.o
    public Object b(Object obj, c9.c cVar) {
        return O0(this, obj, cVar);
    }

    public final void b1(long j10) {
        BufferedChannel bufferedChannel = this;
        if (bufferedChannel.o0()) {
            return;
        }
        while (bufferedChannel.Q() <= j10) {
            bufferedChannel = this;
        }
        int i10 = BufferedChannelKt.f22266c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jQ = bufferedChannel.Q();
            if (jQ == (4611686018427387903L & f22248g.get(bufferedChannel)) && jQ == bufferedChannel.Q()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22248g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j11, BufferedChannelKt.v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long jQ2 = bufferedChannel.Q();
            long j12 = f22248g.get(bufferedChannel);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (jQ2 == j13 && jQ2 == bufferedChannel.Q()) {
                break;
            }
            if (z10) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                f22248g.compareAndSet(bufferedChannel, j12, BufferedChannelKt.v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f22248g;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j14, BufferedChannelKt.v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    @Override // kotlinx.coroutines.channels.n
    public Object c(c9.c cVar) {
        return G0(this, cVar);
    }

    public final long c0() {
        return f22245d.get(this) & 1152921504606846975L;
    }

    public final boolean e0() {
        while (true) {
            g gVarN = (g) f22250i.get(this);
            long jY = Y();
            if (c0() <= jY) {
                return false;
            }
            int i10 = BufferedChannelKt.f22265b;
            long j10 = jY / i10;
            if (gVarN.f22569c == j10 || (gVarN = N(j10, gVarN)) != null) {
                gVarN.b();
                if (i0(gVarN, (int) (jY % i10), jY)) {
                    return true;
                }
                f22246e.compareAndSet(this, jY, 1 + jY);
            } else if (((g) f22250i.get(this)).f22569c < j10) {
                return false;
            }
        }
    }

    public final void f0(long j10) {
        if ((f22248g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f22248g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void h0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22253l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!t.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f22280q : BufferedChannelKt.f22281r));
        if (obj == null) {
            return;
        }
        ((l9.l) obj).invoke(S());
    }

    public final boolean i0(g gVar, int i10, long j10) {
        Object objA;
        do {
            objA = gVar.A(i10);
            if (objA != null && objA != BufferedChannelKt.f22268e) {
                if (objA == BufferedChannelKt.f22267d) {
                    return true;
                }
                if (objA == BufferedChannelKt.f22273j || objA == BufferedChannelKt.z() || objA == BufferedChannelKt.f22272i || objA == BufferedChannelKt.f22271h) {
                    return false;
                }
                if (objA == BufferedChannelKt.f22270g) {
                    return true;
                }
                return objA != BufferedChannelKt.f22269f && j10 == Y();
            }
        } while (!gVar.u(i10, objA, BufferedChannelKt.f22271h));
        L();
        return false;
    }

    @Override // kotlinx.coroutines.channels.n
    public c iterator() {
        return new a();
    }

    public final boolean j0(long j10, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            I(j10 & 1152921504606846975L);
            return (z10 && e0()) ? false : true;
        }
        if (i10 == 3) {
            H(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    public boolean k0() {
        return l0(f22245d.get(this));
    }

    public final boolean l0(long j10) {
        return j0(j10, true);
    }

    public final boolean m0(long j10) {
        return j0(j10, false);
    }

    @Override // kotlinx.coroutines.channels.o
    public Object n(Object obj) {
        g gVarO;
        long j10;
        BufferedChannel bufferedChannel;
        if (Q0(f22245d.get(this))) {
            return e.f22291b.b();
        }
        Object obj2 = BufferedChannelKt.f22273j;
        g gVar = (g) a0().get(this);
        while (true) {
            long andIncrement = b0().getAndIncrement(this);
            long j11 = 1152921504606846975L & andIncrement;
            boolean zM0 = m0(andIncrement);
            int i10 = BufferedChannelKt.f22265b;
            long j12 = j11 / i10;
            int i11 = (int) (j11 % i10);
            if (gVar.f22569c != j12) {
                gVarO = O(j12, gVar);
                if (gVarO != null) {
                    bufferedChannel = this;
                    j10 = j11;
                } else if (zM0) {
                    return e.f22291b.a(Z());
                }
            } else {
                gVarO = gVar;
                j10 = j11;
                bufferedChannel = this;
            }
            Object obj3 = obj;
            int iX0 = bufferedChannel.X0(gVarO, i11, obj3, j10, obj2, zM0);
            gVar = gVarO;
            if (iX0 == 0) {
                gVar.b();
                return e.f22291b.c(s.f25199a);
            }
            if (iX0 == 1) {
                return e.f22291b.c(s.f25199a);
            }
            if (iX0 == 2) {
                if (zM0) {
                    gVar.s();
                    return e.f22291b.a(Z());
                }
                u2 u2Var = obj2 instanceof u2 ? (u2) obj2 : null;
                if (u2Var != null) {
                    D0(u2Var, gVar, i11);
                }
                gVar.s();
                return e.f22291b.b();
            }
            if (iX0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iX0 == 4) {
                if (j10 < Y()) {
                    gVar.b();
                }
                return e.f22291b.a(Z());
            }
            if (iX0 == 5) {
                gVar.b();
            }
            obj = obj3;
        }
    }

    public boolean n0() {
        return false;
    }

    public final boolean o0() {
        long jQ = Q();
        return jQ == 0 || jQ == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (kotlinx.coroutines.channels.g) r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long p0(kotlinx.coroutines.channels.g r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.f22265b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f22569c
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.f22265b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.Y()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.A(r0)
            if (r1 == 0) goto L2c
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.f22267d
            if (r1 != r2) goto L39
            return r3
        L2c:
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r1 = r8.u(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.s()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            kotlinx.coroutines.internal.e r8 = r8.g()
            kotlinx.coroutines.channels.g r8 = (kotlinx.coroutines.channels.g) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.p0(kotlinx.coroutines.channels.g):long");
    }

    public final void q0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22245d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.w(1152921504606846975L & j10, 1)));
    }

    public final void r0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22245d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.w(1152921504606846975L & j10, 3)));
    }

    public final void s0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22245d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = BufferedChannelKt.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = BufferedChannelKt.w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t0(long r5, kotlinx.coroutines.channels.g r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f22569c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.e r0 = r7.e()
            kotlinx.coroutines.channels.g r0 = (kotlinx.coroutines.channels.g) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.j()
            if (r5 == 0) goto L22
            kotlinx.coroutines.internal.e r5 = r7.e()
            kotlinx.coroutines.channels.g r5 = (kotlinx.coroutines.channels.g) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = R()
        L26:
            java.lang.Object r6 = r5.get(r4)
            kotlinx.coroutines.internal.z r6 = (kotlinx.coroutines.internal.z) r6
            long r0 = r6.f22569c
            long r2 = r7.f22569c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.t()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = t.a.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.o()
            if (r5 == 0) goto L4b
            r6.m()
        L4b:
            return
        L4c:
            boolean r6 = r7.o()
            if (r6 == 0) goto L26
            r7.m()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.t0(long, kotlinx.coroutines.channels.g):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01eb, code lost:
    
        r16 = r7;
        r3 = (kotlinx.coroutines.channels.g) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f4, code lost:
    
        if (r3 != null) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    @Override // kotlinx.coroutines.channels.n
    public kotlinx.coroutines.selects.e u() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.f22260a;
        kotlin.jvm.internal.p.c(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        q qVar = (q) x.b(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.f22261a;
        kotlin.jvm.internal.p.c(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.f(this, qVar, (q) x.b(bufferedChannel$onReceiveCatching$2, 3), this.f22256c);
    }

    public void u0() {
    }

    @Override // kotlinx.coroutines.channels.n
    public Object v() {
        g gVarN;
        long j10 = f22246e.get(this);
        long j11 = f22245d.get(this);
        if (l0(j11)) {
            return e.f22291b.a(S());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return e.f22291b.b();
        }
        Object obj = BufferedChannelKt.f22274k;
        g gVar = (g) W().get(this);
        while (!k0()) {
            long andIncrement = X().getAndIncrement(this);
            int i10 = BufferedChannelKt.f22265b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (gVar.f22569c != j12) {
                gVarN = N(j12, gVar);
                if (gVarN == null) {
                    continue;
                }
            } else {
                gVarN = gVar;
            }
            Object objV0 = V0(gVarN, i11, andIncrement, obj);
            if (objV0 == BufferedChannelKt.f22276m) {
                u2 u2Var = obj instanceof u2 ? (u2) obj : null;
                if (u2Var != null) {
                    C0(u2Var, gVarN, i11);
                }
                b1(andIncrement);
                gVarN.s();
                return e.f22291b.b();
            }
            if (objV0 != BufferedChannelKt.f22278o) {
                if (objV0 == BufferedChannelKt.f22277n) {
                    throw new IllegalStateException("unexpected");
                }
                gVarN.b();
                return e.f22291b.c(objV0);
            }
            if (andIncrement < c0()) {
                gVarN.b();
            }
            gVar = gVarN;
        }
        return e.f22291b.a(S());
    }

    public final void v0(kotlinx.coroutines.o oVar) {
        Result.Companion companion = Result.INSTANCE;
        oVar.resumeWith(Result.b(e.b(e.f22291b.a(S()))));
    }

    @Override // kotlinx.coroutines.channels.o
    public void w(l9.l lVar) {
        if (t.a.a(f22253l, this, null, lVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22253l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.f22280q) {
                if (obj == BufferedChannelKt.f22281r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!t.a.a(f22253l, this, BufferedChannelKt.f22280q, BufferedChannelKt.f22281r));
        lVar.invoke(S());
    }

    public final void w0(kotlinx.coroutines.o oVar) {
        Result.Companion companion = Result.INSTANCE;
        oVar.resumeWith(Result.b(kotlin.c.a(V())));
    }

    @Override // kotlinx.coroutines.channels.n
    public Object x(c9.c cVar) {
        return F0(this, cVar);
    }

    public final void x0(kotlinx.coroutines.selects.h hVar) {
        hVar.e(BufferedChannelKt.z());
    }

    public final Object y0(Object obj, c9.c cVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionD;
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        l9.l lVar = this.f22255b;
        if (lVar == null || (undeliveredElementExceptionD = OnUndeliveredElementKt.d(lVar, obj, null, 2, null)) == null) {
            Throwable thZ = Z();
            Result.Companion companion = Result.INSTANCE;
            pVar.resumeWith(Result.b(kotlin.c.a(thZ)));
        } else {
            y8.d.a(undeliveredElementExceptionD, Z());
            Result.Companion companion2 = Result.INSTANCE;
            pVar.resumeWith(Result.b(kotlin.c.a(undeliveredElementExceptionD)));
        }
        Object objW = pVar.w();
        if (objW == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objW == kotlin.coroutines.intrinsics.a.f() ? objW : s.f25199a;
    }

    public final void z0(Object obj, kotlinx.coroutines.o oVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        l9.l lVar = this.f22255b;
        if (lVar != null) {
            OnUndeliveredElementKt.b(lVar, obj, oVar.getContext());
        }
        Throwable thZ = Z();
        Result.Companion companion = Result.INSTANCE;
        oVar.resumeWith(Result.b(kotlin.c.a(thZ)));
    }
}
