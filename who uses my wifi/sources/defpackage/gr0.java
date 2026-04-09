package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;
import com.phuongpn.whousemywifi.networkscanner.RouterPasswordActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gr0 extends yc0 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ gr0(i5 i5Var, int i) {
        this.n = i;
        this.o = i5Var;
    }

    @Override // defpackage.yc0
    public final void b() {
        switch (this.n) {
            case 0:
                ((RouterAdminActivity) this.o).D = null;
                break;
            case 1:
                ((RouterPasswordActivity) this.o).G = null;
                break;
            default:
                xb4 xb4Var = (xb4) ((hd0) this.o);
                xb4Var.getClass();
                ou1.h("#008 Must be called on the main UI thread.");
                gi2.U("Adapter called onAdClosed.");
                try {
                    ((z62) xb4Var.g).c();
                    break;
                } catch (RemoteException e) {
                    gi2.p0("#007 Could not call remote method.", e);
                }
        }
    }

    @Override // defpackage.yc0
    public void c(r2 r2Var) {
        switch (this.n) {
            case 0:
                ((RouterAdminActivity) this.o).D = null;
                break;
            case 1:
                ((RouterPasswordActivity) this.o).G = null;
                break;
        }
    }

    @Override // defpackage.yc0
    public final void d() {
        switch (this.n) {
            case 0:
                ((RouterAdminActivity) this.o).D = null;
                break;
            case 1:
                ((RouterPasswordActivity) this.o).G = null;
                break;
            default:
                xb4 xb4Var = (xb4) ((hd0) this.o);
                xb4Var.getClass();
                ou1.h("#008 Must be called on the main UI thread.");
                gi2.U("Adapter called onAdOpened.");
                try {
                    ((z62) xb4Var.g).j();
                    break;
                } catch (RemoteException e) {
                    gi2.p0("#007 Could not call remote method.", e);
                }
        }
    }

    public gr0(AbstractAdViewAdapter abstractAdViewAdapter, hd0 hd0Var) {
        this.n = 2;
        this.o = hd0Var;
    }
}
