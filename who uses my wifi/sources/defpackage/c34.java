package defpackage;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class c34 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;
    public static final zu3 e;
    public static final wu3 f;
    public static final tb1 g;
    public static final tb1 h;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        v34 v34VarA2 = ow3.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        a = new vv3(j24.class, t24.m);
        b = new tv3(v34VarA, y24.j);
        c = new zu3(l24.class, t24.k);
        d = new wu3(v34VarA2, y24.k);
        e = new zu3(k24.class, t24.l);
        f = new wu3(v34VarA, y24.l);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        i04 i04Var = i04.RAW;
        i24 i24Var = i24.e;
        map.put(i04Var, i24Var);
        map2.put(i24Var, i04Var);
        i04 i04Var2 = i04.TINK;
        i24 i24Var2 = i24.b;
        map.put(i04Var2, i24Var2);
        map2.put(i24Var2, i04Var2);
        i04 i04Var3 = i04.CRUNCHY;
        i24 i24Var3 = i24.c;
        map.put(i04Var3, i24Var3);
        map2.put(i24Var3, i04Var3);
        i04 i04Var4 = i04.LEGACY;
        i24 i24Var4 = i24.d;
        map.put(i04Var4, i24Var4);
        map2.put(i24Var4, i04Var4);
        g = new tb1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        gz3 gz3Var = gz3.SHA256;
        h24 h24Var = h24.b;
        map3.put(gz3Var, h24Var);
        map4.put(h24Var, gz3Var);
        gz3 gz3Var2 = gz3.SHA384;
        h24 h24Var2 = h24.c;
        map3.put(gz3Var2, h24Var2);
        map4.put(h24Var2, gz3Var2);
        gz3 gz3Var3 = gz3.SHA512;
        h24 h24Var3 = h24.d;
        map3.put(gz3Var3, h24Var3);
        map4.put(h24Var3, gz3Var3);
        h = new tb1(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
    }

    public static v04 a(j24 j24Var) {
        u04 u04VarD = v04.D();
        h24 h24Var = j24Var.d;
        tb1 tb1Var = h;
        gz3 gz3Var = (gz3) tb1Var.b(h24Var);
        u04VarD.b();
        ((v04) u04VarD.g).F(gz3Var);
        gz3 gz3Var2 = (gz3) tb1Var.b(j24Var.e);
        u04VarD.b();
        ((v04) u04VarD.g).G(gz3Var2);
        int i = j24Var.f;
        u04VarD.b();
        ((v04) u04VarD.g).H(i);
        return (v04) u04VarD.d();
    }

    public static z04 b(l24 l24Var) {
        y04 y04VarF = z04.F();
        v04 v04VarA = a(l24Var.j);
        y04VarF.b();
        ((z04) y04VarF.g).J(v04VarA);
        byte[] bArrQ = a30.q(l24Var.k);
        y44 y44Var = a54.g;
        y44 y44VarN = a54.n(bArrQ, 0, bArrQ.length);
        y04VarF.b();
        ((z04) y04VarF.g).K(y44VarN);
        byte[] bArrQ2 = a30.q(l24Var.j.b);
        y44 y44VarN2 = a54.n(bArrQ2, 0, bArrQ2.length);
        y04VarF.b();
        ((z04) y04VarF.g).L(y44VarN2);
        y04VarF.b();
        ((z04) y04VarF.g).I(0);
        return (z04) y04VarF.d();
    }

    public static x34 c(a54 a54Var) {
        return new x34(new BigInteger(1, a54Var.p()));
    }
}
