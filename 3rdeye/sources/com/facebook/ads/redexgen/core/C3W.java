package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3W, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3W {
    public boolean A00;
    public final C3T A01;

    public C3W() {
        this(C3T.A00);
    }

    public C3W(C3T c3t) {
        this.A01 = c3t;
    }

    public final synchronized void A00() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized void A01() {
        boolean z10 = false;
        while (true) {
            boolean wasInterrupted = this.A00;
            if (wasInterrupted) {
                break;
            }
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

    public final synchronized boolean A02() {
        boolean z10;
        z10 = this.A00;
        this.A00 = false;
        return z10;
    }

    public final synchronized boolean A03() {
        return this.A00;
    }

    public final synchronized boolean A04() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean A05(long j4) throws InterruptedException {
        if (j4 <= 0) {
            return this.A00;
        }
        long nowMs = this.A01.A6B();
        long j10 = nowMs + j4;
        if (j10 < nowMs) {
            A00();
        } else {
            while (!this.A00 && nowMs < j10) {
                long endMs = j10 - nowMs;
                wait(endMs);
                nowMs = this.A01.A6B();
            }
        }
        return this.A00;
    }
}
