package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import defpackage.a3;
import defpackage.b3;
import defpackage.ba2;
import defpackage.bd0;
import defpackage.d3;
import defpackage.e3;
import defpackage.fd0;
import defpackage.g30;
import defpackage.gi2;
import defpackage.hd0;
import defpackage.j51;
import defpackage.j63;
import defpackage.k52;
import defpackage.o7;
import defpackage.py2;
import defpackage.sv1;
import defpackage.u2;
import defpackage.v2;
import defpackage.vu1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private v2 adLoader;
    protected e3 mAdView;
    protected g30 mInterstitialAd;

    public b3 buildAdRequest(Context context, bd0 bd0Var, Bundle bundle, Bundle bundle2) {
        a3 a3Var = new a3(1);
        o7 o7Var = (o7) a3Var.g;
        Set setC = bd0Var.c();
        if (setC != null) {
            Iterator it = setC.iterator();
            while (it.hasNext()) {
                ((HashSet) o7Var.d).add((String) it.next());
            }
        }
        if (bd0Var.b()) {
            j63 j63Var = sv1.f.a;
            ((HashSet) o7Var.g).add(j63.c(context));
        }
        if (bd0Var.d() != -1) {
            o7Var.a = bd0Var.d() != 1 ? 0 : 1;
        }
        o7Var.b = bd0Var.a();
        a3Var.i1(buildExtrasBundle(bundle, bundle2));
        return new b3(a3Var);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public g30 getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public py2 getVideoController() {
        py2 py2Var;
        e3 e3Var = this.mAdView;
        if (e3Var == null) {
            return null;
        }
        j51 j51Var = e3Var.f.c;
        synchronized (j51Var.a) {
            py2Var = j51Var.b;
        }
        return py2Var;
    }

    public u2 newAdLoader(Context context, String str) {
        return new u2(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.cd0, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        e3 e3Var = this.mAdView;
        if (e3Var != null) {
            e3Var.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        g30 g30Var = this.mInterstitialAd;
        if (g30Var != null) {
            try {
                ba2 ba2Var = ((k52) g30Var).c;
                if (ba2Var != null) {
                    ba2Var.t1(z);
                }
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.cd0, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        e3 e3Var = this.mAdView;
        if (e3Var != null) {
            e3Var.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.cd0, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        e3 e3Var = this.mAdView;
        if (e3Var != null) {
            e3Var.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, fd0 fd0Var, Bundle bundle, d3 d3Var, bd0 bd0Var, Bundle bundle2) {
        e3 e3Var = new e3(context);
        this.mAdView = e3Var;
        e3Var.setAdSize(new d3(d3Var.a, d3Var.b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new vu1(this, fd0Var));
        this.mAdView.b(buildAdRequest(context, bd0Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, hd0 hd0Var, Bundle bundle, bd0 bd0Var, Bundle bundle2) {
        g30.a(context, getAdUnitId(bundle), buildAdRequest(context, bd0Var, bundle2, bundle), new a(this, hd0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void requestNativeAd(android.content.Context r17, defpackage.jd0 r18, android.os.Bundle r19, defpackage.lg0 r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.AbstractAdViewAdapter.requestNativeAd(android.content.Context, jd0, android.os.Bundle, lg0, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        g30 g30Var = this.mInterstitialAd;
        if (g30Var != null) {
            g30Var.c(null);
        }
    }
}
