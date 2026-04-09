package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cs0 implements Runnable {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f10201k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f10202l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static Boolean f10203m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10204a;

    /* renamed from: b, reason: collision with root package name */
    public final za.a f10205b;

    /* renamed from: e, reason: collision with root package name */
    public int f10208e;

    /* renamed from: f, reason: collision with root package name */
    public final dd0 f10209f;
    public final AbstractCollection g;

    /* renamed from: h, reason: collision with root package name */
    public final t00 f10210h;

    /* renamed from: c, reason: collision with root package name */
    public final fs0 f10206c = is0.B();

    /* renamed from: d, reason: collision with root package name */
    public String f10207d = "";

    /* renamed from: i, reason: collision with root package name */
    public boolean f10211i = false;

    public cs0(Context context, za.a aVar, dd0 dd0Var, hl hlVar, t00 t00Var) {
        this.f10204a = context;
        this.f10205b = aVar;
        this.f10209f = dd0Var;
        this.f10210h = t00Var;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.X9)).booleanValue()) {
            this.g = ya.f0.I();
        } else {
            v41 v41Var = x41.f18307b;
            this.g = u51.f17096e;
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (j) {
            try {
                if (f10203m == null) {
                    if (((Boolean) ol.f14723b.u()).booleanValue()) {
                        f10203m = Boolean.valueOf(Math.random() < ((Double) ol.f14722a.u()).doubleValue());
                    } else {
                        f10203m = Boolean.FALSE;
                    }
                }
                zBooleanValue = f10203m.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final void b(as0 as0Var) {
        fx.f11274a.c(new uh0(10, this, as0Var));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrB;
        if (a()) {
            Object obj = f10201k;
            synchronized (obj) {
                try {
                    if (((is0) this.f10206c.f14755b).A() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            fs0 fs0Var = this.f10206c;
                            bArrB = ((is0) fs0Var.e()).b();
                            fs0Var.b();
                            ((is0) fs0Var.f14755b).D();
                        }
                        yg0 yg0Var = new yg0((String) va.s.f36163e.f36166c.a(sk.R9), 60000, new HashMap(), bArrB, "application/x-protobuf");
                        Context context = this.f10204a;
                        String str = this.f10205b.f38129a;
                        Binder.getCallingUid();
                        Object obj2 = null;
                        new pq0(context, str, obj2, false, 19).s(yg0Var);
                    } catch (Exception e2) {
                        if ((e2 instanceof uf0) && ((uf0) e2).f17198a == 3) {
                            return;
                        }
                        ua.j.C.f35265h.g("CuiMonitor.sendCuiPing", e2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
