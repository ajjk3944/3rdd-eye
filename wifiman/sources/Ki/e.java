package Ki;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import Ii.a1;
import Ni.A;
import Ni.AbstractC3399a;
import Ni.AbstractC3400b;
import Ni.AbstractC3407i;
import Ni.B;
import Ni.z;
import Yg.AbstractC3663g;
import Yg.J;
import Yg.u;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public class e implements g {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10824d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10825e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10826f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10827g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10828h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10829i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10830j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10831k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10832l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f10833a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6835l f10834b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    private final mh.q f10835c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    private final class a implements i, a1 {

        /* renamed from: a, reason: collision with root package name */
        private Object f10836a = f.f10864p;

        /* renamed from: b, reason: collision with root package name */
        private C3073p f10837b;

        public a() {
        }

        private final Object f(m mVar, int i10, long j10, InterfaceC5380e interfaceC5380e) {
            Boolean boolA;
            e eVar = e.this;
            C3073p c3073pB = Ii.r.b(AbstractC5467b.d(interfaceC5380e));
            try {
                this.f10837b = c3073pB;
                Object objG1 = eVar.g1(mVar, i10, j10, this);
                if (objG1 == f.f10861m) {
                    eVar.O0(this, mVar, i10);
                } else {
                    mh.q qVarH = null;
                    if (objG1 == f.f10863o) {
                        if (j10 < eVar.l0()) {
                            mVar.c();
                        }
                        m mVar2 = (m) e.f0().get(eVar);
                        while (true) {
                            if (eVar.t0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.g0().getAndIncrement(eVar);
                            int i11 = f.f10850b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (mVar2.f16629c != j11) {
                                m mVarW = eVar.W(j11, mVar2);
                                if (mVarW != null) {
                                    mVar2 = mVarW;
                                }
                            }
                            Object objG12 = eVar.g1(mVar2, i12, andIncrement, this);
                            if (objG12 == f.f10861m) {
                                eVar.O0(this, mVar2, i12);
                                break;
                            }
                            if (objG12 == f.f10863o) {
                                if (andIncrement < eVar.l0()) {
                                    mVar2.c();
                                }
                            } else {
                                if (objG12 == f.f10862n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVar2.c();
                                this.f10836a = objG12;
                                this.f10837b = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                InterfaceC6835l interfaceC6835l = eVar.f10834b;
                                if (interfaceC6835l != null) {
                                    qVarH = eVar.H(interfaceC6835l, objG12);
                                }
                            }
                        }
                    } else {
                        mVar.c();
                        this.f10836a = objG1;
                        this.f10837b = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        InterfaceC6835l interfaceC6835l2 = eVar.f10834b;
                        if (interfaceC6835l2 != null) {
                            qVarH = eVar.H(interfaceC6835l2, objG1);
                        }
                    }
                    c3073pB.b0(boolA, qVarH);
                }
                Object objU = c3073pB.u();
                if (objU == AbstractC5467b.g()) {
                    kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
                }
                return objU;
            } catch (Throwable th2) {
                c3073pB.K();
                throw th2;
            }
        }

        private final boolean g() throws Throwable {
            this.f10836a = f.z();
            Throwable thB0 = e.this.b0();
            if (thB0 == null) {
                return false;
            }
            throw B.a(thB0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C3073p c3073p = this.f10837b;
            AbstractC6492s.f(c3073p);
            this.f10837b = null;
            this.f10836a = f.z();
            Throwable thB0 = e.this.b0();
            if (thB0 == null) {
                u.a aVar = Yg.u.f25017b;
                c3073p.resumeWith(Yg.u.c(Boolean.FALSE));
            } else {
                u.a aVar2 = Yg.u.f25017b;
                c3073p.resumeWith(Yg.u.c(Yg.v.a(thB0)));
            }
        }

        @Override // Ki.i
        public Object a(InterfaceC5380e interfaceC5380e) throws Throwable {
            boolean zG = true;
            if (this.f10836a == f.f10864p || this.f10836a == f.z()) {
                e eVar = e.this;
                m mVar = (m) e.f0().get(eVar);
                while (true) {
                    if (eVar.t0()) {
                        zG = g();
                        break;
                    }
                    long andIncrement = e.g0().getAndIncrement(eVar);
                    int i10 = f.f10850b;
                    long j10 = andIncrement / i10;
                    int i11 = (int) (andIncrement % i10);
                    if (mVar.f16629c != j10) {
                        m mVarW = eVar.W(j10, mVar);
                        if (mVarW == null) {
                            continue;
                        } else {
                            mVar = mVarW;
                        }
                    }
                    Object objG1 = eVar.g1(mVar, i11, andIncrement, null);
                    if (objG1 == f.f10861m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objG1 == f.f10863o) {
                        if (andIncrement < eVar.l0()) {
                            mVar.c();
                        }
                    } else {
                        if (objG1 == f.f10862n) {
                            return f(mVar, i11, andIncrement, interfaceC5380e);
                        }
                        mVar.c();
                        this.f10836a = objG1;
                    }
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        @Override // Ii.a1
        public void b(z zVar, int i10) {
            C3073p c3073p = this.f10837b;
            if (c3073p != null) {
                c3073p.b(zVar, i10);
            }
        }

        public final boolean i(Object obj) {
            C3073p c3073p = this.f10837b;
            AbstractC6492s.f(c3073p);
            this.f10837b = null;
            this.f10836a = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            InterfaceC6835l interfaceC6835l = eVar.f10834b;
            return f.B(c3073p, bool, interfaceC6835l != null ? eVar.H(interfaceC6835l, obj) : null);
        }

        public final void j() {
            C3073p c3073p = this.f10837b;
            AbstractC6492s.f(c3073p);
            this.f10837b = null;
            this.f10836a = f.z();
            Throwable thB0 = e.this.b0();
            if (thB0 == null) {
                u.a aVar = Yg.u.f25017b;
                c3073p.resumeWith(Yg.u.c(Boolean.FALSE));
            } else {
                u.a aVar2 = Yg.u.f25017b;
                c3073p.resumeWith(Yg.u.c(Yg.v.a(thB0)));
            }
        }

        @Override // Ki.i
        public Object next() throws Throwable {
            Object obj = this.f10836a;
            if (obj == f.f10864p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f10836a = f.f10864p;
            if (obj != f.z()) {
                return obj;
            }
            throw B.a(e.this.e0());
        }
    }

    /* synthetic */ class b extends C6490p implements mh.q {
        b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, Object obj, InterfaceC5384i interfaceC5384i) {
            ((e) this.receiver).E0(th2, obj, interfaceC5384i);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Throwable) obj, obj2, (InterfaceC5384i) obj3);
            return J.f24997a;
        }
    }

    /* synthetic */ class c extends C6490p implements mh.q {
        c(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, Object obj, InterfaceC5384i interfaceC5384i) {
            ((e) this.receiver).D0(th2, obj, interfaceC5384i);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Throwable) obj, ((k) obj2).l(), (InterfaceC5384i) obj3);
            return J.f24997a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f10839a;

        /* renamed from: c, reason: collision with root package name */
        int f10841c;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10839a = obj;
            this.f10841c |= PduHandle.NONE;
            Object objR0 = e.R0(e.this, this);
            return objR0 == AbstractC5467b.g() ? objR0 : k.b(objR0);
        }
    }

    /* renamed from: Ki.e$e, reason: collision with other inner class name */
    static final class C0435e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f10842a;

        /* renamed from: b, reason: collision with root package name */
        Object f10843b;

        /* renamed from: c, reason: collision with root package name */
        int f10844c;

        /* renamed from: d, reason: collision with root package name */
        long f10845d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f10846e;

        /* renamed from: g, reason: collision with root package name */
        int f10848g;

        C0435e(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10846e = obj;
            this.f10848g |= PduHandle.NONE;
            Object objS0 = e.this.S0(null, 0, 0L, this);
            return objS0 == AbstractC5467b.g() ? objS0 : k.b(objS0);
        }
    }

    public e(int i10, InterfaceC6835l interfaceC6835l) {
        this.f10833a = i10;
        this.f10834b = interfaceC6835l;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = Z();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (x0()) {
            mVar = f.f10849a;
            AbstractC6492s.g(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.f10835c = interfaceC6835l != null ? new mh.q() { // from class: Ki.b
            @Override // mh.q
            public final Object s(Object obj, Object obj2, Object obj3) {
                e eVar = this.f10819a;
                AbstractC5487d.a(obj);
                return e.M0(eVar, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = f.f10867s;
    }

    private final void A0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10824d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 3)));
    }

    private final void B0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10824d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = f.w(j10 & 1152921504606846975L, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = f.w(j10 & 1152921504606846975L, 3);
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
    private final void C0(long r5, Ki.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f16629c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            Ni.b r0 = r7.f()
            Ki.m r0 = (Ki.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            Ni.b r5 = r7.f()
            Ki.m r5 = (Ki.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a0()
        L26:
            java.lang.Object r6 = r5.get(r4)
            Ni.z r6 = (Ni.z) r6
            long r0 = r6.f16629c
            long r2 = r7.f16629c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L4b
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.p()
            if (r5 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.e.C0(long, Ki.m):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(Throwable th2, Object obj, InterfaceC5384i interfaceC5384i) {
        InterfaceC6835l interfaceC6835l = this.f10834b;
        AbstractC6492s.f(interfaceC6835l);
        Object objF = k.f(obj);
        AbstractC6492s.f(objF);
        Ni.v.a(interfaceC6835l, objF, interfaceC5384i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(Throwable th2, Object obj, InterfaceC5384i interfaceC5384i) {
        InterfaceC6835l interfaceC6835l = this.f10834b;
        AbstractC6492s.f(interfaceC6835l);
        Ni.v.a(interfaceC6835l, obj, interfaceC5384i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(InterfaceC3069n interfaceC3069n) {
        u.a aVar = Yg.u.f25017b;
        interfaceC3069n.resumeWith(Yg.u.c(k.b(k.f10873b.a(b0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mh.q H(final InterfaceC6835l interfaceC6835l, final Object obj) {
        return new mh.q() { // from class: Ki.c
            @Override // mh.q
            public final Object s(Object obj2, Object obj3, Object obj4) {
                return e.J(interfaceC6835l, obj, (Throwable) obj2, obj3, (InterfaceC5384i) obj4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(InterfaceC3069n interfaceC3069n) {
        u.a aVar = Yg.u.f25017b;
        interfaceC3069n.resumeWith(Yg.u.c(Yg.v.a(e0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final th.g I(InterfaceC6835l interfaceC6835l) {
        return new b(this);
    }

    private final Object I0(Object obj, InterfaceC5380e interfaceC5380e) {
        UndeliveredElementException undeliveredElementExceptionC;
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        InterfaceC6835l interfaceC6835l = this.f10834b;
        if (interfaceC6835l == null || (undeliveredElementExceptionC = Ni.v.c(interfaceC6835l, obj, null, 2, null)) == null) {
            Throwable thI0 = i0();
            u.a aVar = Yg.u.f25017b;
            c3073p.resumeWith(Yg.u.c(Yg.v.a(thI0)));
        } else {
            AbstractC3663g.a(undeliveredElementExceptionC, i0());
            u.a aVar2 = Yg.u.f25017b;
            c3073p.resumeWith(Yg.u.c(Yg.v.a(undeliveredElementExceptionC)));
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J J(InterfaceC6835l interfaceC6835l, Object obj, Throwable th2, Object obj2, InterfaceC5384i interfaceC5384i) {
        Ni.v.a(interfaceC6835l, obj, interfaceC5384i);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(Object obj, InterfaceC3069n interfaceC3069n) {
        InterfaceC6835l interfaceC6835l = this.f10834b;
        if (interfaceC6835l != null) {
            Ni.v.a(interfaceC6835l, obj, interfaceC3069n.getContext());
        }
        Throwable thI0 = i0();
        u.a aVar = Yg.u.f25017b;
        interfaceC3069n.resumeWith(Yg.u.c(Yg.v.a(thI0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final th.g K(InterfaceC6835l interfaceC6835l) {
        return new c(this);
    }

    private final boolean L(long j10) {
        return j10 < Z() || j10 < h0() + ((long) this.f10833a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mh.q M0(final e eVar, final Si.e eVar2, Object obj, final Object obj2) {
        return new mh.q(obj2, eVar, eVar2) { // from class: Ki.d

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f10822a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f10823b;

            @Override // mh.q
            public final Object s(Object obj3, Object obj4, Object obj5) {
                return e.N0(this.f10822a, this.f10823b, null, (Throwable) obj3, obj4, (InterfaceC5384i) obj5);
            }
        };
    }

    private final void N(m mVar, long j10) {
        Object objB = AbstractC3407i.b(null, 1, null);
        loop0: while (mVar != null) {
            for (int i10 = f.f10850b - 1; -1 < i10; i10--) {
                if ((mVar.f16629c * f.f10850b) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = mVar.B(i10);
                    if (objB2 != null && objB2 != f.f10853e) {
                        if (!(objB2 instanceof x)) {
                            if (!(objB2 instanceof a1)) {
                                break;
                            }
                            if (mVar.v(i10, objB2, f.z())) {
                                objB = AbstractC3407i.c(objB, objB2);
                                mVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (mVar.v(i10, objB2, f.z())) {
                                objB = AbstractC3407i.c(objB, ((x) objB2).f10891a);
                                mVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar.v(i10, objB2, f.z())) {
                            mVar.t();
                            break;
                        }
                    }
                }
            }
            mVar = (m) mVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                V0((a1) objB);
                return;
            }
            AbstractC6492s.g(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                V0((a1) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J N0(Object obj, e eVar, Si.e eVar2, Throwable th2, Object obj2, InterfaceC5384i interfaceC5384i) {
        if (obj != f.z()) {
            Ni.v.a(eVar.f10834b, obj, eVar2.getContext());
        }
        return J.f24997a;
    }

    private final m O() {
        Object obj = f10830j.get(this);
        m mVar = (m) f10828h.get(this);
        if (mVar.f16629c > ((m) obj).f16629c) {
            obj = mVar;
        }
        m mVar2 = (m) f10829i.get(this);
        if (mVar2.f16629c > ((m) obj).f16629c) {
            obj = mVar2;
        }
        return (m) AbstractC3399a.b((AbstractC3400b) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(a1 a1Var, m mVar, int i10) {
        L0();
        a1Var.b(mVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(a1 a1Var, m mVar, int i10) {
        a1Var.b(mVar, i10 + f.f10850b);
    }

    private final void Q(long j10) {
        U0(R(j10));
    }

    static /* synthetic */ Object Q0(e eVar, InterfaceC5380e interfaceC5380e) throws Throwable {
        m mVar = (m) f0().get(eVar);
        while (!eVar.t0()) {
            long andIncrement = g0().getAndIncrement(eVar);
            int i10 = f.f10850b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar.f16629c != j10) {
                m mVarW = eVar.W(j10, mVar);
                if (mVarW == null) {
                    continue;
                } else {
                    mVar = mVarW;
                }
            }
            Object objG1 = eVar.g1(mVar, i11, andIncrement, null);
            if (objG1 == f.f10861m) {
                throw new IllegalStateException("unexpected");
            }
            if (objG1 != f.f10863o) {
                if (objG1 == f.f10862n) {
                    return eVar.T0(mVar, i11, andIncrement, interfaceC5380e);
                }
                mVar.c();
                return objG1;
            }
            if (andIncrement < eVar.l0()) {
                mVar.c();
            }
        }
        throw B.a(eVar.e0());
    }

    private final m R(long j10) {
        m mVarO = O();
        if (w0()) {
            long jY0 = y0(mVarO);
            if (jY0 != -1) {
                T(jY0);
            }
        }
        N(mVarO, j10);
        return mVarO;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object R0(Ki.e r13, dh.InterfaceC5380e r14) {
        /*
            boolean r0 = r14 instanceof Ki.e.d
            if (r0 == 0) goto L14
            r0 = r14
            Ki.e$d r0 = (Ki.e.d) r0
            int r1 = r0.f10841c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f10841c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            Ki.e$d r0 = new Ki.e$d
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f10839a
            java.lang.Object r0 = eh.AbstractC5467b.g()
            int r1 = r6.f10841c
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            Yg.v.b(r14)
            Ki.k r14 = (Ki.k) r14
            java.lang.Object r13 = r14.l()
            goto Lb2
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            Yg.v.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = s()
            java.lang.Object r14 = r14.get(r13)
            Ki.m r14 = (Ki.m) r14
        L47:
            boolean r1 = r13.t0()
            if (r1 == 0) goto L58
            Ki.k$b r14 = Ki.k.f10873b
            java.lang.Throwable r13 = r13.b0()
            java.lang.Object r13 = r14.a(r13)
            goto Lb2
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = t()
            long r4 = r1.getAndIncrement(r13)
            int r1 = Ki.f.f10850b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f16629c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            Ki.m r1 = p(r13, r7, r14)
            if (r1 != 0) goto L76
            goto L47
        L76:
            r14 = r1
        L77:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = F(r7, r8, r9, r10, r12)
            Ni.C r7 = Ki.f.r()
            if (r1 == r7) goto Lb3
            Ni.C r7 = Ki.f.h()
            if (r1 != r7) goto L98
            long r7 = r13.l0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.c()
            goto L47
        L98:
            Ni.C r7 = Ki.f.s()
            if (r1 != r7) goto La9
            r6.f10841c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.S0(r2, r3, r4, r6)
            if (r13 != r0) goto Lb2
            return r0
        La9:
            r14.c()
            Ki.k$b r13 = Ki.k.f10873b
            java.lang.Object r13 = r13.c(r1)
        Lb2:
            return r13
        Lb3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.e.R0(Ki.e, dh.e):java.lang.Object");
    }

    private final void S() {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S0(Ki.m r11, int r12, long r13, dh.InterfaceC5380e r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.e.S0(Ki.m, int, long, dh.e):java.lang.Object");
    }

    private final Object T0(m mVar, int i10, long j10, InterfaceC5380e interfaceC5380e) {
        mh.q qVar;
        C3073p c3073pB = Ii.r.b(AbstractC5467b.d(interfaceC5380e));
        try {
            Object objG1 = g1(mVar, i10, j10, c3073pB);
            if (objG1 == f.f10861m) {
                O0(c3073pB, mVar, i10);
            } else {
                if (objG1 == f.f10863o) {
                    if (j10 < l0()) {
                        mVar.c();
                    }
                    m mVar2 = (m) f0().get(this);
                    while (true) {
                        if (t0()) {
                            H0(c3073pB);
                            break;
                        }
                        long andIncrement = g0().getAndIncrement(this);
                        int i11 = f.f10850b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (mVar2.f16629c != j11) {
                            m mVarW = W(j11, mVar2);
                            if (mVarW != null) {
                                mVar2 = mVarW;
                            }
                        }
                        objG1 = g1(mVar2, i12, andIncrement, c3073pB);
                        if (objG1 == f.f10861m) {
                            C3073p c3073p = c3073pB != null ? c3073pB : null;
                            if (c3073p != null) {
                                O0(c3073p, mVar2, i12);
                            }
                        } else if (objG1 == f.f10863o) {
                            if (andIncrement < l0()) {
                                mVar2.c();
                            }
                        } else {
                            if (objG1 == f.f10862n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar2.c();
                            InterfaceC6835l interfaceC6835l = this.f10834b;
                            qVar = (mh.q) (interfaceC6835l != null ? I(interfaceC6835l) : null);
                        }
                    }
                } else {
                    mVar.c();
                    InterfaceC6835l interfaceC6835l2 = this.f10834b;
                    qVar = (mh.q) (interfaceC6835l2 != null ? I(interfaceC6835l2) : null);
                }
                c3073pB.b0(objG1, qVar);
            }
            Object objU = c3073pB.u();
            if (objU == AbstractC5467b.g()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
            }
            return objU;
        } catch (Throwable th2) {
            c3073pB.K();
            throw th2;
        }
    }

    private final void U() {
        if (x0()) {
            return;
        }
        m mVar = (m) f10830j.get(this);
        while (true) {
            long andIncrement = f10826f.getAndIncrement(this);
            int i10 = f.f10850b;
            long j10 = andIncrement / i10;
            if (l0() <= andIncrement) {
                if (mVar.f16629c < j10 && mVar.f() != null) {
                    C0(j10, mVar);
                }
                p0(this, 0L, 1, null);
                return;
            }
            if (mVar.f16629c != j10) {
                m mVarV = V(j10, mVar, andIncrement);
                if (mVarV == null) {
                    continue;
                } else {
                    mVar = mVarV;
                }
            }
            if (e1(mVar, (int) (andIncrement % i10), andIncrement)) {
                p0(this, 0L, 1, null);
                return;
            }
            p0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (Ki.m) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void U0(Ki.m r12) {
        /*
            r11 = this;
            mh.l r0 = r11.f10834b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = Ni.AbstractC3407i.b(r1, r2, r1)
        L8:
            int r4 = Ki.f.f10850b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f16629c
            int r8 = Ki.f.f10850b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.B(r4)
            Ni.C r9 = Ki.f.f()
            if (r8 == r9) goto Lbb
            Ni.C r9 = Ki.f.f10852d
            if (r8 != r9) goto L48
            long r9 = r11.h0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            Ni.C r9 = Ki.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = Ni.v.b(r0, r5, r1)
        L40:
            r12.w(r4)
            r12.t()
            goto Laf
        L48:
            Ni.C r9 = Ki.f.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof Ii.a1
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof Ki.x
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            Ni.C r9 = Ki.f.p()
            if (r8 == r9) goto Lbb
            Ni.C r9 = Ki.f.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            Ni.C r9 = Ki.f.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.h0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof Ki.x
            if (r9 == 0) goto L80
            r9 = r8
            Ki.x r9 = (Ki.x) r9
            Ii.a1 r9 = r9.f10891a
            goto L83
        L80:
            r9 = r8
            Ii.a1 r9 = (Ii.a1) r9
        L83:
            Ni.C r10 = Ki.f.z()
            boolean r8 = r12.v(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = Ni.v.b(r0, r5, r1)
        L97:
            java.lang.Object r3 = Ni.AbstractC3407i.c(r3, r9)
            r12.w(r4)
            r12.t()
            goto Laf
        La2:
            Ni.C r9 = Ki.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.t()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            Ni.b r12 = r12.h()
            Ki.m r12 = (Ki.m) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            Ii.a1 r3 = (Ii.a1) r3
            r11.W0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.AbstractC6492s.g(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            Ii.a1 r0 = (Ii.a1) r0
            r11.W0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.e.U0(Ki.m):void");
    }

    private final m V(long j10, m mVar, long j11) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10830j;
        InterfaceC6839p interfaceC6839p = (InterfaceC6839p) f.y();
        loop0: while (true) {
            objC = AbstractC3399a.c(mVar, j10, interfaceC6839p);
            if (!A.c(objC)) {
                z zVarB = A.b(objC);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f16629c >= zVarB.f16629c) {
                        break loop0;
                    }
                    if (!zVarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                        if (zVar.p()) {
                            zVar.n();
                        }
                    } else if (zVarB.p()) {
                        zVarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (A.c(objC)) {
            S();
            C0(j10, mVar);
            p0(this, 0L, 1, null);
            return null;
        }
        m mVar2 = (m) A.b(objC);
        if (mVar2.f16629c <= j10) {
            return mVar2;
        }
        long j12 = mVar2.f16629c;
        int i10 = f.f10850b;
        if (f10826f.compareAndSet(this, j11 + 1, j12 * i10)) {
            o0((mVar2.f16629c * i10) - j11);
            return null;
        }
        p0(this, 0L, 1, null);
        return null;
    }

    private final void V0(a1 a1Var) {
        X0(a1Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m W(long j10, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10829i;
        InterfaceC6839p interfaceC6839p = (InterfaceC6839p) f.y();
        loop0: while (true) {
            objC = AbstractC3399a.c(mVar, j10, interfaceC6839p);
            if (!A.c(objC)) {
                z zVarB = A.b(objC);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f16629c >= zVarB.f16629c) {
                        break loop0;
                    }
                    if (!zVarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                        if (zVar.p()) {
                            zVar.n();
                        }
                    } else if (zVarB.p()) {
                        zVarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (A.c(objC)) {
            S();
            if (mVar.f16629c * f.f10850b >= l0()) {
                return null;
            }
            mVar.c();
            return null;
        }
        m mVar2 = (m) A.b(objC);
        if (!x0() && j10 <= Z() / f.f10850b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10830j;
            while (true) {
                z zVar2 = (z) atomicReferenceFieldUpdater2.get(this);
                if (zVar2.f16629c >= mVar2.f16629c || !mVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, zVar2, mVar2)) {
                    if (zVar2.p()) {
                        zVar2.n();
                    }
                } else if (mVar2.p()) {
                    mVar2.n();
                }
            }
        }
        long j11 = mVar2.f16629c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f10850b;
        k1(j11 * i10);
        if (mVar2.f16629c * i10 >= l0()) {
            return null;
        }
        mVar2.c();
        return null;
    }

    private final void W0(a1 a1Var) {
        X0(a1Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m X(long j10, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10828h;
        InterfaceC6839p interfaceC6839p = (InterfaceC6839p) f.y();
        loop0: while (true) {
            objC = AbstractC3399a.c(mVar, j10, interfaceC6839p);
            if (!A.c(objC)) {
                z zVarB = A.b(objC);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f16629c >= zVarB.f16629c) {
                        break loop0;
                    }
                    if (!zVarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                        if (zVar.p()) {
                            zVar.n();
                        }
                    } else if (zVarB.p()) {
                        zVarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (A.c(objC)) {
            S();
            if (mVar.f16629c * f.f10850b >= h0()) {
                return null;
            }
            mVar.c();
            return null;
        }
        m mVar2 = (m) A.b(objC);
        long j11 = mVar2.f16629c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f10850b;
        l1(j11 * i10);
        if (mVar2.f16629c * i10 >= h0()) {
            return null;
        }
        mVar2.c();
        return null;
    }

    private final void X0(a1 a1Var, boolean z10) {
        if (a1Var instanceof InterfaceC3069n) {
            InterfaceC5380e interfaceC5380e = (InterfaceC5380e) a1Var;
            u.a aVar = Yg.u.f25017b;
            interfaceC5380e.resumeWith(Yg.u.c(Yg.v.a(z10 ? e0() : i0())));
        } else if (a1Var instanceof u) {
            C3073p c3073p = ((u) a1Var).f10890a;
            u.a aVar2 = Yg.u.f25017b;
            c3073p.resumeWith(Yg.u.c(k.b(k.f10873b.a(b0()))));
        } else {
            if (a1Var instanceof a) {
                ((a) a1Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + a1Var).toString());
        }
    }

    static /* synthetic */ Object Y0(e eVar, Object obj, InterfaceC5380e interfaceC5380e) {
        m mVar = (m) j0().get(eVar);
        while (true) {
            long andIncrement = k0().getAndIncrement(eVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zV0 = eVar.v0(andIncrement);
            int i10 = f.f10850b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar.f16629c != j11) {
                m mVarX = eVar.X(j11, mVar);
                if (mVarX != null) {
                    mVar = mVarX;
                } else if (zV0) {
                    Object objI0 = eVar.I0(obj, interfaceC5380e);
                    if (objI0 == AbstractC5467b.g()) {
                        return objI0;
                    }
                }
            }
            int iI1 = eVar.i1(mVar, i11, obj, j10, null, zV0);
            if (iI1 == 0) {
                mVar.c();
                break;
            }
            if (iI1 == 1) {
                break;
            }
            if (iI1 != 2) {
                if (iI1 == 3) {
                    Object objZ0 = eVar.Z0(mVar, i11, obj, j10, interfaceC5380e);
                    if (objZ0 == AbstractC5467b.g()) {
                        return objZ0;
                    }
                } else if (iI1 == 4) {
                    if (j10 < eVar.h0()) {
                        mVar.c();
                    }
                    Object objI02 = eVar.I0(obj, interfaceC5380e);
                    if (objI02 == AbstractC5467b.g()) {
                        return objI02;
                    }
                } else if (iI1 == 5) {
                    mVar.c();
                }
            } else if (zV0) {
                mVar.t();
                Object objI03 = eVar.I0(obj, interfaceC5380e);
                if (objI03 == AbstractC5467b.g()) {
                    return objI03;
                }
            }
        }
        return J.f24997a;
    }

    private final long Z() {
        return f10826f.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object Z0(Ki.m r21, int r22, java.lang.Object r23, long r24, dh.InterfaceC5380e r26) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.e.Z0(Ki.m, int, java.lang.Object, long, dh.e):java.lang.Object");
    }

    private final boolean a1(long j10) {
        if (v0(j10)) {
            return false;
        }
        return !L(j10 & 1152921504606846975L);
    }

    private final boolean b1(Object obj, Object obj2) {
        if (obj instanceof u) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C3073p c3073p = ((u) obj).f10890a;
            k kVarB = k.b(k.f10873b.c(obj2));
            InterfaceC6835l interfaceC6835l = this.f10834b;
            return f.B(c3073p, kVarB, (mh.q) (interfaceC6835l != null ? K(interfaceC6835l) : null));
        }
        if (obj instanceof a) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC3069n) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC3069n interfaceC3069n = (InterfaceC3069n) obj;
            InterfaceC6835l interfaceC6835l2 = this.f10834b;
            return f.B(interfaceC3069n, obj2, (mh.q) (interfaceC6835l2 != null ? I(interfaceC6835l2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean c1(Object obj, m mVar, int i10) {
        if (obj instanceof InterfaceC3069n) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((InterfaceC3069n) obj, J.f24997a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable e0() {
        Throwable thB0 = b0();
        return thB0 == null ? new ClosedReceiveChannelException("Channel was closed") : thB0;
    }

    private final boolean e1(m mVar, int i10, long j10) {
        Object objB = mVar.B(i10);
        if (!(objB instanceof a1) || j10 < f10825e.get(this) || !mVar.v(i10, objB, f.f10855g)) {
            return f1(mVar, i10, j10);
        }
        if (c1(objB, mVar, i10)) {
            mVar.F(i10, f.f10852d);
            return true;
        }
        mVar.F(i10, f.f10858j);
        mVar.C(i10, false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f0() {
        return f10829i;
    }

    private final boolean f1(m mVar, int i10, long j10) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB instanceof a1) {
                if (j10 < f10825e.get(this)) {
                    if (mVar.v(i10, objB, new x((a1) objB))) {
                        return true;
                    }
                } else if (mVar.v(i10, objB, f.f10855g)) {
                    if (c1(objB, mVar, i10)) {
                        mVar.F(i10, f.f10852d);
                        return true;
                    }
                    mVar.F(i10, f.f10858j);
                    mVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == f.f10858j) {
                    return false;
                }
                if (objB == null) {
                    if (mVar.v(i10, objB, f.f10853e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f10852d || objB == f.f10856h || objB == f.f10857i || objB == f.f10859k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f10854f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater g0() {
        return f10825e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g1(m mVar, int i10, long j10, Object obj) {
        Object objB = mVar.B(i10);
        if (objB == null) {
            if (j10 >= (f10824d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f10862n;
                }
                if (mVar.v(i10, objB, obj)) {
                    U();
                    return f.f10861m;
                }
            }
        } else if (objB == f.f10852d && mVar.v(i10, objB, f.f10857i)) {
            U();
            return mVar.D(i10);
        }
        return h1(mVar, i10, j10, obj);
    }

    private final Object h1(m mVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB == null || objB == f.f10853e) {
                if (j10 < (f10824d.get(this) & 1152921504606846975L)) {
                    if (mVar.v(i10, objB, f.f10856h)) {
                        U();
                        return f.f10863o;
                    }
                } else {
                    if (obj == null) {
                        return f.f10862n;
                    }
                    if (mVar.v(i10, objB, obj)) {
                        U();
                        return f.f10861m;
                    }
                }
            } else {
                if (objB != f.f10852d) {
                    if (objB != f.f10858j && objB != f.f10856h) {
                        if (objB == f.z()) {
                            U();
                            return f.f10863o;
                        }
                        if (objB != f.f10855g && mVar.v(i10, objB, f.f10854f)) {
                            boolean z10 = objB instanceof x;
                            if (z10) {
                                objB = ((x) objB).f10891a;
                            }
                            if (c1(objB, mVar, i10)) {
                                mVar.F(i10, f.f10857i);
                                U();
                                return mVar.D(i10);
                            }
                            mVar.F(i10, f.f10858j);
                            mVar.C(i10, false);
                            if (z10) {
                                U();
                            }
                            return f.f10863o;
                        }
                    }
                    return f.f10863o;
                }
                if (mVar.v(i10, objB, f.f10857i)) {
                    U();
                    return mVar.D(i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i1(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        mVar.G(i10, obj);
        if (z10) {
            return j1(mVar, i10, obj, j10, obj2, z10);
        }
        Object objB = mVar.B(i10);
        if (objB == null) {
            if (L(j10)) {
                if (mVar.v(i10, null, f.f10852d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof a1) {
            mVar.w(i10);
            if (b1(objB, obj)) {
                mVar.F(i10, f.f10857i);
                K0();
                return 0;
            }
            if (mVar.x(i10, f.f10859k) != f.f10859k) {
                mVar.C(i10, true);
            }
            return 5;
        }
        return j1(mVar, i10, obj, j10, obj2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater j0() {
        return f10828h;
    }

    private final int j1(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB == null) {
                if (!L(j10) || z10) {
                    if (z10) {
                        if (mVar.v(i10, null, f.f10858j)) {
                            mVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.v(i10, null, f.f10852d)) {
                    return 1;
                }
            } else {
                if (objB != f.f10853e) {
                    if (objB == f.f10859k) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (objB == f.f10856h) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (objB == f.z()) {
                        mVar.w(i10);
                        S();
                        return 4;
                    }
                    mVar.w(i10);
                    if (objB instanceof x) {
                        objB = ((x) objB).f10891a;
                    }
                    if (b1(objB, obj)) {
                        mVar.F(i10, f.f10857i);
                        K0();
                        return 0;
                    }
                    if (mVar.x(i10, f.f10859k) != f.f10859k) {
                        mVar.C(i10, true);
                    }
                    return 5;
                }
                if (mVar.v(i10, objB, f.f10852d)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater k0() {
        return f10824d;
    }

    private final void k1(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10825e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f10825e.compareAndSet(this, j11, j10));
    }

    private final void l1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10824d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f10824d.compareAndSet(this, j11, f.w(j12, (int) (j11 >> 60))));
    }

    private final void o0(long j10) {
        if ((f10827g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f10827g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void p0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.o0(j10);
    }

    private final void q0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10832l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f10865q : f.f10866r));
        if (obj == null) {
            return;
        }
        ((InterfaceC6835l) obj).invoke(b0());
    }

    private final boolean r0(m mVar, int i10, long j10) {
        Object objB;
        do {
            objB = mVar.B(i10);
            if (objB != null && objB != f.f10853e) {
                if (objB == f.f10852d) {
                    return true;
                }
                if (objB == f.f10858j || objB == f.z() || objB == f.f10857i || objB == f.f10856h) {
                    return false;
                }
                if (objB == f.f10855g) {
                    return true;
                }
                return objB != f.f10854f && j10 == h0();
            }
        } while (!mVar.v(i10, objB, f.f10856h));
        U();
        return false;
    }

    private final boolean s0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            R(j10 & 1152921504606846975L);
            if (z10 && n0()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            Q(j10 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean u0(long j10) {
        return s0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v0(long j10) {
        return s0(j10, false);
    }

    private final boolean x0() {
        long jZ = Z();
        return jZ == 0 || jZ == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (Ki.m) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long y0(Ki.m r8) {
        /*
            r7 = this;
        L0:
            int r0 = Ki.f.f10850b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f16629c
            int r5 = Ki.f.f10850b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.h0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            Ni.C r2 = Ki.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            Ni.C r2 = Ki.f.f10852d
            if (r1 != r2) goto L39
            return r3
        L2c:
            Ni.C r2 = Ki.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            Ni.b r8 = r8.h()
            Ki.m r8 = (Ki.m) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.e.y0(Ki.m):long");
    }

    private final void z0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10824d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 1)));
    }

    protected void F0() {
    }

    protected void K0() {
    }

    protected void L0() {
    }

    public boolean M(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return P(th2, true);
    }

    protected boolean P(Throwable th2, boolean z10) {
        if (z10) {
            z0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f10831k, this, f.f10867s, th2);
        if (z10) {
            A0();
        } else {
            B0();
        }
        S();
        F0();
        if (zA) {
            q0();
        }
        return zA;
    }

    protected final void T(long j10) {
        UndeliveredElementException undeliveredElementExceptionC;
        m mVar = (m) f10829i.get(this);
        while (true) {
            long j11 = f10825e.get(this);
            if (j10 < Math.max(this.f10833a + j11, Z())) {
                return;
            }
            if (f10825e.compareAndSet(this, j11, j11 + 1)) {
                int i10 = f.f10850b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (mVar.f16629c != j12) {
                    m mVarW = W(j12, mVar);
                    if (mVarW == null) {
                        continue;
                    } else {
                        mVar = mVarW;
                    }
                }
                Object objG1 = g1(mVar, i11, j11, null);
                if (objG1 != f.f10863o) {
                    mVar.c();
                    InterfaceC6835l interfaceC6835l = this.f10834b;
                    if (interfaceC6835l != null && (undeliveredElementExceptionC = Ni.v.c(interfaceC6835l, objG1, null, 2, null)) != null) {
                        throw undeliveredElementExceptionC;
                    }
                } else if (j11 < l0()) {
                    mVar.c();
                }
            }
        }
    }

    @Override // Ki.w
    public Object b(Object obj, InterfaceC5380e interfaceC5380e) {
        return Y0(this, obj, interfaceC5380e);
    }

    protected final Throwable b0() {
        return (Throwable) f10831k.get(this);
    }

    @Override // Ki.v
    public Object c(InterfaceC5380e interfaceC5380e) {
        return Q0(this, interfaceC5380e);
    }

    @Override // Ki.v
    public final void cancel(CancellationException cancellationException) {
        M(cancellationException);
    }

    @Override // Ki.v
    public Object d() {
        m mVar;
        long j10 = f10825e.get(this);
        long j11 = f10824d.get(this);
        if (u0(j11)) {
            return k.f10873b.a(b0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.f10873b.b();
        }
        Object obj = f.f10859k;
        m mVar2 = (m) f0().get(this);
        while (!t0()) {
            long andIncrement = g0().getAndIncrement(this);
            int i10 = f.f10850b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar2.f16629c != j12) {
                m mVarW = W(j12, mVar2);
                if (mVarW == null) {
                    continue;
                } else {
                    mVar = mVarW;
                }
            } else {
                mVar = mVar2;
            }
            Object objG1 = g1(mVar, i11, andIncrement, obj);
            if (objG1 == f.f10861m) {
                a1 a1Var = obj instanceof a1 ? (a1) obj : null;
                if (a1Var != null) {
                    O0(a1Var, mVar, i11);
                }
                m1(andIncrement);
                mVar.t();
                return k.f10873b.b();
            }
            if (objG1 != f.f10863o) {
                if (objG1 == f.f10862n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.c();
                return k.f10873b.c(objG1);
            }
            if (andIncrement < l0()) {
                mVar.c();
            }
            mVar2 = mVar;
        }
        return k.f10873b.a(b0());
    }

    protected final Object d1(Object obj) {
        m mVar;
        Object obj2 = f.f10852d;
        m mVar2 = (m) j0().get(this);
        while (true) {
            long andIncrement = k0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zV0 = v0(andIncrement);
            int i10 = f.f10850b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar2.f16629c != j11) {
                m mVarX = X(j11, mVar2);
                if (mVarX != null) {
                    mVar = mVarX;
                } else if (zV0) {
                    return k.f10873b.a(i0());
                }
            } else {
                mVar = mVar2;
            }
            int iI1 = i1(mVar, i11, obj, j10, obj2, zV0);
            if (iI1 == 0) {
                mVar.c();
                return k.f10873b.c(J.f24997a);
            }
            if (iI1 == 1) {
                return k.f10873b.c(J.f24997a);
            }
            if (iI1 == 2) {
                if (zV0) {
                    mVar.t();
                    return k.f10873b.a(i0());
                }
                a1 a1Var = obj2 instanceof a1 ? (a1) obj2 : null;
                if (a1Var != null) {
                    P0(a1Var, mVar, i11);
                }
                T((mVar.f16629c * i10) + i11);
                return k.f10873b.c(J.f24997a);
            }
            if (iI1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iI1 == 4) {
                if (j10 < h0()) {
                    mVar.c();
                }
                return k.f10873b.a(i0());
            }
            if (iI1 == 5) {
                mVar.c();
            }
            mVar2 = mVar;
        }
    }

    @Override // Ki.w
    public void e(InterfaceC6835l interfaceC6835l) {
        if (androidx.concurrent.futures.b.a(f10832l, this, null, interfaceC6835l)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10832l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != f.f10865q) {
                if (obj == f.f10866r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f10832l, this, f.f10865q, f.f10866r));
        interfaceC6835l.invoke(b0());
    }

    @Override // Ki.w
    public boolean f(Throwable th2) {
        return P(th2, false);
    }

    public final long h0() {
        return f10825e.get(this);
    }

    @Override // Ki.v
    public Object i(InterfaceC5380e interfaceC5380e) {
        return R0(this, interfaceC5380e);
    }

    protected final Throwable i0() {
        Throwable thB0 = b0();
        return thB0 == null ? new ClosedSendChannelException("Channel was closed") : thB0;
    }

    @Override // Ki.v
    public i iterator() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return Ki.k.f10873b.c(Yg.J.f24997a);
     */
    @Override // Ki.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = k0()
            long r0 = r0.get(r14)
            boolean r0 = r14.a1(r0)
            if (r0 == 0) goto L15
            Ki.k$b r15 = Ki.k.f10873b
            java.lang.Object r15 = r15.b()
            return r15
        L15:
            Ni.C r8 = Ki.f.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = u()
            java.lang.Object r0 = r0.get(r14)
            Ki.m r0 = (Ki.m) r0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = v()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = w(r14, r1)
            int r1 = Ki.f.f10850b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f16629c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5b
            Ki.m r1 = q(r14, r2, r0)
            if (r1 != 0) goto L59
            if (r11 == 0) goto L23
        L4d:
            Ki.k$b r15 = Ki.k.f10873b
            java.lang.Throwable r0 = r14.i0()
            java.lang.Object r15 = r15.a(r0)
            goto Lbc
        L59:
            r13 = r1
            goto L5c
        L5b:
            r13 = r0
        L5c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = G(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb8
            r1 = 1
            if (r0 == r1) goto Laf
            r1 = 2
            if (r0 == r1) goto L92
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L79
            goto L7c
        L79:
            r13.c()
        L7c:
            r0 = r13
            goto L23
        L7e:
            long r0 = r14.h0()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4d
            r13.c()
            goto L4d
        L8a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L92:
            if (r11 == 0) goto L98
            r13.t()
            goto L4d
        L98:
            boolean r15 = r8 instanceof Ii.a1
            if (r15 == 0) goto L9f
            Ii.a1 r8 = (Ii.a1) r8
            goto La0
        L9f:
            r8 = 0
        La0:
            if (r8 == 0) goto La5
            D(r14, r8, r13, r12)
        La5:
            r13.t()
            Ki.k$b r15 = Ki.k.f10873b
            java.lang.Object r15 = r15.b()
            goto Lbc
        Laf:
            Ki.k$b r15 = Ki.k.f10873b
            Yg.J r0 = Yg.J.f24997a
            java.lang.Object r15 = r15.c(r0)
            goto Lbc
        Lb8:
            r13.c()
            goto Laf
        Lbc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.e.k(java.lang.Object):java.lang.Object");
    }

    @Override // Ki.w
    public boolean l() {
        return v0(f10824d.get(this));
    }

    public final long l0() {
        return f10824d.get(this) & 1152921504606846975L;
    }

    public final void m1(long j10) {
        long j11;
        long j12;
        if (x0()) {
            return;
        }
        while (Z() <= j10) {
        }
        int i10 = f.f10851c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jZ = Z();
            if (jZ == (f10827g.get(this) & 4611686018427387903L) && jZ == Z()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10827g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, f.v(j11 & 4611686018427387903L, true)));
        while (true) {
            long jZ2 = Z();
            long j13 = f10827g.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (jZ2 == j14 && jZ2 == Z()) {
                break;
            } else if (!z10) {
                f10827g.compareAndSet(this, j13, f.v(j14, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10827g;
        do {
            j12 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, f.v(j12 & 4611686018427387903L, false)));
    }

    public final boolean n0() {
        while (true) {
            m mVarW = (m) f10829i.get(this);
            long jH0 = h0();
            if (l0() <= jH0) {
                return false;
            }
            int i10 = f.f10850b;
            long j10 = jH0 / i10;
            if (mVarW.f16629c == j10 || (mVarW = W(j10, mVarW)) != null) {
                mVarW.c();
                if (r0(mVarW, (int) (jH0 % i10), jH0)) {
                    return true;
                }
                f10825e.compareAndSet(this, jH0, 1 + jH0);
            } else if (((m) f10829i.get(this)).f16629c < j10) {
                return false;
            }
        }
    }

    public boolean t0() {
        return u0(f10824d.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b5, code lost:
    
        r3 = (Ki.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bc, code lost:
    
        if (r3 != null) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.e.toString():java.lang.String");
    }

    protected boolean w0() {
        return false;
    }
}
