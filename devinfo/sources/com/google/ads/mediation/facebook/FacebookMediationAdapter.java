package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import bb.d;
import bb.e;
import bb.j;
import bb.m;
import bb.o;
import bb.u;
import bb.y;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.kp;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.mx0;
import db.b;
import j6.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nk.k;
import pa.a;
import pa.r;
import x9.c;
import y9.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";

    /* renamed from: a, reason: collision with root package name */
    public final i f9006a = new i(26);

    public static a getAdError(AdError adError) {
        return new a(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads", null);
    }

    public static String getPlacementID(Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(d dVar) {
        int i4 = dVar.f2113e;
        if (i4 == 1) {
            AdSettings.setMixedAudience(true);
        } else if (i4 == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(db.a aVar, b bVar) {
        String bidderToken = BidderTokenProvider.getBidderToken(aVar.f22176a);
        mx0 mx0Var = (mx0) bVar;
        mx0Var.getClass();
        try {
            ((ks) mx0Var.f14041b).k(bidderToken);
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    @Override // bb.a
    public r getSDKVersionInfo() {
        String[] strArrSplit = AdSdkVersion.BUILD.split("\\.");
        if (strArrSplit.length >= 3) {
            return new r(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, "Unexpected SDK version format: 6.21.0.Returning 0.0.0 for SDK version.");
        return new r(0, 0, 0);
    }

    @Override // bb.a
    public r getVersionInfo() throws NumberFormatException {
        String[] strArrSplit = "6.21.0.0".split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, "Unexpected adapter version format: 6.21.0.0.Returning 0.0.0 for adapter version.");
            return new r(0, 0, 0);
        }
        return new r(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
    }

    @Override // bb.a
    public void initialize(Context context, bb.b bVar, List<o> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<o> it = list.iterator();
        while (it.hasNext()) {
            String placementID = getPlacementID(it.next().f2116b);
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (x9.a.f37012d == null) {
            x9.a.f37012d = new x9.a();
        }
        x9.a aVar = x9.a.f37012d;
        x9.b bVar2 = new x9.b(bVar);
        if (aVar.f37013a) {
            aVar.f37015c.add(bVar2);
            return;
        }
        if (!aVar.f37014b) {
            aVar.f37013a = true;
            if (aVar == null) {
                x9.a.f37012d = new x9.a();
            }
            x9.a.f37012d.f37015c.add(bVar2);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.21.0.0").withPlacementIds(arrayList).withInitListener(aVar).initialize();
            return;
        }
        fk0 fk0Var = (fk0) bVar;
        fk0Var.getClass();
        try {
            ((kp) fk0Var.f11194b).c();
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(j jVar, e eVar) {
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithBid;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener;
        InterstitialAd interstitialAd;
        i iVar = this.f9006a;
        f fVar = new f(eVar, iVar);
        k.e(jVar, "adConfiguration");
        String str = jVar.f2114f;
        String placementID = getPlacementID(jVar.f2110b);
        InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfigBuild = null;
        if (TextUtils.isEmpty(placementID)) {
            a aVar = new a(101, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN, null);
            Log.e(TAG, "Failed to request ad. PlacementID is null or empty. ");
            eVar.i(aVar);
            return;
        }
        setMixedAudience(jVar);
        Context context = jVar.f2112d;
        iVar.getClass();
        fVar.f37385b = new InterstitialAd(context, placementID);
        if (!TextUtils.isEmpty(str) && (interstitialAd = fVar.f37385b) != null) {
            interstitialAd.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
        }
        InterstitialAd interstitialAd2 = fVar.f37385b;
        if (interstitialAd2 != null) {
            InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderBuildLoadAdConfig = interstitialAd2.buildLoadAdConfig();
            if (interstitialAdLoadConfigBuilderBuildLoadAdConfig != null && (interstitialAdLoadConfigBuilderWithBid = interstitialAdLoadConfigBuilderBuildLoadAdConfig.withBid(jVar.f2109a)) != null && (interstitialAdLoadConfigBuilderWithAdListener = interstitialAdLoadConfigBuilderWithBid.withAdListener(fVar)) != null) {
                interstitialLoadAdConfigBuild = interstitialAdLoadConfigBuilderWithAdListener.build();
            }
            interstitialAd2.loadAd(interstitialLoadAdConfigBuild);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(m mVar, e eVar) {
        i iVar = this.f9006a;
        y9.a aVar = new y9.a(eVar, iVar);
        Bundle bundle = mVar.f2110b;
        String str = mVar.f2114f;
        String str2 = mVar.f2109a;
        Context context = mVar.f2112d;
        String placementID = getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            a aVar2 = new a(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN, null);
            Log.e(TAG, "Failed to request ad. PlacementID is null or empty.");
            eVar.i(aVar2);
            return;
        }
        setMixedAudience(mVar);
        try {
            iVar.getClass();
            aVar.f37365b = new AdView(context, placementID, str2);
            if (!TextUtils.isEmpty(str)) {
                aVar.f37365b.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.g.d(context), -2);
            aVar.f37366c = new FrameLayout(context);
            aVar.f37365b.setLayoutParams(layoutParams);
            aVar.f37366c.addView(aVar.f37365b);
            AdView adView = aVar.f37365b;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(aVar).withBid(str2).build());
        } catch (Exception e2) {
            String str3 = "Failed to create banner ad: " + e2.getMessage();
            a aVar3 = new a(ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, str3, ERROR_DOMAIN, null);
            Log.e(TAG, str3);
            eVar.i(aVar3);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(bb.r rVar, e eVar) {
        y9.b bVar = new y9.b(eVar, this.f9006a);
        Bundle bundle = rVar.f2110b;
        String str = rVar.f2114f;
        String placementID = getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            a aVar = new a(101, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN, null);
            Log.e(TAG, "Failed to request ad. PlacementID is null or empty. ");
            bVar.f37368a.i(aVar);
            return;
        }
        setMixedAudience(rVar);
        Context context = rVar.f2112d;
        bVar.f37373f.getClass();
        bVar.f37369b = new InterstitialAd(context, placementID);
        if (!TextUtils.isEmpty(str)) {
            bVar.f37369b.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
        }
        InterstitialAd interstitialAd = bVar.f37369b;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(rVar.f2109a).withAdListener(bVar).build());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(u uVar, e eVar) {
        y9.e eVar2 = new y9.e(eVar, this.f9006a);
        Bundle bundle = uVar.f2110b;
        String str = uVar.f2114f;
        String str2 = uVar.f2109a;
        Context context = uVar.f2112d;
        String placementID = getPlacementID(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(placementID);
        e eVar3 = eVar2.f37379r;
        if (zIsEmpty) {
            a aVar = new a(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN, null);
            Log.e(TAG, "Failed to request ad. PlacementID is null or empty.");
            eVar3.i(aVar);
            return;
        }
        setMixedAudience(uVar);
        eVar2.f37383v.getClass();
        eVar2.f37382u = new MediaView(context);
        try {
            eVar2.f37380s = NativeAdBase.fromBidPayload(context, placementID, str2);
            if (!TextUtils.isEmpty(str)) {
                eVar2.f37380s.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
            }
            NativeAdBase nativeAdBase = eVar2.f37380s;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new y9.d(eVar2, context, eVar2.f37380s)).withBid(str2).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e2) {
            String str3 = "Failed to create native ad from bid payload: " + e2.getMessage();
            a aVar2 = new a(ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, str3, ERROR_DOMAIN, null);
            Log.w(TAG, str3);
            eVar3.i(aVar2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(y yVar, e eVar) {
        new c(eVar, this.f9006a).b(yVar);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(y yVar, e eVar) {
        new x9.d(eVar, this.f9006a).b(yVar);
    }
}
