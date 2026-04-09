package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;
import q2.C2841s;
import t2.C2911G;
import u2.C2951a;

/* loaded from: classes.dex */
public final class Yu implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f12720j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f12721k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f12722l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static Boolean f12723m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12724a;

    /* renamed from: b, reason: collision with root package name */
    public final C2951a f12725b;

    /* renamed from: e, reason: collision with root package name */
    public int f12728e;

    /* renamed from: f, reason: collision with root package name */
    public final C0546Hn f12729f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractCollection f12730g;

    /* renamed from: h, reason: collision with root package name */
    public final C0421Ah f12731h;

    /* renamed from: c, reason: collision with root package name */
    public final C0961bv f12726c = C1124ev.B();

    /* renamed from: d, reason: collision with root package name */
    public String f12727d = "";
    public boolean i = false;

    public Yu(Context context, C2951a c2951a, C0546Hn c0546Hn, W9 w9, C0421Ah c0421Ah) {
        this.f12724a = context;
        this.f12725b = c2951a;
        this.f12729f = c0546Hn;
        this.f12731h = c0421Ah;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.V9)).booleanValue()) {
            this.f12730g = C2911G.I();
        } else {
            JB jb = LB.f9635b;
            this.f12730g = C1197gC.f14227e;
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (f12720j) {
            try {
                if (f12723m == null) {
                    if (((Boolean) AbstractC1049da.f13767b.v()).booleanValue()) {
                        f12723m = Boolean.valueOf(Math.random() < ((Double) AbstractC1049da.f13766a.v()).doubleValue());
                    } else {
                        f12723m = Boolean.FALSE;
                    }
                }
                zBooleanValue = f12723m.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void b(Uu uu) {
        AbstractC0640Nf.f10005a.a(new RunnableC0786Vp(this, 11, uu));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrB;
        if (a()) {
            Object obj = f12721k;
            synchronized (obj) {
                try {
                    if (((C1124ev) this.f12726c.f13551b).A() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            C0961bv c0961bv = this.f12726c;
                            bArrB = ((C1124ev) c0961bv.d()).b();
                            c0961bv.b();
                            ((C1124ev) c0961bv.f13551b).D();
                        }
                        C2250zp c2250zp = new C2250zp((String) C2841s.f23267e.f23270c.a(H9.P9), 60000, new HashMap(), bArrB, "application/x-protobuf");
                        Context context = this.f12724a;
                        String str = this.f12725b.f23784a;
                        Binder.getCallingUid();
                        new C1338iu(context, str, null, 19, false).t(c2250zp);
                    } catch (Exception e6) {
                        if ((e6 instanceof C0836Yo) && ((C0836Yo) e6).f12707a == 3) {
                            return;
                        }
                        p2.j.f22785C.f22795h.g("CuiMonitor.sendCuiPing", e6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
