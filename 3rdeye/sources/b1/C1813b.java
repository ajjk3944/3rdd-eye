package b1;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ConcurrencyHelpers.java */
/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1813b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
