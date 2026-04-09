package com.vungle.ads.internal.network;

import java.io.IOException;

/* compiled from: Call.kt */
/* loaded from: classes2.dex */
public interface a<T> {
    void cancel();

    void enqueue(b<T> bVar);

    d<T> execute() throws IOException;

    boolean isCanceled();
}
