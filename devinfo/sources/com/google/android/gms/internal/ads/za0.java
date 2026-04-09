package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class za0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19049a;

    public final synchronized boolean a() {
        if (this.f19049a) {
            return false;
        }
        this.f19049a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        this.f19049a = false;
    }

    public final synchronized void c() {
        while (!this.f19049a) {
            wait();
        }
    }

    public final synchronized void d() {
        boolean z3 = false;
        while (!this.f19049a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z3 = true;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean e(long j) {
        if (j > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j8 = j + jElapsedRealtime;
                if (j8 < jElapsedRealtime) {
                    d();
                } else {
                    boolean z3 = false;
                    while (!this.f19049a && jElapsedRealtime < j8) {
                        try {
                            wait(j8 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f19049a;
    }
}
