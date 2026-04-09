package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class nk implements zr1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30912a;

    /* renamed from: b, reason: collision with root package name */
    private final zs0 f30913b;

    /* renamed from: c, reason: collision with root package name */
    private final vs0 f30914c;

    /* renamed from: d, reason: collision with root package name */
    private final yr1 f30915d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<xr1> f30916e;

    /* renamed from: f, reason: collision with root package name */
    private bu f30917f;

    public nk(Context context, rm2 sdkEnvironmentModule, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor, yr1 adItemLoadControllerFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(adItemLoadControllerFactory, "adItemLoadControllerFactory");
        this.f30912a = context;
        this.f30913b = mainThreadUsageValidator;
        this.f30914c = mainThreadExecutor;
        this.f30915d = adItemLoadControllerFactory;
        this.f30916e = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.zr1
    public final void a() {
        this.f30913b.a();
        this.f30914c.a();
        Iterator<xr1> it = this.f30916e.iterator();
        while (it.hasNext()) {
            xr1 next = it.next();
            next.a((bu) null);
            next.e();
        }
        this.f30916e.clear();
    }

    @Override // com.yandex.mobile.ads.impl.zr1
    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        this.f30913b.a();
        if (this.f30917f == null) {
            uo0.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f30914c.a(new V1(10, this, adRequestData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nk this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        xr1 xr1VarA = this$0.f30915d.a(this$0.f30912a, this$0, adRequestData, null);
        this$0.f30916e.add(xr1VarA);
        xr1VarA.a(adRequestData.a());
        xr1VarA.a(this$0.f30917f);
        xr1VarA.b(adRequestData);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4164n4
    public final void a(dd0 dd0Var) {
        xr1 loadController = (xr1) dd0Var;
        kotlin.jvm.internal.l.f(loadController, "loadController");
        if (this.f30917f == null) {
            uo0.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((bu) null);
        this.f30916e.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.zr1
    public final void a(qm2 qm2Var) {
        this.f30913b.a();
        this.f30917f = qm2Var;
        Iterator<xr1> it = this.f30916e.iterator();
        while (it.hasNext()) {
            it.next().a((bu) qm2Var);
        }
    }
}
