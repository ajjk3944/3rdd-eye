package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Aj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f39115c;

    public Aj(String str, String str2, Throwable th) {
        this.f39113a = str;
        this.f39114b = str2;
        this.f39115c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.reportError(this.f39113a, this.f39114b, this.f39115c);
    }
}
