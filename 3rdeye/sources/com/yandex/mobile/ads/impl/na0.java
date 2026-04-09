package com.yandex.mobile.ads.impl;

import java.util.Set;

/* loaded from: classes3.dex */
public final class na0 {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f30820a;

    public na0(kt nativeAdAssets, ei availableAssetsProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(availableAssetsProvider, "availableAssetsProvider");
        this.f30820a = ei.a(nativeAdAssets);
    }

    public final boolean a() {
        return this.f30820a.size() == 2 && this.f30820a.contains("feedback") && this.f30820a.contains("media");
    }
}
