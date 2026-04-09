package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class r6 extends i5 {
    private final Runnable g;

    public r6(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.g.run();
    }

    public r6(com.applovin.impl.sdk.k kVar, boolean z3, String str, Runnable runnable) {
        super(je.u.t("TaskRunnable:", str), kVar, z3);
        this.g = runnable;
    }
}
