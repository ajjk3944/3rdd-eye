package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class Fe implements InterfaceC4686i9, Ge {

    /* renamed from: a, reason: collision with root package name */
    public final C4555d7 f39436a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f39437b;

    public Fe(C4555d7 c4555d7) {
        this.f39436a = c4555d7;
        this.f39437b = new AtomicLong(c4555d7.b());
        c4555d7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4686i9
    public final void a(List<Integer> list) {
        this.f39437b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4686i9
    public final void b(List<Integer> list) {
        this.f39437b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4686i9
    public final void a() {
        this.f39437b.set(this.f39436a.b());
    }

    public final long b() {
        return this.f39437b.get();
    }
}
