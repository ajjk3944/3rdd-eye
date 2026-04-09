package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class je implements me {

    /* renamed from: r, reason: collision with root package name */
    public static je f12722r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12723a;

    /* renamed from: b, reason: collision with root package name */
    public final aw f12724b;

    /* renamed from: c, reason: collision with root package name */
    public final aw0 f12725c;

    /* renamed from: d, reason: collision with root package name */
    public final dw0 f12726d;

    /* renamed from: e, reason: collision with root package name */
    public final bf f12727e;

    /* renamed from: f, reason: collision with root package name */
    public final gv0 f12728f;
    public final Executor g;

    /* renamed from: h, reason: collision with root package name */
    public final fg f12729h;

    /* renamed from: i, reason: collision with root package name */
    public final w5 f12730i;

    /* renamed from: k, reason: collision with root package name */
    public final nf f12731k;

    /* renamed from: l, reason: collision with root package name */
    public final o1 f12732l;

    /* renamed from: m, reason: collision with root package name */
    public final g8 f12733m;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f12736p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f12737q;

    /* renamed from: n, reason: collision with root package name */
    public volatile long f12734n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Object f12735o = new Object();
    public final CountDownLatch j = new CountDownLatch(1);

    public je(Context context, gv0 gv0Var, aw awVar, aw0 aw0Var, dw0 dw0Var, bf bfVar, Executor executor, fv0 fv0Var, fg fgVar, nf nfVar, o1 o1Var, g8 g8Var) {
        this.f12737q = false;
        this.f12723a = context;
        this.f12728f = gv0Var;
        this.f12724b = awVar;
        this.f12725c = aw0Var;
        this.f12726d = dw0Var;
        this.f12727e = bfVar;
        this.g = executor;
        this.f12729h = fgVar;
        this.f12731k = nfVar;
        this.f12732l = o1Var;
        this.f12733m = g8Var;
        this.f12737q = false;
        this.f12730i = new w5(this, fv0Var);
    }

    public static synchronized je m(Context context, ExecutorService executorService, iv0 iv0Var, boolean z3) {
        try {
            if (f12722r == null) {
                gv0 gv0VarA = gv0.a(context, executorService, z3);
                pk pkVar = sk.f16038a4;
                va.s sVar = va.s.f36163e;
                te teVarA = ((Boolean) sVar.f36166c.a(pkVar)).booleanValue() ? te.a(context) : null;
                nf nfVarA = ((Boolean) sVar.f36166c.a(sk.f16055b4)).booleanValue() ? nf.a(context, executorService) : null;
                o1 o1Var = ((Boolean) sVar.f36166c.a(sk.f16178j3)).booleanValue() ? new o1() : null;
                g8 g8Var = ((Boolean) sVar.f36166c.a(sk.f16317s3)).booleanValue() ? new g8() : null;
                aw awVar = new aw(context, executorService, gv0VarA, new kv0());
                awVar.f9454e = Tasks.call(executorService, new go0(3, awVar)).addOnFailureListener(executorService, new ne0(17, awVar));
                af afVar = new af(context);
                bf bfVar = new bf(iv0Var, awVar, new lf(context, afVar), afVar, teVarA, nfVarA, o1Var, g8Var);
                fg fgVarO = yr1.o(context, gv0VarA);
                fv0 fv0Var = new fv0();
                je jeVar = new je(context, gv0VarA, new aw(context, fgVarO), new aw0(context, fgVarO, new mx0(8, gv0VarA), ((Boolean) sVar.f36166c.a(sk.T2)).booleanValue()), new dw0(context, bfVar, gv0VarA, fv0Var, false), bfVar, executorService, fv0Var, fgVarO, nfVarA, o1Var, g8Var);
                f12722r = jeVar;
                jeVar.j();
                f12722r.k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f12722r;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void a(int i4, int i10, int i11) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16200kd)).booleanValue() || (displayMetrics = this.f12723a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i4;
        float f11 = displayMetrics.density;
        float f12 = i10;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i11, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void b(MotionEvent motionEvent) {
        aw0 aw0VarB = this.f12726d.b();
        if (aw0VarB != null) {
            try {
                aw0VarB.h(motionEvent);
            } catch (bw0 e2) {
                this.f12728f.c(e2.f9817a, -1L, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String c(Context context, String str, View view, Activity activity) {
        nf nfVar = this.f12731k;
        if (nfVar != null && nfVar.f14285d) {
            nfVar.f14283b = System.currentTimeMillis();
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16178j3)).booleanValue()) {
            o1 o1Var = this.f12732l;
            o1Var.f14503h = o1Var.g;
            o1Var.g = SystemClock.uptimeMillis();
        }
        k();
        aw0 aw0VarB = this.f12726d.b();
        if (aw0VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strG = aw0VarB.g(context, str, view, activity);
        this.f12728f.e(PAGErrorCode.LOAD_FACTORY_NULL_CODE, System.currentTimeMillis() - jCurrentTimeMillis, null, strG, null);
        return strG;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void e(StackTraceElement[] stackTraceElementArr) {
        g8 g8Var = this.f12733m;
        if (g8Var != null) {
            g8Var.f11399a = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String f(Context context) {
        nf nfVar = this.f12731k;
        if (nfVar != null && nfVar.f14285d) {
            nfVar.f14283b = System.currentTimeMillis();
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16178j3)).booleanValue()) {
            o1 o1Var = this.f12732l;
            o1Var.f14498b = o1Var.f14497a;
            o1Var.f14497a = SystemClock.uptimeMillis();
        }
        k();
        aw0 aw0VarB = this.f12726d.b();
        if (aw0VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strB = aw0VarB.b(context);
        this.f12728f.e(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strB, null);
        return strB;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void g(View view) {
        this.f12727e.f9665c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String i(Context context, View view, Activity activity) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        nf nfVar = this.f12731k;
        if (nfVar != null && nfVar.f14285d) {
            nfVar.f14283b = System.currentTimeMillis();
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16178j3)).booleanValue()) {
            this.f12732l.b(context, view);
        }
        k();
        aw0 aw0VarB = this.f12726d.b();
        if (aw0VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = aw0VarB.e(context, view, activity);
        this.f12728f.e(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strE, null);
        return strE;
    }

    public final synchronized void j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        xv0 xv0VarN = n();
        if (xv0VarN == null) {
            this.f12728f.b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f12726d.a(xv0VarN)) {
            this.f12737q = true;
            this.j.countDown();
        }
    }

    public final void k() {
        if (this.f12736p) {
            return;
        }
        synchronized (this.f12735o) {
            try {
                if (!this.f12736p) {
                    if ((System.currentTimeMillis() / 1000) - this.f12734n < 3600) {
                        return;
                    }
                    xv0 xv0VarC = this.f12726d.c();
                    if ((xv0VarC == null || xv0VarC.f18515a.C() - (System.currentTimeMillis() / 1000) < 3600) && yr1.j(this.f12729h)) {
                        this.g.execute(new s(3, this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        String strA;
        String strB;
        int length;
        xv0 xv0VarN;
        kg kgVar;
        boolean zI;
        long jCurrentTimeMillis = System.currentTimeMillis();
        xv0 xv0VarN2 = n();
        if (xv0VarN2 != null) {
            strA = xv0VarN2.f18515a.A();
            strB = xv0VarN2.f18515a.B();
        } else {
            strA = null;
            strB = null;
        }
        try {
            try {
                Context context = this.f12723a;
                fg fgVar = this.f12729h;
                gv0 gv0Var = this.f12728f;
                zv0 zv0VarC = yo0.c(context, fgVar, strA, strB, gv0Var);
                byte[] bArr = zv0VarC.f19190b;
                if (bArr == null || (length = bArr.length) == 0) {
                    gv0Var.b(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zm1 zm1VarV = bn1.v(0, length, bArr);
                        jn1 jn1Var = jn1.f12801a;
                        int i4 = um1.f17262a;
                        gg ggVarD = gg.D(zm1VarV, jn1.f12802b);
                        if (ggVarD.A().A().isEmpty() || ggVarD.A().B().isEmpty() || ggVarD.C().y().length == 0 || ((xv0VarN = n()) != null && (kgVar = xv0VarN.f18515a) != null && ggVarD.A().A().equals(kgVar.A()) && ggVarD.A().B().equals(kgVar.B()))) {
                            this.f12728f.b(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            w5 w5Var = this.f12730i;
                            int i10 = zv0VarC.f19191c;
                            if (!((Boolean) va.s.f36163e.f36166c.a(sk.R2)).booleanValue()) {
                                zI = this.f12724b.i(ggVarD, w5Var);
                            } else if (i10 == 3) {
                                zI = this.f12725c.f(ggVarD);
                            } else {
                                if (i10 == 4) {
                                    zI = this.f12725c.d(ggVarD, w5Var);
                                }
                                this.f12728f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zI) {
                                xv0 xv0VarN3 = n();
                                if (xv0VarN3 != null) {
                                    if (this.f12726d.a(xv0VarN3)) {
                                        this.f12737q = true;
                                    }
                                    this.f12734n = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.f12728f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.f12728f.b(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (ao1 e2) {
                this.f12728f.c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e2);
            }
            this.j.countDown();
        } catch (Throwable th2) {
            this.j.countDown();
            throw th2;
        }
    }

    public final xv0 n() {
        if (yr1.j(this.f12729h)) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.R2)).booleanValue()) {
                aw0 aw0Var = this.f12725c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (aw0.f9455f) {
                    try {
                        kg kgVarR = aw0Var.r(1);
                        if (kgVarR == null) {
                            aw0Var.p(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileJ = aw0Var.j(kgVarR.A());
                        File file = new File(fileJ, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileJ, "pcam");
                        }
                        File file2 = new File(fileJ, "pcbc");
                        File file3 = new File(fileJ, "pcopt");
                        aw0Var.p(5016, jCurrentTimeMillis);
                        return new xv0(kgVarR, file, file2, file3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            aw awVar = this.f12724b;
            kg kgVarR2 = awVar.r(1);
            if (kgVarR2 != null) {
                String strA = kgVarR2.A();
                File fileB = mq0.b(strA, "pcam.jar", awVar.u());
                if (!fileB.exists()) {
                    fileB = mq0.b(strA, "pcam", awVar.u());
                }
                return new xv0(kgVarR2, fileB, mq0.b(strA, "pcbc", awVar.u()), mq0.b(strA, "pcopt", awVar.u()));
            }
        }
        return null;
    }
}
