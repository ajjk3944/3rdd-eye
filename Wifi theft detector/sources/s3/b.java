package s3;

import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.f;

/* loaded from: classes.dex */
public class b extends r3.b implements f {
    public b(MediationAdLoadCallback mediationAdLoadCallback, q3.b bVar) {
        super(mediationAdLoadCallback, bVar);
    }

    @Override // r3.b
    public void d(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration) throws Throwable {
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            vungleBannerView.getAdConfig().setWatermark(watermark);
        }
        vungleBannerView.load(bidResponse);
    }
}
