package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Um extends O4 {

    /* renamed from: g, reason: collision with root package name */
    public final Fn f40258g;

    public Um(String str, String str2, Fn fn, InterfaceC4804mo interfaceC4804mo, W2 w22) {
        super(0, str, str2, interfaceC4804mo, w22);
        this.f40258g = fn;
    }

    @Override // io.appmetrica.analytics.impl.O4
    public final void a(Zn zn) {
        String str = (String) this.f40258g.a((String) this.f39921f);
        zn.f40499d.f40598a = str == null ? new byte[0] : str.getBytes();
    }

    public final Fn h() {
        return this.f40258g;
    }
}
