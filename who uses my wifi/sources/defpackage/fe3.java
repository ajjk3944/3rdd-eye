package defpackage;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fe3 {
    public static final HashMap h = new HashMap();
    public final Context a;
    public final ge3 b;
    public final gd3 c;
    public final fd3 d;
    public final boolean e;
    public de3 f;
    public final Object g = new Object();

    public fe3(Context context, ge3 ge3Var, gd3 gd3Var, fd3 fd3Var, boolean z) {
        this.a = context;
        this.b = ge3Var;
        this.c = gd3Var;
        this.d = fd3Var;
        this.e = z;
    }

    public final boolean a(g4 g4Var) throws IllegalAccessException, ee3, InstantiationException, IllegalArgumentException, InvocationTargetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                de3 de3Var = new de3(c(g4Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", g4Var.l(), null, new Bundle(), 2), g4Var, this.b, this.c, this.e);
                if (!de3Var.k()) {
                    throw new ee3("init failed", 4000);
                }
                int iM = de3Var.m();
                if (iM != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iM).length() + 4);
                    sb.append("ci: ");
                    sb.append(iM);
                    throw new ee3(sb.toString(), 4001);
                }
                synchronized (this.g) {
                    de3 de3Var2 = this.f;
                    if (de3Var2 != null) {
                        try {
                            de3Var2.l();
                        } catch (ee3 e) {
                            this.c.c(e.f, -1L, e);
                        }
                        this.f = de3Var;
                    } else {
                        this.f = de3Var;
                    }
                }
                this.c.b(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new ee3(2004, e2);
            }
        } catch (ee3 e3) {
            this.c.c(e3.f, System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    public final de3 b() {
        de3 de3Var;
        synchronized (this.g) {
            de3Var = this.f;
        }
        return de3Var;
    }

    public final synchronized Class c(g4 g4Var) {
        try {
            fv1 fv1Var = (fv1) g4Var.g;
            if (fv1Var == null) {
                throw new ee3("mc", 4010);
            }
            String strA = fv1Var.A();
            HashMap map = h;
            Class cls = (Class) map.get(strA);
            if (cls != null) {
                return cls;
            }
            try {
                fd3 fd3Var = this.d;
                File file = (File) g4Var.j;
                fd3Var.getClass();
                if (!fd3.a(file)) {
                    throw new ee3("VM did not pass signature verification", 2026);
                }
                try {
                    File file2 = (File) g4Var.h;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(((File) g4Var.j).getAbsolutePath(), file2.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strA, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new ee3(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new ee3(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new ee3(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new ee3(2026, e4);
            }
        } finally {
        }
    }
}
