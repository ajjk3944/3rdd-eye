package l3;

import android.util.Log;
import android.view.View;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import j3.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends k3.d {

    /* renamed from: e, reason: collision with root package name */
    public MBBidNativeHandler f23142e;

    public d(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    public void c(MediationNativeAdConfiguration mediationNativeAdConfiguration) throws JSONException {
        String string = mediationNativeAdConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = mediationNativeAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        AdError adErrorH = j.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f21819b.onFailure(adErrorH);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        this.f23142e = new MBBidNativeHandler(nativeProperties, mediationNativeAdConfiguration.getContext());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationNativeAdConfiguration.getWatermark());
            this.f23142e.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding native ad.", e10);
        }
        this.f23142e.setAdListener(new k3.e(this, mediationNativeAdConfiguration.getContext(), this.f21819b));
        this.f23142e.bidLoad(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        ArrayList arrayList = new ArrayList(map3.values());
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            View view2 = (View) arrayList.get(i11);
            if (view2 instanceof MediaView) {
                MediaView mediaView = (MediaView) view2;
                while (true) {
                    if (i10 >= mediaView.getChildCount()) {
                        break;
                    }
                    View childAt = mediaView.getChildAt(i10);
                    if (childAt instanceof MBMediaView) {
                        ((MBMediaView) childAt).setOnMediaViewListener(this);
                        break;
                    }
                    i10++;
                }
            } else {
                i11++;
            }
        }
        MBBidNativeHandler mBBidNativeHandler = this.f23142e;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.registerView(view, arrayList, this.f21818a);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        MBBidNativeHandler mBBidNativeHandler = this.f23142e;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(view, b(view), this.f21818a);
        }
    }
}
