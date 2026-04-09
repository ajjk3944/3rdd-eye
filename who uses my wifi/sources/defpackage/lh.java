package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class lh {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
