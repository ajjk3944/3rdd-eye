package Pi;

import Ii.A0;
import Ii.AbstractC3043a;
import Ii.C3073p;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import Yg.u;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public final class c extends AbstractC3043a implements Dj.c {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f18678f = AtomicLongFieldUpdater.newUpdater(c.class, "requested$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18679g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "producer$volatile");
    private volatile boolean cancellationRequested;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3220g f18680d;

    /* renamed from: e, reason: collision with root package name */
    public final Dj.b f18681e;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    static final class a implements InterfaceC3221h {
        a() {
        }

        @Override // Li.InterfaceC3221h
        public final Object a(Object obj, InterfaceC5380e interfaceC5380e) {
            c.this.f18681e.h(obj);
            if (c.Y0().decrementAndGet(c.this) > 0) {
                A0.l(c.this.getCoroutineContext());
                return J.f24997a;
            }
            c cVar = c.this;
            C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
            c3073p.A();
            c.X0().set(cVar, c3073p);
            Object objU = c3073p.u();
            if (objU == AbstractC5467b.g()) {
                h.c(interfaceC5380e);
            }
            return objU == AbstractC5467b.g() ? objU : J.f24997a;
        }
    }

    public static final class b implements InterfaceC5380e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5384i f18683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f18684b;

        public b(InterfaceC5384i interfaceC5384i, c cVar) {
            this.f18683a = interfaceC5384i;
            this.f18684b = cVar;
        }

        @Override // dh.InterfaceC5380e
        public InterfaceC5384i getContext() {
            return this.f18683a;
        }

        @Override // dh.InterfaceC5380e
        public void resumeWith(Object obj) throws Throwable {
            Oi.a.c(new C0663c(this.f18684b), this.f18684b);
        }
    }

    /* renamed from: Pi.c$c, reason: collision with other inner class name */
    /* synthetic */ class C0663c extends C6490p implements InterfaceC6835l {
        C0663c(Object obj) {
            super(1, obj, c.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((c) this.receiver).W0(interfaceC5380e);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f18685a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18686b;

        /* renamed from: d, reason: collision with root package name */
        int f18688d;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18686b = obj;
            this.f18688d |= PduHandle.NONE;
            return c.this.W0(this);
        }
    }

    public c(InterfaceC3220g interfaceC3220g, Dj.b bVar, InterfaceC5384i interfaceC5384i) {
        super(interfaceC5384i, false, true);
        this.f18680d = interfaceC3220g;
        this.f18681e = bVar;
        this.producer$volatile = V0();
    }

    private final Object U0(InterfaceC5380e interfaceC5380e) {
        Object objB = this.f18680d.b(new a(), interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }

    private final InterfaceC5380e V0() {
        return new b(getCoroutineContext(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W0(dh.InterfaceC5380e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Pi.c.d
            if (r0 == 0) goto L13
            r0 = r5
            Pi.c$d r0 = (Pi.c.d) r0
            int r1 = r0.f18688d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18688d = r1
            goto L18
        L13:
            Pi.c$d r0 = new Pi.c$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18686b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f18688d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f18685a
            Pi.c r0 = (Pi.c) r0
            Yg.v.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L46
        L2d:
            r5 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            Yg.v.b(r5)
            r0.f18685a = r4     // Catch: java.lang.Throwable -> L57
            r0.f18688d = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r4.U0(r0)     // Catch: java.lang.Throwable -> L57
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            Dj.b r5 = r0.f18681e     // Catch: java.lang.Throwable -> L4c
            r5.a()     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r5 = move-exception
            dh.i r0 = r0.getCoroutineContext()
            Ii.L.a(r0, r5)
        L54:
            Yg.J r5 = Yg.J.f24997a
            return r5
        L57:
            r5 = move-exception
            r0 = r4
        L59:
            boolean r1 = r0.cancellationRequested
            if (r1 == 0) goto L69
            boolean r1 = r0.isActive()
            if (r1 != 0) goto L69
            java.util.concurrent.CancellationException r1 = r0.getCancellationException()
            if (r5 == r1) goto L7a
        L69:
            Dj.b r1 = r0.f18681e     // Catch: java.lang.Throwable -> L6f
            r1.onError(r5)     // Catch: java.lang.Throwable -> L6f
            goto L7a
        L6f:
            r1 = move-exception
            Yg.AbstractC3663g.a(r5, r1)
            dh.i r0 = r0.getCoroutineContext()
            Ii.L.a(r0, r5)
        L7a:
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Pi.c.W0(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater X0() {
        return f18679g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater Y0() {
        return f18678f;
    }

    @Override // Ii.D0, Ii.InterfaceC3091y0
    public void cancel() throws Throwable {
        this.cancellationRequested = true;
        cancel((CancellationException) null);
    }

    @Override // Dj.c
    public void request(long j10) {
        long j11;
        long j12;
        InterfaceC5380e interfaceC5380e;
        if (j10 <= 0) {
            return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18678f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = j11 + j10;
            if (j12 <= 0) {
                j12 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j12));
        if (j11 <= 0) {
            do {
                interfaceC5380e = (InterfaceC5380e) f18679g.getAndSet(this, null);
            } while (interfaceC5380e == null);
            u.a aVar = u.f25017b;
            interfaceC5380e.resumeWith(u.c(J.f24997a));
        }
    }
}
