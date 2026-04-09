package B9;

import F9.p;
import android.os.Looper;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class a implements p {
    @Override // F9.p
    public final f a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(false, h.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
