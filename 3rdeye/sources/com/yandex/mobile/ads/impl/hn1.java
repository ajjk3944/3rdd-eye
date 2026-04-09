package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* loaded from: classes3.dex */
public final class hn1<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final kt f28293a;

    /* renamed from: b, reason: collision with root package name */
    private final in1 f28294b;

    /* renamed from: c, reason: collision with root package name */
    private final x31 f28295c;

    /* renamed from: d, reason: collision with root package name */
    private final r41 f28296d;

    public hn1(kt nativeAdAssets, in1 ratingFormatter, x31 nativeAdAdditionalViewProvider, r41 nativeAdContainerViewProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(ratingFormatter, "ratingFormatter");
        kotlin.jvm.internal.l.f(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        kotlin.jvm.internal.l.f(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        this.f28293a = nativeAdAssets;
        this.f28294b = ratingFormatter;
        this.f28295c = nativeAdAdditionalViewProvider;
        this.f28296d = nativeAdContainerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        String strValueOf;
        kotlin.jvm.internal.l.f(container, "container");
        this.f28296d.getClass();
        ViewGroup viewGroup = (ViewGroup) container.findViewById(R.id.rating_container);
        Float fK = this.f28293a.k();
        if (fK == null) {
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        this.f28295c.getClass();
        TextView textView = (TextView) container.findViewById(R.id.rating_text);
        if (textView != null) {
            in1 in1Var = this.f28294b;
            float fFloatValue = fK.floatValue();
            in1Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                strValueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(fFloatValue);
                kotlin.jvm.internal.l.c(strValueOf);
            } catch (RuntimeException unused) {
                strValueOf = String.valueOf(fFloatValue);
            }
            textView.setText(strValueOf);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
