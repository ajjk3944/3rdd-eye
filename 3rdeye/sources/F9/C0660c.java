package F9;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: Concurrent.kt */
/* renamed from: F9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0660c {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f1748a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f1748a = method;
    }
}
