package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ze1 implements ae1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ze1 f19070a = new ze1();

    /* renamed from: b, reason: collision with root package name */
    public static final vd1 f19071b = new vd1(cd1.class, r91.class, ub1.f17167x);

    @Override // com.google.android.gms.internal.ads.ae1
    public final Class a() {
        return r91.class;
    }

    @Override // com.google.android.gms.internal.ads.ae1
    public final Class b() {
        return r91.class;
    }

    @Override // com.google.android.gms.internal.ads.ae1
    public final Object c(av0 av0Var, ed1 ed1Var, ce1 ce1Var) throws GeneralSecurityException {
        vl1 vl1VarZ;
        List list;
        HashMap map = new HashMap();
        for (int i4 = 0; i4 < ((List) av0Var.f9422b).size(); i4++) {
            p91 p91VarX = av0Var.x(i4);
            if (p91VarX.f14930b.equals(m91.f13807c)) {
                al0 al0VarA = p91VarX.a();
                if (al0VarA instanceof we1) {
                    vl1VarZ = ((we1) al0VarA).Z();
                } else {
                    if (!(al0VarA instanceof cd1)) {
                        String name = al0VarA.getClass().getName();
                        String strValueOf = String.valueOf(al0VarA.k());
                        throw new GeneralSecurityException(a0.g.p(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    vl1VarZ = ((cd1) al0VarA).Z();
                }
                ub1 ub1Var = new ub1(23);
                byte[] bArr = vl1VarZ.f17649a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(vl1VarZ)) {
                    list = (List) map.get(vl1VarZ);
                } else {
                    ArrayList arrayList = new ArrayList();
                    map.put(vl1VarZ, arrayList);
                    list = arrayList;
                }
                list.add(ub1Var);
            }
        }
        if (!ed1Var.f10766a.isEmpty()) {
            jd1.f12719b.a().getClass();
        }
        av0Var.m();
        return new ye1();
    }
}
