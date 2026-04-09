package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class hu1 implements Callable {
    public final jt1 a;
    public final String b;
    public final String c;
    public final fr1 d;
    public Method e;
    public final int f;
    public final int g;

    public hu1(jt1 jt1Var, String str, String str2, fr1 fr1Var, int i, int i2) {
        this.a = jt1Var;
        this.b = str;
        this.c = str2;
        this.d = fr1Var;
        this.f = i;
        this.g = i2;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            jt1 jt1Var = this.a;
            Method methodD = jt1Var.d(this.b, this.c);
            this.e = methodD;
            if (methodD == null) {
                return null;
            }
            a();
            qs1 qs1Var = jt1Var.k;
            if (qs1Var == null || (i = this.f) == Integer.MIN_VALUE) {
                return null;
            }
            qs1Var.a(this.g, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
