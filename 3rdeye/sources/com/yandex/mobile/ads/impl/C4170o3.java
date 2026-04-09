package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4170o3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31151a;

    /* renamed from: b, reason: collision with root package name */
    private final zs f31152b;

    /* renamed from: c, reason: collision with root package name */
    private final wl0 f31153c;

    /* renamed from: d, reason: collision with root package name */
    private final ej0 f31154d;

    /* renamed from: e, reason: collision with root package name */
    private final pm0 f31155e;

    /* renamed from: f, reason: collision with root package name */
    private final cc2<tn0> f31156f;

    public C4170o3(Context context, zs adBreak, wl0 adPlayerController, sk1 imageProvider, pm0 adViewsHolderManager, C4211u3 playbackEventsListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(adPlayerController, "adPlayerController");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(adViewsHolderManager, "adViewsHolderManager");
        kotlin.jvm.internal.l.f(playbackEventsListener, "playbackEventsListener");
        this.f31151a = context;
        this.f31152b = adBreak;
        this.f31153c = adPlayerController;
        this.f31154d = imageProvider;
        this.f31155e = adViewsHolderManager;
        this.f31156f = playbackEventsListener;
    }

    public final C4163n3 a() {
        return new C4163n3(new C4239y3(this.f31151a, this.f31152b, this.f31153c, this.f31154d, this.f31155e, this.f31156f).a(this.f31152b.f()));
    }
}
