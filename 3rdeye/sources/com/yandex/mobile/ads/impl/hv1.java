package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class hv1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final CopyOnWriteArrayList<jv1> f28380f = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f28381b;

    /* renamed from: c, reason: collision with root package name */
    private final A9.E f28382c;

    /* renamed from: d, reason: collision with root package name */
    private final u01 f28383d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f28384e;

    @h9.e(c = "com.monetization.ads.core.initializer.SdkInitializeRunnable$run$1", f = "SdkInitializeRunnable.kt", l = {30}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28385b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ jv1 f28386c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ hv1 f28387d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jv1 jv1Var, hv1 hv1Var, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f28386c = jv1Var;
            this.f28387d = hv1Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f28386c, this.f28387d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return new a(this.f28386c, this.f28387d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f28385b;
            try {
                if (i == 0) {
                    b9.n.b(obj);
                    jv1 jv1Var = this.f28386c;
                    tk0 tk0Var = tk0.f33653c;
                    this.f28385b = 1;
                    obj = jv1Var.a(tk0Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                }
                this.f28387d.f28383d.a((gv1) obj);
                hv1.f28380f.remove(this.f28386c);
                return C1992A.f18074a;
            } catch (Throwable th) {
                hv1.f28380f.remove(this.f28386c);
                throw th;
            }
        }
    }

    public hv1(Context context, vu1 sdkEnvironmentModule, A9.E coroutineScope, u01 initializeController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(initializeController, "initializeController");
        this.f28381b = sdkEnvironmentModule;
        this.f28382c = coroutineScope;
        this.f28383d = initializeController;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f28384e = applicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jv1 jv1Var = new jv1(this.f28384e, this.f28381b, this.f28382c, new C4198s4(), null, null, 524272);
        f28380f.add(jv1Var);
        C0575f.e(this.f28382c, null, null, new a(jv1Var, this, null), 3);
    }
}
