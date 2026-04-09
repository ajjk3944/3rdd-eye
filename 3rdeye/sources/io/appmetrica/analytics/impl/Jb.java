package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Jb implements InterfaceC4804mo {
    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(String str) {
        return str == null ? new C4752ko(this, false, "key is null") : str.startsWith("appmetrica") ? new C4752ko(this, false, "key starts with appmetrica") : str.length() > 200 ? new C4752ko(this, false, "key length more then 200 characters") : new C4752ko(this, true, "");
    }
}
