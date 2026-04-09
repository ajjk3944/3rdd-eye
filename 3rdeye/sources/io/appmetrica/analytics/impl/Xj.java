package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Xj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40396b;

    public Xj(String str, String str2) {
        this.f40395a = str;
        this.f40396b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.reportEvent(this.f40395a, this.f40396b);
    }
}
