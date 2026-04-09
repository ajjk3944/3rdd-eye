package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tw3 implements ew3 {
    public static final tw3 a = new tw3();

    @Override // defpackage.ew3
    public final Class a() {
        return sw3.class;
    }

    @Override // defpackage.ew3
    public final Object b(jr3 jr3Var, hv3 hv3Var, lv2 lv2Var) throws GeneralSecurityException {
        v34 v34VarR0;
        List list;
        ir3 ir3VarI = jr3Var.i();
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) jr3Var.g).size(); i++) {
            ir3 ir3VarO = jr3Var.o(i);
            if (ir3VarO.b.equals(er3.h)) {
                sw3 sw3Var = (sw3) lv2Var.g(ir3VarO);
                gi2 gi2VarA = ir3VarO.a();
                if (gi2VarA instanceof bx3) {
                    v34VarR0 = ((bx3) gi2VarA).r0();
                } else {
                    if (!(gi2VarA instanceof fv3)) {
                        String name = gi2VarA.getClass().getName();
                        String strValueOf = String.valueOf(gi2VarA.D());
                        throw new GeneralSecurityException(ex0.m(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    v34VarR0 = ((fv3) gi2VarA).r0();
                }
                byte[] bArr = v34VarR0.a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(v34VarR0)) {
                    list = (List) map.get(v34VarR0);
                } else {
                    ArrayList arrayList = new ArrayList();
                    map.put(v34VarR0, arrayList);
                    list = arrayList;
                }
                list.add(sw3Var);
            }
        }
        return new sw3();
    }

    @Override // defpackage.ew3
    public final Class d() {
        return sw3.class;
    }
}
