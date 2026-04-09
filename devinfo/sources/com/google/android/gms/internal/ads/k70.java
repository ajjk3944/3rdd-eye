package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k70 extends hp1 {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f13068c;

    /* renamed from: d, reason: collision with root package name */
    public final tb.a f13069d;

    /* renamed from: e, reason: collision with root package name */
    public final qd0 f13070e;

    /* renamed from: f, reason: collision with root package name */
    public long f13071f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f13072h;

    /* renamed from: i, reason: collision with root package name */
    public long f13073i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public ScheduledFuture f13074k;

    /* renamed from: l, reason: collision with root package name */
    public ScheduledFuture f13075l;

    public k70(ScheduledExecutorService scheduledExecutorService, tb.a aVar, qd0 qd0Var) {
        super(Collections.EMPTY_SET);
        this.f13071f = -1L;
        this.g = -1L;
        this.f13072h = -1L;
        this.f13073i = -1L;
        this.j = false;
        this.f13068c = scheduledExecutorService;
        this.f13069d = aVar;
        this.f13070e = qd0Var;
    }

    public final synchronized void h() {
        this.j = false;
        x1(0L);
    }

    public final synchronized void v1(int i4) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 20);
        sb2.append("In scheduleRefresh: ");
        sb2.append(i4);
        ya.a0.m(sb2.toString());
        if (i4 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i4);
            if (this.j) {
                long j = this.f13072h;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f13072h = millis;
                return;
            }
            this.f13069d.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            pk pkVar = sk.f16441ze;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                long j8 = this.f13071f;
                if (jElapsedRealtime >= j8 || j8 - jElapsedRealtime > millis) {
                    x1(millis);
                    if (((Boolean) sVar.f36166c.a(sk.We)).booleanValue()) {
                        rt rtVarA = this.f13070e.a();
                        rtVarA.u("action", "rtnc");
                        rtVarA.x();
                    }
                }
            } else {
                long j9 = this.f13071f;
                if (jElapsedRealtime > j9 || j9 - jElapsedRealtime > millis) {
                    x1(millis);
                }
            }
        }
    }

    public final synchronized void w1(int i4) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 28);
        sb2.append("In scheduleShowRefreshedAd: ");
        sb2.append(i4);
        ya.a0.m(sb2.toString());
        if (i4 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i4);
            if (this.j) {
                long j = this.f13073i;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f13073i = millis;
                return;
            }
            this.f13069d.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16441ze)).booleanValue()) {
                if (jElapsedRealtime == this.g) {
                    ya.a0.m("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j8 = this.g;
                if (jElapsedRealtime >= j8 || j8 - jElapsedRealtime > millis) {
                    y1(millis);
                }
            } else {
                long j9 = this.g;
                if (jElapsedRealtime > j9 || j9 - jElapsedRealtime > millis) {
                    y1(millis);
                }
            }
        }
    }

    public final synchronized void x1(long j) {
        try {
            ScheduledFuture scheduledFuture = this.f13074k;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f13074k.cancel(false);
            }
            this.f13069d.getClass();
            this.f13071f = SystemClock.elapsedRealtime() + j;
            this.f13074k = this.f13068c.schedule(new j70(this, 0), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void y1(long j) {
        try {
            ScheduledFuture scheduledFuture = this.f13075l;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f13075l.cancel(false);
            }
            this.f13069d.getClass();
            this.g = SystemClock.elapsedRealtime() + j;
            this.f13075l = this.f13068c.schedule(new j70(this, 1), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
