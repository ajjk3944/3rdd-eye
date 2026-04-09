package io.sentry;

import java.time.Instant;

/* loaded from: classes.dex */
public final class x4 extends k4 {

    /* renamed from: a, reason: collision with root package name */
    public final Instant f12867a = Instant.now();

    @Override // io.sentry.k4
    public final long d() {
        return (this.f12867a.getEpochSecond() * 1000000000) + this.f12867a.getNano();
    }
}
