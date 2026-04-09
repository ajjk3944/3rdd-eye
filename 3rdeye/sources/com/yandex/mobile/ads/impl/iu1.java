package com.yandex.mobile.ads.impl;

import A9.C0575f;
import A9.C0583j;
import A9.InterfaceC0581i;
import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.hu1;
import com.yandex.mobile.ads.impl.su1;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class iu1 {

    /* renamed from: d, reason: collision with root package name */
    private static final K9.a f28866d = K9.f.a();

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f28867a;

    /* renamed from: b, reason: collision with root package name */
    private final zw1 f28868b;

    /* renamed from: c, reason: collision with root package name */
    private final hu1 f28869c;

    public /* synthetic */ iu1(Context context, vu1 vu1Var, k50 k50Var, cc ccVar, C4198s4 c4198s4) {
        zw1 zw1Var = new zw1();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, vu1Var, k50Var, ccVar, c4198s4, zw1Var, new hu1(applicationContext, vu1Var.c(), ccVar, k50Var, c4198s4));
    }

    @h9.e(c = "com.monetization.ads.base.SdkConfigurationLoaderHolder$loadSdkConfiguration$2", f = "SdkConfigurationLoaderHolder.kt", l = {93, 96}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super su1>, Object> {

        /* renamed from: b, reason: collision with root package name */
        K9.a f28870b;

        /* renamed from: c, reason: collision with root package name */
        iu1 f28871c;

        /* renamed from: d, reason: collision with root package name */
        tk0 f28872d;

        /* renamed from: e, reason: collision with root package name */
        Object f28873e;

        /* renamed from: f, reason: collision with root package name */
        int f28874f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ tk0 f28876h;

        /* renamed from: com.yandex.mobile.ads.impl.iu1$a$a, reason: collision with other inner class name */
        public static final class C0409a extends kotlin.jvm.internal.m implements p9.l<Throwable, C1992A> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu1 f28877b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0409a(iu1 iu1Var) {
                super(1);
                this.f28877b = iu1Var;
            }

            @Override // p9.l
            public final C1992A invoke(Throwable th) {
                this.f28877b.f28869c.a();
                return C1992A.f18074a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tk0 tk0Var, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f28876h = tk0Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return iu1.this.new a(this.f28876h, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super su1> interfaceC4347e) {
            return iu1.this.new a(this.f28876h, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            K9.a aVar;
            iu1 iu1Var;
            tk0 tk0Var;
            K9.a aVar2;
            Throwable th;
            g9.a aVar3 = g9.a.COROUTINE_SUSPENDED;
            int i = this.f28874f;
            try {
                if (i == 0) {
                    b9.n.b(obj);
                    C4198s4 c4198s4 = iu1.this.f28867a;
                    EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32461k;
                    c4198s4.getClass();
                    kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
                    c4198s4.a(adLoadingPhaseType, null);
                    aVar = iu1.f28866d;
                    iu1Var = iu1.this;
                    tk0Var = this.f28876h;
                    this.f28870b = aVar;
                    this.f28871c = iu1Var;
                    this.f28872d = tk0Var;
                    this.f28874f = 1;
                    if (aVar.a(this) != aVar3) {
                    }
                    return aVar3;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = this.f28870b;
                    try {
                        b9.n.b(obj);
                        su1 su1Var = (su1) obj;
                        aVar2.c(null);
                        return su1Var;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.c(null);
                        throw th;
                    }
                }
                tk0Var = this.f28872d;
                iu1Var = this.f28871c;
                K9.a aVar4 = this.f28870b;
                b9.n.b(obj);
                aVar = aVar4;
                iu1Var.f28867a.a(EnumC4191r4.f32461k);
                this.f28870b = aVar;
                this.f28871c = iu1Var;
                this.f28872d = tk0Var;
                this.f28874f = 2;
                C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
                c0583j.s();
                c0583j.u(new C0409a(iu1Var));
                iu1Var.f28869c.a(iu1Var.f28868b, tk0Var, new b(c0583j));
                Object objR = c0583j.r();
                if (objR != aVar3) {
                    aVar2 = aVar;
                    obj = objR;
                    su1 su1Var2 = (su1) obj;
                    aVar2.c(null);
                    return su1Var2;
                }
                return aVar3;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                aVar2.c(null);
                throw th;
            }
        }

        public static final class b implements hu1.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0581i<su1> f28878a;

            public b(C0583j c0583j) {
                this.f28878a = c0583j;
            }

            @Override // com.yandex.mobile.ads.impl.hu1.a
            public final void a(fi2 error, er configurationSource) {
                kotlin.jvm.internal.l.f(error, "error");
                kotlin.jvm.internal.l.f(configurationSource, "configurationSource");
                if (this.f28878a.isActive()) {
                    this.f28878a.resumeWith(new su1.a(error, configurationSource));
                }
            }

            @Override // com.yandex.mobile.ads.impl.hu1.a
            public final void a(du1 sdkConfiguration, er configurationSource) {
                kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
                kotlin.jvm.internal.l.f(configurationSource, "configurationSource");
                if (this.f28878a.isActive()) {
                    this.f28878a.resumeWith(new su1.b(sdkConfiguration, configurationSource));
                }
            }
        }
    }

    public final Object a(tk0 tk0Var, InterfaceC4347e<? super su1> interfaceC4347e) {
        return C0575f.h(A9.U.f212b, new a(tk0Var, null), interfaceC4347e);
    }

    public iu1(Context context, vu1 sdkEnvironmentModule, k50 environmentController, cc advertisingConfiguration, C4198s4 adLoadingPhasesManager, zw1 sensitiveModeChecker, hu1 sdkConfigurationLoader) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(environmentController, "environmentController");
        kotlin.jvm.internal.l.f(advertisingConfiguration, "advertisingConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        kotlin.jvm.internal.l.f(sdkConfigurationLoader, "sdkConfigurationLoader");
        this.f28867a = adLoadingPhasesManager;
        this.f28868b = sensitiveModeChecker;
        this.f28869c = sdkConfigurationLoader;
    }
}
