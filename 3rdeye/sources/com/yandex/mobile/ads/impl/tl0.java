package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class tl0 implements gm0 {

    /* renamed from: a, reason: collision with root package name */
    private final ul0 f33668a;

    /* renamed from: b, reason: collision with root package name */
    private final x22 f33669b;

    /* renamed from: c, reason: collision with root package name */
    private final C4198s4 f33670c;

    /* renamed from: d, reason: collision with root package name */
    private final hm0 f33671d;

    /* renamed from: e, reason: collision with root package name */
    private final sb2 f33672e;

    /* renamed from: f, reason: collision with root package name */
    private final fm0 f33673f;

    public tl0(Context context, vu1 sdkEnvironmentModule, ul0 itemFinishedListener, x22 strongReferenceKeepingManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(itemFinishedListener, "itemFinishedListener");
        kotlin.jvm.internal.l.f(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        this.f33668a = itemFinishedListener;
        this.f33669b = strongReferenceKeepingManager;
        C4198s4 c4198s4 = new C4198s4();
        this.f33670c = c4198s4;
        C4072a3 c4072a3 = new C4072a3(ns.f30992h, sdkEnvironmentModule);
        hm0 hm0Var = new hm0(context, c4072a3, c4198s4, this);
        this.f33671d = hm0Var;
        sb2 sb2Var = new sb2(context, c4072a3, c4198s4);
        this.f33672e = sb2Var;
        this.f33673f = new fm0(context, sdkEnvironmentModule, sb2Var, hm0Var);
    }

    public final void a(bi2 requestConfig) {
        kotlin.jvm.internal.l.f(requestConfig, "requestConfig");
        this.f33669b.b(kq0.f29755b, this);
        this.f33671d.a(requestConfig);
        C4198s4 c4198s4 = this.f33670c;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32456e;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        this.f33672e.a(requestConfig, this.f33673f);
    }

    @Override // com.yandex.mobile.ads.impl.gm0
    public final void a() {
        this.f33668a.a(this);
        this.f33669b.a(kq0.f29755b, this);
    }

    public final void a(bt btVar) {
        this.f33671d.a(btVar);
    }
}
