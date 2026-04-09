package com.bytedance.sdk.component.le.ouw.vt;

import android.os.Handler;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {

    /* renamed from: cf, reason: collision with root package name */
    public final PriorityBlockingQueue<com.bytedance.sdk.component.le.ouw.yu.ouw> f7579cf;
    private final Comparator<com.bytedance.sdk.component.le.ouw.yu.ouw> ryl;
    public volatile Handler tlj;
    public volatile com.bytedance.sdk.component.le.ouw.vt.lh.lh vt;
    public static final yu ouw = new yu();
    public static final com.bytedance.sdk.component.le.ouw.vt.ouw.ouw fkw = new com.bytedance.sdk.component.le.ouw.vt.ouw.ouw();

    /* renamed from: le, reason: collision with root package name */
    public static final AtomicLong f7578le = new AtomicLong(0);
    public static final AtomicLong ra = new AtomicLong(0);
    public static final long pno = System.currentTimeMillis();
    public static long bly = 0;

    /* renamed from: lh, reason: collision with root package name */
    public volatile boolean f7580lh = false;
    public volatile boolean yu = false;

    private yu() {
        Comparator<com.bytedance.sdk.component.le.ouw.yu.ouw> comparator = new Comparator<com.bytedance.sdk.component.le.ouw.yu.ouw>() { // from class: com.bytedance.sdk.component.le.ouw.vt.yu.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2) {
                return yu.ouw(ouwVar, ouwVar2);
            }
        };
        this.ryl = comparator;
        this.f7579cf = new PriorityBlockingQueue<>(8, comparator);
    }

    public final void ouw() {
        if (this.vt == null || !this.vt.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.vt != null && this.vt.isAlive()) {
                    if (this.tlj != null) {
                        this.tlj.removeCallbacksAndMessages(null);
                    }
                    this.vt.ouw = false;
                    this.vt.quitSafely();
                    this.vt = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean vt() {
        try {
            if (this.vt != null || com.bytedance.sdk.component.le.ouw.vt.vt()) {
                return false;
            }
            synchronized (this) {
                if (this.vt != null) {
                    return false;
                }
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                this.vt = new com.bytedance.sdk.component.le.ouw.vt.lh.lh(this.f7579cf);
                this.vt.start();
                return true;
            }
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
            return false;
        }
    }

    public static /* synthetic */ int ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2) {
        long jVt;
        long jLh;
        long jLh2;
        long jVt2;
        if (ouwVar == null) {
            return ouwVar2 == null ? 0 : -1;
        }
        if (ouwVar2 == null) {
            return 1;
        }
        if (ouwVar.fkw() == ouwVar2.fkw()) {
            if (ouwVar.ouw() != null) {
                jVt = ouwVar.ouw().vt();
                jLh = ouwVar.ouw().lh();
            } else {
                jVt = 0;
                jLh = 0;
            }
            if (ouwVar2.ouw() != null) {
                jVt2 = ouwVar2.ouw().vt();
                jLh2 = ouwVar2.ouw().lh();
            } else {
                jLh2 = 0;
                jVt2 = 0;
            }
            if (jVt == 0 || jVt2 == 0) {
                return 0;
            }
            long j = jVt - jVt2;
            if (Math.abs(j) > 2147483647L) {
                return 0;
            }
            if (j != 0) {
                return (int) j;
            }
            if (jLh == 0 || jLh2 == 0) {
                return 0;
            }
            return (int) (jLh - jLh2);
        }
        return ouwVar.fkw() - ouwVar2.fkw();
    }
}
