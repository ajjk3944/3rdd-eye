package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hq;

/* loaded from: classes3.dex */
public final class fq implements s62 {
    private static hq b(cs0 cs0Var, aq aqVar) {
        int iOrdinal;
        String strA = aqVar.a();
        if (strA == null) {
            return null;
        }
        try {
            iOrdinal = aqVar.ordinal();
        } catch (ClassCastException unused) {
        }
        if (iOrdinal == 0) {
            return new hq.c(cs0Var.d(strA));
        }
        if (iOrdinal == 1) {
            return new hq.d(cs0Var.d(strA));
        }
        if (iOrdinal == 2) {
            return new hq.b(cs0Var.a(strA, false));
        }
        if (iOrdinal == 3) {
            return new hq.e(cs0Var.d(strA));
        }
        if (iOrdinal == 4) {
            return new hq.f(cs0Var.d(strA));
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new b9.j();
    }

    @Override // com.yandex.mobile.ads.impl.s62
    public final hq a(cs0 localStorage, aq type) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        kotlin.jvm.internal.l.f(type, "type");
        if (type.a() == null || !localStorage.c(type.a())) {
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
                if (kotlin.jvm.internal.l.b(aqVar.a(), key)) {
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
