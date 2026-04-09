package t;

import android.content.res.Resources;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33846a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f33847b;

    public l(m mVar) {
        this.f33846a = 0;
        this.f33847b = new WeakReference(mVar);
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.f33846a) {
            case 0:
                WeakReference weakReference = this.f33847b;
                if (weakReference.get() != null) {
                    ((m) weakReference.get()).m0();
                    break;
                }
                break;
            case 1:
                WeakReference weakReference2 = this.f33847b;
                if (weakReference2.get() != null) {
                    ((s) weakReference2.get()).f33864n = false;
                    break;
                }
                break;
            default:
                WeakReference weakReference3 = this.f33847b;
                if (weakReference3.get() != null) {
                    ((s) weakReference3.get()).f33865o = false;
                    break;
                }
                break;
        }
    }

    public l(s sVar, int i4) {
        this.f33846a = i4;
        switch (i4) {
            case 2:
                this.f33847b = new WeakReference(sVar);
                break;
            default:
                this.f33847b = new WeakReference(sVar);
                break;
        }
    }
}
