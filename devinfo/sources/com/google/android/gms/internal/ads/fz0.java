package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fz0 implements az0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11312a;

    /* renamed from: b, reason: collision with root package name */
    public final cs1 f11313b;

    /* renamed from: c, reason: collision with root package name */
    public final cs1 f11314c;

    /* renamed from: d, reason: collision with root package name */
    public final v11 f11315d;

    /* renamed from: e, reason: collision with root package name */
    public final cs1 f11316e;

    /* renamed from: f, reason: collision with root package name */
    public final tx0 f11317f;
    public final sx0 g;

    public fz0(ExecutorService executorService, cs1 cs1Var, cs1 cs1Var2, v11 v11Var, cs1 cs1Var3, tx0 tx0Var, sx0 sx0Var) {
        this.f11312a = executorService;
        this.f11313b = cs1Var;
        this.f11314c = cs1Var2;
        this.f11315d = v11Var;
        this.f11316e = cs1Var3;
        this.f11317f = tx0Var;
        this.g = sx0Var;
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final vd.b a() {
        return yo0.z(this.f11312a, new go0(5, this));
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final String b() {
        return "1.825731049";
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final vd.b c(Context context, View view, Activity activity) {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f11317f.a();
        context.getClass();
        dVar.f19297c = context;
        dVar.f19298d = view;
        dVar.f19299e = activity;
        dVar.f19300f = true != this.g.J() ? "" : null;
        dVar.g = this.f11315d.b(context, view);
        zc zcVarC0 = md.C0();
        zcVarC0.getClass();
        dVar.f19301h = zcVarC0;
        dVar.f19302i = zx0.f19229b;
        return ((kz0) dVar.f().f17031a.a()).a();
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final void d(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            iz0 iz0Var = (iz0) this.f11316e.a();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (iz0Var) {
                try {
                    if (motionEvent.getAction() == 1) {
                        iz0Var.f12546b = MotionEvent.obtain(motionEvent);
                    }
                    iz0Var.f12547c.a(motionEvent);
                    ArrayDeque arrayDeque = iz0Var.f12545a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new hz0(motionEvent));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final vd.b f(Context context) {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f11317f.a();
        dVar.f19297c = context;
        dVar.g = this.f11315d.a();
        zc zcVarC0 = md.C0();
        zcVarC0.getClass();
        dVar.f19301h = zcVarC0;
        dVar.f19302i = zx0.f19228a;
        return ((kz0) dVar.f().f17031a.a()).a();
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final vd.b g(Context context, String str, View view) {
        cs1 cs1Var = this.f11316e;
        HashMap mapC = this.f11315d.c();
        iz0 iz0Var = (iz0) cs1Var.a();
        synchronized (iz0Var) {
            try {
                MotionEvent motionEvent = iz0Var.f12546b;
                if (motionEvent != null) {
                    mapC.put("nv", motionEvent);
                }
                mapC.put("oe", iz0Var.f12547c);
                ArrayDeque arrayDeque = iz0Var.f12545a;
                mapC.put("ro", arrayDeque.toArray(new hz0[arrayDeque.size()]));
                iz0Var.f12547c = new gz0();
                arrayDeque.clear();
                MotionEvent motionEvent2 = iz0Var.f12546b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    iz0Var.f12546b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f11317f.a();
        context.getClass();
        dVar.f19297c = context;
        dVar.f19298d = view;
        dVar.f19299e = null;
        dVar.f19300f = str;
        dVar.g = mapC;
        dVar.f19302i = zx0.f19230c;
        zc zcVarC0 = md.C0();
        zcVarC0.getClass();
        dVar.f19301h = zcVarC0;
        return ((kz0) dVar.f().f17031a.a()).a();
    }
}
