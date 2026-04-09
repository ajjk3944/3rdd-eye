package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class bn {
    public static final zn a;

    static {
        String property;
        zn znVar;
        int i = wz0.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            on onVar = fp.a;
            i00 i00Var = za0.a;
            i00 i00Var2 = i00Var.j;
            znVar = i00Var;
            if (i00Var == null) {
                znVar = an.n;
            }
        } else {
            znVar = an.n;
        }
        a = znVar;
    }
}
