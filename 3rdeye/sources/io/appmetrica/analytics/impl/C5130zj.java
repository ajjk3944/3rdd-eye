package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5130zj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f42198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f42199b;

    public C5130zj(String str, Throwable th) {
        this.f42198a = str;
        this.f42199b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.reportError(this.f42198a, this.f42199b);
    }
}
