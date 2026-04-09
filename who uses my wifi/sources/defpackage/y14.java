package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y14 implements ew3 {
    public static final y14 a = new y14();
    public static final aw3 b = new aw3(fv3.class, or3.class, tt3.B);

    @Override // defpackage.ew3
    public final Class a() {
        return or3.class;
    }

    @Override // defpackage.ew3
    public final Object b(jr3 jr3Var, hv3 hv3Var, lv2 lv2Var) throws GeneralSecurityException {
        v34 v34VarR0;
        List arrayList;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) jr3Var.g).size(); i++) {
            ir3 ir3VarO = jr3Var.o(i);
            if (ir3VarO.b.equals(er3.h)) {
                or3 or3Var = (or3) lv2Var.g(ir3VarO);
                gi2 gi2VarA = ir3VarO.a();
                if (gi2VarA instanceof p24) {
                    v34VarR0 = ((p24) gi2VarA).r0();
                } else {
                    if (!(gi2VarA instanceof fv3)) {
                        String name = gi2VarA.getClass().getName();
                        String strValueOf = String.valueOf(gi2VarA.D());
                        throw new GeneralSecurityException(ex0.m(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    v34VarR0 = ((fv3) gi2VarA).r0();
                }
                w14 w14Var = new w14(or3Var, ir3VarO.c);
                byte[] bArr = v34VarR0.a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(v34VarR0)) {
                    arrayList = (List) map.get(v34VarR0);
                } else {
                    arrayList = new ArrayList();
                    map.put(v34VarR0, arrayList);
                }
                arrayList.add(w14Var);
            }
        }
        if (!hv3Var.a.isEmpty()) {
            nv3.b.a().getClass();
        }
        return new x14(new zv3(map));
    }

    @Override // defpackage.ew3
    public final Class d() {
        return or3.class;
    }
}
