package com.monetization.ads.mediation.nativeads.assets.factories;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class DefaultMediatedFeedbackFactory {
    public final MediatedNativeAdImage makeFeedback(Context context, int i) {
        l.f(context, "context");
        MediatedNativeAdImage.Builder height = new MediatedNativeAdImage.Builder("default_mediation_feedback_url").setWidth(68).setHeight(68);
        try {
            height.setDrawable(context.getDrawable(i));
        } catch (Throwable unused) {
        }
        return height.build();
    }
}
