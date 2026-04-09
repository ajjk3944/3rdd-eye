package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class r extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final DQ f16434a;

    /* renamed from: b, reason: collision with root package name */
    public HQ f16435b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f16436c;

    /* renamed from: d, reason: collision with root package name */
    public int f16437d;

    /* renamed from: e, reason: collision with root package name */
    public Thread f16438e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16439f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f16440g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1338iu f16441h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1338iu c1338iu, Looper looper, DQ dq, HQ hq, long j6) {
        super(looper);
        Objects.requireNonNull(c1338iu);
        this.f16441h = c1338iu;
        this.f16434a = dq;
        this.f16435b = hq;
    }

    public final void a(boolean z6) {
        this.f16440g = z6;
        this.f16436c = null;
        if (hasMessages(1)) {
            this.f16439f = true;
            removeMessages(1);
            if (!z6) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f16439f = true;
                    this.f16434a.f7775g = true;
                    Thread thread = this.f16438e;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z6) {
            this.f16441h.f14823c = null;
            SystemClock.elapsedRealtime();
            HQ hq = this.f16435b;
            hq.getClass();
            hq.d(this.f16434a, true);
            this.f16435b = null;
        }
    }

    public final void b() {
        C1319iQ c1319iQ;
        SystemClock.elapsedRealtime();
        HQ hq = this.f16435b;
        hq.getClass();
        int i = this.f16437d;
        DQ dq = this.f16434a;
        C1205gK c1205gK = dq.f7770b;
        if (i == 0) {
            Uri uri = dq.f7777j.f11361a;
            Map map = Collections.EMPTY_MAP;
            c1319iQ = new C1319iQ();
        } else {
            Uri uri2 = c1205gK.f14260b;
            c1319iQ = new C1319iQ();
        }
        C2233zP c2233zP = hq.f8950d;
        c2233zP.a(new C1728q5(c2233zP, c1319iQ, new C1587nQ(-1, null, Vt.r(dq.i), Vt.r(hq.f8934O)), i));
        this.f16436c = null;
        C1338iu c1338iu = this.f16441h;
        r rVar = (r) c1338iu.f14823c;
        rVar.getClass();
        ((ExecutorC2099x) c1338iu.f14822b).execute(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        C1668p c1668p;
        L0 l02;
        if (this.f16440g) {
            return;
        }
        int i = message.what;
        int i3 = 1;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        C1338iu c1338iu = this.f16441h;
        c1338iu.f14823c = null;
        SystemClock.elapsedRealtime();
        HQ hq = this.f16435b;
        hq.getClass();
        if (this.f16439f) {
            hq.d(this.f16434a, false);
            return;
        }
        int i6 = message.what;
        if (i6 == 2) {
            try {
                hq.e(this.f16434a);
                return;
            } catch (RuntimeException e6) {
                AbstractC2022vd.K("LoadTask", "Unexpected exception handling load completed", e6);
                this.f16441h.f14824d = new C1937u(e6);
                return;
            }
        }
        if (i6 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f16436c = iOException;
        int i7 = this.f16437d;
        this.f16437d = i7 + 1;
        DQ dq = this.f16434a;
        Uri uri = dq.f7770b.f14260b;
        C1319iQ c1319iQ = new C1319iQ();
        String str = Vt.f12096a;
        if ((iOException instanceof P4) || (iOException instanceof FileNotFoundException) || (iOException instanceof BH) || (iOException instanceof C1937u)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C1359jE) && ((C1359jE) cause).f14918a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min(i7 * TTAdConstant.STYLE_SIZE_RADIO_1_1, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
        if (jMin == -9223372036854775807L) {
            c1668p = C1338iu.f14820g;
        } else {
            int iW = hq.w();
            int i8 = iW > hq.f8945Z ? 1 : 0;
            if (hq.f8941V || !((l02 = hq.f8933N) == null || l02.a() == -9223372036854775807L)) {
                hq.f8945Z = iW;
            } else {
                boolean z6 = hq.f8930J;
                if (!z6 || hq.q()) {
                    hq.f8938S = z6;
                    hq.f8942W = 0L;
                    hq.f8945Z = 0;
                    for (LQ lq : hq.f8927G) {
                        lq.l(false);
                    }
                    dq.f7774f.f6910a = 0L;
                    dq.i = 0L;
                    i3 = 1;
                    dq.f7776h = true;
                    dq.f7779l = false;
                } else {
                    hq.f8944Y = true;
                    c1668p = C1338iu.f14819f;
                }
            }
            c1668p = new C1668p(i8, jMin);
        }
        int i9 = c1668p.f16088a;
        int i10 = (i9 == 0 || i9 == i3) ? i3 : 0;
        C2233zP c2233zP = hq.f8950d;
        c2233zP.a(new Ww(c2233zP, c1319iQ, new C1587nQ(-1, null, Vt.r(dq.i), Vt.r(hq.f8934O)), iOException, i10 ^ 1));
        int i11 = c1668p.f16088a;
        if (i11 == 3) {
            c1338iu.f14824d = this.f16436c;
            return;
        }
        if (i11 != 2) {
            if (i11 == 1) {
                this.f16437d = 1;
            }
            long jMin2 = c1668p.f16089b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.f16437d - 1) * TTAdConstant.STYLE_SIZE_RADIO_1_1, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
            }
            C1338iu c1338iu2 = this.f16441h;
            AbstractC0582Jp.h0(((r) c1338iu2.f14823c) == null);
            c1338iu2.f14823c = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            synchronized (this) {
                z6 = this.f16439f;
                this.f16438e = Thread.currentThread();
            }
            if (!z6) {
                DQ dq = this.f16434a;
                String simpleName = dq.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    dq.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f16438e = null;
                Thread.interrupted();
            }
            if (this.f16440g) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e6) {
            if (this.f16440g) {
                return;
            }
            obtainMessage(3, e6).sendToTarget();
        } catch (Exception e7) {
            if (this.f16440g) {
                return;
            }
            AbstractC2022vd.K("LoadTask", "Unexpected exception loading stream", e7);
            obtainMessage(3, new C1937u(e7)).sendToTarget();
        } catch (OutOfMemoryError e8) {
            if (this.f16440g) {
                return;
            }
            AbstractC2022vd.K("LoadTask", "OutOfMemory error loading stream", e8);
            obtainMessage(3, new C1937u(e8)).sendToTarget();
        } catch (Error e9) {
            if (!this.f16440g) {
                AbstractC2022vd.K("LoadTask", "Unexpected error loading stream", e9);
                obtainMessage(4, e9).sendToTarget();
            }
            throw e9;
        }
    }
}
