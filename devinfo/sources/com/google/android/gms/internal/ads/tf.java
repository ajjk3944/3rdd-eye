package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tf extends zf {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16803h = 3;

    /* renamed from: i, reason: collision with root package name */
    public final Object f16804i;

    public tf(ff ffVar, zc zcVar, int i4, View view) {
        super(ffVar, "FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", zcVar, i4, 57);
        this.f16804i = view;
    }

    private final void b() {
        Method method = this.f19076e;
        g8 g8Var = (g8) this.f16804i;
        List list = g8Var.f11399a;
        g8Var.f11399a = Collections.EMPTY_LIST;
        int iIntValue = ((Integer) method.invoke(null, list)).intValue();
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            int iH = nn1.h(iIntValue);
            zcVar.b();
            ((md) zcVar.f14755b).u0(iH);
        }
    }

    private final void c() {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.f16804i;
        if (stackTraceElementArr != null) {
            re reVar = new re((String) this.f19076e.invoke(null, stackTraceElementArr));
            zc zcVar = this.f19075d;
            synchronized (zcVar) {
                try {
                    long jLongValue = reVar.I.longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).N(jLongValue);
                    if (((Boolean) reVar.J).booleanValue()) {
                        int i4 = true != ((Boolean) reVar.K).booleanValue() ? 2 : 1;
                        zcVar.b();
                        ((md) zcVar.f14755b).r0(i4);
                    } else {
                        zcVar.b();
                        ((md) zcVar.f14755b).r0(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        switch (this.f16803h) {
            case 0:
                Method method = this.f19076e;
                o1 o1Var = (o1) this.f16804i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(o1Var.f14499c), Long.valueOf(o1Var.f14500d), Long.valueOf(o1Var.f14501e), Long.valueOf(o1Var.f14502f));
                zc zcVar = this.f19075d;
                synchronized (zcVar) {
                    long j = jArr[0];
                    zcVar.b();
                    ((md) zcVar.f14755b).j0(j);
                    long j8 = jArr[1];
                    zcVar.b();
                    ((md) zcVar.f14755b).k0(j8);
                }
                return;
            case 1:
                b();
                return;
            case 2:
                c();
                return;
            default:
                View view = (View) this.f16804i;
                if (view != null) {
                    pk pkVar = sk.f16072c4;
                    va.s sVar = va.s.f36163e;
                    Boolean bool = (Boolean) sVar.f36166c.a(pkVar);
                    Boolean bool2 = (Boolean) sVar.f36166c.a(sk.f16199kc);
                    String str = (String) this.f19076e.invoke(null, view, this.f19072a.f11116a.getResources().getDisplayMetrics(), bool, bool2);
                    jf jfVar = new jf(25);
                    HashMap mapM = ls.m(str);
                    if (mapM != null) {
                        jfVar.H = (Long) mapM.get(0);
                        jfVar.I = (Long) mapM.get(1);
                        jfVar.J = (Long) mapM.get(2);
                        jfVar.K = (Long) mapM.get(3);
                        jfVar.L = (Long) mapM.get(4);
                    }
                    kd kdVarA = ld.A();
                    long jLongValue = jfVar.H.longValue();
                    kdVarA.b();
                    ((ld) kdVarA.f14755b).C(jLongValue);
                    long jLongValue2 = jfVar.I.longValue();
                    kdVarA.b();
                    ((ld) kdVarA.f14755b).D(jLongValue2);
                    long jLongValue3 = jfVar.J.longValue();
                    kdVarA.b();
                    ((ld) kdVarA.f14755b).E(jLongValue3);
                    if (bool2.booleanValue()) {
                        long jLongValue4 = jfVar.L.longValue();
                        kdVarA.b();
                        ((ld) kdVarA.f14755b).B(jLongValue4);
                    }
                    if (bool.booleanValue()) {
                        long jLongValue5 = jfVar.K.longValue();
                        kdVarA.b();
                        ((ld) kdVarA.f14755b).F(jLongValue5);
                    }
                    zc zcVar2 = this.f19075d;
                    ld ldVar = (ld) kdVarA.e();
                    zcVar2.b();
                    ((md) zcVar2.f14755b).W(ldVar);
                    return;
                }
                return;
        }
    }

    public tf(ff ffVar, zc zcVar, int i4, o1 o1Var) {
        super(ffVar, "uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", zcVar, i4, 85);
        this.f16804i = o1Var;
    }

    public tf(ff ffVar, zc zcVar, int i4, g8 g8Var) {
        super(ffVar, "mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", zcVar, i4, 94);
        this.f16804i = g8Var;
    }

    public tf(ff ffVar, zc zcVar, int i4, StackTraceElement[] stackTraceElementArr) {
        super(ffVar, "TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", zcVar, i4, 45);
        this.f16804i = stackTraceElementArr;
    }
}
