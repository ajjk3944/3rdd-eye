package xa;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final long f37072a;

    public k(long j) {
        this.f37072a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f9018z.remove(Long.valueOf(this.f37072a)) == null) {
            return null;
        }
        ua.j.C.f35265h.f("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
