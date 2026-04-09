package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.td0;

/* loaded from: classes3.dex */
public abstract class dd0<T extends td0<T>> extends ag0 {

    /* renamed from: A, reason: collision with root package name */
    private final dg0 f26133A;

    /* renamed from: B, reason: collision with root package name */
    private final yc0 f26134B;

    /* renamed from: C, reason: collision with root package name */
    private wc0<T> f26135C;

    /* renamed from: D, reason: collision with root package name */
    private wc0<T> f26136D;

    /* renamed from: E, reason: collision with root package name */
    private T f26137E;

    /* renamed from: y, reason: collision with root package name */
    private final ed0<T> f26138y;

    /* renamed from: z, reason: collision with root package name */
    private final nd0<T> f26139z;

    public /* synthetic */ dd0(Context context, C4072a3 c4072a3, vu1 vu1Var, ed0 ed0Var, C4198s4 c4198s4, nd0 nd0Var, dg0 dg0Var) {
        this(context, c4072a3, vu1Var, ed0Var, c4198s4, nd0Var, dg0Var, new yc0(vu1Var));
    }

    public abstract wc0<T> a(xc0 xc0Var);

    @Override // com.yandex.mobile.ads.impl.vj
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f26138y.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void e() {
        if (aa.a((lo) this)) {
            return;
        }
        Context contextL = l();
        wc0[] wc0VarArr = {this.f26136D, this.f26135C};
        for (int i = 0; i < 2; i++) {
            wc0 wc0Var = wc0VarArr[i];
            if (wc0Var != null) {
                wc0Var.a(contextL);
            }
        }
        super.e();
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void r() {
        C4128i3 error = i7.q();
        kotlin.jvm.internal.l.f(error, "error");
        this.f26138y.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void s() {
        T t10 = this.f26137E;
        if (t10 != null) {
            this.f26138y.a(t10);
        } else {
            this.f26138y.a(i7.m());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(Context context, C4072a3 adConfiguration, vu1 sdkEnvironmentModule, ed0<T> fullScreenLoadEventListener, C4198s4 adLoadingPhasesManager, nd0<T> fullscreenAdContentFactory, dg0 htmlAdResponseReportManager, yc0 adResponseControllerFactoryCreator) {
        super(context, adConfiguration, adLoadingPhasesManager);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(fullScreenLoadEventListener, "fullScreenLoadEventListener");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(fullscreenAdContentFactory, "fullscreenAdContentFactory");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        kotlin.jvm.internal.l.f(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        this.f26138y = fullScreenLoadEventListener;
        this.f26139z = fullscreenAdContentFactory;
        this.f26133A = htmlAdResponseReportManager;
        this.f26134B = adResponseControllerFactoryCreator;
        a(u8.f33967a.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.vj, com.yandex.mobile.ads.impl.rq1.b
    public void a(a8<String> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        super.a((a8<T>) adResponse);
        this.f26133A.a(adResponse);
        this.f26133A.a(f());
        wc0<T> wc0VarA = a(this.f26134B.a(adResponse));
        this.f26136D = this.f26135C;
        this.f26135C = wc0VarA;
        this.f26137E = (T) this.f26139z.a(adResponse, f(), wc0VarA);
        Context contextA = C4146l0.a();
        if (contextA != null) {
            fp0.a(new Object[0]);
        }
        if (contextA == null) {
            contextA = l();
        }
        wc0VarA.a(contextA, adResponse);
    }
}
