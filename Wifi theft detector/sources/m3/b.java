package m3;

import android.util.Log;
import android.widget.FrameLayout;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import j3.j;

/* loaded from: classes.dex */
public class b extends k3.b {
    public b(MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    public void b(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        BannerSize bannerSizeA = k3.b.a(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), false);
        if (bannerSizeA == null) {
            AdError adErrorA = MintegralConstants.a(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f21810a.onFailure(adErrorA);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = j.g(string, string2);
        if (adErrorG != null) {
            this.f21810a.onFailure(adErrorG);
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(mediationBannerAdConfiguration.getContext());
        this.f21811b = mBBannerView;
        mBBannerView.init(bannerSizeA, string2, string);
        this.f21811b.setLayoutParams(new FrameLayout.LayoutParams(j.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getWidth()), j.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getHeight())));
        this.f21811b.setBannerAdListener(this);
        this.f21811b.load();
    }
}
