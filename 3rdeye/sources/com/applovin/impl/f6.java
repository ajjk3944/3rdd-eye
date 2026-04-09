package com.applovin.impl;

/* loaded from: classes.dex */
public class f6 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f19354g;

    public f6(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f19354g.run();
    }

    public f6(com.applovin.impl.sdk.k kVar, boolean z10, String str, Runnable runnable) {
        super(androidx.work.s.d("TaskRunnable:", str), kVar, z10);
        this.f19354g = runnable;
    }
}
