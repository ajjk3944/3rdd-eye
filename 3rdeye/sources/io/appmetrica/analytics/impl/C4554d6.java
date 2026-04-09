package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4554d6 implements InterfaceC4528c6 {

    /* renamed from: a, reason: collision with root package name */
    public final B5 f40708a;

    public C4554d6(B5 b52) {
        this.f40708a = b52;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4528c6, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final B5 getAdRevenueProcessorsHolder() {
        return this.f40708a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f40708a;
    }
}
