package l3;

import android.content.Context;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import j3.h;
import j3.j;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends k3.c {

    /* renamed from: f, reason: collision with root package name */
    public j3.b f23141f;

    public c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) throws JSONException {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdError adErrorH = j.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f21813a.onFailure(adErrorH);
            return;
        }
        if (this.f21817e.a()) {
            h hVar = new h(string, string2);
            this.f21814b = hVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(hVar, new WeakReference<>(this));
        }
        j3.b bVarA = j3.d.a();
        this.f23141f = bVarA;
        bVarA.a(mediationInterstitialAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationInterstitialAdConfiguration.getWatermark());
            this.f23141f.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding interstitial ad.", e10);
        }
        this.f23141f.b(this);
        this.f23141f.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f23141f.playVideoMute(this.f21816d ? 1 : 2);
        this.f23141f.showFromBid();
    }
}
