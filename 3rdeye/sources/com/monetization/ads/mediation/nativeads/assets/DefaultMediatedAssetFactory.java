package com.monetization.ads.mediation.nativeads.assets;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedFeedbackFactory;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedSponsoredFactory;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class DefaultMediatedAssetFactory implements MediatedAssetFactory {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23764a;

    /* renamed from: b, reason: collision with root package name */
    private final DefaultMediatedSponsoredFactory f23765b;

    /* renamed from: c, reason: collision with root package name */
    private final DefaultMediatedFeedbackFactory f23766c;

    public DefaultMediatedAssetFactory(Context context, DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory) {
        l.f(context, "context");
        l.f(defaultMediatedSponsoredFactory, "defaultMediatedSponsoredFactory");
        l.f(defaultMediatedFeedbackFactory, "defaultMediatedFeedbackFactory");
        this.f23764a = context;
        this.f23765b = defaultMediatedSponsoredFactory;
        this.f23766c = defaultMediatedFeedbackFactory;
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    public MediatedNativeAdImage makeDefaultFeedback() {
        return this.f23766c.makeFeedback(this.f23764a, R.drawable.monetization_ads_mediation_api_feedback_icon);
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    public String makeDefaultSponsored() {
        return this.f23765b.makeSponsored(this.f23764a, R.string.monetization_ads_mediation_api_sponsored_text);
    }

    public /* synthetic */ DefaultMediatedAssetFactory(Context context, DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory, int i, g gVar) {
        this(context, (i & 2) != 0 ? new DefaultMediatedSponsoredFactory() : defaultMediatedSponsoredFactory, (i & 4) != 0 ? new DefaultMediatedFeedbackFactory() : defaultMediatedFeedbackFactory);
    }
}
