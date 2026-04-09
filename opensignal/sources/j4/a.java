package j4;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class a {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
