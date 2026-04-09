package com.yandex.mobile.ads.impl;

import A9.B;
import A9.C0575f;
import android.os.Looper;
import b9.C1992A;
import f9.AbstractC4343a;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class vd {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f34448j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static volatile vd f34449k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f34450l = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f34451a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34452b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<z50> f34453c;

    /* renamed from: d, reason: collision with root package name */
    private final A9.E f34454d;

    /* renamed from: e, reason: collision with root package name */
    private final td f34455e;

    /* renamed from: f, reason: collision with root package name */
    private final ud f34456f;

    /* renamed from: g, reason: collision with root package name */
    private final l42 f34457g;

    /* renamed from: h, reason: collision with root package name */
    private final a f34458h;
    private final AtomicBoolean i;

    @h9.e(c = "com.monetization.ads.core.anr.AnrTracker$startTracking$1", f = "AnrTracker.kt", l = {29, 30}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f34459b;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return vd.this.new b(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return vd.this.new b(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[PHI: r7
  0x0031: PHI (r7v4 java.lang.Object) = (r7v3 java.lang.Object), (r7v0 java.lang.Object) binds: [B:12:0x002e, B:9:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0045 -> B:11:0x001c). Please report as a decompilation issue!!! */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r6.f34459b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L19
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L15:
                b9.n.b(r7)
                goto L31
            L19:
                b9.n.b(r7)
            L1c:
                com.yandex.mobile.ads.impl.vd r7 = com.yandex.mobile.ads.impl.vd.this
                com.yandex.mobile.ads.impl.td r7 = com.yandex.mobile.ads.impl.vd.a(r7)
                com.yandex.mobile.ads.impl.vd r1 = com.yandex.mobile.ads.impl.vd.this
                long r4 = com.yandex.mobile.ads.impl.vd.c(r1)
                r6.f34459b = r3
                java.lang.Object r7 = r7.a(r4, r6)
                if (r7 != r0) goto L31
                goto L47
            L31:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L48
                com.yandex.mobile.ads.impl.vd r7 = com.yandex.mobile.ads.impl.vd.this
                long r4 = com.yandex.mobile.ads.impl.vd.b(r7)
                r6.f34459b = r2
                java.lang.Object r7 = A9.O.a(r4, r6)
                if (r7 != r0) goto L1c
            L47:
                return r0
            L48:
                com.yandex.mobile.ads.impl.vd r7 = com.yandex.mobile.ads.impl.vd.this
                com.yandex.mobile.ads.impl.vd.f(r7)
                b9.A r7 = b9.C1992A.f18074a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vd.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements p9.l<Throwable, C1992A> {
        public c() {
            super(1);
        }

        @Override // p9.l
        public final C1992A invoke(Throwable th) {
            vd.this.i.set(false);
            return C1992A.f18074a;
        }
    }

    private vd(long j4, long j10, Set<z50> set, A9.E e4, td tdVar, ud udVar, l42 l42Var) {
        this.f34451a = j4;
        this.f34452b = j10;
        this.f34453c = set;
        this.f34454d = e4;
        this.f34455e = tdVar;
        this.f34456f = udVar;
        this.f34457g = l42Var;
        this.f34458h = new a(B.a.f182b);
        this.i = new AtomicBoolean(false);
    }

    public static final void f(vd vdVar) {
        vdVar.f34457g.getClass();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        kotlin.jvm.internal.l.e(allStackTraces, "getAllStackTraces(...)");
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr == null || !x12.a(stackTraceElementArr, vdVar.f34453c)) {
            return;
        }
        vdVar.f34456f.a(allStackTraces);
    }

    public final void c() {
        if (this.i.getAndSet(true)) {
            return;
        }
        C0575f.e(this.f34454d, this.f34458h, null, new b(null), 2).F(new c());
    }

    public /* synthetic */ vd(long j4, long j10, Set set, A9.E e4, td tdVar, ud udVar, l42 l42Var, int i) {
        this(j4, j10, set, e4, tdVar, udVar, l42Var);
    }

    public static final class a extends AbstractC4343a implements A9.B {
        public a(B.a aVar) {
            super(aVar);
        }

        @Override // A9.B
        public final void handleException(InterfaceC4350h interfaceC4350h, Throwable th) {
        }
    }
}
