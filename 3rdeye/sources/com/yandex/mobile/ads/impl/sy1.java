package com.yandex.mobile.ads.impl;

import b9.C1992A;

/* loaded from: classes3.dex */
public final class sy1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f33327a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f33328b;

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        synchronized (this.f33327a) {
            if (this.f33328b) {
                return;
            }
            this.f33328b = true;
            C1992A c1992a = C1992A.f18074a;
            runnable.run();
        }
    }
}
