package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class i01 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28431a;

    /* renamed from: b, reason: collision with root package name */
    private final C4148l2 f28432b;

    /* renamed from: c, reason: collision with root package name */
    private final wl0 f28433c;

    /* renamed from: d, reason: collision with root package name */
    private final lm0 f28434d;

    /* renamed from: e, reason: collision with root package name */
    private final pm0 f28435e;

    /* renamed from: f, reason: collision with root package name */
    private final yn0 f28436f;

    /* renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f28437g;

    public i01(Context context, C4148l2 adBreakStatusController, wl0 instreamAdPlayerController, lm0 instreamAdUiElementsManager, pm0 instreamAdViewsHolderManager, yn0 adCreativePlaybackEventListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adBreakStatusController, "adBreakStatusController");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(instreamAdUiElementsManager, "instreamAdUiElementsManager");
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(adCreativePlaybackEventListener, "adCreativePlaybackEventListener");
        this.f28431a = context;
        this.f28432b = adBreakStatusController;
        this.f28433c = instreamAdPlayerController;
        this.f28434d = instreamAdUiElementsManager;
        this.f28435e = instreamAdViewsHolderManager;
        this.f28436f = adCreativePlaybackEventListener;
        this.f28437g = new LinkedHashMap();
    }

    public final C4113g2 a(zs adBreak) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        LinkedHashMap linkedHashMap = this.f28437g;
        Object obj = linkedHashMap.get(adBreak);
        if (obj == null) {
            Context applicationContext = this.f28431a.getApplicationContext();
            kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
            C4113g2 c4113g2 = new C4113g2(applicationContext, adBreak, this.f28433c, this.f28434d, this.f28435e, this.f28432b);
            c4113g2.a(this.f28436f);
            linkedHashMap.put(adBreak, c4113g2);
            obj = c4113g2;
        }
        return (C4113g2) obj;
    }
}
