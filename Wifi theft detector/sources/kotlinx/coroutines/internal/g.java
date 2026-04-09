package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection f22531a = SequencesKt___SequencesKt.u(kotlin.sequences.m.d(ServiceLoader.load(kotlinx.coroutines.g0.class, kotlinx.coroutines.g0.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f22531a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
