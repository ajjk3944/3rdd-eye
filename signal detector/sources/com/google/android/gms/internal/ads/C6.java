package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q2.C2841s;

/* loaded from: classes.dex */
public final class C6 implements F6 {

    /* renamed from: F, reason: collision with root package name */
    public static C6 f7527F;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f7529D;

    /* renamed from: E, reason: collision with root package name */
    public volatile boolean f7530E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7531a;

    /* renamed from: b, reason: collision with root package name */
    public final C1431kf f7532b;

    /* renamed from: c, reason: collision with root package name */
    public final Ww f7533c;

    /* renamed from: d, reason: collision with root package name */
    public final Zw f7534d;

    /* renamed from: e, reason: collision with root package name */
    public final T6 f7535e;

    /* renamed from: f, reason: collision with root package name */
    public final Cw f7536f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f7537g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC1945u7 f7538h;
    public final C1994v2 i;

    /* renamed from: k, reason: collision with root package name */
    public final C1028d7 f7540k;

    /* renamed from: l, reason: collision with root package name */
    public final C1453l0 f7541l;

    /* renamed from: m, reason: collision with root package name */
    public final F3 f7542m;

    /* renamed from: n, reason: collision with root package name */
    public volatile long f7543n = 0;

    /* renamed from: C, reason: collision with root package name */
    public final Object f7528C = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final CountDownLatch f7539j = new CountDownLatch(1);

    public C6(Context context, Cw cw, C1431kf c1431kf, Ww ww, Zw zw, T6 t6, Executor executor, Bw bw, EnumC1945u7 enumC1945u7, C1028d7 c1028d7, C1453l0 c1453l0, F3 f32) {
        this.f7530E = false;
        this.f7531a = context;
        this.f7536f = cw;
        this.f7532b = c1431kf;
        this.f7533c = ww;
        this.f7534d = zw;
        this.f7535e = t6;
        this.f7537g = executor;
        this.f7538h = enumC1945u7;
        this.f7540k = c1028d7;
        this.f7541l = c1453l0;
        this.f7542m = f32;
        this.f7530E = false;
        this.i = new C1994v2(this, bw);
    }

