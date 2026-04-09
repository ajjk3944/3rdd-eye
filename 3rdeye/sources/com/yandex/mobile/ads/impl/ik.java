package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class ik implements lp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28715a;

    /* renamed from: b, reason: collision with root package name */
    private final zs0 f28716b;

    /* renamed from: c, reason: collision with root package name */
    private final vs0 f28717c;

    /* renamed from: d, reason: collision with root package name */
    private final kp0 f28718d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<jp0> f28719e;

    /* renamed from: f, reason: collision with root package name */
    private ht f28720f;

    public ik(Context context, rm2 sdkEnvironmentModule, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor, kp0 adItemLoadControllerFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(adItemLoadControllerFactory, "adItemLoadControllerFactory");
        this.f28715a = context;
        this.f28716b = mainThreadUsageValidator;
        this.f28717c = mainThreadExecutor;
        this.f28718d = adItemLoadControllerFactory;
        this.f28719e = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.lp0
    public final void a() {
        this.f28716b.a();
        this.f28717c.a();
        Iterator<jp0> it = this.f28719e.iterator();
        while (it.hasNext()) {
            jp0 next = it.next();
            next.a((ht) null);
            next.e();
        }
        this.f28719e.clear();
    }

    @Override // com.yandex.mobile.ads.impl.lp0
    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        this.f28716b.a();
        if (this.f28720f == null) {
            uo0.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f28717c.a(new I2(4, this, adRequestData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ik this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        jp0 jp0VarA = this$0.f28718d.a(this$0.f28715a, this$0, adRequestData, null);
        this$0.f28719e.add(jp0VarA);
        jp0VarA.a(adRequestData.a());
        jp0VarA.a(this$0.f28720f);
        jp0VarA.b(adRequestData);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4164n4
    public final void a(dd0 dd0Var) {
        jp0 loadController = (jp0) dd0Var;
        kotlin.jvm.internal.l.f(loadController, "loadController");
        if (this.f28720f == null) {
            uo0.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((ht) null);
        this.f28719e.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.lp0
    public final void a(bm2 bm2Var) {
        this.f28716b.a();
        this.f28720f = bm2Var;
        Iterator<jp0> it = this.f28719e.iterator();
        while (it.hasNext()) {
            it.next().a((ht) bm2Var);
        }
    }
}
