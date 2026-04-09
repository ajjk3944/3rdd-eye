package defpackage;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class z24 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;
    public static final zu3 e;
    public static final wu3 f;
    public static final tb1 g;
    public static final tb1 h;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        v34 v34VarA2 = ow3.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        a = new vv3(c24.class, t24.j);
        b = new tv3(v34VarA, y24.g);
        c = new zu3(e24.class, t24.h);
        d = new wu3(v34VarA2, y24.h);
        e = new zu3(d24.class, t24.i);
        f = new wu3(v34VarA, y24.i);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        i04 i04Var = i04.RAW;
        b24 b24Var = b24.e;
        map.put(i04Var, b24Var);
        map2.put(b24Var, i04Var);
        i04 i04Var2 = i04.TINK;
        b24 b24Var2 = b24.b;
        map.put(i04Var2, b24Var2);
        map2.put(b24Var2, i04Var2);
        i04 i04Var3 = i04.CRUNCHY;
        b24 b24Var3 = b24.c;
        map.put(i04Var3, b24Var3);
        map2.put(b24Var3, i04Var3);
        i04 i04Var4 = i04.LEGACY;
        b24 b24Var4 = b24.d;
        map.put(i04Var4, b24Var4);
        map2.put(b24Var4, i04Var4);
        g = new tb1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        gz3 gz3Var = gz3.SHA256;
        a24 a24Var = a24.b;
        map3.put(gz3Var, a24Var);
        map4.put(a24Var, gz3Var);
        gz3 gz3Var2 = gz3.SHA384;
        a24 a24Var2 = a24.c;
        map3.put(gz3Var2, a24Var2);
        map4.put(a24Var2, gz3Var2);
        gz3 gz3Var3 = gz3.SHA512;
        a24 a24Var3 = a24.d;
        map3.put(gz3Var3, a24Var3);
        map4.put(a24Var3, gz3Var3);
        h = new tb1(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
    }

    public static r04 a(e24 e24Var) {
        q04 q04VarF = r04.F();
        c24 c24Var = e24Var.j;
        m04 m04VarB = n04.B();
        gz3 gz3Var = (gz3) h.b(c24Var.d);
        m04VarB.b();
        ((n04) m04VarB.g).D(gz3Var);
        n04 n04Var = (n04) m04VarB.d();
        q04VarF.b();
        ((r04) q04VarF.g).I(n04Var);
        byte[] bArrQ = a30.q(e24Var.k);
        y44 y44Var = a54.g;
        y44 y44VarN = a54.n(bArrQ, 0, bArrQ.length);
        q04VarF.b();
        ((r04) q04VarF.g).J(y44VarN);
        byte[] bArrQ2 = a30.q(e24Var.j.b);
        y44 y44VarN2 = a54.n(bArrQ2, 0, bArrQ2.length);
        q04VarF.b();
        ((r04) q04VarF.g).K(y44VarN2);
        return (r04) q04VarF.d();
    }

    public static x34 b(a54 a54Var) {
        return new x34(new BigInteger(1, a54Var.p()));
    }
}
