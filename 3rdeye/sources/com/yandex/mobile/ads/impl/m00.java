package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class m00 implements bz {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30143a;

    public m00(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f30143a = context;
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final ag<?> a() throws Resources.NotFoundException {
        CharSequence text = this.f30143a.getResources().getText(R.string.monetization_ads_internal_instream_sponsored_default);
        kotlin.jvm.internal.l.e(text, "getText(...)");
        return new ag<>("sponsored", "string", text, null, false, true);
    }
}
