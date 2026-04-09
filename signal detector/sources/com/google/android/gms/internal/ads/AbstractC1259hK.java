package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.hK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1259hK implements InterfaceC1199gE {

    /* renamed from: a, reason: collision with root package name */
    public static final Vu f14474a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f14475b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14476c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        EnumC0932bK enumC0932bK = EnumC0932bK.f13344a;
        C2011vJ c2011vJ = C2011vJ.f17253b;
        map.put(enumC0932bK, c2011vJ);
        map2.put(c2011vJ, enumC0932bK);
        EnumC0932bK enumC0932bK2 = EnumC0932bK.f13345b;
        C2011vJ c2011vJ2 = C2011vJ.f17254c;
        map.put(enumC0932bK2, c2011vJ2);
        map2.put(c2011vJ2, enumC0932bK2);
        EnumC0932bK enumC0932bK3 = EnumC0932bK.f13346c;
        C2011vJ c2011vJ3 = C2011vJ.f17255d;
        map.put(enumC0932bK3, c2011vJ3);
        map2.put(c2011vJ3, enumC0932bK3);
        f14474a = new Vu(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        f14475b = new byte[0];
        f14476c = new byte[]{0};
    }
}
