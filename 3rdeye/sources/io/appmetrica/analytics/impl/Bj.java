package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Bj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f39201a;

    public Bj(Throwable th) {
        this.f39201a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.reportUnhandledException(this.f39201a);
    }
}
