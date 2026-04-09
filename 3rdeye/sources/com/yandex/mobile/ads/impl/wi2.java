package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class wi2<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final a41 f34994a;

    public /* synthetic */ wi2() {
        this(new a41());
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f34994a.getClass();
        TextView textView = (TextView) container.findViewById(R.id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    public wi2(a41 nativeAdAssetViewProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f34994a = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
