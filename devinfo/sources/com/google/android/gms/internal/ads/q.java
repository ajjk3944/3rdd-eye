package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final xy1 f15159a;

    /* renamed from: b, reason: collision with root package name */
    public bz1 f15160b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f15161c;

    /* renamed from: d, reason: collision with root package name */
    public int f15162d;

    /* renamed from: e, reason: collision with root package name */
    public Thread f15163e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15164f;
    public volatile boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pq0 f15165h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(pq0 pq0Var, Looper looper, xy1 xy1Var, bz1 bz1Var, long j) {
        super(looper);
        Objects.requireNonNull(pq0Var);
        this.f15165h = pq0Var;
        this.f15159a = xy1Var;
        this.f15160b = bz1Var;
    }

    public final void a(boolean z3) {
        this.g = z3;
        this.f15161c = null;
        if (hasMessages(1)) {
            this.f15164f = true;
            removeMessages(1);
            if (!z3) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f15164f = true;
                    this.f15159a.g = true;
                    Thread thread = this.f15163e;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z3) {
            this.f15165h.f15074c = null;
            SystemClock.elapsedRealtime();
            bz1 bz1Var = this.f15160b;
            bz1Var.getClass();
            bz1Var.d(this.f15159a, true);
            this.f15160b = null;
        }
    }

    public final void b() {
        cy1 cy1Var;
        SystemClock.elapsedRealtime();
        bz1 bz1Var = this.f15160b;
        bz1Var.getClass();
        int i4 = this.f15162d;
        xy1 xy1Var = this.f15159a;
        tl1 tl1Var = xy1Var.f18574b;
        if (i4 == 0) {
            Uri uri = xy1Var.j.f11479a;
            Map map = Collections.EMPTY_MAP;
            cy1Var = new cy1();
        } else {
            Uri uri2 = tl1Var.f16880b;
            cy1Var = new cy1();
        }
        l90 l90Var = bz1Var.f9864d;
        l90Var.z(new wb(l90Var, cy1Var, new a0.c0(-1, null, bq0.r(xy1Var.f18580i), bq0.r(bz1Var.A)), i4));
        this.f15161c = null;
        pq0 pq0Var = this.f15165h;
        q qVar = (q) pq0Var.f15074c;
        qVar.getClass();
        ((w) pq0Var.f15073b).execute(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        o oVar;
        m2 m2Var;
        if (this.g) {
            return;
        }
        int i4 = message.what;
        int i10 = 1;
        if (i4 == 1) {
            b();
            return;
        }
        if (i4 == 4) {
            throw ((Error) message.obj);
        }
        pq0 pq0Var = this.f15165h;
        pq0Var.f15074c = null;
        SystemClock.elapsedRealtime();
        bz1 bz1Var = this.f15160b;
        bz1Var.getClass();
        if (this.f15164f) {
            bz1Var.d(this.f15159a, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                bz1Var.e(this.f15159a);
                return;
            } catch (RuntimeException e2) {
                ls.H("LoadTask", "Unexpected exception handling load completed", e2);
                this.f15165h.f15075d = new t(e2);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f15161c = iOException;
        int i12 = this.f15162d;
        this.f15162d = i12 + 1;
        xy1 xy1Var = this.f15159a;
        Uri uri = xy1Var.f18574b.f16880b;
        cy1 cy1Var = new cy1();
        String str = bq0.f9768a;
        if ((iOException instanceof ua) || (iOException instanceof FileNotFoundException) || (iOException instanceof pg1) || (iOException instanceof t)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof x91) && ((x91) cause).f18331a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min(i12 * 1000, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
        if (jMin == -9223372036854775807L) {
            oVar = pq0.g;
        } else {
            int iU = bz1Var.u();
            int i13 = iU > bz1Var.L ? 1 : 0;
            if (bz1Var.H || !((m2Var = bz1Var.f9884z) == null || m2Var.b() == -9223372036854775807L)) {
                bz1Var.L = iU;
            } else {
                boolean z3 = bz1Var.f9880v;
                if (!z3 || bz1Var.q()) {
                    bz1Var.E = z3;
                    bz1Var.I = 0L;
                    bz1Var.L = 0;
                    for (hz1 hz1Var : bz1Var.f9877s) {
                        hz1Var.l(false);
                    }
                    xy1Var.f18578f.f9923a = 0L;
                    xy1Var.f18580i = 0L;
                    i10 = 1;
                    xy1Var.f18579h = true;
                    xy1Var.f18582l = false;
                } else {
                    bz1Var.K = true;
                    oVar = pq0.f15071f;
                }
            }
            oVar = new o(i13, jMin);
        }
        int i14 = oVar.f14493a;
        int i15 = (i14 == 0 || i14 == i10) ? i10 : 0;
        l90 l90Var = bz1Var.f9864d;
        l90Var.z(new aw0(l90Var, cy1Var, new a0.c0(-1, null, bq0.r(xy1Var.f18580i), bq0.r(bz1Var.A)), iOException, i15 ^ 1));
        int i16 = oVar.f14493a;
        if (i16 == 3) {
            pq0Var.f15075d = this.f15161c;
            return;
        }
        if (i16 != 2) {
            if (i16 == 1) {
                this.f15162d = 1;
            }
            long jMin2 = oVar.f14494b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.f15162d - 1) * 1000, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
            }
            pq0 pq0Var2 = this.f15165h;
            mq0.c0(((q) pq0Var2.f15074c) == null);
            pq0Var2.f15074c = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            synchronized (this) {
                z3 = this.f15164f;
                this.f15163e = Thread.currentThread();
            }
            if (!z3) {
                xy1 xy1Var = this.f15159a;
                String simpleName = xy1Var.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    xy1Var.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f15163e = null;
                Thread.interrupted();
            }
            if (this.g) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.g) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (Exception e10) {
            if (this.g) {
                return;
            }
            ls.H("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new t(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.g) {
                return;
            }
            ls.H("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(3, new t(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.g) {
                ls.H("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
