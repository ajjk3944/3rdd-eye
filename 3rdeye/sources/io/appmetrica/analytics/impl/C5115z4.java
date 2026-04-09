package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5115z4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f42162a;

    public C5115z4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f42162a.elapsedRealtime();
    }

    public C5115z4(SystemTimeProvider systemTimeProvider) {
        this.f42162a = systemTimeProvider;
    }
}
