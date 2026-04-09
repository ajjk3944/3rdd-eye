package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vu1 extends t2 implements b8, fd1 {
    public final fd0 f;

    public vu1(AbstractAdViewAdapter abstractAdViewAdapter, fd0 fd0Var) {
        this.f = fd0Var;
    }

    @Override // defpackage.t2
    public final void C() {
        xb4 xb4Var = (xb4) this.f;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdClicked.");
        try {
            ((z62) xb4Var.g).b();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.b8
    public final void O(String str, String str2) {
        xb4 xb4Var = (xb4) this.f;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAppEvent.");
        try {
            ((z62) xb4Var.g).v2(str, str2);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.t2
    public final void a() {
        xb4 xb4Var = (xb4) this.f;
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
        ((xb4) this.f).t(u70Var);
    }

    @Override // defpackage.t2
    public final void e() {
        xb4 xb4Var = (xb4) this.f;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdLoaded.");
        try {
            ((z62) xb4Var.g).g();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.t2
    public final void h() {
        xb4 xb4Var = (xb4) this.f;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdOpened.");
        try {
            ((z62) xb4Var.g).j();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }
}
