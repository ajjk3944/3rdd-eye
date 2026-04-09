package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1472lJ implements InterfaceC1577nG {

    /* renamed from: a, reason: collision with root package name */
    public static final C1472lJ f15378a = new C1472lJ();

    /* renamed from: b, reason: collision with root package name */
    public static final C1309iG f15379b = new C1309iG(PF.class, InterfaceC1199gE.class, C1312iJ.f14707b);

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Class a() {
        return InterfaceC1199gE.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Object b(C2041vw c2041vw, RF rf, Vu vu) throws GeneralSecurityException {
        C1313iK c1313iKW;
        List arrayList;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) c2041vw.f17369b).size(); i++) {
            C0926bE c0926bEX = c2041vw.x(i);
            if (c0926bEX.f13330b.equals(YD.f12606c)) {
                InterfaceC1199gE interfaceC1199gE = (InterfaceC1199gE) vu.w(c0926bEX);
                Cr crA = c0926bEX.a();
                if (crA instanceof DJ) {
                    c1313iKW = ((DJ) crA).W();
                } else {
                    if (!(crA instanceof PF)) {
                        String name = crA.getClass().getName();
                        String strValueOf = String.valueOf(crA.g());
                        throw new GeneralSecurityException(AbstractC1135f5.o(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    c1313iKW = ((PF) crA).W();
                }
                C1364jJ c1364jJ = new C1364jJ(interfaceC1199gE, c0926bEX.f13331c);
                byte[] bArr = c1313iKW.f14720a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(c1313iKW)) {
                    arrayList = (List) map.get(c1313iKW);
                } else {
                    arrayList = new ArrayList();
                    map.put(c1313iKW, arrayList);
                }
                arrayList.add(c1364jJ);
            }
        }
        if (!rf.f10877a.isEmpty()) {
            WF.f12193b.a().getClass();
        }
        return new C1418kJ(new C1255hG(map));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Class c() {
        return InterfaceC1199gE.class;
    }
}
