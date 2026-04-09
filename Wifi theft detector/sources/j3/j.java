package j3;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21753a = "j";

    public static void a(Context context, MBridgeSDK mBridgeSDK) {
        mBridgeSDK.setCoppaStatus(context, MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1);
    }

    public static int b(Context context, float f10) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f10 + 0.5f, resources.getDisplayMetrics());
    }

    public static String c() {
        return "17.0.61.0";
    }

    public static List d(RtbSignalData rtbSignalData) {
        ArrayList arrayList = new ArrayList();
        for (MediationConfiguration mediationConfiguration : rtbSignalData.getConfigurations()) {
            String string = mediationConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
            String string2 = mediationConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                arrayList.add(new h(string, string2));
            }
        }
        return arrayList;
    }

    public static String e() {
        return MBConfiguration.SDK_VERSION;
    }

    public static boolean f(Bundle bundle) {
        return bundle.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
    }

    public static AdError g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorA = MintegralConstants.a(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e(f21753a, adErrorA.toString());
            return adErrorA;
        }
        if (!TextUtils.isEmpty(str2)) {
            return null;
        }
        AdError adErrorA2 = MintegralConstants.a(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
        Log.e(f21753a, adErrorA2.toString());
        return adErrorA2;
    }

    public static AdError h(String str, String str2, String str3) {
        AdError adErrorG = g(str, str2);
        if (adErrorG != null) {
            return adErrorG;
        }
        if (!TextUtils.isEmpty(str3)) {
            return null;
        }
        AdError adErrorA = MintegralConstants.a(103, "Missing or invalid Mintegral bidding signal in this ad request.");
        Log.w(f21753a, adErrorA.toString());
        return adErrorA;
    }
}
