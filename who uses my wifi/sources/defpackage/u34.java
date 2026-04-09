package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class u34 implements or3 {
    public static final tb1 a;
    public static final byte[] b;
    public static final byte[] c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        p34 p34Var = p34.f;
        h24 h24Var = h24.b;
        map.put(p34Var, h24Var);
        map2.put(h24Var, p34Var);
        p34 p34Var2 = p34.g;
        h24 h24Var2 = h24.c;
        map.put(p34Var2, h24Var2);
        map2.put(h24Var2, p34Var2);
        p34 p34Var3 = p34.h;
        h24 h24Var3 = h24.d;
        map.put(p34Var3, h24Var3);
        map2.put(h24Var3, p34Var3);
        a = new tb1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        b = new byte[0];
        c = new byte[]{0};
    }
}
