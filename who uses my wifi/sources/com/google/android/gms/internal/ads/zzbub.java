package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import defpackage.bd0;
import defpackage.e51;
import defpackage.fc2;
import defpackage.fd2;
import defpackage.gi2;
import defpackage.hd0;
import defpackage.hg4;
import defpackage.j82;
import defpackage.l92;
import defpackage.lf4;
import defpackage.mz1;
import defpackage.n62;
import defpackage.ou1;
import defpackage.rl;
import defpackage.tw1;
import defpackage.xb4;
import defpackage.yz1;
import defpackage.z62;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zzbub implements MediationInterstitialAdapter {
    public Activity a;
    public hd0 b;
    public Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        gi2.U("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        gi2.U("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        gi2.U("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, hd0 hd0Var, Bundle bundle, bd0 bd0Var, Bundle bundle2) {
        this.b = hd0Var;
        if (hd0Var == null) {
            gi2.i0("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            gi2.i0("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((xb4) this.b).s();
            return;
        }
        if (!yz1.a(context)) {
            gi2.i0("Default browser does not support custom tabs. Bailing out.");
            ((xb4) this.b).s();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            gi2.i0("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((xb4) this.b).s();
            return;
        }
        this.a = (Activity) context;
        this.c = Uri.parse(string);
        xb4 xb4Var = (xb4) this.b;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdLoaded.");
        try {
            ((z62) xb4Var.g).g();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        l92 l92VarA = new rl().a();
        ((Intent) l92VarA.f).setData(this.c);
        lf4.l.post(new n62(this, new AdOverlayInfoParcel(new fc2((Intent) l92VarA.f, null), null, new j82(this), null, new e51(0, 0, false), null, null, ""), 2, false));
        hg4 hg4Var = hg4.C;
        fd2 fd2Var = hg4Var.h.m;
        fd2Var.getClass();
        hg4Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (fd2Var.a) {
            try {
                if (fd2Var.c == 3) {
                    if (fd2Var.b + ((Long) tw1.e.c.a(mz1.q6)).longValue() <= jCurrentTimeMillis) {
                        fd2Var.c = 1;
                    }
                }
            } finally {
            }
        }
        hg4Var.k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (fd2Var.a) {
            try {
                if (fd2Var.c != 2) {
                    return;
                }
                fd2Var.c = 3;
                if (fd2Var.c == 3) {
                    fd2Var.b = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
