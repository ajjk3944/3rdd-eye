package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class HJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f8886a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f8887b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f8888c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f8889d;

    /* renamed from: e, reason: collision with root package name */
    public static final JF f8890e;

    /* renamed from: f, reason: collision with root package name */
    public static final HF f8891f;

    /* renamed from: g, reason: collision with root package name */
    public static final Vu f8892g;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        C1313iK c1313iKA2 = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f8886a = new C1037dG(C0985cJ.class, C1312iJ.f14695F);
        f8887b = new C0928bG(c1313iKA, C1312iJ.f14717m);
        f8888c = new JF(C1149fJ.class, C1312iJ.f14718n);
        f8889d = new HF(c1313iKA2, C1312iJ.f14692C);
        f8890e = new JF(C1040dJ.class, C1312iJ.f14693D);
        f8891f = new HF(c1313iKA, C1312iJ.f14694E);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        EnumC1956uI enumC1956uI = EnumC1956uI.RAW;
        C0931bJ c0931bJ = C0931bJ.f13342e;
        map.put(enumC1956uI, c0931bJ);
        map2.put(c0931bJ, enumC1956uI);
        EnumC1956uI enumC1956uI2 = EnumC1956uI.TINK;
        C0931bJ c0931bJ2 = C0931bJ.f13339b;
        map.put(enumC1956uI2, c0931bJ2);
        map2.put(c0931bJ2, enumC1956uI2);
        EnumC1956uI enumC1956uI3 = EnumC1956uI.CRUNCHY;
        C0931bJ c0931bJ3 = C0931bJ.f13340c;
        map.put(enumC1956uI3, c0931bJ3);
        map2.put(c0931bJ3, enumC1956uI3);
        EnumC1956uI enumC1956uI4 = EnumC1956uI.LEGACY;
        C0931bJ c0931bJ4 = C0931bJ.f13341d;
        map.put(enumC1956uI4, c0931bJ4);
        map2.put(c0931bJ4, enumC1956uI4);
        f8892g = new Vu(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static QH a(C1149fJ c1149fJ) {
        PH phD = QH.D();
        byte[] bArrB = c1149fJ.f14052d.b();
        OK okR = QK.r(0, bArrB.length, bArrB);
        phD.b();
        ((QH) phD.f13551b).G(okR);
        return (QH) phD.d();
    }
}
