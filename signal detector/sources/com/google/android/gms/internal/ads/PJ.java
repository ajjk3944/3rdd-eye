package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class PJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f10339a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f10340b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f10341c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f10342d;

    /* renamed from: e, reason: collision with root package name */
    public static final JF f10343e;

    /* renamed from: f, reason: collision with root package name */
    public static final HF f10344f;

    /* renamed from: g, reason: collision with root package name */
    public static final Vu f10345g;

    /* renamed from: h, reason: collision with root package name */
    public static final Vu f10346h;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        C1313iK c1313iKA2 = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f10339a = new C1037dG(C2119xJ.class, C1312iJ.f14706R);
        f10340b = new C0928bG(c1313iKA, C1312iJ.M);
        f10341c = new JF(C2227zJ.class, C1312iJ.f14702N);
        f10342d = new HF(c1313iKA2, C1312iJ.f14703O);
        f10343e = new JF(C2173yJ.class, C1312iJ.f14704P);
        f10344f = new HF(c1313iKA, C1312iJ.f14705Q);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        EnumC1956uI enumC1956uI = EnumC1956uI.RAW;
        C2065wJ c2065wJ = C2065wJ.f17421e;
        map.put(enumC1956uI, c2065wJ);
        map2.put(c2065wJ, enumC1956uI);
        EnumC1956uI enumC1956uI2 = EnumC1956uI.TINK;
        C2065wJ c2065wJ2 = C2065wJ.f17418b;
        map.put(enumC1956uI2, c2065wJ2);
        map2.put(c2065wJ2, enumC1956uI2);
        EnumC1956uI enumC1956uI3 = EnumC1956uI.CRUNCHY;
        C2065wJ c2065wJ3 = C2065wJ.f17419c;
        map.put(enumC1956uI3, c2065wJ3);
        map2.put(c2065wJ3, enumC1956uI3);
        EnumC1956uI enumC1956uI4 = EnumC1956uI.LEGACY;
        C2065wJ c2065wJ4 = C2065wJ.f17420d;
        map.put(enumC1956uI4, c2065wJ4);
        map2.put(c2065wJ4, enumC1956uI4);
        f10345g = new Vu(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        RH rh = RH.SHA256;
        C2011vJ c2011vJ = C2011vJ.f17253b;
        map3.put(rh, c2011vJ);
        map4.put(c2011vJ, rh);
        RH rh2 = RH.SHA384;
        C2011vJ c2011vJ2 = C2011vJ.f17254c;
        map3.put(rh2, c2011vJ2);
        map4.put(c2011vJ2, rh2);
        RH rh3 = RH.SHA512;
        C2011vJ c2011vJ3 = C2011vJ.f17255d;
        map3.put(rh3, c2011vJ3);
        map4.put(c2011vJ3, rh3);
        f10346h = new Vu(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
    }

    public static HI a(C2119xJ c2119xJ) {
        GI giD = HI.D();
        C2011vJ c2011vJ = c2119xJ.f17573d;
        Vu vu = f10346h;
        RH rh = (RH) vu.y(c2011vJ);
        giD.b();
        ((HI) giD.f13551b).F(rh);
        RH rh2 = (RH) vu.y(c2119xJ.f17574e);
        giD.b();
        ((HI) giD.f13551b).G(rh2);
        int i = c2119xJ.f17575f;
        giD.b();
        ((HI) giD.f13551b).H(i);
        return (HI) giD.d();
    }

    public static LI b(C2227zJ c2227zJ) {
        KI kiF = LI.F();
        HI hiA = a(c2227zJ.f17853c);
        kiF.b();
        ((LI) kiF.f13551b).J(hiA);
        byte[] bArrL = C1476lN.l(c2227zJ.f17854d);
        OK ok = QK.f10609b;
        OK okR = QK.r(0, bArrL.length, bArrL);
        kiF.b();
        ((LI) kiF.f13551b).K(okR);
        byte[] bArrL2 = C1476lN.l(c2227zJ.f17853c.f17571b);
        OK okR2 = QK.r(0, bArrL2.length, bArrL2);
        kiF.b();
        ((LI) kiF.f13551b).L(okR2);
        kiF.b();
        ((LI) kiF.f13551b).I(0);
        return (LI) kiF.d();
    }

    public static Wu c(QK qk) {
        return new Wu(6, new BigInteger(1, qk.u()));
    }
}
