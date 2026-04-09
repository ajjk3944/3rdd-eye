package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import bb.f;
import bb.n;
import bb.s;
import bb.v;
import bb.z;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.pq0;
import pa.a;
import pa.h;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@KeepName
/* loaded from: classes3.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9041d = new a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads", null);

    /* renamed from: a, reason: collision with root package name */
    public CustomEventBanner f9042a;

    /* renamed from: b, reason: collision with root package name */
    public CustomEventInterstitial f9043b;

    /* renamed from: c, reason: collision with root package name */
    public CustomEventNative f9044c;

    public static Object a(Class cls, String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            }
            throw null;
        } catch (Throwable th2) {
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb2.append("Could not instantiate custom event adapter: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            i.h(sb2.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f9042a;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f9043b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f9044c;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onPause() {
        CustomEventBanner customEventBanner = this.f9042a;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f9043b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f9044c;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onResume() {
        CustomEventBanner customEventBanner = this.f9042a;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f9043b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f9044c;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, n nVar, Bundle bundle, h hVar, f fVar, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f9042a = customEventBanner;
        if (customEventBanner == null) {
            ((pq0) nVar).j(f9041d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f9042a;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new ed.f(7), bundle.getString("parameter"), hVar, fVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, s sVar, Bundle bundle, f fVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f9043b = customEventInterstitial;
        if (customEventInterstitial == null) {
            ((pq0) sVar).m(f9041d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f9043b;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new b7.h(8), bundle.getString("parameter"), fVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, v vVar, Bundle bundle, z zVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString("class_name"));
        this.f9044c = customEventNative;
        if (customEventNative == null) {
            ((pq0) vVar).n(f9041d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f9044c;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new bf.f(8), bundle.getString("parameter"), zVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f9043b;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
