package l3;

import android.content.Context;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import j3.h;
import j3.j;
import java.lang.ref.WeakReference;
import k3.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: f, reason: collision with root package name */
    public j3.c f23143f;

    public e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) throws JSONException {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdError adErrorH = j.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f21829a.onFailure(adErrorH);
            return;
        }
        if (this.f21833e.a()) {
            h hVar = new h(string, string2);
            this.f21830b = hVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(hVar, new WeakReference<>(this));
        }
        j3.c cVarD = j3.d.d();
        this.f23143f = cVarD;
        cVarD.a(mediationRewardedAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationRewardedAdConfiguration.getWatermark());
            this.f23143f.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding rewarded video ad.", e10);
        }
        this.f23143f.b(this);
        this.f23143f.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f23143f.playVideoMute(this.f21832d ? 1 : 2);
        this.f23143f.showFromBid();
    }
}
