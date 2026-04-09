package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class MG implements InterfaceC1577nG {

    /* renamed from: a, reason: collision with root package name */
    public static final MG f9856a = new MG();

    /* renamed from: b, reason: collision with root package name */
    public static final C1309iG f9857b = new C1309iG(PF.class, InterfaceC1035dE.class, C1414kF.f15079E);

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Class a() {
        return InterfaceC1035dE.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Object b(C2041vw c2041vw, RF rf, Vu vu) throws GeneralSecurityException {
        C1313iK c1313iKW;
        List list;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) c2041vw.f17369b).size(); i++) {
            C0926bE c0926bEX = c2041vw.x(i);
            if (c0926bEX.f13330b.equals(YD.f12606c)) {
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
                C1414kF c1414kF = new C1414kF(16);
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
                list.add(c1414kF);
            }
        }
        if (!rf.f10877a.isEmpty()) {
            WF.f12193b.a().getClass();
        }
        c2041vw.j();
        return new LG();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1577nG
    public final Class c() {
        return InterfaceC1035dE.class;
    }
}
