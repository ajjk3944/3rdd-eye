package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yj1 implements ae1 {

    /* renamed from: a, reason: collision with root package name */
    public static final yj1 f18782a = new yj1();

    /* renamed from: b, reason: collision with root package name */
    public static final vd1 f18783b = new vd1(cd1.class, u91.class, df1.f10453i);

    @Override // com.google.android.gms.internal.ads.ae1
    public final Class a() {
        return u91.class;
    }

    @Override // com.google.android.gms.internal.ads.ae1
    public final Class b() {
        return u91.class;
    }

    @Override // com.google.android.gms.internal.ads.ae1
    public final Object c(av0 av0Var, ed1 ed1Var, ce1 ce1Var) throws GeneralSecurityException {
        vl1 vl1VarZ;
        List arrayList;
        HashMap map = new HashMap();
        for (int i4 = 0; i4 < ((List) av0Var.f9422b).size(); i4++) {
            p91 p91VarX = av0Var.x(i4);
            if (p91VarX.f14930b.equals(m91.f13807c)) {
                u91 u91Var = (u91) ce1Var.f(p91VarX);
                al0 al0VarA = p91VarX.a();
                if (al0VarA instanceof qk1) {
                    vl1VarZ = ((qk1) al0VarA).Z();
                } else {
                    if (!(al0VarA instanceof cd1)) {
                        String name = al0VarA.getClass().getName();
                        String strValueOf = String.valueOf(al0VarA.k());
                        throw new GeneralSecurityException(a0.g.p(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    vl1VarZ = ((cd1) al0VarA).Z();
                }
                wj1 wj1Var = new wj1(u91Var, p91VarX.f14931c);
                byte[] bArr = vl1VarZ.f17649a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(vl1VarZ)) {
                    arrayList = (List) map.get(vl1VarZ);
                } else {
                    arrayList = new ArrayList();
                    map.put(vl1VarZ, arrayList);
                }
                arrayList.add(wj1Var);
            }
        }
        if (!ed1Var.f10766a.isEmpty()) {
            jd1.f12719b.a().getClass();
        }
        return new xj1(new ud1(map));
    }
}
