package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class hh1<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final kt f28224a;

    /* renamed from: b, reason: collision with root package name */
    private final x31 f28225b;

    /* renamed from: c, reason: collision with root package name */
    private final a41 f28226c;

    public hh1(kt nativeAdAssets, x31 nativeAdAdditionalViewProvider, a41 nativeAdAssetViewProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        kotlin.jvm.internal.l.f(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f28224a = nativeAdAssets;
        this.f28225b = nativeAdAdditionalViewProvider;
        this.f28226c = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f28225b.getClass();
        ImageView imageView = (ImageView) container.findViewById(R.id.icon_placeholder);
        mt mtVarG = this.f28224a.g();
        mt mtVarE = this.f28224a.e();
        if (imageView != null && mtVarG == null && mtVarE == null) {
            this.f28226c.getClass();
            xg2 xg2Var = new xg2((TextView) container.findViewById(R.id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(xg2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
