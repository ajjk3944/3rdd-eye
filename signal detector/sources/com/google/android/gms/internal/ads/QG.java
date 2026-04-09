package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class QG {

    /* renamed from: a, reason: collision with root package name */
    public static final Vu f10595a;

    /* renamed from: b, reason: collision with root package name */
    public static final Vu f10596b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1037dG f10597c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0928bG f10598d;

    /* renamed from: e, reason: collision with root package name */
    public static final JF f10599e;

    /* renamed from: f, reason: collision with root package name */
    public static final HF f10600f;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        EnumC1956uI enumC1956uI = EnumC1956uI.RAW;
        GG gg = GG.f8346e;
        map.put(enumC1956uI, gg);
        map2.put(gg, enumC1956uI);
        EnumC1956uI enumC1956uI2 = EnumC1956uI.TINK;
        GG gg2 = GG.f8343b;
        map.put(enumC1956uI2, gg2);
        map2.put(gg2, enumC1956uI2);
        EnumC1956uI enumC1956uI3 = EnumC1956uI.LEGACY;
        GG gg3 = GG.f8345d;
        map.put(enumC1956uI3, gg3);
        map2.put(gg3, enumC1956uI3);
        EnumC1956uI enumC1956uI4 = EnumC1956uI.CRUNCHY;
        GG gg4 = GG.f8344c;
        map.put(enumC1956uI4, gg4);
        map2.put(gg4, enumC1956uI4);
        f10595a = new Vu(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        RH rh = RH.SHA1;
        FG fg = FG.f8075b;
        map3.put(rh, fg);
        map4.put(fg, rh);
        RH rh2 = RH.SHA224;
        FG fg2 = FG.f8076c;
        map3.put(rh2, fg2);
        map4.put(fg2, rh2);
        RH rh3 = RH.SHA256;
        FG fg3 = FG.f8077d;
        map3.put(rh3, fg3);
        map4.put(fg3, rh3);
        RH rh4 = RH.SHA384;
        FG fg4 = FG.f8078e;
        map3.put(rh4, fg4);
        map4.put(fg4, rh4);
        RH rh5 = RH.SHA512;
        FG fg5 = FG.f8079f;
        map3.put(rh5, fg5);
        map4.put(fg5, rh5);
        f10596b = new Vu(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
        f10597c = new C1037dG(HG.class, C1414kF.M);
        f10598d = new C0928bG(c1313iKA, C1414kF.f15084J);
        f10599e = new JF(DG.class, C1414kF.f15085K);
        f10600f = new HF(c1313iKA, C1414kF.f15086L);
    }
}
