package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fak {
    public long ouw;
    public long vt;

    private fak(boolean z3) {
        if (z3) {
            yu();
        }
    }

    public static fak ouw() {
        return new fak(true);
    }

    public static fak vt() {
        return new fak(false);
    }

    public final boolean fkw() {
        return this.vt > 0;
    }

    public final long lh() {
        return SystemClock.elapsedRealtime() - this.vt;
    }

    public final String toString() {
        return String.valueOf(this.ouw);
    }

    public final void yu() {
        this.ouw = System.currentTimeMillis();
        this.vt = SystemClock.elapsedRealtime();
    }

    public final long ouw(fak fakVar) {
        return Math.abs(fakVar.vt - this.vt);
    }
}
