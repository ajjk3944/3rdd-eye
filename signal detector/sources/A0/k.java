package A0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class k {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
