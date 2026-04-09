package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class da2 {

    /* renamed from: a, reason: collision with root package name */
    private final oa2 f26034a;

    public da2(Context context, qa2 verificationResourcesLoaderProvider, oa2 oa2Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(verificationResourcesLoaderProvider, "verificationResourcesLoaderProvider");
        this.f26034a = oa2Var;
    }

    public final void a(List<za2> videoAds, pa2 listener) {
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        kotlin.jvm.internal.l.f(listener, "listener");
        if (this.f26034a != null && (!(videoAds instanceof Collection) || !videoAds.isEmpty())) {
            Iterator<T> it = videoAds.iterator();
            while (it.hasNext()) {
                if (!((za2) it.next()).d().isEmpty()) {
                    this.f26034a.a(listener);
                    return;
                }
            }
        }
        listener.a();
    }
}
