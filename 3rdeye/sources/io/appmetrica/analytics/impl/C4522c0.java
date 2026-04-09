package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4522c0 implements InterfaceC5059wn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4548d0 f40602a;

    public C4522c0(C4548d0 c4548d0) {
        this.f40602a = c4548d0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5059wn
    public final Thread a() {
        return this.f40602a.f40676b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5059wn
    public final StackTraceElement[] b() {
        C4548d0 c4548d0 = this.f40602a;
        return (StackTraceElement[]) c4548d0.f40675a.get(c4548d0.f40676b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5059wn
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f40602a.f40675a;
    }
}
