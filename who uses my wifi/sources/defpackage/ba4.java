package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ba4 implements ga4, z94 {
    public static final Object c = new Object();
    public volatile ga4 a;
    public volatile Object b = c;

    public ba4(ga4 ga4Var) {
        this.a = ga4Var;
    }

    public static ba4 a(ga4 ga4Var) {
        return ga4Var instanceof ba4 ? (ba4) ga4Var : new ba4(ga4Var);
    }

    public static z94 b(ga4 ga4Var) {
        if (ga4Var instanceof z94) {
            return (z94) ga4Var;
        }
        ga4Var.getClass();
        return new ba4(ga4Var);
    }

    @Override // defpackage.ga4
    public final Object d() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objD = this.a.d();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objD) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objD + ". This is likely due to a circular dependency.");
                }
                this.b = objD;
                this.a = null;
                return objD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
