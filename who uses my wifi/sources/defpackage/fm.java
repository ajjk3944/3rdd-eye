package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class fm {
    public static final ue0 a;

    static {
        ue0 ue0Var = new ue0("DNSSEC Digest Algorithm", 2);
        a = ue0Var;
        HashMap map = new HashMap(4);
        ue0Var.i = 255;
        ue0Var.b("SHA-1", 1);
        map.put(1, 20);
        ue0Var.b("SHA-256", 2);
        map.put(2, 32);
        ue0Var.b("GOST R 34.11-94", 3);
        map.put(3, 32);
        ue0Var.b("SHA-384", 4);
        map.put(4, 48);
        ue0Var.b("GOST12", 5);
        map.put(5, 64);
        ue0Var.b("SM3", 6);
        map.put(6, 32);
    }
}
