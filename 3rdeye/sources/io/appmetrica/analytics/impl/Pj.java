package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Pj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f39987b;

    public Pj(String str, byte[] bArr) {
        this.f39986a = str;
        this.f39987b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.setSessionExtra(this.f39986a, this.f39987b);
    }
}
