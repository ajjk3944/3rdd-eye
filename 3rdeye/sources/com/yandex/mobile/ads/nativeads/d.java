package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.xt;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class d implements CustomClickHandlerEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final xt f36861a;

    public d(xt coreListener) {
        l.f(coreListener, "coreListener");
        this.f36861a = coreListener;
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onLeftApplication() {
        this.f36861a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onReturnedToApplication() {
        this.f36861a.onReturnedToApplication();
    }
}
