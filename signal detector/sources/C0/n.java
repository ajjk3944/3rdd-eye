package C0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class n extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1069a;

    public n(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1069a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        q5.i.e((f) iInterface, "callback");
        q5.i.e(obj, "cookie");
        this.f1069a.f5635b.remove((Integer) obj);
    }
}
