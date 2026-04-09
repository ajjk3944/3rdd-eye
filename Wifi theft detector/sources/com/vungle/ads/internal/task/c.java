package com.vungle.ads.internal.task;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface c {
    void cancelPendingJob(@NotNull String str);

    void execute(@NotNull JobInfo jobInfo);
}
