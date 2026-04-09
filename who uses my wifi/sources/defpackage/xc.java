package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class xc implements l40, Serializable {
    public transient l40 f;
    public final Object g;
    public final Class h;
    public final String i;
    public final String j;
    public final boolean k;

    public xc(Object obj, Class cls, String str, String str2, boolean z) {
        this.g = obj;
        this.h = cls;
        this.i = str;
        this.j = str2;
        this.k = z;
    }

    public final gf c() {
        boolean z = this.k;
        Class cls = this.h;
        if (!z) {
            return dp0.a(cls);
        }
        dp0.a.getClass();
        return new ak0(cls);
    }
}
