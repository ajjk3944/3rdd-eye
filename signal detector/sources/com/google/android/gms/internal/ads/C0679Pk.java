package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679Pk extends VL {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f10486c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.a f10487d;

    /* renamed from: e, reason: collision with root package name */
    public final C0784Vn f10488e;

    /* renamed from: f, reason: collision with root package name */
    public long f10489f;

    /* renamed from: g, reason: collision with root package name */
    public long f10490g;

    /* renamed from: h, reason: collision with root package name */
    public long f10491h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10492j;

    /* renamed from: k, reason: collision with root package name */
    public ScheduledFuture f10493k;

    /* renamed from: l, reason: collision with root package name */
    public ScheduledFuture f10494l;

    public C0679Pk(ScheduledExecutorService scheduledExecutorService, Q2.a aVar, C0784Vn c0784Vn) {
        super(Collections.EMPTY_SET);
        this.f10489f = -1L;
        this.f10490g = -1L;
        this.f10491h = -1L;
        this.i = -1L;
        this.f10492j = false;
        this.f10486c = scheduledExecutorService;
        this.f10487d = aVar;
        this.f10488e = c0784Vn;
    }

    public final synchronized void H1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        AbstractC2907C.m(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f10492j) {
                long j6 = this.f10491h;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f10491h = millis;
                return;
            }
            this.f10487d.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            E9 e9 = H9.xe;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                long j7 = this.f10489f;
                if (jElapsedRealtime >= j7 || j7 - jElapsedRealtime > millis) {
                    J1(millis);
                    if (((Boolean) c2841s.f23270c.a(H9.Ue)).booleanValue()) {
                        C0697Ql c0697QlA = this.f10488e.a();
                        c0697QlA.r("action", "rtnc");
                        c0697QlA.x();
                    }
                }
            } else {
                long j8 = this.f10489f;
                if (jElapsedRealtime > j8 || j8 - jElapsedRealtime > millis) {
                    J1(millis);
                }
            }
        }
    }

    public final synchronized void I1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        AbstractC2907C.m(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f10492j) {
                long j6 = this.i;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.i = millis;
                return;
            }
            this.f10487d.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.xe)).booleanValue()) {
                if (jElapsedRealtime == this.f10490g) {
                    AbstractC2907C.m("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j7 = this.f10490g;
                if (jElapsedRealtime >= j7 || j7 - jElapsedRealtime > millis) {
                    L1(millis);
                }
            } else {
                long j8 = this.f10490g;
                if (jElapsedRealtime > j8 || j8 - jElapsedRealtime > millis) {
                    L1(millis);
                }
            }
        }
    }

    public final synchronized void J1(long j6) {
        try {
            ScheduledFuture scheduledFuture = this.f10493k;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f10493k.cancel(false);
            }
            this.f10487d.getClass();
            this.f10489f = SystemClock.elapsedRealtime() + j6;
            this.f10493k = this.f10486c.schedule(new RunnableC0662Ok(this, 0), j6, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void L1(long j6) {
        try {
            ScheduledFuture scheduledFuture = this.f10494l;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f10494l.cancel(false);
            }
            this.f10487d.getClass();
            this.f10490g = SystemClock.elapsedRealtime() + j6;
            this.f10494l = this.f10486c.schedule(new RunnableC0662Ok(this, 1), j6, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void s() {
        this.f10492j = false;
        J1(0L);
    }
}
