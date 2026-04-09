package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u00 implements me {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17028a;

    /* renamed from: b, reason: collision with root package name */
    public final ix0 f17029b;

    public u00(Context context, za.a aVar) {
        ix0 ix0Var;
        this.f17028a = context;
        pk pkVar = sk.f16254o3;
        va.s sVar = va.s.f36163e;
        int iIntValue = ((Integer) sVar.f36166c.a(pkVar)).intValue();
        int i4 = iIntValue != 1 ? (iIntValue == 2 || iIntValue != 3) ? 3 : 4 : 2;
        ux0 ux0VarE = vx0.E();
        float fFloatValue = ((Float) sVar.f36166c.a(sk.f16364v3)).floatValue();
        ux0VarE.b();
        ((vx0) ux0VarE.f14755b).G(fFloatValue);
        vx0 vx0Var = (vx0) ux0VarE.e();
        wx0 wx0VarH = xx0.H();
        boolean zBooleanValue = ((Boolean) sVar.f36166c.a(sk.f16380w3)).booleanValue();
        wx0VarH.b();
        ((xx0) wx0VarH.f14755b).J(zBooleanValue);
        long jLongValue = ((Long) sVar.f36166c.a(sk.f16414y3)).longValue();
        wx0VarH.b();
        ((xx0) wx0VarH.f14755b).K(jLongValue);
        xx0 xx0Var = (xx0) wx0VarH.e();
        rx0 rx0VarY = sx0.Y();
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).E(i4);
        String str = aVar.f38129a;
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).a0(str);
        boolean zBooleanValue2 = ((Boolean) sVar.f36166c.a(sk.S2)).booleanValue();
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).Z(zBooleanValue2);
        boolean z3 = ((Integer) sVar.f36166c.a(sk.f16207l3)).intValue() == -1;
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).C(z3);
        long jIntValue = ((Integer) sVar.f36166c.a(sk.f16238n3)).intValue();
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).B(jIntValue);
        long jLongValue2 = ((Long) sVar.f36166c.a(sk.f16397x3)).longValue();
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).d0(jLongValue2);
        long jIntValue2 = ((Integer) sVar.f36166c.a(sk.f16223m3)).intValue();
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).c0(jIntValue2);
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).b0(vx0Var);
        rx0VarY.b();
        ((sx0) rx0VarY.f14755b).A(xx0Var);
        sx0 sx0Var = (sx0) rx0VarY.e();
        ex exVar = fx.f11274a;
        synchronized (ix0.f12499d) {
            try {
                if (ix0.f12500e == null) {
                    ix0.f12500e = new ix0(context, exVar, sx0Var);
                }
                ix0Var = ix0.f12500e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f17029b = ix0Var;
        ix0Var.m();
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void a(int i4, int i10, int i11) {
        za.d dVar = va.r.g.f36157a;
        Context context = this.f17028a;
        long j = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j, 0, za.d.b(i4, context), za.d.n(context.getResources().getDisplayMetrics(), i10), 0);
        ix0 ix0Var = this.f17029b;
        ix0Var.u(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j, 2, za.d.n(context.getResources().getDisplayMetrics(), i4), za.d.n(context.getResources().getDisplayMetrics(), i10), 0);
        ix0Var.u(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j, 1, za.d.n(context.getResources().getDisplayMetrics(), i4), za.d.n(context.getResources().getDisplayMetrics(), i10), 0);
        ix0Var.u(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f17029b.u(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String c(Context context, String str, View view, Activity activity) {
        return this.f17029b.t(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String d(Context context) {
        return this.f17029b.r(context);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void e(StackTraceElement[] stackTraceElementArr) {
        ix0 ix0Var = this.f17029b;
        List listAsList = Arrays.asList(stackTraceElementArr);
        a21 a21Var = ((px0) ix0Var.f12502b).f15136c.f17429b;
        synchronized (a21Var) {
            ArrayList arrayList = a21Var.f9191a;
            arrayList.clear();
            arrayList.addAll(listAsList);
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String f(Context context) {
        return this.f17029b.r(context);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String h(Context context, String str, View view) {
        return this.f17029b.t(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String i(Context context, View view, Activity activity) {
        String string;
        x71 x71Var;
        px0 px0Var = (px0) this.f17029b.f12502b;
        dy0 dy0Var = px0Var.f15138e;
        g21 g21Var = px0Var.f15137d;
        f21 f21VarA = g21Var.a(4);
        try {
            try {
                try {
                    f21VarA.a();
                    ny0 ny0Var = px0Var.f15134a;
                    synchronized (ny0Var) {
                        x71Var = ny0Var.f14482e;
                        if (x71Var == null) {
                            throw null;
                        }
                    }
                    string = (String) yo0.F(x71Var, new qq(px0Var, context, view, activity, 6), k81.f13081a).get(px0Var.f15139f, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    f21VarA.b(e2);
                    string = "";
                } catch (ExecutionException e10) {
                    Throwable th2 = e10;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    f21VarA.b(th2);
                    string = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                g21Var.b(57);
                string = Integer.toString(17);
            } catch (Throwable th3) {
                f21VarA.b(th3);
                throw th3;
            }
            f21VarA.c();
            dy0Var.a();
            return string;
        } catch (Throwable th4) {
            f21VarA.c();
            dy0Var.a();
            throw th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void g(View view) {
    }
}
