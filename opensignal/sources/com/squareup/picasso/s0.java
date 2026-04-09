package com.squareup.picasso;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class s0 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new r0(runnable);
    }
}
