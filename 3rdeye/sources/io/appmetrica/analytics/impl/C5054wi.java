package io.appmetrica.analytics.impl;

import N7.C1154e9;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5054wi implements InterfaceC4804mo {

    /* renamed from: a, reason: collision with root package name */
    public final Map f41980a;

    public C5054wi(Map<String, ?> map) {
        this.f41980a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(String str) {
        return this.f41980a.containsKey(str) ? new C4752ko(this, false, C1154e9.i("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new C4752ko(this, true, "");
    }
}