    public static synchronized C6 m(Context context, ExecutorService executorService, Ew ew, boolean z6) {
        try {
            if (f7527F == null) {
                Cw cwA = Cw.a(context, executorService, z6);
                E9 e9 = H9.f8712a4;
                C2841s c2841s = C2841s.f23267e;
                L6 l6J = ((Boolean) c2841s.f23270c.a(e9)).booleanValue() ? L6.j(context) : null;
                C1028d7 c1028d7A = ((Boolean) c2841s.f23270c.a(H9.f8718b4)).booleanValue() ? C1028d7.a(context, executorService) : null;
                C1453l0 c1453l0 = ((Boolean) c2841s.f23270c.a(H9.f8766j3)).booleanValue() ? new C1453l0() : null;
                F3 f32 = ((Boolean) c2841s.f23270c.a(H9.f8826s3)).booleanValue() ? new F3() : null;
                C1431kf c1431kfE = C1431kf.e(context, executorService, cwA);
                S6 s6 = new S6(context);
                T6 t6 = new T6(ew, c1431kfE, new ViewOnAttachStateChangeListenerC0919b7(context, s6), s6, l6J, c1028d7A, c1453l0, f32);
                EnumC1945u7 enumC1945u7P = C1476lN.p(context, cwA);
                Bw bw = new Bw();
                C6 c6 = new C6(context, cwA, new C1431kf(context, enumC1945u7P), new Ww(context, enumC1945u7P, new C1283hr(6, cwA), ((Boolean) c2841s.f23270c.a(H9.f8674T2)).booleanValue()), new Zw(context, t6, cwA, bw, false), t6, executorService, bw, enumC1945u7P, c1028d7A, c1453l0, f32);
                f7527F = c6;
                c6.j();
                f7527F.k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7527F;
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void a(int i, int i3, int i6) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.id)).booleanValue() || (displayMetrics = this.f7531a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f2 = i;
        float f5 = displayMetrics.density;
        float f6 = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f2 * f5, f6 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain);
        motionEventObtain.recycle();
        float f7 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f2 * f7, f6 * f7, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain2);
        motionEventObtain2.recycle();
        float f8 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i6, 1, f2 * f8, f6 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void b(MotionEvent motionEvent) {
        Ww wwB = this.f7534d.b();
        if (wwB != null) {
            try {
                wwB.h(motionEvent);
            } catch (Xw e6) {
                this.f7536f.c(e6.f12520a, -1L, e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String c(Context context, String str, View view, Activity activity) {
        C1028d7 c1028d7 = this.f7540k;
        if (c1028d7 != null && c1028d7.f13731d) {
            c1028d7.f13729b = System.currentTimeMillis();
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8766j3)).booleanValue()) {
            C1453l0 c1453l0 = this.f7541l;
            c1453l0.f15329h = c1453l0.f15328g;
            c1453l0.f15328g = SystemClock.uptimeMillis();
        }
        k();
        Ww wwB = this.f7534d.b();
        if (wwB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strG = wwB.g(context, str, view, activity);
        this.f7536f.e(PAGErrorCode.LOAD_FACTORY_NULL_CODE, System.currentTimeMillis() - jCurrentTimeMillis, null, strG, null);
        return strG;
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String d(Context context, View view, String str) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String e(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void f(StackTraceElement[] stackTraceElementArr) {
        F3 f32 = this.f7542m;
        if (f32 != null) {
            f32.f8064a = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String g(Context context) {
        C1028d7 c1028d7 = this.f7540k;
        if (c1028d7 != null && c1028d7.f13731d) {
            c1028d7.f13729b = System.currentTimeMillis();
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8766j3)).booleanValue()) {
            C1453l0 c1453l0 = this.f7541l;
            c1453l0.f15323b = c1453l0.f15322a;
            c1453l0.f15322a = SystemClock.uptimeMillis();
        }
        k();
        Ww wwB = this.f7534d.b();
        if (wwB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = wwB.c(context);
        this.f7536f.e(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strC, null);
        return strC;
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void h(View view) {
        this.f7535e.f11343c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String i(Context context, View view, Activity activity) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C1028d7 c1028d7 = this.f7540k;
        if (c1028d7 != null && c1028d7.f13731d) {
            c1028d7.f13729b = System.currentTimeMillis();
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8766j3)).booleanValue()) {
            this.f7541l.b(context, view);
        }
        k();
        Ww wwB = this.f7534d.b();
        if (wwB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = wwB.e(context, view, activity);
        this.f7536f.e(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strE, null);
        return strE;
    }

    public final synchronized void j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Tw twN = n();
        if (twN == null) {
            this.f7536f.b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f7534d.a(twN)) {
            this.f7530E = true;
            this.f7539j.countDown();
        }
    }

    public final void k() {
        if (this.f7529D) {
            return;
        }
        synchronized (this.f7528C) {
            try {
                if (!this.f7529D) {
                    if ((System.currentTimeMillis() / 1000) - this.f7543n < 3600) {
                        return;
                    }
                    Tw twC = this.f7534d.c();
                    if ((twC == null || twC.f11509a.C() - (System.currentTimeMillis() / 1000) < 3600) && C1476lN.i(this.f7538h)) {
                        this.f7537g.execute(new RunnableC1883t(4, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        String strA;
        String strB;
        int length;
        Tw twN;
        C2215z7 c2215z7;
        boolean zJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Tw twN2 = n();
        if (twN2 != null) {
            strA = twN2.f11509a.A();
            strB = twN2.f11509a.B();
        } else {
            strA = null;
            strB = null;
        }
        try {
            try {
                Context context = this.f7531a;
                EnumC1945u7 enumC1945u7 = this.f7538h;
                Cw cw = this.f7536f;
                Vw vwC = AbstractC1984ut.c(context, enumC1945u7, strA, strB, cw);
                byte[] bArr = vwC.f12113b;
                if (bArr == null || (length = bArr.length) == 0) {
                    cw.b(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        OK okR = QK.r(0, length, bArr);
                        XK xk = XK.f12412a;
                        int i = JK.f9277a;
                        C1999v7 c1999v7D = C1999v7.D(okR, XK.f12413b);
                        if (c1999v7D.A().A().isEmpty() || c1999v7D.A().B().isEmpty() || c1999v7D.C().u().length == 0 || ((twN = n()) != null && (c2215z7 = twN.f11509a) != null && c1999v7D.A().A().equals(c2215z7.A()) && c1999v7D.A().B().equals(c2215z7.B()))) {
                            this.f7536f.b(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            C1994v2 c1994v2 = this.i;
                            int i3 = vwC.f12114c;
                            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8662R2)).booleanValue()) {
                                zJ = this.f7532b.j(c1999v7D, c1994v2);
                            } else if (i3 == 3) {
                                zJ = this.f7533c.f(c1999v7D);
                            } else {
                                if (i3 == 4) {
                                    zJ = this.f7533c.d(c1999v7D, c1994v2);
                                }
                                this.f7536f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zJ) {
                                Tw twN3 = n();
                                if (twN3 != null) {
                                    if (this.f7534d.a(twN3)) {
                                        this.f7530E = true;
                                    }
                                    this.f7543n = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.f7536f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.f7536f.b(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (C1636oL e6) {
                this.f7536f.c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e6);
            }
            this.f7539j.countDown();
        } catch (Throwable th) {
            this.f7539j.countDown();
            throw th;
        }
    }

    public final Tw n() {
        if (C1476lN.i(this.f7538h)) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8662R2)).booleanValue()) {
                Ww ww = this.f7533c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (Ww.f12343f) {
                    try {
                        C2215z7 c2215z7R = ww.r(1);
                        if (c2215z7R == null) {
                            ww.p(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileI = ww.i(c2215z7R.A());
                        File file = new File(fileI, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileI, "pcam");
                        }
                        File file2 = new File(fileI, "pcbc");
                        File file3 = new File(fileI, "pcopt");
                        ww.p(5016, jCurrentTimeMillis);
                        return new Tw(c2215z7R, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C1431kf c1431kf = this.f7532b;
            C2215z7 c2215z7R2 = c1431kf.r(1);
            if (c2215z7R2 != null) {
                String strA = c2215z7R2.A();
                File fileB = AbstractC0582Jp.b(strA, "pcam.jar", c1431kf.v());
                if (!fileB.exists()) {
                    fileB = AbstractC0582Jp.b(strA, "pcam", c1431kf.v());
                }
                return new Tw(c2215z7R2, fileB, AbstractC0582Jp.b(strA, "pcbc", c1431kf.v()), AbstractC0582Jp.b(strA, "pcopt", c1431kf.v()));
            }
        }
        return null;
    }
}
