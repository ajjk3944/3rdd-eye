package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import q2.C2841s;
import r.C2866i;
import t2.C2911G;
import u2.C2951a;

/* loaded from: classes.dex */
public final class zzbwl implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f18001a;

    /* renamed from: b, reason: collision with root package name */
    public w2.p f18002b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f18003c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        u2.k.c("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        u2.k.c("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        u2.k.c("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, w2.p pVar, Bundle bundle, w2.f fVar, Bundle bundle2) {
        this.f18002b = pVar;
        if (pVar == null) {
            u2.k.h("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            u2.k.h("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((C1338iu) this.f18002b).d();
            return;
        }
        if (!Q9.a(context)) {
            u2.k.h("Default browser does not support custom tabs. Bailing out.");
            ((C1338iu) this.f18002b).d();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            u2.k.h("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((C1338iu) this.f18002b).d();
            return;
        }
        this.f18001a = (Activity) context;
        this.f18003c = Uri.parse(string);
        C1338iu c1338iu = (C1338iu) this.f18002b;
        c1338iu.getClass();
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called onAdLoaded.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).h();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        C2866i c2866iA = new C0855Zq().a();
        c2866iA.f23314a.setData(this.f18003c);
        C2911G.f23576l.post(new CD(this, new AdOverlayInfoParcel(new s2.e(c2866iA.f23314a, null), null, new C2238zd(this), null, new C2951a(0, 0, false), null, null, ""), 8, false));
        p2.j jVar = p2.j.f22785C;
        C0521Gf c0521Gf = jVar.f22795h.f8979m;
        c0521Gf.getClass();
        jVar.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (c0521Gf.f8408a) {
            try {
                if (c0521Gf.f8410c == 3) {
                    if (c0521Gf.f8409b + ((Long) C2841s.f23267e.f23270c.a(H9.K6)).longValue() <= jCurrentTimeMillis) {
                        c0521Gf.f8410c = 1;
                    }
                }
            } finally {
            }
        }
        jVar.f22797k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (c0521Gf.f8408a) {
            try {
                if (c0521Gf.f8410c != 2) {
                    return;
                }
                c0521Gf.f8410c = 3;
                if (c0521Gf.f8410c == 3) {
                    c0521Gf.f8409b = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
