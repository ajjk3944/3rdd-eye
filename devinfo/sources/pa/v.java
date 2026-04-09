package pa;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.ut;
import va.e2;
import va.l0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f31558b;

    public /* synthetic */ v(k kVar, int i4) {
        this.f31557a = i4;
        this.f31558b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31557a) {
            case 0:
                k kVar = this.f31558b;
                try {
                    e2 e2Var = kVar.f31539a;
                    e2Var.getClass();
                    try {
                        l0 l0Var = e2Var.f36077i;
                        if (l0Var != null) {
                            l0Var.d();
                            break;
                        }
                    } catch (RemoteException e2) {
                        za.i.k("#007 Could not call remote method.", e2);
                        return;
                    }
                } catch (IllegalStateException e10) {
                    ut.a(kVar.getContext()).d("BaseAdView.pause", e10);
                    return;
                }
                break;
            case 1:
                k kVar2 = this.f31558b;
                try {
                    e2 e2Var2 = kVar2.f31539a;
                    e2Var2.getClass();
                    try {
                        l0 l0Var2 = e2Var2.f36077i;
                        if (l0Var2 != null) {
                            l0Var2.e();
                        }
                    } catch (RemoteException e11) {
                        za.i.k("#007 Could not call remote method.", e11);
                    }
                    break;
                } catch (IllegalStateException e12) {
                    ut.a(kVar2.getContext()).d("BaseAdView.resume", e12);
                    return;
                }
            default:
                k kVar3 = this.f31558b;
                try {
                    e2 e2Var3 = kVar3.f31539a;
                    e2Var3.getClass();
                    try {
                        l0 l0Var3 = e2Var3.f36077i;
                        if (l0Var3 != null) {
                            l0Var3.h();
                            break;
                        }
                    } catch (RemoteException e13) {
                        za.i.k("#007 Could not call remote method.", e13);
                        return;
                    }
                } catch (IllegalStateException e14) {
                    ut.a(kVar3.getContext()).d("BaseAdView.destroy", e14);
                }
                break;
        }
    }
}
