package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.Em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494Em {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8001a;

    public final synchronized boolean a() {
        if (this.f8001a) {
            return false;
        }
        this.f8001a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        this.f8001a = false;
    }

    public final synchronized void c() {
        while (!this.f8001a) {
            wait();
        }
    }

    public final synchronized void d() {
        boolean z6 = false;
        while (!this.f8001a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean e(long j6) {
        if (j6 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = j6 + jElapsedRealtime;
                if (j7 < jElapsedRealtime) {
                    d();
                } else {
                    boolean z6 = false;
                    while (!this.f8001a && jElapsedRealtime < j7) {
                        try {
                            wait(j7 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z6 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f8001a;
    }
}
