package o7;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.l;

/* compiled from: UiThreadHandler.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f44878a = new Handler(Looper.getMainLooper());

    public static final boolean a() {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = Looper.getMainLooper().getThread();
        l.e(thread, "getMainLooper().thread");
        return l.b(threadCurrentThread, thread);
    }
}
