package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C2841s;

/* loaded from: classes.dex */
public final class G6 implements F6 {

    /* renamed from: L, reason: collision with root package name */
    public static volatile X6 f8288L = null;
    public static final Object M = new Object();

    /* renamed from: N, reason: collision with root package name */
    public static boolean f8289N = false;

    /* renamed from: O, reason: collision with root package name */
    public static long f8290O;

    /* renamed from: P, reason: collision with root package name */
    public static L6 f8291P;

    /* renamed from: Q, reason: collision with root package name */
    public static C1028d7 f8292Q;

    /* renamed from: R, reason: collision with root package name */
    public static C1453l0 f8293R;

    /* renamed from: S, reason: collision with root package name */
    public static C1338iu f8294S;

    /* renamed from: T, reason: collision with root package name */
    public static Nx f8295T;

    /* renamed from: C, reason: collision with root package name */
    public float f8296C;

    /* renamed from: D, reason: collision with root package name */
    public float f8297D;

    /* renamed from: G, reason: collision with root package name */
    public final DisplayMetrics f8300G;

    /* renamed from: H, reason: collision with root package name */
    public final F3 f8301H;

    /* renamed from: I, reason: collision with root package name */
    public final A1.w f8302I;

    /* renamed from: J, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC0919b7 f8303J;

    /* renamed from: K, reason: collision with root package name */
    public final HashMap f8304K;

    /* renamed from: a, reason: collision with root package name */
    public MotionEvent f8305a;

    /* renamed from: j, reason: collision with root package name */
    public double f8313j;

    /* renamed from: k, reason: collision with root package name */
    public double f8314k;

    /* renamed from: l, reason: collision with root package name */
    public double f8315l;

    /* renamed from: m, reason: collision with root package name */
    public float f8316m;

    /* renamed from: n, reason: collision with root package name */
    public float f8317n;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f8306b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public long f8307c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f8308d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f8309e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f8310f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f8311g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f8312h = 0;
    public long i = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8298E = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8299F = false;

