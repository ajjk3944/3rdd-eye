package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ah1;
import java.util.List;

/* loaded from: classes3.dex */
public final class gw1 implements b62 {

    /* renamed from: a, reason: collision with root package name */
    private final id1 f28020a;

    /* renamed from: b, reason: collision with root package name */
    private final no1 f28021b;

    /* renamed from: c, reason: collision with root package name */
    private final ok0 f28022c;

    /* renamed from: d, reason: collision with root package name */
    private final ah1 f28023d;

    public gw1(u21 noticeTrackingManager, no1 renderTrackingManager, ok0 indicatorManager, ah1 phoneStateTracker) {
        kotlin.jvm.internal.l.f(noticeTrackingManager, "noticeTrackingManager");
        kotlin.jvm.internal.l.f(renderTrackingManager, "renderTrackingManager");
        kotlin.jvm.internal.l.f(indicatorManager, "indicatorManager");
        kotlin.jvm.internal.l.f(phoneStateTracker, "phoneStateTracker");
        this.f28020a = noticeTrackingManager;
        this.f28021b = renderTrackingManager;
        this.f28022c = indicatorManager;
        this.f28023d = phoneStateTracker;
    }

    @Override // com.yandex.mobile.ads.impl.b62
    public final void a(x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f28022c.a(nativeAdViewAdapter);
    }

    @Override // com.yandex.mobile.ads.impl.b62
    public final void a(hk0 impressionTrackingListener) {
        kotlin.jvm.internal.l.f(impressionTrackingListener, "impressionTrackingListener");
        this.f28020a.a(impressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.b62
    public final void a(j91 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f28021b.a(reportParameterManager);
    }

    @Override // com.yandex.mobile.ads.impl.b62
    public final void a(Context context, ah1.b phoneStateListener, x61 x61Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(phoneStateListener, "phoneStateListener");
        this.f28021b.b();
        this.f28020a.b();
        this.f28023d.a(phoneStateListener);
        if (x61Var != null) {
            this.f28022c.a(context, x61Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b62
    public final void a(Context context, ah1.b phoneStateListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(phoneStateListener, "phoneStateListener");
        this.f28021b.c();
        this.f28020a.a();
        this.f28023d.b(phoneStateListener);
        this.f28022c.a();
    }

    @Override // com.yandex.mobile.ads.impl.b62
    public final void a(a8<?> adResponse, List<tx1> showNotices) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        this.f28020a.a(adResponse, showNotices);
    }
}
