package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Ni implements InterfaceC5064x3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f39906a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5064x3 f39907b;

    public Ni(Object obj, InterfaceC5064x3 interfaceC5064x3) {
        this.f39906a = obj;
        this.f39907b = interfaceC5064x3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5064x3
    public final int getBytesTruncated() {
        return this.f39907b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f39906a + ", metaInfo=" + this.f39907b + '}';
    }
}
