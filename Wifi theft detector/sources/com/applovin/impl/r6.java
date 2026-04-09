package com.applovin.impl;

/* loaded from: classes.dex */
public class r6 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f7501g;

    public r6(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7501g.run();
    }

    public r6(com.applovin.impl.sdk.k kVar, boolean z10, String str, Runnable runnable) {
        super("TaskRunnable:" + str, kVar, z10);
        this.f7501g = runnable;
    }
}
