package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4904qk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f41489a;

    /* renamed from: b, reason: collision with root package name */
    public final long f41490b;

    public C4904qk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f41489a = systemTimeProvider;
        this.f41490b = systemTimeProvider.currentTimeMillis();
    }
}
