package Ni;

import java.util.Collection;
import java.util.ServiceLoader;
import zi.AbstractC8783m;

/* renamed from: Ni.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3403e {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f16590a = AbstractC8783m.Z(AbstractC8783m.g(ServiceLoader.load(Ii.K.class, Ii.K.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f16590a;
    }

    public static final void b(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
