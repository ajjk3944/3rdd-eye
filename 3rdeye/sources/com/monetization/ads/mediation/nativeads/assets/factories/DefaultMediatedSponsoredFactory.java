package com.monetization.ads.mediation.nativeads.assets.factories;

import android.content.Context;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class DefaultMediatedSponsoredFactory {
    public final String makeSponsored(Context context, int i) {
        l.f(context, "context");
        try {
            String string = context.getString(i);
            l.c(string);
            return string;
        } catch (Throwable unused) {
            return "Advertisement";
        }
    }
}
