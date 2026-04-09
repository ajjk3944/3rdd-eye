package com.vungle.ads.internal.network;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface a {
    void cancel();

    void enqueue(@NotNull b bVar);

    @Nullable
    e execute();

    boolean isCanceled();
}
