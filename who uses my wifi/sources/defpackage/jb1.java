package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class jb1 {
    public static final ue0 a;
    public static final HashMap b;

    static {
        ue0 ue0Var = new ue0("ZONEMD Hash Algorithms", 2);
        a = ue0Var;
        HashMap map = new HashMap(2);
        b = map;
        ue0Var.i = 255;
        ue0Var.b("RESERVED", 0);
        ue0Var.b("SHA384", 1);
        map.put(1, 48);
        ue0Var.b("SHA512", 2);
        map.put(2, 64);
    }
}
