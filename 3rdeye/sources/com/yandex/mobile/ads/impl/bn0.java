package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class bn0 implements ze1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25348a;

    /* renamed from: b, reason: collision with root package name */
    private final in0 f25349b;

    /* renamed from: c, reason: collision with root package name */
    private final l82 f25350c;

    public bn0(Context context, in0 instreamInteractionTracker, l82 urlViewerLauncher) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(instreamInteractionTracker, "instreamInteractionTracker");
        kotlin.jvm.internal.l.f(urlViewerLauncher, "urlViewerLauncher");
        this.f25348a = context;
        this.f25349b = instreamInteractionTracker;
        this.f25350c = urlViewerLauncher;
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        if (this.f25350c.a(this.f25348a, url)) {
            this.f25349b.a();
        }
    }
}
