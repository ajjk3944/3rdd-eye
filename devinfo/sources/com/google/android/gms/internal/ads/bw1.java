package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bw1 {

    /* renamed from: p, reason: collision with root package name */
    public static final Object f9818p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static ScheduledExecutorService f9819q;

    /* renamed from: r, reason: collision with root package name */
    public static int f9820r;

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f9821a;

    /* renamed from: b, reason: collision with root package name */
    public final pv1 f9822b;

    /* renamed from: c, reason: collision with root package name */
    public xv1 f9823c;

    /* renamed from: d, reason: collision with root package name */
    public final dw1 f9824d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9825e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9826f;
    public final aw1 g;

    /* renamed from: h, reason: collision with root package name */
    public final yf0 f9827h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9828i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f9829k;

    /* renamed from: l, reason: collision with root package name */
    public int f9830l;

    /* renamed from: m, reason: collision with root package name */
    public int f9831m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9832n;

    /* renamed from: o, reason: collision with root package name */
    public final ne0 f9833o;

    public bw1(AudioTrack audioTrack, pv1 pv1Var, ne0 ne0Var, w5 w5Var) {
        this.f9821a = audioTrack;
        this.f9822b = pv1Var;
        this.f9833o = ne0Var;
        yf0 yf0Var = new yf0(Thread.currentThread());
        this.f9827h = yf0Var;
        yf0Var.f18728b = false;
        boolean zA = bq0.a(pv1Var.f15119a);
        this.f9825e = zA;
        if (zA) {
            this.f9826f = bq0.d(pv1Var.f15119a) * Integer.bitCount(pv1Var.f15121c);
        } else {
            this.f9826f = -1;
        }
        this.f9824d = new dw1(new kh0(23, this), w5Var, audioTrack, pv1Var.f15119a, this.f9826f, pv1Var.f15122d);
        if (Build.VERSION.SDK_INT >= 24 && ne0Var != null) {
            this.f9823c = new xv1(audioTrack, ne0Var);
        }
        this.g = b() ? new aw1(this) : null;
    }

    public final boolean a(ByteBuffer byteBuffer, int i4) {
        int underrunCount;
        boolean z3;
        ne0 ne0Var;
        cw1 cw1Var;
        xi0 xi0Var;
        boolean z10 = this.f9825e;
        if (!z10 && this.f9830l == 0) {
            this.f9830l = kw1.c(byteBuffer, this.f9822b.f15119a);
        }
        long jD = d();
        int i10 = Build.VERSION.SDK_INT;
        AudioTrack audioTrack = this.f9821a;
        if (i10 >= 24) {
            underrunCount = audioTrack.getUnderrunCount();
        } else {
            boolean z11 = this.f9832n;
            long jA = this.f9824d.a();
            int sampleRate = audioTrack.getSampleRate();
            String str = bq0.f9768a;
            boolean z12 = jD > bq0.u(jA, (long) sampleRate, 1000000L, RoundingMode.UP);
            this.f9832n = z12;
            underrunCount = (!z11 || z12 || audioTrack.getPlayState() == 1) ? this.f9831m : this.f9831m + 1;
        }
        int i11 = this.f9831m;
        this.f9831m = underrunCount;
        if (underrunCount > i11) {
            uu1 uu1Var = uu1.f17346c;
            yf0 yf0Var = this.f9827h;
            yf0Var.c(-1, uu1Var);
            yf0Var.d();
        }
        int iRemaining = byteBuffer.remaining();
        int iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z3 = iWrite == iRemaining;
            if (z10) {
                this.j += iWrite;
                return z3;
            }
            if (z3) {
                this.f9829k = (this.f9830l * i4) + this.f9829k;
            }
            return z3;
        }
        z3 = (i10 >= 24 && iWrite == -6) || iWrite == -32;
        if (z3 && (ne0Var = this.f9833o) != null && (xi0Var = (cw1Var = (cw1) ne0Var.f14280b).f10239f) != null) {
            ev1 ev1Var = ev1.f10889c;
            cw1Var.f10238e = ev1Var;
            xi0Var.h(ev1Var);
        }
        throw new jv1(iWrite, z3);
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 29 && this.f9821a.isOffloadedPlayback();
    }

    public final void c(cv1 cv1Var) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        synchronized (cv1Var) {
            bv1 bv1Var = cv1Var.f10229b;
            if (bv1Var == null) {
                throw null;
            }
            logSessionId = bv1Var.f9812a;
        }
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.f9821a.setLogSessionId(logSessionId);
    }

    public final long d() {
        if (!this.f9825e) {
            return this.f9829k;
        }
        long j = this.j;
        String str = bq0.f9768a;
        return ((j + r2) - 1) / this.f9826f;
    }
}
