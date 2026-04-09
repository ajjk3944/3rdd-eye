package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import bb.f;
import bb.n;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.up;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p.t0;
import pa.g;
import pa.h;
import pa.i;
import pa.s;
import pa.v;
import va.a2;
import va.e2;
import va.l0;
import va.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private pa.e adLoader;
    protected i mAdView;
    protected ab.a mInterstitialAd;

    public g buildAdRequest(Context context, f fVar, Bundle bundle, Bundle bundle2) {
        pa.f fVar2 = new pa.f(7);
        t0 t0Var = (t0) fVar2.f218b;
        Set setC = fVar.c();
        if (setC != null) {
            Iterator it = setC.iterator();
            while (it.hasNext()) {
                ((HashSet) t0Var.f30867d).add((String) it.next());
            }
        }
        if (fVar.isTesting()) {
            za.d dVar = r.g.f36157a;
            ((HashSet) t0Var.g).add(za.d.c(context));
        }
        if (fVar.a() != -1) {
            t0Var.f30864a = fVar.a() != 1 ? 0 : 1;
        }
        t0Var.f30865b = fVar.b();
        fVar2.l(buildExtrasBundle(bundle, bundle2));
        return new g(fVar2);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString("pubid");
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public ab.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public a2 getVideoController() {
        a2 a2Var;
        i iVar = this.mAdView;
        if (iVar == null) {
            return null;
        }
        s sVar = iVar.f31539a.f36072c;
        synchronized (sVar.f31549a) {
            a2Var = sVar.f31550b;
        }
        return a2Var;
    }

    public pa.d newAdLoader(Context context, String str) {
        return new pa.d(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onDestroy() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z3) {
        ab.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            try {
                l0 l0Var = ((up) aVar).f17283c;
                if (l0Var != null) {
                    l0Var.E0(z3);
                }
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onPause() {
        i iVar = this.mAdView;
        if (iVar != null) {
            sk.a(iVar.getContext());
            if (((Boolean) sl.g.u()).booleanValue()) {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.tc)).booleanValue()) {
                    za.b.f38135b.execute(new v(iVar, 0));
                    return;
                }
            }
            e2 e2Var = iVar.f31539a;
            e2Var.getClass();
            try {
                l0 l0Var = e2Var.f36077i;
                if (l0Var != null) {
                    l0Var.d();
                }
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onResume() {
        i iVar = this.mAdView;
        if (iVar != null) {
            sk.a(iVar.getContext());
            if (((Boolean) sl.f16461h.u()).booleanValue()) {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16310rc)).booleanValue()) {
                    za.b.f38135b.execute(new v(iVar, 1));
                    return;
                }
            }
            e2 e2Var = iVar.f31539a;
            e2Var.getClass();
            try {
                l0 l0Var = e2Var.f36077i;
                if (l0Var != null) {
                    l0Var.e();
                }
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, n nVar, Bundle bundle, h hVar, f fVar, Bundle bundle2) {
        i iVar = new i(context);
        this.mAdView = iVar;
        iVar.setAdSize(new h(hVar.f31530a, hVar.f31531b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, nVar));
        this.mAdView.b(buildAdRequest(context, fVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, bb.s sVar, Bundle bundle, f fVar, Bundle bundle2) {
        ab.a.a(context, getAdUnitId(bundle), buildAdRequest(context, fVar, bundle2, bundle), new c(this, sVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void requestNativeAd(android.content.Context r17, bb.v r18, android.os.Bundle r19, bb.z r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.AbstractAdViewAdapter.requestNativeAd(android.content.Context, bb.v, android.os.Bundle, bb.z, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        ab.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.b(null);
        }
    }
}
