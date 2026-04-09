package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.fm0;

/* loaded from: classes3.dex */
public final class hm0 implements fm0.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f28267a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f28268b;

    /* renamed from: c, reason: collision with root package name */
    private final gm0 f28269c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f28270d;

    /* renamed from: e, reason: collision with root package name */
    private final C4212u4 f28271e;

    /* renamed from: f, reason: collision with root package name */
    private bt f28272f;

    public /* synthetic */ hm0(Context context, C4072a3 c4072a3, C4198s4 c4198s4, gm0 gm0Var) {
        this(context, c4072a3, c4198s4, gm0Var, new Handler(Looper.getMainLooper()), new C4212u4(context, c4072a3, c4198s4));
    }

    @Override // com.yandex.mobile.ads.impl.fm0.a
    public final void a(String error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f28268b.a(EnumC4191r4.f32456e);
        this.f28271e.a(error);
        this.f28270d.post(new L4(7, this, error));
    }

    public hm0(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, gm0 requestFinishedListener, Handler handler, C4212u4 adLoadingResultReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(requestFinishedListener, "requestFinishedListener");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(adLoadingResultReporter, "adLoadingResultReporter");
        this.f28267a = adConfiguration;
        this.f28268b = adLoadingPhasesManager;
        this.f28269c = requestFinishedListener;
        this.f28270d = handler;
        this.f28271e = adLoadingResultReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hm0 this$0, String error) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(error, "$error");
        bt btVar = this$0.f28272f;
        if (btVar != null) {
            btVar.onInstreamAdFailedToLoad(error);
        }
        this$0.f28269c.a();
    }

    @Override // com.yandex.mobile.ads.impl.fm0.a
    public final void a(xs instreamAd) {
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        C4156m3.a(this.f28267a.b().b());
        this.f28268b.a(EnumC4191r4.f32456e);
        this.f28271e.a();
        this.f28270d.post(new L(5, this, instreamAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hm0 this$0, xs instreamAd) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(instreamAd, "$instreamAd");
        bt btVar = this$0.f28272f;
        if (btVar != null) {
            btVar.a(instreamAd);
        }
        this$0.f28269c.a();
    }

    public final void a(bt btVar) {
        this.f28272f = btVar;
        this.f28271e.a(btVar);
    }

    public final void a(bi2 requestConfig) {
        kotlin.jvm.internal.l.f(requestConfig, "requestConfig");
        this.f28271e.a(new lo0(requestConfig));
    }
}
