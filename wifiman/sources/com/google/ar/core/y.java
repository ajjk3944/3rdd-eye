package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes3.dex */
final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f38317a;

    y(A a10) {
        this.f38317a = a10;
    }

    @Override // com.google.ar.core.x
    public final void a(ArCoreApk.Availability availability) {
        synchronized (this.f38317a) {
            this.f38317a.f(availability);
            this.f38317a.g();
        }
    }
}
