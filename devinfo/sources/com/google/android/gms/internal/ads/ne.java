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
import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ne implements me {
    public static long A = 0;
    public static te B = null;
    public static nf C = null;
    public static o1 D = null;
    public static be E = null;
    public static fk0 F = null;

    /* renamed from: x, reason: collision with root package name */
    public static volatile ff f14255x = null;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f14256y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static boolean f14257z = false;

    /* renamed from: a, reason: collision with root package name */
    public MotionEvent f14258a;
    public double j;

    /* renamed from: k, reason: collision with root package name */
    public double f14266k;

    /* renamed from: l, reason: collision with root package name */
    public double f14267l;

    /* renamed from: m, reason: collision with root package name */
    public float f14268m;

    /* renamed from: n, reason: collision with root package name */
    public float f14269n;

    /* renamed from: o, reason: collision with root package name */
    public float f14270o;

    /* renamed from: p, reason: collision with root package name */
    public float f14271p;

    /* renamed from: s, reason: collision with root package name */
    public final DisplayMetrics f14274s;

    /* renamed from: t, reason: collision with root package name */
    public final g8 f14275t;

    /* renamed from: u, reason: collision with root package name */
    public final m8.s f14276u;

    /* renamed from: v, reason: collision with root package name */
    public lf f14277v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f14278w;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f14259b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public long f14260c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f14261d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f14262e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f14263f = 0;
    public long g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f14264h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f14265i = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14272q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14273r = false;

    public ne(Context context, m8.s sVar) {
        try {
            de.a();
            this.f14274s = context.getResources().getDisplayMetrics();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16317s3)).booleanValue()) {
                this.f14275t = new g8();
            }
        } catch (Throwable unused) {
        }
        this.f14278w = new HashMap();
        this.f14276u = sVar;
    }

    public static ff p(Context context, boolean z3) {
        if (f14255x == null) {
            synchronized (f14256y) {
                try {
                    if (f14255x == null) {
                        ff ffVarA = ff.a(context, z3, F);
                        if (ffVarA.f11127n) {
                            try {
                                if (((Boolean) va.s.f36163e.f36166c.a(sk.W3)).booleanValue()) {
                                    ffVarA.c("EG2NhqmkZH3IzxVQRUhlLPeSdGNOmVVMlZvdVRoPMeBX1YRu4M6S9HAWzARuGlrt", "rJ+3epX9GIWpiD23zEqB2nJ57HosctKKCexIQaNPOnU=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            ffVarA.c("mKTuB4d9zL2gk2O79XsYpNB+aKHwN1U9hkAKPABelEWUf6fdcG0P932Axqt06R0v", "IhWvFwVDz7+S2dgPUyZdbvNgcZm/v4DQbcD3M8nxqCg=", Context.class);
                            pk pkVar = sk.f16103e4;
                            va.s sVar = va.s.f36163e;
                            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                                ffVarA.c("r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", new Class[0]);
                            }
                            ffVarA.c("BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", Context.class);
                            ffVarA.c("t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", Context.class);
                            ffVarA.c("1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", Context.class);
                            ffVarA.c("KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", Context.class);
                            Class cls = Boolean.TYPE;
                            ffVarA.c("Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", Context.class, cls);
                            ffVarA.c("WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", Context.class);
                            ffVarA.c("YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", Context.class);
                            ffVarA.c("VBBl/RSrrbh4NuoCpwv4Ff9uwlR+nIgvPASME/UcMSWtAZ4zziFv8sIkhiXD3JGh", "adtakVLQMMHz1yZrv+u5ZZiabjtFTP38FJEsPLAtvHE=", MotionEvent.class, DisplayMetrics.class);
                            ffVarA.c("cyl6+Nm7z/4AUMU9zZ2TYBK+lMXXrSwSgLNSZTdnB4C/ax/Gmzarui2kcSD53JXu", "gJiy+5nUzzsm5alaQ5ciO1Z43m3zAJgcxxPvmvUS+Vo=", MotionEvent.class, DisplayMetrics.class);
                            ffVarA.c("KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", new Class[0]);
                            ffVarA.c("R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", new Class[0]);
                            ffVarA.c("yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", new Class[0]);
                            ffVarA.c("FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", new Class[0]);
                            ffVarA.c("iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", new Class[0]);
                            ffVarA.c("WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", new Class[0]);
                            ffVarA.c("ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", Context.class, cls, String.class);
                            ffVarA.c("TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", StackTraceElement[].class);
                            ffVarA.c("FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", View.class, DisplayMetrics.class, cls, cls);
                            ffVarA.c("bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", Context.class, cls);
                            ffVarA.c("v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", View.class, Activity.class, cls);
                            ffVarA.c("X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", Long.TYPE);
                            ffVarA.c("x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", new Class[0]);
                            try {
                                if (((Boolean) sVar.f36166c.a(sk.Z3)).booleanValue()) {
                                    ffVarA.c("EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            ffVarA.c("9zQJNYPRQu7M2PxsR2X5pUd2hUmUxo++JOxzNqkh3zn646wyxpHEbvjQqLWoAge2", "vZPGoOEoDBpprn4Bn8baCi1LGHgj6zo4y/AsLq2W9n8=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16038a4)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        ffVarA.c("MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16317s3)).booleanValue()) {
                                    ffVarA.c("mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16178j3)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                ffVarA.c("uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16165i3)).booleanValue()) {
                                        ffVarA.c("mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused5) {
                                }
                            }
                        }
                        f14255x = ffVarA;
                    }
                } finally {
                }
            }
        }
        return f14255x;
    }

    public static gf r(ff ffVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws ze {
        Method methodD = ffVar.d("VBBl/RSrrbh4NuoCpwv4Ff9uwlR+nIgvPASME/UcMSWtAZ4zziFv8sIkhiXD3JGh", "adtakVLQMMHz1yZrv+u5ZZiabjtFTP38FJEsPLAtvHE=");
        if (methodD == null || motionEvent == null) {
            throw new ze();
        }
        try {
            try {
                return new gf((String) methodD.invoke(null, motionEvent, displayMetrics));
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new ze(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            e = e10;
        }
    }

    public static final void t(List list) throws InterruptedException {
        ExecutorService executorService;
        if (f14255x == null || (executorService = f14255x.f11117b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) va.s.f36163e.f36166c.a(sk.f16102e3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            char[] cArr = hf.f11849a;
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            Log.d("ne", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final synchronized void a(int i4, int i10, int i11) {
        try {
            if (this.f14258a != null) {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16054b3)).booleanValue()) {
                    o();
                } else {
                    this.f14258a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f14274s;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.f14258a = MotionEvent.obtain(0L, i11, 1, i4 * f10, i10 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f14258a = null;
            }
            this.f14273r = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final synchronized void b(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.f14272q) {
                o();
                this.f14272q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.j = 0.0d;
                this.f14266k = motionEvent.getRawX();
                this.f14267l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.f14266k;
                double d11 = rawY - this.f14267l;
                this.j += Math.sqrt((d11 * d11) + (d10 * d10));
                this.f14266k = rawX;
                this.f14267l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f14258a = motionEventObtain;
                        LinkedList linkedList = this.f14259b;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f14262e++;
                        this.g = n(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f14261d += motionEvent.getHistorySize() + 1;
                        gf gfVarM = m(motionEvent);
                        Long l11 = gfVarM.K;
                        if (l11 != null && gfVarM.N != null) {
                            this.f14264h = l11.longValue() + gfVarM.N.longValue() + this.f14264h;
                        }
                        if (this.f14274s != null && (l10 = gfVarM.L) != null && gfVarM.O != null) {
                            this.f14265i = l10.longValue() + gfVarM.O.longValue() + this.f14265i;
                        }
                    } else if (action2 == 3) {
                        this.f14263f++;
                    }
                } catch (ze unused) {
                }
            } else {
                this.f14268m = motionEvent.getX();
                this.f14269n = motionEvent.getY();
                this.f14270o = motionEvent.getRawX();
                this.f14271p = motionEvent.getRawY();
                this.f14260c++;
            }
            this.f14273r = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String c(Context context, String str, View view, Activity activity) {
        return q(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void e(StackTraceElement[] stackTraceElementArr) {
        g8 g8Var;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16317s3)).booleanValue() || (g8Var = this.f14275t) == null) {
            return;
        }
        g8Var.f11399a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String f(Context context) {
        char[] cArr = hf.f11849a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return q(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void g(View view) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16150h3)).booleanValue()) {
            if (this.f14277v == null) {
                ff ffVar = f14255x;
                this.f14277v = new lf(ffVar.f11116a, ffVar.f11128o);
            }
            this.f14277v.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String h(Context context, String str, View view) {
        return q(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String i(Context context, View view, Activity activity) {
        return q(context, null, 2, view, activity);
    }

    public final zc j(Context context) throws InterruptedException {
        long j;
        nf nfVar = C;
        if (nfVar != null && nfVar.f14285d) {
            nfVar.f14283b = System.currentTimeMillis();
        }
        pk pkVar = sk.f16178j3;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            o1 o1Var = D;
            o1Var.f14498b = o1Var.f14497a;
            o1Var.f14497a = SystemClock.uptimeMillis();
        }
        zc zcVarC0 = md.C0();
        m8.s sVar2 = this.f14276u;
        String str = (String) sVar2.f28983b;
        if (!TextUtils.isEmpty(str)) {
            zcVarC0.b();
            ((md) zcVarC0.f14755b).F0(str);
        }
        ff ffVarP = p(context, sVar2.f28982a);
        if (ffVarP.f11117b == null) {
            return zcVarC0;
        }
        int iE = ffVarP.e();
        ArrayList arrayList = new ArrayList();
        if (ffVarP.f11127n) {
            qf qfVar = new qf(ffVarP, zcVarC0, iE, context, (vc) sVar2.f28984c, E);
            int i4 = iE;
            arrayList.add(qfVar);
            arrayList.add(new sf(ffVarP, zcVarC0, A, i4));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 3));
            arrayList.add(new of(ffVarP, zcVarC0, i4, context));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 4));
            arrayList.add(new pf(ffVarP, zcVarC0, i4, context));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 7));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 9));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 10));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 0));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 2));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 13));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 6));
            arrayList.add(new rf(ffVarP, zcVarC0, i4, 12));
            arrayList.add(new wf(ffVarP, zcVarC0, i4));
            if (Build.VERSION.SDK_INT >= 24 && ((Boolean) rkVar2.a(sk.f16038a4)).booleanValue()) {
                nf nfVar2 = C;
                long j8 = -1;
                if (nfVar2 != null) {
                    long j9 = nfVar2.f14285d ? nfVar2.f14283b - nfVar2.f14282a : -1L;
                    long j10 = nfVar2.f14284c;
                    nfVar2.f14284c = -1L;
                    j8 = j9;
                    j = j10;
                } else {
                    j = -1;
                }
                vf vfVar = new vf(ffVarP, zcVarC0, i4, B, j8, j);
                i4 = i4;
                arrayList.add(vfVar);
            }
            if (((Boolean) rkVar2.a(sk.Z3)).booleanValue()) {
                arrayList.add(new rf(ffVarP, zcVarC0, i4, 11));
            }
            rf rfVar = new rf(ffVarP, "9zQJNYPRQu7M2PxsR2X5pUd2hUmUxo++JOxzNqkh3zn646wyxpHEbvjQqLWoAge2", "vZPGoOEoDBpprn4Bn8baCi1LGHgj6zo4y/AsLq2W9n8=", zcVarC0, i4, 76, 8);
            zcVarC0 = zcVarC0;
            arrayList.add(rfVar);
            if (((Boolean) rkVar2.a(sk.f16088d4)).booleanValue()) {
                arrayList.add(new rf(ffVarP, zcVarC0, i4, 5));
            }
            if (((Boolean) rkVar2.a(sk.f16103e4)).booleanValue()) {
                rf rfVar2 = new rf(ffVarP, "r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", zcVarC0, i4, 82, 1);
                zcVarC0 = zcVarC0;
                arrayList.add(rfVar2);
            }
        } else {
            zcVarC0.i(Http2Stream.EMIT_BUFFER_SIZE);
        }
        t(arrayList);
        return zcVarC0;
    }

    public final zc k(Context context, View view, Activity activity) throws InterruptedException {
        nf nfVar = C;
        if (nfVar != null && nfVar.f14285d) {
            nfVar.f14283b = System.currentTimeMillis();
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16178j3)).booleanValue()) {
            o1 o1Var = D;
            o1Var.f14503h = o1Var.g;
            o1Var.g = SystemClock.uptimeMillis();
        }
        zc zcVarC0 = md.C0();
        m8.s sVar = this.f14276u;
        String str = (String) sVar.f28983b;
        if (!TextUtils.isEmpty(str)) {
            zcVarC0.b();
            ((md) zcVarC0.f14755b).F0(str);
        }
        s(p(context, sVar.f28982a), zcVarC0, view, activity, true, context);
        return zcVarC0;
    }

    public final zc l(Context context, View view, Activity activity) throws IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
        nf nfVar = C;
        if (nfVar != null && nfVar.f14285d) {
            nfVar.f14283b = System.currentTimeMillis();
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16178j3)).booleanValue()) {
            D.b(context, view);
        }
        zc zcVarC0 = md.C0();
        m8.s sVar = this.f14276u;
        String str = (String) sVar.f28983b;
        zcVarC0.b();
        ((md) zcVarC0.f14755b).F0(str);
        s(p(context, sVar.f28982a), zcVarC0, view, activity, false, context);
        return zcVarC0;
    }

    public final gf m(MotionEvent motionEvent) throws ze {
        Method methodD = f14255x.d("cyl6+Nm7z/4AUMU9zZ2TYBK+lMXXrSwSgLNSZTdnB4C/ax/Gmzarui2kcSD53JXu", "gJiy+5nUzzsm5alaQ5ciO1Z43m3zAJgcxxPvmvUS+Vo=");
        if (methodD == null || motionEvent == null) {
            throw new ze();
        }
        try {
            return new gf((String) methodD.invoke(null, motionEvent, this.f14274s));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new ze(e2);
        }
    }

    public final long n(StackTraceElement[] stackTraceElementArr) throws ze {
        Method methodD = f14255x.d("TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new ze();
        }
        try {
            return new re((String) methodD.invoke(null, stackTraceElementArr)).I.longValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new ze(e2);
        }
    }

    public final void o() {
        this.g = 0L;
        this.f14260c = 0L;
        this.f14261d = 0L;
        this.f14262e = 0L;
        this.f14263f = 0L;
        this.f14264h = 0L;
        this.f14265i = 0L;
        LinkedList linkedList = this.f14259b;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f14258a;
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
        this.f14258a = null;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ne.q(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    public final void s(ff ffVar, zc zcVar, View view, Activity activity, boolean z3, Context context) throws InterruptedException {
        Context context2;
        va.s sVar;
        long j;
        long j8;
        long j9;
        MotionEvent motionEvent;
        ArrayList arrayListAsList;
        int i4 = 1;
        if (ffVar.f11127n) {
            synchronized (this) {
                try {
                    try {
                        gf gfVarR = r(ffVar, this.f14258a, this.f14274s);
                        Long l10 = gfVarR.H;
                        if (l10 != null) {
                            long jLongValue = l10.longValue();
                            zcVar.b();
                            ((md) zcVar.f14755b).L0(jLongValue);
                        }
                        Long l11 = gfVarR.I;
                        if (l11 != null) {
                            long jLongValue2 = l11.longValue();
                            zcVar.b();
                            ((md) zcVar.f14755b).M0(jLongValue2);
                        }
                        Long l12 = gfVarR.J;
                        if (l12 != null) {
                            long jLongValue3 = l12.longValue();
                            zcVar.b();
                            ((md) zcVar.f14755b).N0(jLongValue3);
                        }
                        if (this.f14273r) {
                            Long l13 = gfVarR.K;
                            if (l13 != null) {
                                long jLongValue4 = l13.longValue();
                                zcVar.b();
                                ((md) zcVar.f14755b).G(jLongValue4);
                            }
                            Long l14 = gfVarR.L;
                            if (l14 != null) {
                                long jLongValue5 = l14.longValue();
                                zcVar.b();
                                ((md) zcVar.f14755b).H(jLongValue5);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (ze unused) {
                }
                id idVarA = jd.A();
                if (this.f14260c > 0) {
                    DisplayMetrics displayMetrics = this.f14274s;
                    char[] cArr = hf.f11849a;
                    if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                        long jB = hf.b(this.j, displayMetrics);
                        idVarA.b();
                        ((jd) idVarA.f14755b).M(jB);
                        long jB2 = hf.b(this.f14270o - this.f14268m, this.f14274s);
                        idVarA.b();
                        ((jd) idVarA.f14755b).N(jB2);
                        long jB3 = hf.b(this.f14271p - this.f14269n, this.f14274s);
                        idVarA.b();
                        ((jd) idVarA.f14755b).O(jB3);
                        long jB4 = hf.b(this.f14268m, this.f14274s);
                        idVarA.b();
                        ((jd) idVarA.f14755b).R(jB4);
                        long jB5 = hf.b(this.f14269n, this.f14274s);
                        idVarA.b();
                        ((jd) idVarA.f14755b).S(jB5);
                        if (this.f14273r && (motionEvent = this.f14258a) != null) {
                            long jB6 = hf.b(((this.f14268m - this.f14270o) + motionEvent.getRawX()) - this.f14258a.getX(), this.f14274s);
                            if (jB6 != 0) {
                                idVarA.b();
                                ((jd) idVarA.f14755b).P(jB6);
                            }
                            long jB7 = hf.b(((this.f14269n - this.f14271p) + this.f14258a.getRawY()) - this.f14258a.getY(), this.f14274s);
                            if (jB7 != 0) {
                                idVarA.b();
                                ((jd) idVarA.f14755b).Q(jB7);
                            }
                        }
                    }
                }
                try {
                    gf gfVarM = m(this.f14258a);
                    Long l15 = gfVarM.H;
                    if (l15 != null) {
                        long jLongValue6 = l15.longValue();
                        idVarA.b();
                        ((jd) idVarA.f14755b).B(jLongValue6);
                    }
                    Long l16 = gfVarM.I;
                    if (l16 != null) {
                        long jLongValue7 = l16.longValue();
                        idVarA.b();
                        ((jd) idVarA.f14755b).C(jLongValue7);
                    }
                    long jLongValue8 = gfVarM.J.longValue();
                    idVarA.b();
                    ((jd) idVarA.f14755b).I(jLongValue8);
                    if (this.f14273r) {
                        Long l17 = gfVarM.L;
                        if (l17 != null) {
                            long jLongValue9 = l17.longValue();
                            idVarA.b();
                            ((jd) idVarA.f14755b).D(jLongValue9);
                        }
                        Long l18 = gfVarM.K;
                        if (l18 != null) {
                            long jLongValue10 = l18.longValue();
                            idVarA.b();
                            ((jd) idVarA.f14755b).G(jLongValue10);
                        }
                        Long l19 = gfVarM.M;
                        if (l19 != null) {
                            int i10 = l19.longValue() != 0 ? 2 : 1;
                            idVarA.b();
                            ((jd) idVarA.f14755b).T(i10);
                        }
                        long j10 = this.f14261d;
                        if (j10 > 0) {
                            DisplayMetrics displayMetrics2 = this.f14274s;
                            char[] cArr2 = hf.f11849a;
                            Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f14265i / j10)) : null;
                            if (lValueOf != null) {
                                long jLongValue11 = lValueOf.longValue();
                                idVarA.b();
                                ((jd) idVarA.f14755b).E(jLongValue11);
                            } else {
                                idVarA.b();
                                ((jd) idVarA.f14755b).F();
                            }
                            long jRound = Math.round(this.f14264h / this.f14261d);
                            idVarA.b();
                            ((jd) idVarA.f14755b).H(jRound);
                        }
                        Long l20 = gfVarM.P;
                        if (l20 != null) {
                            long jLongValue12 = l20.longValue();
                            idVarA.b();
                            ((jd) idVarA.f14755b).K(jLongValue12);
                        }
                        Long l21 = gfVarM.Q;
                        if (l21 != null) {
                            long jLongValue13 = l21.longValue();
                            idVarA.b();
                            ((jd) idVarA.f14755b).J(jLongValue13);
                        }
                        Long l22 = gfVarM.R;
                        if (l22 != null) {
                            int i11 = l22.longValue() != 0 ? 2 : 1;
                            idVarA.b();
                            ((jd) idVarA.f14755b).U(i11);
                        }
                    }
                } catch (ze unused2) {
                }
                long j11 = this.g;
                if (j11 > 0) {
                    idVarA.b();
                    ((jd) idVarA.f14755b).L(j11);
                }
                jd jdVar = (jd) idVarA.e();
                zcVar.b();
                ((md) zcVar.f14755b).T(jdVar);
                long j12 = this.f14260c;
                if (j12 > 0) {
                    zcVar.b();
                    ((md) zcVar.f14755b).K(j12);
                }
                long j13 = this.f14261d;
                if (j13 > 0) {
                    zcVar.b();
                    ((md) zcVar.f14755b).J(j13);
                }
                long j14 = this.f14262e;
                if (j14 > 0) {
                    zcVar.b();
                    ((md) zcVar.f14755b).I(j14);
                }
                long j15 = this.f14263f;
                if (j15 > 0) {
                    zcVar.b();
                    ((md) zcVar.f14755b).L(j15);
                }
                try {
                    LinkedList linkedList = this.f14259b;
                    int size = linkedList.size() - 1;
                    if (size > 0) {
                        zcVar.b();
                        ((md) zcVar.f14755b).V();
                        for (int i12 = 0; i12 < size; i12++) {
                            gf gfVarR2 = r(f14255x, (MotionEvent) linkedList.get(i12), this.f14274s);
                            id idVarA2 = jd.A();
                            long jLongValue14 = gfVarR2.H.longValue();
                            idVarA2.b();
                            ((jd) idVarA2.f14755b).B(jLongValue14);
                            long jLongValue15 = gfVarR2.I.longValue();
                            idVarA2.b();
                            ((jd) idVarA2.f14755b).C(jLongValue15);
                            jd jdVar2 = (jd) idVarA2.e();
                            zcVar.b();
                            ((md) zcVar.f14755b).U(jdVar2);
                        }
                    }
                } catch (ze unused3) {
                    zcVar.b();
                    ((md) zcVar.f14755b).V();
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayListAsList = arrayList;
            if (ffVar.f11117b != null) {
                int iE = ffVar.e();
                pk pkVar = sk.f16302r3;
                va.s sVar2 = va.s.f36163e;
                if (((Boolean) sVar2.f36166c.a(pkVar)).booleanValue()) {
                    context2 = context;
                    arrayList.add(new qf(ffVar, zcVar, iE, context, (vc) this.f14276u.f28984c, E));
                    arrayList.add(new pf(ffVar, zcVar, iE, context2));
                    arrayList.add(new of(ffVar, zcVar, iE, context2));
                    arrayList.add(new rf(ffVar, zcVar, iE, 4));
                    nf nfVar = C;
                    if (nfVar != null) {
                        if (nfVar.f14285d) {
                            sVar = sVar2;
                            j9 = nfVar.f14283b - nfVar.f14282a;
                        } else {
                            sVar = sVar2;
                            j9 = -1;
                        }
                        long j16 = nfVar.f14284c;
                        nfVar.f14284c = -1L;
                        j8 = j9;
                        j = j16;
                    } else {
                        sVar = sVar2;
                        j = -1;
                        j8 = -1;
                    }
                    arrayList.add(new vf(ffVar, zcVar, iE, B, j8, j));
                    arrayList.add(new rf(ffVar, zcVar, iE, 11));
                } else {
                    context2 = context;
                    sVar = sVar2;
                }
                arrayList.add(new ae(i4, ffVar, zcVar));
                arrayList.add(new rf(ffVar, zcVar, iE, 3));
                arrayList.add(new sf(ffVar, zcVar, A, iE));
                arrayList.add(new rf(ffVar, zcVar, iE, 0));
                arrayList.add(new rf(ffVar, zcVar, iE, 9));
                arrayList.add(new rf(ffVar, zcVar, iE, 10));
                arrayList.add(new rf(ffVar, zcVar, iE, 2));
                arrayList.add(new rf(ffVar, zcVar, iE, 7));
                arrayList.add(new rf(ffVar, zcVar, iE, 13));
                arrayList.add(new rf(ffVar, zcVar, iE, 6));
                arrayList.add(new rf(ffVar, zcVar, iE, 12));
                arrayList.add(new tf(ffVar, zcVar, iE, new Throwable().getStackTrace()));
                arrayList.add(new tf(ffVar, zcVar, iE, view));
                arrayList.add(new wf(ffVar, zcVar, iE));
                va.s sVar3 = sVar;
                if (((Boolean) sVar3.f36166c.a(sk.f16119f3)).booleanValue()) {
                    arrayList.add(new of(ffVar, zcVar, iE, view, activity));
                }
                if (((Boolean) sVar3.f36166c.a(sk.f16088d4)).booleanValue()) {
                    arrayList.add(new rf(ffVar, zcVar, iE, 5));
                }
                if (z3) {
                    arrayListAsList = arrayList;
                    if (((Boolean) sVar3.f36166c.a(sk.f16150h3)).booleanValue()) {
                        arrayList.add(new xf(ffVar, zcVar, iE, this.f14277v));
                        arrayListAsList = arrayList;
                    }
                } else {
                    try {
                        if (((Boolean) sVar3.f36166c.a(sk.f16165i3)).booleanValue()) {
                            arrayList.add(new uf(ffVar, zcVar, iE, this.f14278w, view, context2));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16178j3)).booleanValue()) {
                            arrayList.add(new tf(ffVar, zcVar, iE, D));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    arrayListAsList = arrayList;
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16317s3)).booleanValue()) {
                        arrayList.add(new tf(ffVar, zcVar, iE, this.f14275t));
                        arrayListAsList = arrayList;
                    }
                }
            }
        } else {
            zcVar.i(Http2Stream.EMIT_BUFFER_SIZE);
            arrayListAsList = Arrays.asList(new ae(i4, ffVar, zcVar));
        }
        t(arrayListAsList);
    }
}
