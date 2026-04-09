package io.sentry.android.core;

import android.os.SystemClock;
import java.util.Date;

/* loaded from: classes.dex */
public final class o implements io.sentry.android.core.internal.util.p {

    /* renamed from: a, reason: collision with root package name */
    public float f11706a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11707b;

    public o(q qVar) {
        this.f11707b = qVar;
    }

    @Override // io.sentry.android.core.internal.util.p
    public final void b(long j, long j7, long j10, long j11, boolean z10, boolean z11, float f10) {
        Date dateQ = dr.a.q();
        System.nanoTime();
        long time = dateQ.getTime() * 1000000;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j7 - System.nanoTime());
        q qVar = this.f11707b;
        long j12 = jElapsedRealtimeNanos - qVar.f11737a;
        if (j12 < 0) {
            return;
        }
        if (z11) {
            qVar.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j12), Long.valueOf(j10), time));
        } else if (z10) {
            qVar.f11745i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j12), Long.valueOf(j10), time));
        }
        if (f10 != this.f11706a) {
            this.f11706a = f10;
            qVar.f11744h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j12), Float.valueOf(f10), time));
        }
    }
}
