package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4566di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f40749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40750b;

    public RunnableC4566di(C4927ri c4927ri, boolean z10) {
        this.f40750b = c4927ri;
        this.f40749a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40750b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).setDataSendingEnabled(this.f40749a);
    }
}
