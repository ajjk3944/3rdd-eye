package com.vungle.ads.internal.executor;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {
    @NotNull
    VungleThreadPoolExecutor getApiExecutor();

    @NotNull
    VungleThreadPoolExecutor getBackgroundExecutor();

    @NotNull
    VungleThreadPoolExecutor getDownloaderExecutor();

    @NotNull
    VungleThreadPoolExecutor getIoExecutor();

    @NotNull
    VungleThreadPoolExecutor getJobExecutor();

    @NotNull
    VungleThreadPoolExecutor getLoggerExecutor();

    @NotNull
    VungleThreadPoolExecutor getOffloadExecutor();

    @NotNull
    VungleThreadPoolExecutor getUaExecutor();
}
