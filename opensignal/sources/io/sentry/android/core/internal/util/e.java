package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.u4;

/* loaded from: classes.dex */
public final class e implements io.sentry.util.thread.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f11647a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f11648b;

    static {
        e eVar = new e();
        new Handler(Looper.getMainLooper()).post(new u4(1));
        f11647a = eVar;
        f11648b = Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public final String a() {
        return c() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long b() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public final boolean c() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }
}
