package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4846oe implements InterfaceC4804mo {

    /* renamed from: a, reason: collision with root package name */
    public final String f41373a;

    public C4846oe(String str) {
        this.f41373a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(Object obj) {
        return obj == null ? new C4752ko(this, false, B4.f.c(new StringBuilder(), this.f41373a, " is null.")) : new C4752ko(this, true, "");
    }

    public final String a() {
        return this.f41373a;
    }
}
