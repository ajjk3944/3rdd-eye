package l3;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import j3.h;
import j3.j;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends k3.a {

    /* renamed from: f, reason: collision with root package name */
    public String f23140f;

    public a(MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        super(mediationAdLoadCallback, aVar);
    }

    public void a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) throws JSONException {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        this.f23140f = bidResponse;
        AdError adErrorH = j.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f21805a.onFailure(adErrorH);
            return;
        }
        if (this.f21809e.a()) {
            h hVar = new h(string, string2);
            this.f21806b = hVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(hVar, new WeakReference<>(this));
        }
        this.f21808d = j3.d.f();
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            b(watermark);
        }
        this.f21808d.d(string2, string);
        this.f21808d.e(this);
        this.f21808d.f(this);
        this.f21808d.c(this.f23140f);
    }

    public final void b(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, str);
            this.f21808d.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding app open ad.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Activity activity = (Activity) context;
        if (this.f21808d != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.f21808d.b(relativeLayout, this.f23140f);
        }
    }
}
