package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4873pf implements InterfaceC4633g8 {

    /* renamed from: a, reason: collision with root package name */
    public final Cf f41422a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C4847of> f41423b;

    public C4873pf(Cf cf, List<C4847of> list) {
        this.f41422a = cf;
        this.f41423b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4633g8
    public final List<C4847of> a() {
        return this.f41423b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4633g8
    public final Object b() {
        return this.f41422a;
    }

    public final Cf c() {
        return this.f41422a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f41422a + ", candidates=" + this.f41423b + '}';
    }
}
