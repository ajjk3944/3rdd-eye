package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbub;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j82 implements ye4 {
    public final /* synthetic */ zzbub f;

    public j82(zzbub zzbubVar) {
        this.f = zzbubVar;
    }

    @Override // defpackage.ye4
    public final void B1() {
        gi2.U("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // defpackage.ye4
    public final void E1() {
        gi2.U("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // defpackage.ye4
    public final void G1(int i) {
        gi2.U("AdMobCustomTabsAdapter overlay is closed.");
        xb4 xb4Var = (xb4) this.f.b;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdClosed.");
        try {
            ((z62) xb4Var.g).c();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.ye4
    public final void M1() {
        gi2.U("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // defpackage.ye4
    public final void U() {
        gi2.U("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // defpackage.ye4
    public final void Y() {
        gi2.U("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // defpackage.ye4
    public final void f() {
        gi2.U("Opening AdMobCustomTabsAdapter overlay.");
        xb4 xb4Var = (xb4) this.f.b;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        gi2.U("Adapter called onAdOpened.");
        try {
            ((z62) xb4Var.g).j();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.ye4
    public final void f3() {
        gi2.U("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // defpackage.ye4
    public final void h3() {
        gi2.U("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // defpackage.ye4
    public final void m2() {
        gi2.U("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // defpackage.ye4
    public final void R2() {
    }
}
