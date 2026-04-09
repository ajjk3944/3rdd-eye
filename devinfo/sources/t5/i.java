package t5;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f34242a;

    public i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f34242a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        nk.k.e((d) iInterface, "callback");
        nk.k.e(obj, "cookie");
        this.f34242a.f1568b.remove((Integer) obj);
    }
}
