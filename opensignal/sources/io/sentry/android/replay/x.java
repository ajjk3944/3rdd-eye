package io.sentry.android.replay;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.measurement.internal.zzr;
import h7.r1;
import io.sentry.b5;
import io.sentry.u0;
import io.sentry.x5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import zc.c1;
import zc.i1;
import zc.j0;
import zc.p3;
import zc.s3;
import zc.x2;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12032a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12033d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12034g;

    /* renamed from: r, reason: collision with root package name */
    public Object f12035r;

    /* renamed from: x, reason: collision with root package name */
    public Object f12036x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f12037y;

    public /* synthetic */ x(i1 i1Var, zzr zzrVar, Bundle bundle, zc.z zVar, String str) {
        this.f12032a = 1;
        this.f12033d = i1Var;
        this.f12034g = zzrVar;
        this.f12035r = bundle;
        this.f12036x = zVar;
        this.f12037y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        x2 x2Var;
        zc.x xVar;
        s3 s3Var;
        zc.x xVar2;
        switch (this.f12032a) {
            case 0:
                x5 x5Var = (x5) this.f12033d;
                if (!((AtomicBoolean) this.f12037y).get()) {
                    if (x5Var.getSessionReplay().f12083l) {
                        x5Var.getLogger().m(b5.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                        return;
                    }
                    return;
                }
                try {
                    if (x5Var.getSessionReplay().f12083l) {
                        x5Var.getLogger().m(b5.DEBUG, "Capturing a frame.", new Object[0]);
                    }
                    s sVar = (s) this.f12035r;
                    if (sVar != null) {
                        sVar.b();
                    }
                } catch (Throwable th2) {
                    x5Var.getLogger().g(b5.ERROR, "Failed to capture a frame", th2);
                }
                if (x5Var.getSessionReplay().f12083l) {
                    u0 logger = x5Var.getLogger();
                    b5 b5Var = b5.DEBUG;
                    StringBuilder sb2 = new StringBuilder("Posting the capture runnable again, frame rate is ");
                    t tVar = (t) this.f12036x;
                    logger.m(b5Var, h0.b.i(tVar != null ? tVar.f11989e : 1, " fps.", sb2), new Object[0]);
                }
                if (((Handler) ((r1) this.f12034g).f10199d).postDelayed(this, 1000 / (((t) this.f12036x) != null ? r4.f11989e : 1))) {
                    return;
                }
                x5Var.getLogger().m(b5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                return;
            case 1:
                i1 i1Var = (i1) this.f12033d;
                zzr zzrVar = (zzr) this.f12034g;
                Bundle bundle = (Bundle) this.f12035r;
                zc.z zVar = (zc.z) this.f12036x;
                String str = (String) this.f12037y;
                p3 p3Var = i1Var.f26968d;
                p3Var.w();
                try {
                    zVar.H(p3Var.a0(bundle, zzrVar));
                    return;
                } catch (RemoteException e4) {
                    p3Var.x().B.d(str, e4, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f12033d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            x2Var = (x2) this.f12037y;
                            xVar = x2Var.f27267x;
                        } catch (RemoteException e10) {
                            j0 j0Var = ((c1) ((x2) this.f12037y).f1504d).f26889y;
                            c1.g(j0Var);
                            j0Var.B.e("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f12034g, e10);
                            ((AtomicReference) this.f12033d).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f12033d;
                        }
                        if (xVar == null) {
                            j0 j0Var2 = ((c1) x2Var.f1504d).f26889y;
                            c1.g(j0Var2);
                            j0Var2.B.e("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f12034g, (String) this.f12035r);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(xVar.N((String) this.f12034g, (String) this.f12035r, (zzr) this.f12036x));
                        } else {
                            atomicReference2.set(xVar.o(null, (String) this.f12034g, (String) this.f12035r));
                        }
                        x2Var.F1();
                        atomicReference = (AtomicReference) this.f12033d;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f12033d).notify();
                        throw th3;
                    }
                }
            default:
                m0 m0Var = (m0) this.f12036x;
                String str2 = (String) this.f12034g;
                String str3 = (String) this.f12033d;
                x2 x2Var2 = (x2) this.f12037y;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        xVar2 = x2Var2.f27267x;
                    } catch (RemoteException e11) {
                        j0 j0Var3 = ((c1) x2Var2.f1504d).f26889y;
                        c1.g(j0Var3);
                        j0Var3.B.e("Failed to get conditional properties; remote exception", str3, str2, e11);
                    }
                    if (xVar2 != null) {
                        arrayList = s3.h2(xVar2.N(str3, str2, (zzr) this.f12035r));
                        x2Var2.F1();
                        s3Var = ((c1) x2Var2.f1504d).E;
                        c1.e(s3Var);
                        s3Var.g2(m0Var, arrayList);
                        return;
                    }
                    c1 c1Var = (c1) x2Var2.f1504d;
                    j0 j0Var4 = c1Var.f26889y;
                    c1.g(j0Var4);
                    j0Var4.B.d(str3, str2, "Failed to get conditional properties; not connected to service");
                    s3Var = c1Var.E;
                    c1.e(s3Var);
                    s3Var.g2(m0Var, arrayList);
                    return;
                } catch (Throwable th4) {
                    s3 s3Var2 = ((c1) x2Var2.f1504d).E;
                    c1.e(s3Var2);
                    s3Var2.g2(m0Var, arrayList);
                    throw th4;
                }
        }
    }

    public /* synthetic */ x(x2 x2Var, Serializable serializable, String str, Object obj, Object obj2, int i10) {
        this.f12032a = i10;
        this.f12033d = serializable;
        this.f12034g = str;
        this.f12035r = obj;
        this.f12036x = obj2;
        this.f12037y = x2Var;
    }

    public x(x5 x5Var, r1 r1Var) {
        this.f12032a = 0;
        br.l.e(r1Var, "mainLooperHandler");
        this.f12033d = x5Var;
        this.f12034g = r1Var;
        this.f12037y = new AtomicBoolean(true);
    }
}
