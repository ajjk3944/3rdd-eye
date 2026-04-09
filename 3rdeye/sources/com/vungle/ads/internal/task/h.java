package com.vungle.ads.internal.task;

import com.vungle.ads.internal.executor.i;

/* compiled from: PriorityRunnable.kt */
/* loaded from: classes2.dex */
public abstract class h implements i.b {
    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        kotlin.jvm.internal.l.f(other, "other");
        if (!(other instanceof h)) {
            return -1;
        }
        return kotlin.jvm.internal.l.h(((h) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
