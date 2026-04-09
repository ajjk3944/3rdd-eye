package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zzbwl implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f19248a;

    /* renamed from: b, reason: collision with root package name */
    public bb.s f19249b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f19250c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, bb.g
    public final void onDestroy() {
        za.i.c("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, bb.g
    public final void onPause() {
        za.i.c("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, bb.g
    public final void onResume() {
        za.i.c("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, bb.s sVar, Bundle bundle, bb.f fVar, Bundle bundle2) {
        this.f19249b = sVar;
        if (sVar == null) {
            za.i.h("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            za.i.h("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((pq0) this.f19249b).h();
            return;
        }
        if (!al.a(context)) {
            za.i.h("Default browser does not support custom tabs. Bailing out.");
            ((pq0) this.f19249b).h();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            za.i.h("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((pq0) this.f19249b).h();
            return;
        }
        this.f19248a = (Activity) context;
        this.f19250c = Uri.parse(string);
        pq0 pq0Var = (pq0) this.f19249b;
        pq0Var.getClass();
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called onAdLoaded.");
        try {
            ((fr) pq0Var.f15073b).A1();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        u.m mVarA = new u.l().a();
        mVarA.f34718a.setData(this.f19250c);
        boolean z3 = false;
        ya.f0.f37440l.post(new q81(this, z3, new AdOverlayInfoParcel(new xa.e(mVarA.f34718a, null), null, new ps(this), null, new za.a(0, 0, false), null, null, ""), 8));
        ua.j jVar = ua.j.C;
        yw ywVar = jVar.f35265h.f19203m;
        ywVar.getClass();
        jVar.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (ywVar.f18892a) {
            try {
                if (ywVar.f18894c == 3) {
                    if (ywVar.f18893b + ((Long) va.s.f36163e.f36166c.a(sk.K6)).longValue() <= jCurrentTimeMillis) {
                        ywVar.f18894c = 1;
                    }
                }
            } finally {
            }
        }
        jVar.f35267k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (ywVar.f18892a) {
            try {
                if (ywVar.f18894c != 2) {
                    return;
                }
                ywVar.f18894c = 3;
                if (ywVar.f18894c == 3) {
                    ywVar.f18893b = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
