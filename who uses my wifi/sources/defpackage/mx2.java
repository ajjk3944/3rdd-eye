package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class mx2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ r9 g;

    public /* synthetic */ mx2(r9 r9Var, int i) {
        this.f = i;
        this.g = r9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                r9 r9Var = this.g;
                try {
                    e23 e23Var = r9Var.f;
                    e23Var.getClass();
                    try {
                        ba2 ba2Var = e23Var.i;
                        if (ba2Var != null) {
                            ba2Var.c();
                            break;
                        }
                    } catch (RemoteException e) {
                        gi2.p0("#007 Could not call remote method.", e);
                        return;
                    }
                } catch (IllegalStateException e2) {
                    r92.a(r9Var.getContext()).e("BaseAdView.pause", e2);
                    return;
                }
                break;
            case 1:
                r9 r9Var2 = this.g;
                try {
                    e23 e23Var2 = r9Var2.f;
                    e23Var2.getClass();
                    try {
                        ba2 ba2Var2 = e23Var2.i;
                        if (ba2Var2 != null) {
                            ba2Var2.e();
                        }
                    } catch (RemoteException e3) {
                        gi2.p0("#007 Could not call remote method.", e3);
                    }
                    break;
                } catch (IllegalStateException e4) {
                    r92.a(r9Var2.getContext()).e("BaseAdView.resume", e4);
                    return;
                }
            default:
                r9 r9Var3 = this.g;
                try {
                    e23 e23Var3 = r9Var3.f;
                    e23Var3.getClass();
                    try {
                        ba2 ba2Var3 = e23Var3.i;
                        if (ba2Var3 != null) {
                            ba2Var3.r();
                            break;
                        }
                    } catch (RemoteException e5) {
                        gi2.p0("#007 Could not call remote method.", e5);
                        return;
                    }
                } catch (IllegalStateException e6) {
                    r92.a(r9Var3.getContext()).e("BaseAdView.destroy", e6);
                }
                break;
        }
    }
}
