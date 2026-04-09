package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t20 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16670a;

    /* renamed from: b, reason: collision with root package name */
    public final ya.c0 f16671b;

    /* renamed from: c, reason: collision with root package name */
    public final yh0 f16672c;

    /* renamed from: d, reason: collision with root package name */
    public final zc0 f16673d;

    /* renamed from: e, reason: collision with root package name */
    public final w81 f16674e;

    /* renamed from: f, reason: collision with root package name */
    public final w81 f16675f;
    public final ScheduledExecutorService g;

    public t20(Context context, ya.c0 c0Var, yh0 yh0Var, zc0 zc0Var, w81 w81Var, w81 w81Var2, ScheduledExecutorService scheduledExecutorService) {
        this.f16670a = context;
        this.f16671b = c0Var;
        this.f16672c = yh0Var;
        this.f16673d = zc0Var;
        this.f16674e = w81Var;
        this.f16675f = w81Var2;
        this.g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) va.s.f36163e.f36166c.a(sk.f16372vb));
    }

    public final vd.b a(String str, Random random) {
        return TextUtils.isEmpty(str) ? yo0.e(str) : yo0.D(c(str, this.f16673d.f19057a, random), Throwable.class, new mo(this, str, 1), this.f16674e);
    }

    public final vd.b c(String str, MotionEvent motionEvent, Random random) {
        Exception exc;
        pk pkVar;
        rk rkVar;
        rk rkVar2;
        vd.b bVarW;
        try {
            pkVar = sk.f16372vb;
            va.s sVar = va.s.f36163e;
            rkVar = sVar.f36166c;
            rkVar2 = sVar.f36166c;
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (!str.contains((CharSequence) rkVar.a(pkVar)) || this.f16671b.E()) {
                return yo0.e(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) rkVar2.a(sk.f16388wb), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                try {
                    builderBuildUpon.appendQueryParameter((String) rkVar2.a(sk.f16405xb), "11");
                    return yo0.e(builderBuildUpon.toString());
                } catch (Exception e10) {
                    exc = e10;
                    return yo0.w(exc);
                }
            }
            yh0 yh0Var = this.f16672c;
            yh0Var.getClass();
            try {
                n5.a aVarB = n5.a.b(yh0Var.f18754b);
                yh0Var.f18753a = aVarB;
                bVarW = aVarB == null ? yo0.w(new IllegalStateException("MeasurementManagerFutures is null")) : aVarB.c();
            } catch (Exception e11) {
                bVarW = yo0.w(e11);
            }
            return yo0.D(yo0.F(n81.s(bVarW), new qq(1, this, builderBuildUpon, motionEvent, str), this.f16675f), Throwable.class, new sq(2, this, builderBuildUpon), this.f16674e);
        } catch (Exception e12) {
            e = e12;
            exc = e;
            return yo0.w(exc);
        }
    }
}
