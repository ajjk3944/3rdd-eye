package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Gn implements InterfaceC5064x3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f39550a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5064x3 f39551b;

    public Gn(Object obj, InterfaceC5064x3 interfaceC5064x3) {
        this.f39550a = obj;
        this.f39551b = interfaceC5064x3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5064x3
    public final int getBytesTruncated() {
        return this.f39551b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f39550a + ", metaInfo=" + this.f39551b + '}';
    }
}
