package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zg {

    /* renamed from: a, reason: collision with root package name */
    private final List<sm0> f36468a;

    /* JADX WARN: Multi-variable type inference failed */
    public zg(List<? extends sm0> assetViewConfigurators) {
        kotlin.jvm.internal.l.f(assetViewConfigurators, "assetViewConfigurators");
        this.f36468a = assetViewConfigurators;
    }

    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        Iterator<sm0> it = this.f36468a.iterator();
        while (it.hasNext()) {
            it.next().a(uiElements);
        }
    }
}
