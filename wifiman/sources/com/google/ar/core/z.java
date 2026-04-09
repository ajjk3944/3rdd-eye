package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class z implements x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Consumer f38318a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A f38319b;

    z(A a10, Consumer consumer) {
        this.f38318a = consumer;
        this.f38319b = a10;
    }

    @Override // com.google.ar.core.x
    public final void a(ArCoreApk.Availability availability) {
        this.f38319b.e().post(new RunnableC5050m(this.f38318a, availability, 1));
    }
}