    public G6(Context context, A1.w wVar) {
        try {
            AbstractC1998v6.a();
            this.f8300G = context.getResources().getDisplayMetrics();
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8826s3)).booleanValue()) {
                this.f8301H = new F3();
            }
        } catch (Throwable unused) {
        }
        this.f8304K = new HashMap();
        this.f8302I = wVar;
    }

    public static X6 p(Context context, boolean z6) {
        if (f8288L == null) {
            synchronized (M) {
                try {
                    if (f8288L == null) {
                        X6 x6A = X6.a(context, z6, f8295T);
                        if (x6A.f12387n) {
                            try {
                                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8691W3)).booleanValue()) {
                                    x6A.c("EG2NhqmkZH3IzxVQRUhlLPeSdGNOmVVMlZvdVRoPMeBX1YRu4M6S9HAWzARuGlrt", "rJ+3epX9GIWpiD23zEqB2nJ57HosctKKCexIQaNPOnU=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            x6A.c("mKTuB4d9zL2gk2O79XsYpNB+aKHwN1U9hkAKPABelEWUf6fdcG0P932Axqt06R0v", "IhWvFwVDz7+S2dgPUyZdbvNgcZm/v4DQbcD3M8nxqCg=", Context.class);
                            E9 e9 = H9.f8738e4;
                            C2841s c2841s = C2841s.f23267e;
                            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                                x6A.c("r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", new Class[0]);
                            }
                            x6A.c("BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", Context.class);
                            x6A.c("t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", Context.class);
                            x6A.c("1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", Context.class);
                            x6A.c("KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", Context.class);
                            Class cls = Boolean.TYPE;
                            x6A.c("Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", Context.class, cls);
                            x6A.c("WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", Context.class);
                            x6A.c("YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", Context.class);
                            x6A.c("VBBl/RSrrbh4NuoCpwv4Ff9uwlR+nIgvPASME/UcMSWtAZ4zziFv8sIkhiXD3JGh", "adtakVLQMMHz1yZrv+u5ZZiabjtFTP38FJEsPLAtvHE=", MotionEvent.class, DisplayMetrics.class);
                            x6A.c("cyl6+Nm7z/4AUMU9zZ2TYBK+lMXXrSwSgLNSZTdnB4C/ax/Gmzarui2kcSD53JXu", "gJiy+5nUzzsm5alaQ5ciO1Z43m3zAJgcxxPvmvUS+Vo=", MotionEvent.class, DisplayMetrics.class);
                            x6A.c("KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", new Class[0]);
                            x6A.c("R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", new Class[0]);
                            x6A.c("yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", new Class[0]);
                            x6A.c("FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", new Class[0]);
                            x6A.c("iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", new Class[0]);
                            x6A.c("WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", new Class[0]);
                            x6A.c("ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", Context.class, cls, String.class);
                            x6A.c("TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", StackTraceElement[].class);
                            x6A.c("FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", View.class, DisplayMetrics.class, cls, cls);
                            x6A.c("bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", Context.class, cls);
                            x6A.c("v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", View.class, Activity.class, cls);
                            x6A.c("X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", Long.TYPE);
                            x6A.c("x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", new Class[0]);
                            try {
                                if (((Boolean) c2841s.f23270c.a(H9.f8705Z3)).booleanValue()) {
                                    x6A.c("EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            x6A.c("9zQJNYPRQu7M2PxsR2X5pUd2hUmUxo++JOxzNqkh3zn646wyxpHEbvjQqLWoAge2", "vZPGoOEoDBpprn4Bn8baCi1LGHgj6zo4y/AsLq2W9n8=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8712a4)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        x6A.c("MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8826s3)).booleanValue()) {
                                    x6A.c("mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8766j3)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                x6A.c("uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.i3)).booleanValue()) {
                                        x6A.c("mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused5) {
                                }
                            }
                        }
                        f8288L = x6A;
                    }
                } finally {
                }
            }
        }
        return f8288L;
    }

    public static Y6 r(X6 x6, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws R6 {
        Method methodD = x6.d("VBBl/RSrrbh4NuoCpwv4Ff9uwlR+nIgvPASME/UcMSWtAZ4zziFv8sIkhiXD3JGh", "adtakVLQMMHz1yZrv+u5ZZiabjtFTP38FJEsPLAtvHE=");
        if (methodD == null || motionEvent == null) {
            throw new R6();
        }
        try {
            try {
                return new Y6((String) methodD.invoke(null, motionEvent, displayMetrics));
            } catch (InvocationTargetException e6) {
                e = e6;
                throw new R6(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e7) {
            e = e7;
        }
    }

    public static final void t(List list) throws InterruptedException {
        ExecutorService executorService;
        if (f8288L == null || (executorService = f8288L.f12376b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) C2841s.f23267e.f23270c.a(H9.f8737e3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            char[] cArr = Z6.f12791a;
            StringWriter stringWriter = new StringWriter();
            e6.printStackTrace(new PrintWriter(stringWriter));
            Log.d("G6", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final synchronized void a(int i, int i3, int i6) {
        try {
            if (this.f8305a != null) {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8717b3)).booleanValue()) {
                    o();
                } else {
                    this.f8305a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f8300G;
            if (displayMetrics != null) {
                float f2 = displayMetrics.density;
                this.f8305a = MotionEvent.obtain(0L, i6, 1, i * f2, i3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f8305a = null;
            }
            this.f8299F = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final synchronized void b(MotionEvent motionEvent) {
        Long l2;
        try {
            if (this.f8298E) {
                o();
                this.f8298E = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f8313j = 0.0d;
                this.f8314k = motionEvent.getRawX();
                this.f8315l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d6 = rawX - this.f8314k;
                double d7 = rawY - this.f8315l;
                this.f8313j += Math.sqrt((d7 * d7) + (d6 * d6));
                this.f8314k = rawX;
                this.f8315l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f8305a = motionEventObtain;
                        LinkedList linkedList = this.f8306b;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f8309e++;
                        this.f8311g = n(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f8308d += motionEvent.getHistorySize() + 1;
                        Y6 y6M = m(motionEvent);
                        Long l6 = y6M.f12590K;
                        if (l6 != null && y6M.f12592N != null) {
                            this.f8312h = l6.longValue() + y6M.f12592N.longValue() + this.f8312h;
                        }
                        if (this.f8300G != null && (l2 = y6M.f12591L) != null && y6M.f12593O != null) {
                            this.i = l2.longValue() + y6M.f12593O.longValue() + this.i;
                        }
                    } else if (action2 == 3) {
                        this.f8310f++;
                    }
                } catch (R6 unused) {
                }
            } else {
                this.f8316m = motionEvent.getX();
                this.f8317n = motionEvent.getY();
                this.f8296C = motionEvent.getRawX();
                this.f8297D = motionEvent.getRawY();
                this.f8307c++;
            }
            this.f8299F = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String c(Context context, String str, View view, Activity activity) {
        return q(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String d(Context context, View view, String str) {
        return q(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String e(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void f(StackTraceElement[] stackTraceElementArr) {
        F3 f32;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8826s3)).booleanValue() || (f32 = this.f8301H) == null) {
            return;
        }
        f32.f8064a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String g(Context context) {
        char[] cArr = Z6.f12791a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return q(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void h(View view) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8755h3)).booleanValue()) {
            if (this.f8303J == null) {
                X6 x6 = f8288L;
                this.f8303J = new ViewOnAttachStateChangeListenerC0919b7(x6.f12375a, x6.f12388o);
            }
            this.f8303J.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String i(Context context, View view, Activity activity) {
        return q(context, null, 2, view, activity);
    }

    public final S5 j(Context context) throws InterruptedException {
        long j6;
        C1028d7 c1028d7 = f8292Q;
        if (c1028d7 != null && c1028d7.f13731d) {
            c1028d7.f13729b = System.currentTimeMillis();
        }
        E9 e9 = H9.f8766j3;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            C1453l0 c1453l0 = f8293R;
            c1453l0.f15323b = c1453l0.f15322a;
            c1453l0.f15322a = SystemClock.uptimeMillis();
        }
        S5 s5C0 = C1136f6.C0();
        A1.w wVar = this.f8302I;
        String str = (String) wVar.f141d;
        if (!TextUtils.isEmpty(str)) {
            s5C0.b();
            ((C1136f6) s5C0.f13551b).F0(str);
        }
        X6 x6P = p(context, wVar.f140c);
        if (x6P.f12376b == null) {
            return s5C0;
        }
        int iE = x6P.e();
        ArrayList arrayList = new ArrayList();
        if (x6P.f12387n) {
            C1192g7 c1192g7 = new C1192g7(x6P, s5C0, iE, context, (O5) wVar.f139b, f8294S);
            int i = iE;
            arrayList.add(c1192g7);
            arrayList.add(new C1300i7(x6P, s5C0, f8290O, i));
            arrayList.add(new C1246h7(x6P, s5C0, i, 3));
            arrayList.add(new C1082e7(x6P, s5C0, i, context));
            arrayList.add(new C1246h7(x6P, s5C0, i, 4));
            arrayList.add(new C1137f7(x6P, s5C0, i, context));
            arrayList.add(new C1246h7(x6P, s5C0, i, 7));
            arrayList.add(new C1246h7(x6P, s5C0, i, 9));
            arrayList.add(new C1246h7(x6P, s5C0, i, 10));
            arrayList.add(new C1246h7(x6P, s5C0, i, 0));
            arrayList.add(new C1246h7(x6P, s5C0, i, 2));
            arrayList.add(new C1246h7(x6P, s5C0, i, 13));
            arrayList.add(new C1246h7(x6P, s5C0, i, 6));
            arrayList.add(new C1246h7(x6P, s5C0, i, 12));
            arrayList.add(new C1514m7(x6P, s5C0, i));
            if (Build.VERSION.SDK_INT >= 24 && ((Boolean) g92.a(H9.f8712a4)).booleanValue()) {
                C1028d7 c1028d72 = f8292Q;
                long j7 = -1;
                if (c1028d72 != null) {
                    long j8 = c1028d72.f13731d ? c1028d72.f13729b - c1028d72.f13728a : -1L;
                    long j9 = c1028d72.f13730c;
                    c1028d72.f13730c = -1L;
                    j7 = j8;
                    j6 = j9;
                } else {
                    j6 = -1;
                }
                C1460l7 c1460l7 = new C1460l7(x6P, s5C0, i, f8291P, j7, j6);
                i = i;
                arrayList.add(c1460l7);
            }
            if (((Boolean) g92.a(H9.f8705Z3)).booleanValue()) {
                arrayList.add(new C1246h7(x6P, s5C0, i, 11));
            }
            C1246h7 c1246h7 = new C1246h7(x6P, "9zQJNYPRQu7M2PxsR2X5pUd2hUmUxo++JOxzNqkh3zn646wyxpHEbvjQqLWoAge2", "vZPGoOEoDBpprn4Bn8baCi1LGHgj6zo4y/AsLq2W9n8=", s5C0, i, 76, 8);
            s5C0 = s5C0;
            arrayList.add(c1246h7);
            if (((Boolean) g92.a(H9.f8731d4)).booleanValue()) {
                arrayList.add(new C1246h7(x6P, s5C0, i, 5));
            }
            if (((Boolean) g92.a(H9.f8738e4)).booleanValue()) {
                C1246h7 c1246h72 = new C1246h7(x6P, "r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", s5C0, i, 82, 1);
                s5C0 = s5C0;
                arrayList.add(c1246h72);
            }
        } else {
            s5C0.h(16384L);
        }
        t(arrayList);
        return s5C0;
    }

    public final S5 k(Context context, View view, Activity activity) throws InterruptedException {
        C1028d7 c1028d7 = f8292Q;
        if (c1028d7 != null && c1028d7.f13731d) {
            c1028d7.f13729b = System.currentTimeMillis();
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8766j3)).booleanValue()) {
            C1453l0 c1453l0 = f8293R;
            c1453l0.f15329h = c1453l0.f15328g;
            c1453l0.f15328g = SystemClock.uptimeMillis();
        }
        S5 s5C0 = C1136f6.C0();
        A1.w wVar = this.f8302I;
        String str = (String) wVar.f141d;
        if (!TextUtils.isEmpty(str)) {
            s5C0.b();
            ((C1136f6) s5C0.f13551b).F0(str);
        }
        s(p(context, wVar.f140c), s5C0, view, activity, true, context);
        return s5C0;
    }

    public final S5 l(Context context, View view, Activity activity) throws IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
        C1028d7 c1028d7 = f8292Q;
        if (c1028d7 != null && c1028d7.f13731d) {
            c1028d7.f13729b = System.currentTimeMillis();
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8766j3)).booleanValue()) {
            f8293R.b(context, view);
        }
        S5 s5C0 = C1136f6.C0();
        A1.w wVar = this.f8302I;
        String str = (String) wVar.f141d;
        s5C0.b();
        ((C1136f6) s5C0.f13551b).F0(str);
        s(p(context, wVar.f140c), s5C0, view, activity, false, context);
        return s5C0;
    }

    public final Y6 m(MotionEvent motionEvent) throws R6 {
        Method methodD = f8288L.d("cyl6+Nm7z/4AUMU9zZ2TYBK+lMXXrSwSgLNSZTdnB4C/ax/Gmzarui2kcSD53JXu", "gJiy+5nUzzsm5alaQ5ciO1Z43m3zAJgcxxPvmvUS+Vo=");
        if (methodD == null || motionEvent == null) {
            throw new R6();
        }
        try {
            return new Y6((String) methodD.invoke(null, motionEvent, this.f8300G));
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new R6(e6);
        }
    }

    public final long n(StackTraceElement[] stackTraceElementArr) throws R6 {
        Method methodD = f8288L.d("TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new R6();
        }
        try {
            return new K6((String) methodD.invoke(null, stackTraceElementArr)).f9449I.longValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new R6(e6);
        }
    }

    public final void o() {
        this.f8311g = 0L;
        this.f8307c = 0L;
        this.f8308d = 0L;
        this.f8309e = 0L;
        this.f8310f = 0L;
        this.f8312h = 0L;
        this.i = 0L;
        LinkedList linkedList = this.f8306b;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f8305a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f8305a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.G6.q(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    public final void s(X6 x6, S5 s5, View view, Activity activity, boolean z6, Context context) throws InterruptedException {
        Context context2;
        C2841s c2841s;
        long j6;
        long j7;
        long j8;
        MotionEvent motionEvent;
        ArrayList arrayListAsList;
        int i = 1;
        if (x6.f12387n) {
            synchronized (this) {
                try {
                    try {
                        Y6 y6R = r(x6, this.f8305a, this.f8300G);
                        Long l2 = y6R.f12587H;
                        if (l2 != null) {
                            long jLongValue = l2.longValue();
                            s5.b();
                            ((C1136f6) s5.f13551b).L0(jLongValue);
                        }
                        Long l6 = y6R.f12588I;
                        if (l6 != null) {
                            long jLongValue2 = l6.longValue();
                            s5.b();
                            ((C1136f6) s5.f13551b).M0(jLongValue2);
                        }
                        Long l7 = y6R.f12589J;
                        if (l7 != null) {
                            long jLongValue3 = l7.longValue();
                            s5.b();
                            ((C1136f6) s5.f13551b).N0(jLongValue3);
                        }
                        if (this.f8299F) {
                            Long l8 = y6R.f12590K;
                            if (l8 != null) {
                                long jLongValue4 = l8.longValue();
                                s5.b();
                                ((C1136f6) s5.f13551b).G(jLongValue4);
                            }
                            Long l9 = y6R.f12591L;
                            if (l9 != null) {
                                long jLongValue5 = l9.longValue();
                                s5.b();
                                ((C1136f6) s5.f13551b).H(jLongValue5);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (R6 unused) {
                }
                C0918b6 c0918b6A = C0972c6.A();
                if (this.f8307c > 0) {
                    DisplayMetrics displayMetrics = this.f8300G;
                    char[] cArr = Z6.f12791a;
                    if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                        long jB = Z6.b(this.f8313j, displayMetrics);
                        c0918b6A.b();
                        ((C0972c6) c0918b6A.f13551b).M(jB);
                        long jB2 = Z6.b(this.f8296C - this.f8316m, this.f8300G);
                        c0918b6A.b();
                        ((C0972c6) c0918b6A.f13551b).N(jB2);
                        long jB3 = Z6.b(this.f8297D - this.f8317n, this.f8300G);
                        c0918b6A.b();
                        ((C0972c6) c0918b6A.f13551b).O(jB3);
                        long jB4 = Z6.b(this.f8316m, this.f8300G);
                        c0918b6A.b();
                        ((C0972c6) c0918b6A.f13551b).R(jB4);
                        long jB5 = Z6.b(this.f8317n, this.f8300G);
                        c0918b6A.b();
                        ((C0972c6) c0918b6A.f13551b).S(jB5);
                        if (this.f8299F && (motionEvent = this.f8305a) != null) {
                            long jB6 = Z6.b(((this.f8316m - this.f8296C) + motionEvent.getRawX()) - this.f8305a.getX(), this.f8300G);
                            if (jB6 != 0) {
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).P(jB6);
                            }
                            long jB7 = Z6.b(((this.f8317n - this.f8297D) + this.f8305a.getRawY()) - this.f8305a.getY(), this.f8300G);
                            if (jB7 != 0) {
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).Q(jB7);
                            }
                        }
                    }
                }
                try {
                    Y6 y6M = m(this.f8305a);
                    Long l10 = y6M.f12587H;
                    if (l10 != null) {
                        long jLongValue6 = l10.longValue();
                        c0918b6A.b();
                        ((C0972c6) c0918b6A.f13551b).B(jLongValue6);
                    }
                    Long l11 = y6M.f12588I;
                    if (l11 != null) {
                        long jLongValue7 = l11.longValue();
                        c0918b6A.b();
                        ((C0972c6) c0918b6A.f13551b).C(jLongValue7);
                    }
                    long jLongValue8 = y6M.f12589J.longValue();
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).I(jLongValue8);
                    if (this.f8299F) {
                        Long l12 = y6M.f12591L;
                        if (l12 != null) {
                            long jLongValue9 = l12.longValue();
                            c0918b6A.b();
                            ((C0972c6) c0918b6A.f13551b).D(jLongValue9);
                        }
                        Long l13 = y6M.f12590K;
                        if (l13 != null) {
                            long jLongValue10 = l13.longValue();
                            c0918b6A.b();
                            ((C0972c6) c0918b6A.f13551b).G(jLongValue10);
                        }
                        Long l14 = y6M.M;
                        if (l14 != null) {
                            int i3 = l14.longValue() != 0 ? 2 : 1;
                            c0918b6A.b();
                            ((C0972c6) c0918b6A.f13551b).T(i3);
                        }
                        long j9 = this.f8308d;
                        if (j9 > 0) {
                            DisplayMetrics displayMetrics2 = this.f8300G;
                            char[] cArr2 = Z6.f12791a;
                            Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.i / j9)) : null;
                            if (lValueOf != null) {
                                long jLongValue11 = lValueOf.longValue();
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).E(jLongValue11);
                            } else {
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).F();
                            }
                            long jRound = Math.round(this.f8312h / this.f8308d);
                            c0918b6A.b();
                            ((C0972c6) c0918b6A.f13551b).H(jRound);
                        }
                        Long l15 = y6M.f12594P;
                        if (l15 != null) {
                            long jLongValue12 = l15.longValue();
                            c0918b6A.b();
                            ((C0972c6) c0918b6A.f13551b).K(jLongValue12);
                        }
                        Long l16 = y6M.f12595Q;
                        if (l16 != null) {
                            long jLongValue13 = l16.longValue();
                            c0918b6A.b();
                            ((C0972c6) c0918b6A.f13551b).J(jLongValue13);
                        }
                        Long l17 = y6M.f12596R;
                        if (l17 != null) {
                            int i6 = l17.longValue() != 0 ? 2 : 1;
                            c0918b6A.b();
                            ((C0972c6) c0918b6A.f13551b).U(i6);
                        }
                    }
                } catch (R6 unused2) {
                }
                long j10 = this.f8311g;
                if (j10 > 0) {
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).L(j10);
                }
                C0972c6 c0972c6 = (C0972c6) c0918b6A.d();
                s5.b();
                ((C1136f6) s5.f13551b).T(c0972c6);
                long j11 = this.f8307c;
                if (j11 > 0) {
                    s5.b();
                    ((C1136f6) s5.f13551b).K(j11);
                }
                long j12 = this.f8308d;
                if (j12 > 0) {
                    s5.b();
                    ((C1136f6) s5.f13551b).J(j12);
                }
                long j13 = this.f8309e;
                if (j13 > 0) {
                    s5.b();
                    ((C1136f6) s5.f13551b).I(j13);
                }
                long j14 = this.f8310f;
                if (j14 > 0) {
                    s5.b();
                    ((C1136f6) s5.f13551b).L(j14);
                }
                try {
                    LinkedList linkedList = this.f8306b;
                    int size = linkedList.size() - 1;
                    if (size > 0) {
                        s5.b();
                        ((C1136f6) s5.f13551b).V();
                        for (int i7 = 0; i7 < size; i7++) {
                            Y6 y6R2 = r(f8288L, (MotionEvent) linkedList.get(i7), this.f8300G);
                            C0918b6 c0918b6A2 = C0972c6.A();
                            long jLongValue14 = y6R2.f12587H.longValue();
                            c0918b6A2.b();
                            ((C0972c6) c0918b6A2.f13551b).B(jLongValue14);
                            long jLongValue15 = y6R2.f12588I.longValue();
                            c0918b6A2.b();
                            ((C0972c6) c0918b6A2.f13551b).C(jLongValue15);
                            C0972c6 c0972c62 = (C0972c6) c0918b6A2.d();
                            s5.b();
                            ((C1136f6) s5.f13551b).U(c0972c62);
                        }
                    }
                } catch (R6 unused3) {
                    s5.b();
                    ((C1136f6) s5.f13551b).V();
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayListAsList = arrayList;
            if (x6.f12376b != null) {
                int iE = x6.e();
                E9 e9 = H9.f8819r3;
                C2841s c2841s2 = C2841s.f23267e;
                if (((Boolean) c2841s2.f23270c.a(e9)).booleanValue()) {
                    context2 = context;
                    arrayList.add(new C1192g7(x6, s5, iE, context, (O5) this.f8302I.f139b, f8294S));
                    arrayList.add(new C1137f7(x6, s5, iE, context2));
                    arrayList.add(new C1082e7(x6, s5, iE, context2));
                    arrayList.add(new C1246h7(x6, s5, iE, 4));
                    C1028d7 c1028d7 = f8292Q;
                    if (c1028d7 != null) {
                        if (c1028d7.f13731d) {
                            c2841s = c2841s2;
                            j8 = c1028d7.f13729b - c1028d7.f13728a;
                        } else {
                            c2841s = c2841s2;
                            j8 = -1;
                        }
                        long j15 = c1028d7.f13730c;
                        c1028d7.f13730c = -1L;
                        j7 = j8;
                        j6 = j15;
                    } else {
                        c2841s = c2841s2;
                        j6 = -1;
                        j7 = -1;
                    }
                    arrayList.add(new C1460l7(x6, s5, iE, f8291P, j7, j6));
                    arrayList.add(new C1246h7(x6, s5, iE, 11));
                } else {
                    context2 = context;
                    c2841s = c2841s2;
                }
                arrayList.add(new CallableC1890t6(x6, i, s5));
                arrayList.add(new C1246h7(x6, s5, iE, 3));
                arrayList.add(new C1300i7(x6, s5, f8290O, iE));
                arrayList.add(new C1246h7(x6, s5, iE, 0));
                arrayList.add(new C1246h7(x6, s5, iE, 9));
                arrayList.add(new C1246h7(x6, s5, iE, 10));
                arrayList.add(new C1246h7(x6, s5, iE, 2));
                arrayList.add(new C1246h7(x6, s5, iE, 7));
                arrayList.add(new C1246h7(x6, s5, iE, 13));
                arrayList.add(new C1246h7(x6, s5, iE, 6));
                arrayList.add(new C1246h7(x6, s5, iE, 12));
                arrayList.add(new C1352j7(x6, s5, iE, new Throwable().getStackTrace()));
                arrayList.add(new C1352j7(x6, s5, iE, view));
                arrayList.add(new C1514m7(x6, s5, iE));
                C2841s c2841s3 = c2841s;
                if (((Boolean) c2841s3.f23270c.a(H9.f8743f3)).booleanValue()) {
                    arrayList.add(new C1082e7(x6, s5, iE, view, activity));
                }
                if (((Boolean) c2841s3.f23270c.a(H9.f8731d4)).booleanValue()) {
                    arrayList.add(new C1246h7(x6, s5, iE, 5));
                }
                if (z6) {
                    arrayListAsList = arrayList;
                    if (((Boolean) c2841s3.f23270c.a(H9.f8755h3)).booleanValue()) {
                        arrayList.add(new C1568n7(x6, s5, iE, this.f8303J));
                        arrayListAsList = arrayList;
                    }
                } else {
                    try {
                        if (((Boolean) c2841s3.f23270c.a(H9.i3)).booleanValue()) {
                            arrayList.add(new C1406k7(x6, s5, iE, this.f8304K, view, context2));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8766j3)).booleanValue()) {
                            arrayList.add(new C1352j7(x6, s5, iE, f8293R));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    arrayListAsList = arrayList;
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8826s3)).booleanValue()) {
                        arrayList.add(new C1352j7(x6, s5, iE, this.f8301H));
                        arrayListAsList = arrayList;
                    }
                }
            }
        } else {
            s5.h(16384L);
            arrayListAsList = Arrays.asList(new CallableC1890t6(x6, i, s5));
        }
        t(arrayListAsList);
    }
}
