package com.google.ads.mediation.pangle;

import aa.l;
import aa.n;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import bb.j;
import bb.m;
import bb.o;
import bb.u;
import bb.y;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.fk0;
import d.h;
import db.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import pa.r;
import z2.f;
import z9.a;
import z9.c;
import z9.d;
import z9.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* renamed from: d, reason: collision with root package name */
    public static int f9007d = -1;

    /* renamed from: a, reason: collision with root package name */
    public final c f9008a;

    /* renamed from: b, reason: collision with root package name */
    public final e f9009b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9010c;

    public PangleMediationAdapter() {
        if (c.f38122f == null) {
            c.f38122f = new c();
        }
        this.f9008a = c.f38122f;
        this.f9009b = new e();
        this.f9010c = new a();
    }

    public static int getGDPRConsent() {
        return f9007d;
    }

    public static int getPAConsent() {
        return PAGConfig.getPAConsent();
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i4) {
        if (i4 != 1 && i4 != 0 && i4 != -1) {
            Log.w(TAG, "Invalid GDPR value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            wb.e.C();
            PAGConfig.setGDPRConsent(i4);
        }
        f9007d = i4;
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i4) {
        if (i4 == 1 || i4 == 0) {
            PAGConfig.setPAConsent(i4);
        } else {
            Log.w(TAG, "Invalid PA value. Pangle SDK only accepts 0 or 1.");
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(db.a aVar, b bVar) {
        wb.e.C();
        Bundle bundle = aVar.f22178c;
        e eVar = this.f9009b;
        if (bundle != null && bundle.containsKey("user_data")) {
            String string = bundle.getString("user_data", "");
            eVar.getClass();
            PAGConfig.setUserData(string);
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setAdxId("207");
        Context context = aVar.f22176a;
        f fVar = new f(bVar);
        eVar.getClass();
        PAGSdk.getBiddingToken(context, pAGBiddingRequest, fVar);
    }

    @Override // bb.a
    public r getSDKVersionInfo() throws NumberFormatException {
        this.f9009b.getClass();
        String sDKVersion = PAGSdk.getSDKVersion();
        String[] strArrSplit = sDKVersion.split("\\.");
        if (strArrSplit.length < 3) {
            Log.w(TAG, h.t("Unexpected SDK version format: ", sDKVersion, ". Returning 0.0.0 for SDK version."));
            return new r(0, 0, 0);
        }
        int i4 = Integer.parseInt(strArrSplit[0]);
        int i10 = Integer.parseInt(strArrSplit[1]);
        int i11 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i11 = (i11 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new r(i4, i10, i11);
    }

    @Override // bb.a
    public r getVersionInfo() throws NumberFormatException {
        String[] strArrSplit = "7.8.0.8.0".split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, "Unexpected adapter version format: 7.8.0.8.0. Returning 0.0.0 for adapter version.");
            return new r(0, 0, 0);
        }
        int i4 = Integer.parseInt(strArrSplit[0]);
        int i10 = Integer.parseInt(strArrSplit[1]);
        int i11 = Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100);
        if (strArrSplit.length >= 5) {
            i11 = (i11 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new r(i4, i10, i11);
    }

    @Override // bb.a
    public void initialize(Context context, bb.b bVar, List<o> list) {
        wb.e.C();
        HashSet hashSet = new HashSet();
        Iterator<o> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().f2116b.getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            pa.a aVarJ = wb.e.j(101, "Missing or invalid App ID.");
            Log.w(TAG, aVarJ.toString());
            ((fk0) bVar).a(aVarJ.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
            }
            this.f9008a.a(context, str, new d(bVar));
        }
    }

    @Override // bb.a
    public void loadAppOpenAd(j jVar, bb.e eVar) {
        wb.e.C();
        a aVar = this.f9010c;
        aVar.getClass();
        c cVar = this.f9008a;
        aa.c cVar2 = new aa.c(eVar, cVar, this.f9009b, aVar);
        Bundle bundle = jVar.f2110b;
        String string = bundle.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            cVar.a(jVar.f2112d, bundle.getString("appid"), new aa.b(cVar2, jVar.f2109a, jVar, string, 0));
        } else {
            pa.a aVarJ = wb.e.j(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, aVarJ.toString());
            eVar.i(aVarJ);
        }
    }

    @Override // bb.a
    public void loadBannerAd(m mVar, bb.e eVar) {
        wb.e.C();
        a aVar = this.f9010c;
        aVar.getClass();
        c cVar = this.f9008a;
        aa.f fVar = new aa.f(eVar, cVar, this.f9009b, aVar);
        Bundle bundle = mVar.f2110b;
        String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            pa.a aVarJ = wb.e.j(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, aVarJ.toString());
            eVar.i(aVarJ);
        } else {
            String str = mVar.f2109a;
            Context context = mVar.f2112d;
            cVar.a(context, bundle.getString("appid"), new aa.e(fVar, mVar, context, str, string));
        }
    }

    @Override // bb.a
    public void loadInterstitialAd(bb.r rVar, bb.e eVar) {
        wb.e.C();
        a aVar = this.f9010c;
        aVar.getClass();
        c cVar = this.f9008a;
        aa.h hVar = new aa.h(eVar, cVar, this.f9009b, aVar);
        Bundle bundle = rVar.f2110b;
        String string = bundle.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            cVar.a(rVar.f2112d, bundle.getString("appid"), new aa.b(hVar, rVar.f2109a, rVar, string, 1));
        } else {
            pa.a aVarJ = wb.e.j(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, aVarJ.toString());
            eVar.i(aVarJ);
        }
    }

    @Override // bb.a
    public void loadNativeAd(u uVar, bb.e eVar) {
        wb.e.C();
        a aVar = this.f9010c;
        aVar.getClass();
        l lVar = new l(eVar, this.f9008a, this.f9009b, aVar);
        Bundle bundle = uVar.f2110b;
        String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            pa.a aVarJ = wb.e.j(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, aVarJ.toString());
            lVar.f285r.i(aVarJ);
        } else {
            String str = uVar.f2109a;
            lVar.f286s.a(uVar.f2112d, bundle.getString("appid"), new aa.b(lVar, str, uVar, string, 2));
        }
    }

    @Override // bb.a
    public void loadRewardedAd(y yVar, bb.e eVar) {
        wb.e.C();
        a aVar = this.f9010c;
        aVar.getClass();
        c cVar = this.f9008a;
        n nVar = new n(eVar, cVar, this.f9009b, aVar);
        Bundle bundle = yVar.f2110b;
        String string = bundle.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            cVar.a(yVar.f2112d, bundle.getString("appid"), new aa.b(nVar, yVar.f2109a, yVar, string, 3));
        } else {
            pa.a aVarJ = wb.e.j(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, aVarJ.toString());
            eVar.i(aVarJ);
        }
    }
}
