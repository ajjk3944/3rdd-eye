package j2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1053de;
import q2.F0;
import q2.L;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2555k f21369b;

    public /* synthetic */ v(AbstractC2555k abstractC2555k, int i) {
        this.f21368a = i;
        this.f21369b = abstractC2555k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21368a) {
            case 0:
                AbstractC2555k abstractC2555k = this.f21369b;
                try {
                    F0 f02 = abstractC2555k.f21350a;
                    f02.getClass();
                    try {
                        L l2 = f02.i;
                        if (l2 != null) {
                            l2.d();
                            break;
                        }
                    } catch (RemoteException e6) {
                        u2.k.k("#007 Could not call remote method.", e6);
                        return;
                    }
                } catch (IllegalStateException e7) {
                    C1053de.a(abstractC2555k.getContext()).e("BaseAdView.pause", e7);
                    return;
                }
                break;
            case 1:
                AbstractC2555k abstractC2555k2 = this.f21369b;
                try {
                    F0 f03 = abstractC2555k2.f21350a;
                    f03.getClass();
                    try {
                        L l6 = f03.i;
                        if (l6 != null) {
                            l6.e();
                        }
                    } catch (RemoteException e8) {
                        u2.k.k("#007 Could not call remote method.", e8);
                    }
                    break;
                } catch (IllegalStateException e9) {
                    C1053de.a(abstractC2555k2.getContext()).e("BaseAdView.resume", e9);
                    return;
                }
            default:
                AbstractC2555k abstractC2555k3 = this.f21369b;
                try {
                    F0 f04 = abstractC2555k3.f21350a;
                    f04.getClass();
                    try {
                        L l7 = f04.i;
                        if (l7 != null) {
                            l7.s();
                            break;
                        }
                    } catch (RemoteException e10) {
                        u2.k.k("#007 Could not call remote method.", e10);
                        return;
                    }
                } catch (IllegalStateException e11) {
                    C1053de.a(abstractC2555k3.getContext()).e("BaseAdView.destroy", e11);
                }
                break;
        }
    }
}
