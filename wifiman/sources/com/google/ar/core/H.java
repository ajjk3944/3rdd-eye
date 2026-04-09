package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class H implements x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f38180a;

    H(AtomicReference atomicReference) {
        this.f38180a = atomicReference;
    }

    @Override // com.google.ar.core.x
    public final void a(ArCoreApk.Availability availability) {
        this.f38180a.set(availability);
    }
}
