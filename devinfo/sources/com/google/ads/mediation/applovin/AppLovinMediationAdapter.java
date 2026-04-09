package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.f1;
import bb.y;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.BuildConfig;
import com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer;
import com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.mx0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import pa.r;
import va.w1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinMediationAdapter extends RtbAdapter {
    public static final String APPLOVIN_SDK_ERROR_DOMAIN = "com.applovin.sdk";
    public static final int ERROR_AD_ALREADY_REQUESTED = 105;
    public static final int ERROR_AD_FORMAT_UNSUPPORTED = 108;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    public static final int ERROR_CHILD_USER = 112;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.applovin";
    public static final int ERROR_EMPTY_BID_TOKEN = 104;
    public static final int ERROR_MISSING_AD_UNIT_ID = 113;
    public static final int ERROR_MISSING_SDK_KEY = 110;
    static final String ERROR_MSG_BANNER_SIZE_MISMATCH = "Failed to request banner with unsupported size.";
    static final String ERROR_MSG_MISSING_SDK = "Missing or invalid SDK Key.";
    public static final int ERROR_PRESENTATION_AD_NOT_READY = 106;
    private static final String TAG = "AppLovinMediationAdapter";
    private final a appLovinAdFactory;
    private final f appLovinInitializer;
    private final l appLovinSdkUtilsWrapper;
    private final m appLovinSdkWrapper;
    private c bannerAd;
    private q rewardedRenderer;
    private AppLovinRtbInterstitialRenderer rtbInterstitialRenderer;
    private AppLovinRtbRewardedRenderer rtbRewardedRenderer;
    private p waterfallInterstitialAd;

    public AppLovinMediationAdapter() {
        if (f.f8979b == null) {
            f.f8979b = new f();
        }
        this.appLovinInitializer = f.f8979b;
        this.appLovinAdFactory = new a();
        this.appLovinSdkWrapper = new m();
        this.appLovinSdkUtilsWrapper = new l();
    }

    public static AppLovinSdkSettings getSdkSettings(Context context) {
        return AppLovinSdk.getInstance(context).getSettings();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(db.a aVar, db.b bVar) {
        if (AppLovinUtils.isChildUser()) {
            pa.a childUserError = AppLovinUtils.getChildUserError();
            mx0 mx0Var = (mx0) bVar;
            mx0Var.getClass();
            try {
                ((ks) mx0Var.f14041b).b(childUserError.a());
                return;
            } catch (RemoteException e2) {
                za.i.f("", e2);
                return;
            }
        }
        ArrayList arrayList = aVar.f22177b;
        if (!arrayList.isEmpty() && ((bb.o) arrayList.get(0)).f2115a == pa.b.NATIVE) {
            Log.e(TAG, "Requested to collect signal for unsupported native ad format. Ignoring...");
            mx0 mx0Var2 = (mx0) bVar;
            mx0Var2.getClass();
            try {
                ((ks) mx0Var2.f14041b).b(new w1(108, "Requested to collect signal for unsupported native ad format. Ignoring...", ERROR_DOMAIN, null, null));
                return;
            } catch (RemoteException e10) {
                za.i.f("", e10);
                return;
            }
        }
        String str = TAG;
        Log.i(str, "Extras for signal collection: " + aVar.f22178c);
        String bidToken = this.appLovinInitializer.b(aVar.f22176a).getAdService().getBidToken();
        if (TextUtils.isEmpty(bidToken)) {
            Log.e(str, "Failed to generate bid token.");
            mx0 mx0Var3 = (mx0) bVar;
            mx0Var3.getClass();
            try {
                ((ks) mx0Var3.f14041b).b(new w1(104, "Failed to generate bid token.", ERROR_DOMAIN, null, null));
                return;
            } catch (RemoteException e11) {
                za.i.f("", e11);
                return;
            }
        }
        Log.i(str, "Generated bid token: " + bidToken);
        mx0 mx0Var4 = (mx0) bVar;
        mx0Var4.getClass();
        try {
            ((ks) mx0Var4.f14041b).k(bidToken);
        } catch (RemoteException e12) {
            za.i.f("", e12);
        }
    }

    @Override // bb.a
    public r getSDKVersionInfo() {
        this.appLovinSdkWrapper.getClass();
        String str = AppLovinSdk.VERSION;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 3) {
            return new r(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, d.h.t("Unexpected SDK version format: ", str, ". Returning 0.0.0 for SDK version."));
        return new r(0, 0, 0);
    }

    @Override // bb.a
    public r getVersionInfo() {
        return getVersionInfo(BuildConfig.ADAPTER_VERSION);
    }

    @Override // bb.a
    public void initialize(Context context, bb.b bVar, List<bb.o> list) {
        if (AppLovinUtils.isChildUser()) {
            ((fk0) bVar).a(AppLovinUtils.ERROR_MSG_CHILD_USER);
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<bb.o> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().f2116b.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            Log.w(TAG, ERROR_MSG_MISSING_SDK);
            ((fk0) bVar).a(ERROR_MSG_MISSING_SDK);
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (hashSet.size() > 1) {
            Log.w(TAG, "Found more than one AppLovin SDK key. Using " + str + ". Please update your app's ad unit mappings on Admob/GAM UI to use a single SDK key for ad serving to work as expected.");
        }
        this.appLovinInitializer.a(context, str, new h(bVar));
    }

    @Override // bb.a
    public void loadAppOpenAd(bb.j jVar, bb.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.i(AppLovinUtils.getChildUserError());
            return;
        }
        f fVar = this.appLovinInitializer;
        n nVar = new n(eVar, fVar, this.appLovinAdFactory);
        nk.k.e(jVar, "appOpenAdConfiguration");
        Bundle bundle = jVar.f2110b;
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (string == null || string.length() == 0) {
            eVar.i(new pa.a(110, ERROR_MSG_MISSING_SDK, ERROR_DOMAIN, null));
            return;
        }
        String string2 = bundle.getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        if (string2 == null || string2.length() == 0) {
            eVar.i(new pa.a(ERROR_MISSING_AD_UNIT_ID, "Ad Unit ID is missing.", ERROR_DOMAIN, null));
        } else {
            fVar.a(jVar.f2112d, string, new com.applovin.impl.sdk.ad.f(1, nVar, string2));
        }
    }

    @Override // bb.a
    public void loadBannerAd(bb.m mVar, bb.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.i(AppLovinUtils.getChildUserError());
            return;
        }
        f fVar = this.appLovinInitializer;
        c cVar = new c(eVar, fVar, this.appLovinAdFactory);
        this.bannerAd = cVar;
        Context context = mVar.f2112d;
        Bundle bundle = mVar.f2110b;
        pa.h hVar = mVar.g;
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            pa.a aVar = new pa.a(110, ERROR_MSG_MISSING_SDK, ERROR_DOMAIN, null);
            Log.e("c", ERROR_MSG_MISSING_SDK);
            eVar.i(aVar);
            return;
        }
        AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, hVar);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize != null) {
            fVar.a(context, string, new f1((Object) cVar, (Object) context, (Parcelable) bundle, (Object) appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, (Object) hVar, 2));
            return;
        }
        pa.a aVar2 = new pa.a(101, ERROR_MSG_BANNER_SIZE_MISMATCH, ERROR_DOMAIN, null);
        Log.e("c", ERROR_MSG_BANNER_SIZE_MISMATCH);
        eVar.i(aVar2);
    }

    @Override // bb.a
    public void loadInterstitialAd(bb.r rVar, bb.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.i(AppLovinUtils.getChildUserError());
            return;
        }
        p pVar = new p(eVar, this.appLovinInitializer, this.appLovinAdFactory);
        pVar.f8995b = false;
        this.waterfallInterstitialAd = pVar;
        Context context = rVar.f2112d;
        Bundle bundle = rVar.f2110b;
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            pa.a aVar = new pa.a(110, ERROR_MSG_MISSING_SDK, APPLOVIN_SDK_ERROR_DOMAIN, null);
            Log.e(g.TAG, ERROR_MSG_MISSING_SDK);
            pVar.interstitialAdLoadCallback.i(aVar);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                pVar.f8995b = true;
            }
            pVar.networkExtras = rVar.f2111c;
            pVar.appLovinInitializer.a(context, string, new o(pVar, bundle, context, 0));
        }
    }

    @Override // bb.a
    public void loadRewardedAd(y yVar, bb.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.i(AppLovinUtils.getChildUserError());
            return;
        }
        q qVar = new q(eVar, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        qVar.f8998b = false;
        this.rewardedRenderer = qVar;
        Context context = yVar.f2112d;
        Bundle bundle = yVar.f2110b;
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            pa.a aVar = new pa.a(110, ERROR_MSG_MISSING_SDK, APPLOVIN_SDK_ERROR_DOMAIN, null);
            Log.e(k.TAG, aVar.toString());
            qVar.adLoadCallback.i(aVar);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                qVar.f8998b = true;
            }
            qVar.networkExtras = yVar.f2111c;
            qVar.appLovinInitializer.a(context, string, new o(qVar, bundle, context, 1));
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(bb.r rVar, bb.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.i(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinRtbInterstitialRenderer appLovinRtbInterstitialRenderer = new AppLovinRtbInterstitialRenderer(eVar, this.appLovinInitializer, this.appLovinAdFactory);
        this.rtbInterstitialRenderer = appLovinRtbInterstitialRenderer;
        appLovinRtbInterstitialRenderer.loadAd(rVar);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(y yVar, bb.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.i(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinRtbRewardedRenderer appLovinRtbRewardedRenderer = new AppLovinRtbRewardedRenderer(eVar, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rtbRewardedRenderer = appLovinRtbRewardedRenderer;
        appLovinRtbRewardedRenderer.loadAd(yVar);
    }

    public r getVersionInfo(String str) throws NumberFormatException {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, d.h.t("Unexpected adapter version format: ", str, ". Returning 0.0.0 for adapter version."));
            return new r(0, 0, 0);
        }
        return new r(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
    }
}
