package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class kn<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final a41 f29731a;

    /* renamed from: b, reason: collision with root package name */
    private final jn f29732b;

    public kn(Context context, a41 nativeAdAssetViewProvider, jn callToActionAnimationController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        kotlin.jvm.internal.l.f(callToActionAnimationController, "callToActionAnimationController");
        this.f29731a = nativeAdAssetViewProvider;
        this.f29732b = callToActionAnimationController;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f29731a.getClass();
        TextView textView = (TextView) container.findViewById(R.id.call_to_action);
        if (textView != null) {
            this.f29732b.a(textView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        this.f29732b.a();
    }
}
