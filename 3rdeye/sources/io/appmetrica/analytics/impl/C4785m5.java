package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4785m5 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f41239a = new CopyOnWriteArrayList();

    public final void a(A4 a42) {
        this.f41239a.add(a42);
    }

    public final void b(A4 a42) {
        this.f41239a.remove(a42);
    }

    public final List<A4> a() {
        return this.f41239a;
    }
}
