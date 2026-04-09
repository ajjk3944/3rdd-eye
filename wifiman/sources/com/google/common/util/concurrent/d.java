package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public interface d extends Future {
    void a(Runnable runnable, Executor executor);
}
