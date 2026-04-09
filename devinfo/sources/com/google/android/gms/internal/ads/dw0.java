package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dw0 {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f10567h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f10568a;

    /* renamed from: b, reason: collision with root package name */
    public final ew0 f10569b;

    /* renamed from: c, reason: collision with root package name */
    public final gv0 f10570c;

    /* renamed from: d, reason: collision with root package name */
    public final fv0 f10571d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10572e;

    /* renamed from: f, reason: collision with root package name */
    public aw0 f10573f;
    public final Object g = new Object();

    public dw0(Context context, ew0 ew0Var, gv0 gv0Var, fv0 fv0Var, boolean z3) {
        this.f10568a = context;
        this.f10569b = ew0Var;
        this.f10570c = gv0Var;
        this.f10571d = fv0Var;
        this.f10572e = z3;
    }

    public final boolean a(xv0 xv0Var) throws bw0 {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                aw0 aw0Var = new aw0(d(xv0Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f10568a, "msa-r", xv0Var.a(), null, new Bundle(), 2), xv0Var, this.f10569b, this.f10570c, this.f10572e);
                if (!aw0Var.k()) {
                    throw new bw0(4000, "init failed");
                }
                int iM = aw0Var.m();
                if (iM != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iM).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(iM);
                    throw new bw0(4001, sb2.toString());
                }
                synchronized (this.g) {
                    aw0 aw0Var2 = this.f10573f;
                    if (aw0Var2 != null) {
                        try {
                            aw0Var2.l();
                        } catch (bw0 e2) {
                            this.f10570c.c(e2.f9817a, -1L, e2);
                        }
                        this.f10573f = aw0Var;
                    } else {
                        this.f10573f = aw0Var;
                    }
                }
                this.f10570c.b(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e10) {
                throw new bw0(AdError.INTERNAL_ERROR_2004, e10);
            }
        } catch (bw0 e11) {
            this.f10570c.c(e11.f9817a, System.currentTimeMillis() - jCurrentTimeMillis, e11);
            return false;
        } catch (Exception e12) {
            this.f10570c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        }
    }

    public final aw0 b() {
        aw0 aw0Var;
        synchronized (this.g) {
            aw0Var = this.f10573f;
        }
        return aw0Var;
    }

    public final xv0 c() {
        synchronized (this.g) {
            try {
                aw0 aw0Var = this.f10573f;
                if (aw0Var == null) {
                    return null;
                }
                return (xv0) aw0Var.f9458c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Class d(xv0 xv0Var) {
        try {
            kg kgVar = xv0Var.f18515a;
            if (kgVar == null) {
                throw new bw0(4010, "mc");
            }
            String strA = kgVar.A();
            HashMap map = f10567h;
            Class cls = (Class) map.get(strA);
            if (cls != null) {
                return cls;
            }
            try {
                fv0 fv0Var = this.f10571d;
                File file = xv0Var.f18516b;
                fv0Var.getClass();
                if (!fv0.a(file)) {
                    throw new bw0(2026, "VM did not pass signature verification");
                }
                try {
                    File file2 = xv0Var.f18517c;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(xv0Var.f18516b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f10568a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strA, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    throw new bw0(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    throw new bw0(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (SecurityException e11) {
                    e = e11;
                    throw new bw0(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            } catch (GeneralSecurityException e12) {
                throw new bw0(2026, e12);
            }
        } finally {
        }
    }
}
