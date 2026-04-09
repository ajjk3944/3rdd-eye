package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class rc<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final kt f32587a;

    /* renamed from: b, reason: collision with root package name */
    private final e51 f32588b;

    public rc(kt nativeAdAssets, e51 nativeAdDividerViewProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(nativeAdDividerViewProvider, "nativeAdDividerViewProvider");
        this.f32587a = nativeAdAssets;
        this.f32588b = nativeAdDividerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f32588b.getClass();
        View viewFindViewById = container.findViewById(R.id.age_divider);
        if (viewFindViewById == null || this.f32587a.a() != null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
