package com.google.ads.mediation.pangle;

import R3.b;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.InterfaceC0806Xb;
import com.google.android.gms.internal.ads.Rx;
import h2.a;
import h2.c;
import h2.d;
import h2.e;
import h2.f;
import i2.h;
import j2.C2545a;
import j2.r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u2.k;
import w2.InterfaceC2970b;
import w2.InterfaceC2973e;
import w2.i;
import w2.m;
import w2.o;
import w2.u;
import y2.C3011a;
import y2.InterfaceC3012b;

/* loaded from: classes.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* renamed from: d, reason: collision with root package name */
    public static int f6844d = -1;

    /* renamed from: a, reason: collision with root package name */
    public final c f6845a;

    /* renamed from: b, reason: collision with root package name */
    public final f f6846b;

    /* renamed from: c, reason: collision with root package name */
    public final a f6847c;

    public PangleMediationAdapter() {
        if (c.f20466f == null) {
            c.f20466f = new c();
        }
        this.f6845a = c.f20466f;
        this.f6846b = new f();
        this.f6847c = new a();
    }

    public static int getGDPRConsent() {
        return f6844d;
    }

    public static int getPAConsent() {
        return PAGConfig.getPAConsent();
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i) {
        if (i != 1 && i != 0 && i != -1) {
            Log.w(TAG, "Invalid GDPR value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            b.r();
            PAGConfig.setGDPRConsent(i);
        }
        f6844d = i;
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i) {
        if (i == 1 || i == 0) {
            PAGConfig.setPAConsent(i);
        } else {
            Log.w(TAG, "Invalid PA value. Pangle SDK only accepts 0 or 1.");
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(C3011a c3011a, InterfaceC3012b interfaceC3012b) {
        b.r();
        Bundle bundle = c3011a.f24251b;
        f fVar = this.f6846b;
        if (bundle != null && bundle.containsKey("user_data")) {
            String string = bundle.getString("user_data", "");
            fVar.getClass();
            PAGConfig.setUserData(string);
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setAdxId("207");
        Context context = c3011a.f24250a;
        d dVar = new d(interfaceC3012b);
        fVar.getClass();
        PAGSdk.getBiddingToken(context, pAGBiddingRequest, dVar);
    }

    @Override // w2.AbstractC2969a
    public r getSDKVersionInfo() throws NumberFormatException {
        this.f6846b.getClass();
        String sDKVersion = PAGSdk.getSDKVersion();
        String[] strArrSplit = sDKVersion.split("\\.");
        if (strArrSplit.length < 3) {
            Log.w(TAG, A.f.m("Unexpected SDK version format: ", sDKVersion, ". Returning 0.0.0 for SDK version."));
            return new r(0, 0, 0);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i3 = Integer.parseInt(strArrSplit[1]);
        int i6 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i6 = (i6 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new r(i, i3, i6);
    }

    @Override // w2.AbstractC2969a
    public r getVersionInfo() throws NumberFormatException {
        String[] strArrSplit = "7.8.5.2.0".split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, "Unexpected adapter version format: 7.8.5.2.0. Returning 0.0.0 for adapter version.");
            return new r(0, 0, 0);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i3 = Integer.parseInt(strArrSplit[1]);
        int i6 = Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100);
        if (strArrSplit.length >= 5) {
            i6 = (i6 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new r(i, i3, i6);
    }

    @Override // w2.AbstractC2969a
    public void initialize(Context context, InterfaceC2970b interfaceC2970b, List<m> list) {
        b.r();
        HashSet hashSet = new HashSet();
        Iterator<m> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().f23952a.getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
            }
            this.f6845a.a(context, str, new e(interfaceC2970b));
            return;
        }
        C2545a c2545aE = b.e(101, "Missing or invalid App ID.");
        Log.w(TAG, c2545aE.toString());
        String string2 = c2545aE.toString();
        Rx rx = (Rx) interfaceC2970b;
        rx.getClass();
        try {
            ((InterfaceC0806Xb) rx.f11090b).K2(string2);
        } catch (RemoteException e6) {
            k.f("", e6);
        }
    }

    @Override // w2.AbstractC2969a
    public void loadAppOpenAd(i iVar, InterfaceC2973e interfaceC2973e) {
        b.r();
        a aVar = this.f6847c;
        aVar.getClass();
        c cVar = this.f6845a;
        i2.c cVar2 = new i2.c(interfaceC2973e, cVar, this.f6846b, aVar);
        Bundle bundle = iVar.f23948b;
        String string = bundle.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            cVar.a(iVar.f23949c, bundle.getString("appid"), new i2.b(cVar2, iVar.f23947a, iVar, string, 0));
        } else {
            C2545a c2545aE = b.e(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, c2545aE.toString());
            interfaceC2973e.k(c2545aE);
        }
    }

    @Override // w2.AbstractC2969a
    public void loadBannerAd(w2.k kVar, InterfaceC2973e interfaceC2973e) {
        b.r();
        a aVar = this.f6847c;
        aVar.getClass();
        c cVar = this.f6845a;
        i2.f fVar = new i2.f(interfaceC2973e, cVar, this.f6846b, aVar);
        Bundle bundle = kVar.f23948b;
        String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            C2545a c2545aE = b.e(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, c2545aE.toString());
            interfaceC2973e.k(c2545aE);
        } else {
            String str = kVar.f23947a;
            Context context = kVar.f23949c;
            cVar.a(context, bundle.getString("appid"), new i2.e(fVar, kVar, context, str, string));
        }
    }

    @Override // w2.AbstractC2969a
    public void loadInterstitialAd(o oVar, InterfaceC2973e interfaceC2973e) {
        b.r();
        a aVar = this.f6847c;
        aVar.getClass();
        c cVar = this.f6845a;
        h hVar = new h(interfaceC2973e, cVar, this.f6846b, aVar);
        Bundle bundle = oVar.f23948b;
        String string = bundle.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            cVar.a(oVar.f23949c, bundle.getString("appid"), new i2.b(hVar, oVar.f23947a, oVar, string, 1));
        } else {
            C2545a c2545aE = b.e(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, c2545aE.toString());
            interfaceC2973e.k(c2545aE);
        }
    }

    @Override // w2.AbstractC2969a
    public void loadNativeAd(w2.r rVar, InterfaceC2973e interfaceC2973e) {
        b.r();
        a aVar = this.f6847c;
        aVar.getClass();
        i2.k kVar = new i2.k(interfaceC2973e, this.f6845a, this.f6846b, aVar);
        Bundle bundle = rVar.f23948b;
        String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            C2545a c2545aE = b.e(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, c2545aE.toString());
            kVar.f20573q.k(c2545aE);
        } else {
            String str = rVar.f23947a;
            kVar.f20574r.a(rVar.f23949c, bundle.getString("appid"), new i2.b(kVar, str, rVar, string, 2));
        }
    }

    @Override // w2.AbstractC2969a
    public void loadRewardedAd(u uVar, InterfaceC2973e interfaceC2973e) {
        b.r();
        a aVar = this.f6847c;
        aVar.getClass();
        c cVar = this.f6845a;
        i2.m mVar = new i2.m(interfaceC2973e, cVar, this.f6846b, aVar);
        Bundle bundle = uVar.f23948b;
        String string = bundle.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            cVar.a(uVar.f23949c, bundle.getString("appid"), new i2.b(mVar, uVar.f23947a, uVar, string, 3));
        } else {
            C2545a c2545aE = b.e(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, c2545aE.toString());
            interfaceC2973e.k(c2545aE);
        }
    }
}
