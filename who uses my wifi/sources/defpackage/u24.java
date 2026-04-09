package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class u24 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;
    public static final zu3 e;
    public static final wu3 f;
    public static final tb1 g;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        v34 v34VarA2 = ow3.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        a = new vv3(q14.class, t24.g);
        b = new tv3(v34VarA, vt3.G);
        c = new zu3(t14.class, tt3.H);
        d = new wu3(v34VarA2, vt3.H);
        e = new zu3(r14.class, tt3.I);
        f = new wu3(v34VarA, vt3.I);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        i04 i04Var = i04.RAW;
        p14 p14Var = p14.e;
        map.put(i04Var, p14Var);
        map2.put(p14Var, i04Var);
        i04 i04Var2 = i04.TINK;
        p14 p14Var2 = p14.b;
        map.put(i04Var2, p14Var2);
        map2.put(p14Var2, i04Var2);
        i04 i04Var3 = i04.CRUNCHY;
        p14 p14Var3 = p14.c;
        map.put(i04Var3, p14Var3);
        map2.put(p14Var3, i04Var3);
        i04 i04Var4 = i04.LEGACY;
        p14 p14Var4 = p14.d;
        map.put(i04Var4, p14Var4);
        map2.put(p14Var4, i04Var4);
        g = new tb1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static fz3 a(t14 t14Var) {
        ez3 ez3VarD = fz3.D();
        byte[] bArrB = t14Var.k.b();
        y44 y44VarN = a54.n(bArrB, 0, bArrB.length);
        ez3VarD.b();
        ((fz3) ez3VarD.g).G(y44VarN);
        return (fz3) ez3VarD.d();
    }
}
