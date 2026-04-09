package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b6 implements sm0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f25089c = R.string.monetization_ads_internal_instream_ad_position;

    /* renamed from: a, reason: collision with root package name */
    private final int f25090a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25091b;

    public b6(int i, int i10) {
        this.f25090a = i;
        this.f25091b = i10;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) throws Resources.NotFoundException {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        TextView textViewB = uiElements.b();
        if (textViewB != null) {
            String string = textViewB.getContext().getResources().getString(f25089c);
            kotlin.jvm.internal.l.e(string, "getString(...)");
            textViewB.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f25090a), Integer.valueOf(this.f25091b)}, 2)));
        }
    }
}
