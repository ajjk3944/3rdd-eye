package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4669hi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f41020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41021c;

    public RunnableC4669hi(C4927ri c4927ri, String str, byte[] bArr) {
        this.f41021c = c4927ri;
        this.f41019a = str;
        this.f41020b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41021c;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).setSessionExtra(this.f41019a, this.f41020b);
    }
}
