package com.yandex.mobile.ads.impl;

import A9.C0575f;
import D9.InterfaceC0645g;
import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.z90;
import f9.InterfaceC4347e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ia0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f28605a;

    /* renamed from: b, reason: collision with root package name */
    private final D9.x<h90> f28606b;

    /* renamed from: c, reason: collision with root package name */
    private final A9.E f28607c;

    /* renamed from: d, reason: collision with root package name */
    private vs f28608d;

    /* renamed from: e, reason: collision with root package name */
    private final D9.I<ga0> f28609e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f28610f;

    @h9.e(c = "com.monetization.ads.feed.ui.FeedViewModel$observeLoadingState$1", f = "FeedViewModel.kt", l = {93}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28611b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f28612c;

        /* renamed from: com.yandex.mobile.ads.impl.ia0$a$a, reason: collision with other inner class name */
        public static final class C0407a extends kotlin.jvm.internal.m implements p9.l<ga0, z90> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0407a f28614b = new C0407a();

            public C0407a() {
                super(1);
            }

            @Override // p9.l
            public final z90 invoke(ga0 ga0Var) {
                ga0 ga0Var2 = ga0Var;
                kotlin.jvm.internal.l.f(ga0Var2, "<name for destructuring parameter 0>");
                return ga0Var2.a();
            }
        }

        public static final class b<T> implements InterfaceC0645g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ia0 f28615a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ A9.E f28616b;

            public b(ia0 ia0Var, A9.E e4) {
                this.f28615a = ia0Var;
                this.f28616b = e4;
            }

            @Override // D9.InterfaceC0645g
            public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
                ga0 ga0Var = (ga0) obj;
                z90 z90VarC = ga0Var.c();
                if (z90VarC instanceof z90.a) {
                    C4128i3 c4128i3A = ((z90.a) ga0Var.c()).a();
                    vs vsVarB = this.f28615a.b();
                    if (vsVarB != null) {
                        vsVarB.a(c4128i3A);
                    }
                    A9.E e4 = this.f28616b;
                    CancellationException cancellationException = new CancellationException(c4128i3A.d());
                    cancellationException.initCause(null);
                    A9.F.b(e4, cancellationException);
                } else if (z90VarC instanceof z90.c) {
                    vs vsVarB2 = this.f28615a.b();
                    if (vsVarB2 != null) {
                        vsVarB2.onAdLoaded();
                    }
                } else if (!(z90VarC instanceof z90.b)) {
                    boolean z10 = z90VarC instanceof z90.d;
                }
                return C1992A.f18074a;
            }
        }

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            a aVar = ia0.this.new a(interfaceC4347e);
            aVar.f28612c = obj;
            return aVar;
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            a aVar = ia0.this.new a(interfaceC4347e);
            aVar.f28612c = e4;
            return aVar.invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r7.f28611b
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                b9.n.b(r8)
                goto L4e
            Ld:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L15:
                b9.n.b(r8)
                java.lang.Object r8 = r7.f28612c
                A9.E r8 = (A9.E) r8
                com.yandex.mobile.ads.impl.ia0 r1 = com.yandex.mobile.ads.impl.ia0.this
                D9.I r1 = r1.c()
                com.yandex.mobile.ads.impl.ia0$a$a r3 = com.yandex.mobile.ads.impl.ia0.a.C0407a.f28614b
                D9.j$a r4 = D9.C0648j.f1203b
                boolean r5 = r1 instanceof D9.C0643e
                if (r5 == 0) goto L38
                r5 = r1
                D9.e r5 = (D9.C0643e) r5
                kotlin.jvm.internal.m r6 = r5.f1186c
                if (r6 != r3) goto L38
                D9.j$a r5 = r5.f1187d
                if (r5 != r4) goto L38
                D9.e r1 = (D9.C0643e) r1
                goto L3e
            L38:
                D9.e r5 = new D9.e
                r5.<init>(r1, r3, r4)
                r1 = r5
            L3e:
                com.yandex.mobile.ads.impl.ia0$a$b r3 = new com.yandex.mobile.ads.impl.ia0$a$b
                com.yandex.mobile.ads.impl.ia0 r4 = com.yandex.mobile.ads.impl.ia0.this
                r3.<init>(r4, r8)
                r7.f28611b = r2
                java.lang.Object r8 = r1.b(r3, r7)
                if (r8 != r0) goto L4e
                return r0
            L4e:
                b9.A r8 = b9.C1992A.f18074a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ia0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @h9.e(c = "com.monetization.ads.feed.ui.FeedViewModel$onFeedItemVisible$1", f = "FeedViewModel.kt", l = {86}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28617b;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return ia0.this.new b(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ia0.this.new b(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f28617b;
            if (i == 0) {
                b9.n.b(obj);
                D9.x xVar = ia0.this.f28606b;
                h90.a aVar2 = h90.a.f28145a;
                this.f28617b = 1;
                if (xVar.emit(aVar2, this) == aVar) {
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

    @h9.e(c = "com.monetization.ads.feed.ui.FeedViewModel$preloadAd$1", f = "FeedViewModel.kt", l = {77}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28619b;

        public c(InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return ia0.this.new c(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ia0.this.new c(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f28619b;
            if (i == 0) {
                b9.n.b(obj);
                D9.x xVar = ia0.this.f28606b;
                h90.a aVar2 = h90.a.f28145a;
                this.f28619b = 1;
                if (xVar.emit(aVar2, this) == aVar) {
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

    public ia0(Context appContext, rm2 sdkEnvironmentModule, h7 adRequestData, f90 divContextProvider, g90 divViewPreloader, C4072a3 adConfiguration, D9.x feedInputEventFlow, r90 feedItemLoadControllerCreator, s90 feedItemLoadDataSource, w90 feedItemPreloadDataSource, xz0 memoryUtils, t90 loadEnoughMemoryValidator, y90 feedItemsRepository, o90 feedItemListUseCase, A9.E coroutineScope) {
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(divContextProvider, "divContextProvider");
        kotlin.jvm.internal.l.f(divViewPreloader, "divViewPreloader");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(feedInputEventFlow, "feedInputEventFlow");
        kotlin.jvm.internal.l.f(feedItemLoadControllerCreator, "feedItemLoadControllerCreator");
        kotlin.jvm.internal.l.f(feedItemLoadDataSource, "feedItemLoadDataSource");
        kotlin.jvm.internal.l.f(feedItemPreloadDataSource, "feedItemPreloadDataSource");
        kotlin.jvm.internal.l.f(memoryUtils, "memoryUtils");
        kotlin.jvm.internal.l.f(loadEnoughMemoryValidator, "loadEnoughMemoryValidator");
        kotlin.jvm.internal.l.f(feedItemsRepository, "feedItemsRepository");
        kotlin.jvm.internal.l.f(feedItemListUseCase, "feedItemListUseCase");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        this.f28605a = adConfiguration;
        this.f28606b = feedInputEventFlow;
        this.f28607c = coroutineScope;
        this.f28609e = feedItemListUseCase.a();
        this.f28610f = new AtomicInteger(-1);
        e();
    }

    private final void e() {
        C0575f.e(this.f28607c, null, null, new a(null), 3);
    }

    public final vs b() {
        return this.f28608d;
    }

    public final D9.I<ga0> c() {
        return this.f28609e;
    }

    public final AtomicInteger d() {
        return this.f28610f;
    }

    public final void f() {
        if (this.f28609e.getValue().b().isEmpty() && this.f28610f.get() == -1 && !(this.f28609e.getValue().c() instanceof z90.a)) {
            this.f28610f.getAndIncrement();
            C0575f.e(this.f28607c, null, null, new c(null), 3);
            return;
        }
        C4128i3 c4128i3S = i7.s();
        vs vsVar = this.f28608d;
        if (vsVar != null) {
            vsVar.a(c4128i3S);
        }
    }

    public final C4072a3 a() {
        return this.f28605a;
    }

    public final void a(int i) {
        if ((this.f28609e.getValue().c() instanceof z90.a) || i != this.f28610f.get()) {
            return;
        }
        this.f28610f.getAndIncrement();
        C0575f.e(this.f28607c, null, null, new b(null), 3);
    }

    public final void a(y80 y80Var) {
        this.f28608d = y80Var;
    }
}
