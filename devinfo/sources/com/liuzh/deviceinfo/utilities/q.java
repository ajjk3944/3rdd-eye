package com.liuzh.deviceinfo.utilities;

import android.net.TrafficStats;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public long f21290a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f21291b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f21292c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f21293d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f21294e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f21295f;

    public q(r rVar) {
        this.f21295f = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        long j = this.f21292c;
        r rVar = this.f21295f;
        if (j == -1 || this.f21290a == -1 || this.f21291b == -1) {
            this.f21290a = TrafficStats.getTotalRxBytes();
            this.f21291b = TrafficStats.getTotalTxBytes();
            this.f21292c = SystemClock.elapsedRealtime();
        } else {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long totalTxBytes = TrafficStats.getTotalTxBytes();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (totalRxBytes != -1 && totalTxBytes != -1) {
                float f10 = (jElapsedRealtime - this.f21292c) / 1000.0f;
                this.f21293d = (long) ((totalRxBytes - this.f21290a) / f10);
                this.f21294e = (long) ((totalTxBytes - this.f21291b) / f10);
                rVar.f21301e.run();
                this.f21291b = totalTxBytes;
                this.f21290a = totalRxBytes;
                this.f21292c = jElapsedRealtime;
            }
        }
        if (rVar.f21297a.get()) {
            rVar.f21299c.postDelayed(this, 1000L);
        }
    }
}
