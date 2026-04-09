package i7;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class j extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f11263a;

    public j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f11263a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        br.l.e((d) iInterface, "callback");
        br.l.e(obj, "cookie");
        this.f11263a.f2114d.remove((Integer) obj);
    }
}
