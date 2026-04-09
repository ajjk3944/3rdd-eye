package com.google.ads.mediation;

import M2.u;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1268hc;
import com.google.android.gms.internal.ads.C1338iu;
import com.google.android.gms.internal.ads.InterfaceC0688Qc;
import j2.C2556l;
import q2.BinderC2843t;
import q2.L;
import u2.k;
import v2.AbstractC2960a;
import w2.p;

/* loaded from: classes.dex */
public final class c extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractAdViewAdapter f6837d;

    /* renamed from: e, reason: collision with root package name */
    public final p f6838e;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f6837d = abstractAdViewAdapter;
        this.f6838e = pVar;
    }

    @Override // j2.u
    public final void c(C2556l c2556l) {
        ((C1338iu) this.f6838e).l(c2556l);
    }

    @Override // j2.u
    public final void f(Object obj) {
        AbstractC2960a abstractC2960a = (AbstractC2960a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f6837d;
        abstractAdViewAdapter.mInterstitialAd = abstractC2960a;
        p pVar = this.f6838e;
        d dVar = new d(abstractAdViewAdapter, 0, pVar);
        C1268hc c1268hc = (C1268hc) abstractC2960a;
        c1268hc.getClass();
        try {
            L l2 = c1268hc.f14511c;
            if (l2 != null) {
                l2.I2(new BinderC2843t(dVar));
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
        C1338iu c1338iu = (C1338iu) pVar;
        c1338iu.getClass();
        u.c("#008 Must be called on the main UI thread.");
        k.c("Adapter called onAdLoaded.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).h();
        } catch (RemoteException e7) {
            k.k("#007 Could not call remote method.", e7);
        }
    }
}
