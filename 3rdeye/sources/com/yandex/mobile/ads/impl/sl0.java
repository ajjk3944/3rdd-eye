package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.x22;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class sl0 implements ul0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33105a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f33106b;

    /* renamed from: c, reason: collision with root package name */
    private final zs0 f33107c;

    /* renamed from: d, reason: collision with root package name */
    private final vs0 f33108d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<tl0> f33109e;

    /* renamed from: f, reason: collision with root package name */
    private bt f33110f;

    public /* synthetic */ sl0(Context context, vu1 vu1Var) {
        this(context, vu1Var, new zs0(context), new vs0());
    }

    public final void a(bi2 requestConfig) {
        kotlin.jvm.internal.l.f(requestConfig, "requestConfig");
        this.f33107c.a();
        this.f33108d.a(new V1(15, this, requestConfig));
    }

    public sl0(Context context, vu1 sdkEnvironmentModule, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        this.f33105a = context;
        this.f33106b = sdkEnvironmentModule;
        this.f33107c = mainThreadUsageValidator;
        this.f33108d = mainThreadExecutor;
        this.f33109e = new CopyOnWriteArrayList<>();
        mainThreadUsageValidator.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(sl0 this$0, bi2 requestConfig) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(requestConfig, "$requestConfig");
        tl0 tl0Var = new tl0(this$0.f33105a, this$0.f33106b, this$0, x22.a.a());
        this$0.f33109e.add(tl0Var);
        tl0Var.a(this$0.f33110f);
        tl0Var.a(requestConfig);
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a(tl0 nativeAdLoadingItem) {
        kotlin.jvm.internal.l.f(nativeAdLoadingItem, "nativeAdLoadingItem");
        this.f33107c.a();
        this.f33109e.remove(nativeAdLoadingItem);
    }

    public final void a(bt btVar) {
        this.f33107c.a();
        this.f33110f = btVar;
        Iterator<T> it = this.f33109e.iterator();
        while (it.hasNext()) {
            ((tl0) it.next()).a(btVar);
        }
    }
}
