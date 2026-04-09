package a5;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class x implements b {
    public final z a(Looper looper, Handler.Callback callback) {
        return new z(new Handler(looper, callback));
    }
}
