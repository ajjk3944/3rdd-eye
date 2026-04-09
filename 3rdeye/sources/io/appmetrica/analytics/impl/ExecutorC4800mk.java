package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC4800mk implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f41269a;

    public ExecutorC4800mk(Handler handler) {
        this.f41269a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f41269a.post(runnable);
    }
}
