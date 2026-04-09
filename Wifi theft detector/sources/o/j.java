package o;

import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final ITrustedWebActivityCallback f23556a;

    public j(ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.f23556a = iTrustedWebActivityCallback;
    }

    public static j a(IBinder iBinder) {
        ITrustedWebActivityCallback iTrustedWebActivityCallbackAsInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (iTrustedWebActivityCallbackAsInterface == null) {
            return null;
        }
        return new j(iTrustedWebActivityCallbackAsInterface);
    }
}
