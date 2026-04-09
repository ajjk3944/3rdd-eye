package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* loaded from: classes3.dex */
public final class Pa implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C4769lf f39969a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4639ge f39970b;

    public Pa(C4769lf c4769lf, EnumC4639ge enumC4639ge) {
        this.f39969a = c4769lf;
        this.f39970b = enumC4639ge;
    }

    public final EnumC4639ge a() {
        return this.f39970b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f39969a.a(this.f39970b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f39969a.a(this.f39970b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j4) {
        this.f39969a.b(this.f39970b, j4).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.f39969a.b(this.f39970b, i).b();
    }
}
