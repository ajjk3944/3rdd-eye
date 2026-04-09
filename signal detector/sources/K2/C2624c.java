package k2;

import android.os.RemoteException;
import j2.AbstractC2555k;
import j2.C2552h;
import j2.s;
import j2.t;
import q2.F0;
import q2.L;
import q2.Y0;
import u2.k;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2624c extends AbstractC2555k {
    public C2552h[] getAdSizes() {
        return this.f21350a.f23108g;
    }

    public InterfaceC2625d getAppEventListener() {
        return this.f21350a.f23109h;
    }

    public s getVideoController() {
        return this.f21350a.f23104c;
    }

    public t getVideoOptions() {
        return this.f21350a.f23110j;
    }

    public void setAdSizes(C2552h... c2552hArr) {
        if (c2552hArr == null || c2552hArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f21350a.d(c2552hArr);
    }

    public void setAppEventListener(InterfaceC2625d interfaceC2625d) {
        this.f21350a.e(interfaceC2625d);
    }

    public void setManualImpressionsEnabled(boolean z6) {
        F0 f02 = this.f21350a;
        f02.f23113m = z6;
        try {
            L l2 = f02.i;
            if (l2 != null) {
                l2.w2(z6);
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }

    public void setVideoOptions(t tVar) {
        F0 f02 = this.f21350a;
        f02.f23110j = tVar;
        try {
            L l2 = f02.i;
            if (l2 != null) {
                l2.O0(tVar == null ? null : new Y0(tVar));
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }
}
