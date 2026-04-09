package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private boolean f25762a;

    public cr() {
        this(0);
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.f25762a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f25762a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void c() {
        this.f25762a = false;
    }

    public final synchronized boolean d() {
        return this.f25762a;
    }

    public final synchronized boolean e() {
        if (this.f25762a) {
            return false;
        }
        this.f25762a = true;
        notifyAll();
        return true;
    }

    public cr(int i) {
    }

    public final synchronized boolean a(long j4) throws InterruptedException {
        if (j4 <= 0) {
            return this.f25762a;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j4 + jElapsedRealtime;
        if (j10 < jElapsedRealtime) {
            a();
        } else {
            while (!this.f25762a && jElapsedRealtime < j10) {
                wait(j10 - jElapsedRealtime);
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return this.f25762a;
    }
}
