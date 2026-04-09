package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class fz implements bz {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27491a;

    public fz(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f27491a = context;
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final ag<?> a() throws Resources.NotFoundException {
        CharSequence text = this.f27491a.getResources().getText(R.string.monetization_ads_internal_instream_call_to_action);
        kotlin.jvm.internal.l.e(text, "getText(...)");
        return new ag<>("call_to_action", "string", text, null, true, true);
    }
}
