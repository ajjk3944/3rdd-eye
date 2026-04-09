package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Xh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40393b;

    public Xh(C4927ri c4927ri, String str) {
        this.f40393b = c4927ri;
        this.f40392a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40393b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).setUserProfileID(this.f40392a);
    }
}
