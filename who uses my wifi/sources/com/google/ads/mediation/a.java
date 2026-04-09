package com.google.ads.mediation;

import android.os.RemoteException;
import defpackage.g30;
import defpackage.gi2;
import defpackage.gr0;
import defpackage.h30;
import defpackage.hd0;
import defpackage.ou1;
import defpackage.u70;
import defpackage.xb4;
import defpackage.z62;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a extends h30 {
    public final AbstractAdViewAdapter y;
    public final hd0 z;

    public a(AbstractAdViewAdapter abstractAdViewAdapter, hd0 hd0Var) {
        this.y = abstractAdViewAdapter;
        this.z = hd0Var;
    }

    @Override // defpackage.um
    public final void q(u70 u70Var) {
        ((xb4) this.z).u(u70Var);
    }

    @Override // defpackage.um
    public final void r(Object obj) {
        g30 g30Var = (g30) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.y;
        abstractAdViewAdapter.mInterstitialAd = g30Var;
        hd0 hd0Var = this.z;
        g30Var.b(new gr0(abstractAdViewAdapter, hd0Var));
        xb4 xb4Var = (xb4) hd0Var;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdLoaded.");
        try {
            ((z62) xb4Var.g).g();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }
}
