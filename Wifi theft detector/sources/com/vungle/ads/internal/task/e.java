package com.vungle.ads.internal.task;

import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class e implements VungleThreadPoolExecutor.b {
    @Override // java.lang.Comparable
    public int compareTo(@NotNull Object other) {
        p.e(other, "other");
        if (!(other instanceof e)) {
            return -1;
        }
        return p.f(((e) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
