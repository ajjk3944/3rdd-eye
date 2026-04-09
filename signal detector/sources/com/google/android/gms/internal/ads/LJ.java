package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class LJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f9644a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f9645b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f9646c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f9647d;

    /* renamed from: e, reason: collision with root package name */
    public static final JF f9648e;

    /* renamed from: f, reason: collision with root package name */
    public static final HF f9649f;

    /* renamed from: g, reason: collision with root package name */
    public static final Vu f9650g;

    /* renamed from: h, reason: collision with root package name */
    public static final Vu f9651h;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        C1313iK c1313iKA2 = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f9644a = new C1037dG(C1688pJ.class, C1312iJ.f14701L);
        f9645b = new C0928bG(c1313iKA, C1312iJ.f14696G);
        f9646c = new JF(C1849sJ.class, C1312iJ.f14697H);
        f9647d = new HF(c1313iKA2, C1312iJ.f14698I);
        f9648e = new JF(C1795rJ.class, C1312iJ.f14699J);
        f9649f = new HF(c1313iKA, C1312iJ.f14700K);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        EnumC1956uI enumC1956uI = EnumC1956uI.RAW;
        C1634oJ c1634oJ = C1634oJ.f15931e;
        map.put(enumC1956uI, c1634oJ);
        map2.put(c1634oJ, enumC1956uI);
        EnumC1956uI enumC1956uI2 = EnumC1956uI.TINK;
        C1634oJ c1634oJ2 = C1634oJ.f15928b;
        map.put(enumC1956uI2, c1634oJ2);
        map2.put(c1634oJ2, enumC1956uI2);
        EnumC1956uI enumC1956uI3 = EnumC1956uI.CRUNCHY;
        C1634oJ c1634oJ3 = C1634oJ.f15929c;
        map.put(enumC1956uI3, c1634oJ3);
        map2.put(c1634oJ3, enumC1956uI3);
        EnumC1956uI enumC1956uI4 = EnumC1956uI.LEGACY;
        C1634oJ c1634oJ4 = C1634oJ.f15930d;
        map.put(enumC1956uI4, c1634oJ4);
        map2.put(c1634oJ4, enumC1956uI4);
        f9650g = new Vu(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        RH rh = RH.SHA256;
        C1580nJ c1580nJ = C1580nJ.f15763b;
        map3.put(rh, c1580nJ);
        map4.put(c1580nJ, rh);
        RH rh2 = RH.SHA384;
        C1580nJ c1580nJ2 = C1580nJ.f15764c;
        map3.put(rh2, c1580nJ2);
        map4.put(c1580nJ2, rh2);
        RH rh3 = RH.SHA512;
        C1580nJ c1580nJ3 = C1580nJ.f15765d;
        map3.put(rh3, c1580nJ3);
        map4.put(c1580nJ3, rh3);
        f9651h = new Vu(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
    }

    public static DI a(C1849sJ c1849sJ) {
        CI ciF = DI.F();
        C1688pJ c1688pJ = c1849sJ.f16702c;
        C2172yI c2172yIB = C2226zI.B();
        RH rh = (RH) f9651h.y(c1688pJ.f16160d);
        c2172yIB.b();
        ((C2226zI) c2172yIB.f13551b).D(rh);
        C2226zI c2226zI = (C2226zI) c2172yIB.d();
        ciF.b();
        ((DI) ciF.f13551b).I(c2226zI);
        byte[] bArrL = C1476lN.l(c1849sJ.f16703d);
        OK ok = QK.f10609b;
        OK okR = QK.r(0, bArrL.length, bArrL);
        ciF.b();
        ((DI) ciF.f13551b).J(okR);
        byte[] bArrL2 = C1476lN.l(c1849sJ.f16702c.f16158b);
        OK okR2 = QK.r(0, bArrL2.length, bArrL2);
        ciF.b();
        ((DI) ciF.f13551b).K(okR2);
        return (DI) ciF.d();
    }

    public static Wu b(QK qk) {
        return new Wu(6, new BigInteger(1, qk.u()));
    }
}
