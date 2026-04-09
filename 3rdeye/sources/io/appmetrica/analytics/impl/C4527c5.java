package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4527c5 implements InterfaceC4865p7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f40610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40611b;

    public C4527c5(C4759l5 c4759l5) {
        this.f40610a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c4759l5.d() ? "main" : c4759l5.b()}, 1));
        this.f40611b = "db_metrica_" + c4759l5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4865p7
    public final String a() {
        return this.f40611b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4865p7
    public final String b() {
        return this.f40610a;
    }
}
