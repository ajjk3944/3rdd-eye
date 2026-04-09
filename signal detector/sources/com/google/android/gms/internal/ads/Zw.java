package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Zw {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f12988h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f12989a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0908ax f12990b;

    /* renamed from: c, reason: collision with root package name */
    public final Cw f12991c;

    /* renamed from: d, reason: collision with root package name */
    public final Bw f12992d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12993e;

    /* renamed from: f, reason: collision with root package name */
    public Ww f12994f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12995g = new Object();

    public Zw(Context context, InterfaceC0908ax interfaceC0908ax, Cw cw, Bw bw, boolean z6) {
        this.f12989a = context;
        this.f12990b = interfaceC0908ax;
        this.f12991c = cw;
        this.f12992d = bw;
        this.f12993e = z6;
    }

    public final boolean a(Tw tw) throws Xw {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Ww ww = new Ww(d(tw).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f12989a, "msa-r", tw.a(), null, new Bundle(), 2), tw, this.f12990b, this.f12991c, this.f12993e);
                if (!ww.j()) {
                    throw new Xw(4000, "init failed");
                }
                int iL = ww.l();
                if (iL != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iL).length() + 4);
                    sb.append("ci: ");
                    sb.append(iL);
                    throw new Xw(4001, sb.toString());
                }
                synchronized (this.f12995g) {
                    Ww ww2 = this.f12994f;
                    if (ww2 != null) {
                        try {
                            ww2.k();
                        } catch (Xw e6) {
                            this.f12991c.c(e6.f12520a, -1L, e6);
                        }
                        this.f12994f = ww;
                    } else {
                        this.f12994f = ww;
                    }
                }
                this.f12991c.b(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e7) {
                throw new Xw(e7, 2004);
            }
        } catch (Xw e8) {
            this.f12991c.c(e8.f12520a, System.currentTimeMillis() - jCurrentTimeMillis, e8);
            return false;
        } catch (Exception e9) {
            this.f12991c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e9);
            return false;
        }
    }

    public final Ww b() {
        Ww ww;
        synchronized (this.f12995g) {
            ww = this.f12994f;
        }
        return ww;
    }

    public final Tw c() {
        synchronized (this.f12995g) {
            try {
                Ww ww = this.f12994f;
                if (ww == null) {
                    return null;
                }
                return (Tw) ww.f12346c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Class d(Tw tw) {
        try {
            C2215z7 c2215z7 = tw.f11509a;
            if (c2215z7 == null) {
                throw new Xw(4010, "mc");
            }
            String strA = c2215z7.A();
            HashMap map = f12988h;
            Class cls = (Class) map.get(strA);
            if (cls != null) {
                return cls;
            }
            try {
                Bw bw = this.f12992d;
                File file = tw.f11510b;
                bw.getClass();
                if (!Bw.a(file)) {
                    throw new Xw(2026, "VM did not pass signature verification");
                }
                try {
                    File file2 = tw.f11511c;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(tw.f11510b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f12989a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strA, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e6) {
                    e = e6;
                    throw new Xw(e, 2008);
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    throw new Xw(e, 2008);
                } catch (SecurityException e8) {
                    e = e8;
                    throw new Xw(e, 2008);
                }
            } catch (GeneralSecurityException e9) {
                throw new Xw(e9, 2026);
            }
        } finally {
        }
    }
}
