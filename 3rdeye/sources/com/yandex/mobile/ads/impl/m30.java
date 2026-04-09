package com.yandex.mobile.ads.impl;

import A9.C0585k;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import com.yandex.mobile.ads.impl.j82;
import d9.C4284b;
import f9.InterfaceC4347e;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class m30 {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f30183e = new AtomicBoolean(true);

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f30184a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f30185b;

    /* renamed from: c, reason: collision with root package name */
    private final C4245z3 f30186c;

    /* renamed from: d, reason: collision with root package name */
    private final tf0 f30187d;

    @h9.e(c = "com.monetization.ads.base.dns.DnsPrefetcher", f = "DnsPrefetcher.kt", l = {28}, m = "prefetch")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        C4198s4 f30188b;

        /* renamed from: c, reason: collision with root package name */
        EnumC4191r4 f30189c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30190d;

        /* renamed from: f, reason: collision with root package name */
        int f30192f;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f30190d = obj;
            this.f30192f |= RecyclerView.UNDEFINED_DURATION;
            return m30.this.a(this);
        }
    }

    @h9.e(c = "com.monetization.ads.base.dns.DnsPrefetcher$prefetch$2$1", f = "DnsPrefetcher.kt", l = {34}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30193b;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return m30.this.new b(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return m30.this.new b(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = g9.a.COROUTINE_SUSPENDED;
            int i = this.f30193b;
            if (i == 0) {
                b9.n.b(obj);
                List listA = m30.a(m30.this);
                if (listA.isEmpty()) {
                    fp0.a(new Object[0]);
                    return C1992A.f18074a;
                }
                m30 m30Var = m30.this;
                this.f30193b = 1;
                m30Var.getClass();
                Object objB = C0585k.b(2500L, new n30(m30Var, listA, null), this);
                if (objB != obj2) {
                    objB = C1992A.f18074a;
                }
                if (objB == obj2) {
                    return obj2;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m30(Context context, C4198s4 c4198s4) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4198s4, applicationContext, new C4245z3(), new tf0());
    }

    public static final List a(m30 m30Var) {
        m30Var.getClass();
        C4284b c4284bU = E.u.u();
        j82.a aVar = j82.f29019a;
        String strA = m30Var.f30186c.a(m30Var.f30185b);
        aVar.getClass();
        String strA2 = j82.a.a(strA);
        if (strA2 != null) {
            c4284bU.add(strA2);
        }
        return E.u.m(c4284bU);
    }

    public m30(Context context, C4198s4 adLoadingPhasesManager, Context appContext, C4245z3 adHostConfigurator, tf0 hostReachabilityRepository) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(adHostConfigurator, "adHostConfigurator");
        kotlin.jvm.internal.l.f(hostReachabilityRepository, "hostReachabilityRepository");
        this.f30184a = adLoadingPhasesManager;
        this.f30185b = appContext;
        this.f30186c = adHostConfigurator;
        this.f30187d = hostReachabilityRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(f9.InterfaceC4347e<? super b9.C1992A> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.yandex.mobile.ads.impl.m30.a
            if (r0 == 0) goto L13
            r0 = r9
            com.yandex.mobile.ads.impl.m30$a r0 = (com.yandex.mobile.ads.impl.m30.a) r0
            int r1 = r0.f30192f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30192f = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.m30$a r0 = new com.yandex.mobile.ads.impl.m30$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30190d
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f30192f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            com.yandex.mobile.ads.impl.r4 r1 = r0.f30189c
            com.yandex.mobile.ads.impl.s4 r0 = r0.f30188b
            b9.n.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L6f
        L2c:
            r9 = move-exception
            goto L67
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            b9.n.b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = com.yandex.mobile.ads.impl.m30.f30183e
            boolean r9 = r9.getAndSet(r3)
            if (r9 == 0) goto L74
            com.yandex.mobile.ads.impl.s4 r9 = r8.f30184a
            com.yandex.mobile.ads.impl.r4 r2 = com.yandex.mobile.ads.impl.EnumC4191r4.f32452A
            r9.b(r2)
            A9.A r5 = com.yandex.mobile.ads.impl.ju.a()     // Catch: java.lang.Throwable -> L62
            com.yandex.mobile.ads.impl.m30$b r6 = new com.yandex.mobile.ads.impl.m30$b     // Catch: java.lang.Throwable -> L62
            r7 = 0
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L62
            r0.f30188b = r9     // Catch: java.lang.Throwable -> L62
            r0.f30189c = r2     // Catch: java.lang.Throwable -> L62
            r0.f30192f = r4     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = A9.C0575f.h(r5, r6, r0)     // Catch: java.lang.Throwable -> L62
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r0 = r9
            r1 = r2
            goto L6f
        L62:
            r0 = move-exception
            r1 = r0
            r0 = r9
            r9 = r1
            r1 = r2
        L67:
            r9.getMessage()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.yandex.mobile.ads.impl.fp0.a(r9)
        L6f:
            b9.A r9 = b9.C1992A.f18074a
            r0.a(r1)
        L74:
            b9.A r9 = b9.C1992A.f18074a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m30.a(f9.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        if (this.f30187d.a(2000, str)) {
            fp0.a(new Object[0]);
        } else {
            fp0.a(new Object[0]);
        }
    }
}
