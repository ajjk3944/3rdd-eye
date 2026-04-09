package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.AbstractC1266ha;
import com.google.android.gms.internal.ads.C1268hc;
import com.google.android.gms.internal.ads.H9;
import j2.C2548d;
import j2.C2549e;
import j2.C2550f;
import j2.C2551g;
import j2.C2552h;
import j2.C2553i;
import j2.s;
import j2.v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.U;
import q2.B0;
import q2.C2841s;
import q2.F0;
import q2.L;
import q2.r;
import u2.AbstractC2953c;
import u2.k;
import v2.AbstractC2960a;
import w2.f;
import w2.l;
import w2.p;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C2549e adLoader;
    protected C2553i mAdView;
    protected AbstractC2960a mInterstitialAd;

    public C2551g buildAdRequest(Context context, f fVar, Bundle bundle, Bundle bundle2) {
        C2550f c2550f = new C2550f(1);
        U u6 = (U) c2550f.f1505a;
        Set setD = fVar.d();
        if (setD != null) {
            Iterator it = setD.iterator();
            while (it.hasNext()) {
                ((HashSet) u6.f22432d).add((String) it.next());
            }
        }
        if (fVar.c()) {
            u2.f fVar2 = r.f23260g.f23261a;
            ((HashSet) u6.f22435g).add(u2.f.c(context));
        }
        if (fVar.a() != -1) {
            u6.f22429a = fVar.a() != 1 ? 0 : 1;
        }
        u6.f22430b = fVar.b();
        c2550f.b(buildExtrasBundle(bundle, bundle2));
        return new C2551g(c2550f);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public AbstractC2960a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public B0 getVideoController() {
        B0 b0;
        C2553i c2553i = this.mAdView;
        if (c2553i == null) {
            return null;
        }
        s sVar = c2553i.f21350a.f23104c;
        synchronized (sVar.f21360a) {
            b0 = sVar.f21361b;
        }
        return b0;
    }

    public C2548d newAdLoader(Context context, String str) {
        return new C2548d(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w2.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        C2553i c2553i = this.mAdView;
        if (c2553i != null) {
            c2553i.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z6) {
        AbstractC2960a abstractC2960a = this.mInterstitialAd;
        if (abstractC2960a != null) {
            try {
                L l2 = ((C1268hc) abstractC2960a).f14511c;
                if (l2 != null) {
                    l2.S0(z6);
                }
            } catch (RemoteException e6) {
                k.k("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w2.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        C2553i c2553i = this.mAdView;
        if (c2553i != null) {
            H9.a(c2553i.getContext());
            if (((Boolean) AbstractC1266ha.f14505g.v()).booleanValue()) {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.rc)).booleanValue()) {
                    AbstractC2953c.f23792b.execute(new v(c2553i, 0));
                    return;
                }
            }
            F0 f02 = c2553i.f21350a;
            f02.getClass();
            try {
                L l2 = f02.i;
                if (l2 != null) {
                    l2.d();
                }
            } catch (RemoteException e6) {
                k.k("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w2.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        C2553i c2553i = this.mAdView;
        if (c2553i != null) {
            H9.a(c2553i.getContext());
            if (((Boolean) AbstractC1266ha.f14506h.v()).booleanValue()) {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.pc)).booleanValue()) {
                    AbstractC2953c.f23792b.execute(new v(c2553i, 1));
                    return;
                }
            }
            F0 f02 = c2553i.f21350a;
            f02.getClass();
            try {
                L l2 = f02.i;
                if (l2 != null) {
                    l2.e();
                }
            } catch (RemoteException e6) {
                k.k("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, l lVar, Bundle bundle, C2552h c2552h, f fVar, Bundle bundle2) {
        C2553i c2553i = new C2553i(context);
        this.mAdView = c2553i;
        c2553i.setAdSize(new C2552h(c2552h.f21340a, c2552h.f21341b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, lVar));
        this.mAdView.b(buildAdRequest(context, fVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, p pVar, Bundle bundle, f fVar, Bundle bundle2) {
        AbstractC2960a.a(context, getAdUnitId(bundle), buildAdRequest(context, fVar, bundle2, bundle), new c(this, pVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void requestNativeAd(android.content.Context r17, w2.s r18, android.os.Bundle r19, w2.v r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.AbstractAdViewAdapter.requestNativeAd(android.content.Context, w2.s, android.os.Bundle, w2.v, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        AbstractC2960a abstractC2960a = this.mInterstitialAd;
        if (abstractC2960a != null) {
            abstractC2960a.b(null);
        }
    }
}
