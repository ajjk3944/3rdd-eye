package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hq;

/* loaded from: classes3.dex */
public final class gq implements s62 {
    private static hq b(cs0 cs0Var, aq aqVar) {
        String strB = aqVar.b();
        try {
            int iOrdinal = aqVar.ordinal();
            if (iOrdinal == 0) {
                return new hq.c(cs0Var.d(strB));
            }
            boolean z10 = true;
            if (iOrdinal == 1) {
                int iB = cs0Var.b(-1, strB);
                Integer numValueOf = Integer.valueOf(iB);
                if (iB == -1) {
                    numValueOf = null;
                }
                return new hq.d(numValueOf != null ? String.valueOf(numValueOf.intValue()) : null);
            }
            if (iOrdinal == 2) {
                if (cs0Var.b(-1, strB) == -1) {
                    z10 = false;
                }
                return new hq.b(z10);
            }
            if (iOrdinal == 3) {
                return new hq.e(cs0Var.d(strB));
            }
            if (iOrdinal == 4) {
                return new hq.f(cs0Var.d(strB));
            }
            if (iOrdinal == 5) {
                return new hq.a(cs0Var.d(strB));
            }
            throw new b9.j();
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.s62
    public final hq a(cs0 localStorage, aq type) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        kotlin.jvm.internal.l.f(type, "type");
        if (!localStorage.c(type.b())) {
            type = null;
        }
        if (type != null) {
            return b(localStorage, type);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.s62
    public final hq a(cs0 localStorage, String key) {
        aq aqVar;
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        kotlin.jvm.internal.l.f(key, "key");
        if (!localStorage.c(key)) {
            key = null;
        }
        if (key != null) {
            aq.f24788d.getClass();
            aq[] aqVarArrValues = aq.values();
            int length = aqVarArrValues.length;
            for (int i = 0; i < length; i++) {
                aqVar = aqVarArrValues[i];
                if (kotlin.jvm.internal.l.b(aqVar.b(), key)) {
                    break;
                }
            }
            aqVar = null;
        } else {
            aqVar = null;
        }
        if (aqVar != null) {
            return b(localStorage, aqVar);
        }
        return null;
    }
}
