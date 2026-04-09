package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes3.dex */
public abstract class P2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4930rl f39952a;

    public P2(InterfaceC4930rl interfaceC4930rl) {
        this.f39952a = interfaceC4930rl;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z10) {
        return ((Ld) this.f39952a).c(str, z10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i) {
        return ((Ld) this.f39952a).c(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j4) {
        return ((Ld) this.f39952a).c(a(str), j4);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((Ld) this.f39952a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z10) {
        Ld ld = (Ld) this.f39952a;
        ((AbstractC4717jf) ((InterfaceC4930rl) ld.b(ld.f(a(str)), z10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i) {
        Ld ld = (Ld) this.f39952a;
        ((AbstractC4717jf) ((InterfaceC4930rl) ld.b(ld.f(str), i))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j4) {
        Ld ld = (Ld) this.f39952a;
        ((AbstractC4717jf) ((InterfaceC4930rl) ld.b(ld.f(a(str)), j4))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        Ld ld = (Ld) this.f39952a;
        ((AbstractC4717jf) ((InterfaceC4930rl) ld.b(ld.f(a(str)), str2))).b();
    }
}
