package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rx2 extends t2 {
    public final AbstractAdViewAdapter f;
    public final jd0 g;

    public rx2(AbstractAdViewAdapter abstractAdViewAdapter, jd0 jd0Var) {
        this.f = abstractAdViewAdapter;
        this.g = jd0Var;
    }

    @Override // defpackage.t2
    public final void C() {
        xb4 xb4Var = (xb4) this.g;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        hd1 hd1Var = (hd1) xb4Var.h;
        if (((f23) xb4Var.i) == null) {
            if (hd1Var == null) {
                gi2.p0("#007 Could not call remote method.", null);
                return;
            } else if (!hd1Var.n) {
                gi2.U("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        gi2.U("Adapter called onAdClicked.");
        try {
            ((z62) xb4Var.g).b();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.t2
    public final void a() {
        xb4 xb4Var = (xb4) this.g;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdClosed.");
        try {
            ((z62) xb4Var.g).c();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.t2
    public final void b(u70 u70Var) {
        ((xb4) this.g).w(u70Var);
    }

    @Override // defpackage.t2
    public final void c() {
        xb4 xb4Var = (xb4) this.g;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        hd1 hd1Var = (hd1) xb4Var.h;
        if (((f23) xb4Var.i) == null) {
            if (hd1Var == null) {
                gi2.p0("#007 Could not call remote method.", null);
                return;
            } else if (!hd1Var.m) {
                gi2.U("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        gi2.U("Adapter called onAdImpression.");
        try {
            ((z62) xb4Var.g).k();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.t2
    public final void h() {
        xb4 xb4Var = (xb4) this.g;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdOpened.");
        try {
            ((z62) xb4Var.g).j();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.t2
    public final void e() {
    }
}
