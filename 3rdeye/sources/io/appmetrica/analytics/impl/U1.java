package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class U1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f40218e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Ya f40219a;

    /* renamed from: b, reason: collision with root package name */
    public final J6 f40220b = C5065x4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final H6 f40221c = new H6();

    /* renamed from: d, reason: collision with root package name */
    public final C5084xn f40222d = new C5084xn();

    public U1(D6 d62) {
        this.f40219a = d62;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArrB;
        try {
            f40218e.set(true);
            Ya ya = this.f40219a;
            C4907qn c4907qnApply = this.f40221c.apply(thread);
            C5084xn c5084xn = this.f40222d;
            Thread threadA = c5084xn.f42092a.a();
            ArrayList arrayListA = c5084xn.a(threadA, thread);
            if (thread != threadA) {
                try {
                    stackTraceElementArrB = c5084xn.f42092a.b();
                    if (stackTraceElementArrB == null) {
                        try {
                            stackTraceElementArrB = threadA.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArrB = null;
                }
                arrayListA.add(0, (C4907qn) c5084xn.f42093b.apply(threadA, stackTraceElementArrB));
            }
            ya.a(th, new U(c4907qnApply, arrayListA, this.f40220b.b()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
