package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Tj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40193b;

    public Tj(String str, String str2) {
        this.f40192a = str;
        this.f40193b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.putAppEnvironmentValue(this.f40192a, this.f40193b);
    }
}
