package com.squareup.picasso;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class i0 extends ThreadPoolExecutor {
    public final void a(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        h0 h0Var = new h0((f) runnable);
        execute(h0Var);
        return h0Var;
    }
}
