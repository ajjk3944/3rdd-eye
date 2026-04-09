package defpackage;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fe4 implements Callable {
    public final long a;

    public fe4(long j) {
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.E.remove(Long.valueOf(this.a)) == null) {
            return null;
        }
        hg4.C.h.d("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
