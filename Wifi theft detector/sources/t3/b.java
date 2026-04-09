package t3;

import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleBannerView;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b extends r3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MediationAdLoadCallback mediationAdLoadCallback, q3.b vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
        p.e(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.e(vungleFactory, "vungleFactory");
    }

    @Override // r3.b
    public void d(VungleBannerView bannerAdView, MediationBannerAdConfiguration mediationBannerAdConfiguration) throws Throwable {
        p.e(bannerAdView, "bannerAdView");
        p.e(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        bannerAdView.load(null);
    }
}
