package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class hx3 {
    public static final tb1 a;
    public static final tb1 b;
    public static final vv3 c;
    public static final tv3 d;
    public static final zu3 e;
    public static final wu3 f;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        i04 i04Var = i04.RAW;
        yw3 yw3Var = yw3.e;
        map.put(i04Var, yw3Var);
        map2.put(yw3Var, i04Var);
        i04 i04Var2 = i04.TINK;
        yw3 yw3Var2 = yw3.b;
        map.put(i04Var2, yw3Var2);
        map2.put(yw3Var2, i04Var2);
        i04 i04Var3 = i04.LEGACY;
        yw3 yw3Var3 = yw3.d;
        map.put(i04Var3, yw3Var3);
        map2.put(yw3Var3, i04Var3);
        i04 i04Var4 = i04.CRUNCHY;
        yw3 yw3Var4 = yw3.c;
        map.put(i04Var4, yw3Var4);
        map2.put(yw3Var4, i04Var4);
        a = new tb1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        gz3 gz3Var = gz3.SHA1;
        xw3 xw3Var = xw3.b;
        map3.put(gz3Var, xw3Var);
        map4.put(xw3Var, gz3Var);
        gz3 gz3Var2 = gz3.SHA224;
        xw3 xw3Var2 = xw3.c;
        map3.put(gz3Var2, xw3Var2);
        map4.put(xw3Var2, gz3Var2);
        gz3 gz3Var3 = gz3.SHA256;
        xw3 xw3Var3 = xw3.d;
        map3.put(gz3Var3, xw3Var3);
        map4.put(xw3Var3, gz3Var3);
        gz3 gz3Var4 = gz3.SHA384;
        xw3 xw3Var4 = xw3.e;
        map3.put(gz3Var4, xw3Var4);
        map4.put(xw3Var4, gz3Var4);
        gz3 gz3Var5 = gz3.SHA512;
        xw3 xw3Var5 = xw3.f;
        map3.put(gz3Var5, xw3Var5);
        map4.put(xw3Var5, gz3Var5);
        b = new tb1(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
        c = new vv3(zw3.class, vt3.x);
        d = new tv3(v34VarA, tt3.x);
        e = new zu3(uw3.class, vt3.w);
        f = new wu3(v34VarA, tt3.y);
    }
}
