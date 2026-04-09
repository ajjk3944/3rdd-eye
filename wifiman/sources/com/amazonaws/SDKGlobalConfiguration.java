package com.amazonaws;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class SDKGlobalConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f34058a = new AtomicLong(0);

    public static long a() {
        return f34058a.get();
    }
}
