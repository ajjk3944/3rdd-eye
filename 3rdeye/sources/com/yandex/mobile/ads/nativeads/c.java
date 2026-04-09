package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.wt;
import com.yandex.mobile.ads.impl.xt;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class c implements wt {

    /* renamed from: a, reason: collision with root package name */
    private final CustomClickHandler f36860a;

    public c(CustomClickHandler customClickHandler) {
        l.f(customClickHandler, "customClickHandler");
        this.f36860a = customClickHandler;
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final void a(String url, xt listener) {
        l.f(url, "url");
        l.f(listener, "listener");
        this.f36860a.handleCustomClick(url, new d(listener));
    }
}
