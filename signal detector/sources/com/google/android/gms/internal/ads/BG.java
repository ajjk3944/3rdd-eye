package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class BG implements InterfaceC1577nG {

    /* renamed from: a, reason: collision with root package name */
    public static final BG f7329a = new BG();

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Class a() {
        return AG.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Object b(C2041vw c2041vw, RF rf, Vu vu) throws GeneralSecurityException {
        C1313iK c1313iKW;
        List list;
        C0926bE c0926bEJ = c2041vw.j();
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) c2041vw.f17369b).size(); i++) {
            C0926bE c0926bEX = c2041vw.x(i);
            if (c0926bEX.f13330b.equals(YD.f12606c)) {
                AG ag = (AG) vu.w(c0926bEX);
                Cr crA = c0926bEX.a();
                if (crA instanceof JG) {
                    c1313iKW = ((JG) crA).W();
                } else {
                    if (!(crA instanceof PF)) {
                        String name = crA.getClass().getName();
                        String strValueOf = String.valueOf(crA.g());
                        throw new GeneralSecurityException(AbstractC1135f5.o(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    c1313iKW = ((PF) crA).W();
                }
                byte[] bArr = c1313iKW.f14720a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(c1313iKW)) {
                    list = (List) map.get(c1313iKW);
                } else {
                    ArrayList arrayList = new ArrayList();
                    map.put(c1313iKW, arrayList);
                    list = arrayList;
                }
                list.add(ag);
            }
        }
        return new AG();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Class c() {
        return AG.class;
    }
}
