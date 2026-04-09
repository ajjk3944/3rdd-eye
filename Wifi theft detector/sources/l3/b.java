package l3;

import android.util.Log;
import android.widget.FrameLayout;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import j3.j;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends k3.b {
    public b(MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    public void b(MediationBannerAdConfiguration mediationBannerAdConfiguration) throws JSONException {
        BannerSize bannerSizeA = k3.b.a(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), true);
        if (bannerSizeA == null) {
            AdError adErrorA = MintegralConstants.a(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f21810a.onFailure(adErrorA);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        AdError adErrorH = j.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f21810a.onFailure(adErrorH);
            return;
        }
        MBBannerView mBBannerViewC = j3.d.c(mediationBannerAdConfiguration.getContext());
        this.f21811b = mBBannerViewC;
        mBBannerViewC.init(bannerSizeA, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationBannerAdConfiguration.getWatermark());
            this.f21811b.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding banner ad.", e10);
        }
        this.f21811b.setLayoutParams(new FrameLayout.LayoutParams(j.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getWidth()), j.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getHeight())));
        this.f21811b.setBannerAdListener(this);
        this.f21811b.loadFromBid(bidResponse);
    }
}
