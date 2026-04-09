package defpackage;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ea3 implements Runnable {
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static final Object q = new Object();
    public static Boolean r;
    public final Context f;
    public final e51 g;
    public int j;
    public final xu2 k;
    public final AbstractCollection l;
    public final ch2 m;
    public final ha3 h = ka3.B();
    public String i = "";
    public boolean n = false;

    public ea3(Context context, e51 e51Var, xu2 xu2Var, ts0 ts0Var, ch2 ch2Var) {
        this.f = context;
        this.g = e51Var;
        this.k = xu2Var;
        this.m = ch2Var;
        if (((Boolean) tw1.e.c.a(mz1.y9)).booleanValue()) {
            this.l = lf4.G();
        } else {
            vm3 vm3Var = xm3.g;
            this.l = sn3.j;
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (o) {
            try {
                if (r == null) {
                    if (((Boolean) n02.b.w()).booleanValue()) {
                        r = Boolean.valueOf(Math.random() < ((Double) n02.a.w()).doubleValue());
                    } else {
                        r = Boolean.FALSE;
                    }
                }
                zBooleanValue = r.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void b(ca3 ca3Var) {
        md2.a.a(new sz2(this, ca3Var, 10));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrB;
        if (a()) {
            Object obj = p;
            synchronized (obj) {
                try {
                    if (((ka3) this.h.g).A() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            ha3 ha3Var = this.h;
                            bArrB = ((ka3) ha3Var.d()).b();
                            ha3Var.b();
                            ((ka3) ha3Var.g).D();
                        }
                        yy2 yy2Var = new yy2((String) tw1.e.c.a(mz1.s9), 60000, new HashMap(), bArrB, "application/x-protobuf");
                        Context context = this.f;
                        String str = this.g.f;
                        Binder.getCallingUid();
                        new xb4(context, str, (Object) null, 25).C(yy2Var);
                    } catch (Exception e) {
                        if ((e instanceof hx2) && ((hx2) e).f == 3) {
                            return;
                        }
                        hg4.C.h.e("CuiMonitor.sendCuiPing", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
