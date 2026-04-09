package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class rm implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ op1 f32687b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ sm f32688c;

    public rm(sm smVar, op1 op1Var) {
        this.f32688c = smVar;
        this.f32687b = op1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f32688c.f33118c.put(this.f32687b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
