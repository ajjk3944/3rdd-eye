package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h54 {
    public static volatile h54 a;
    public static final h54 b;

    static {
        h54 h54Var = new h54();
        Map map = Collections.EMPTY_MAP;
        b = h54Var;
    }

    public static h54 a() {
        h54 h54Var = a;
        if (h54Var != null) {
            return h54Var;
        }
        synchronized (h54.class) {
            try {
                h54 h54Var2 = a;
                if (h54Var2 != null) {
                    return h54Var2;
                }
                int i = u44.a;
                h54 h54VarL = m54.L();
                a = h54VarL;
                return h54VarL;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
