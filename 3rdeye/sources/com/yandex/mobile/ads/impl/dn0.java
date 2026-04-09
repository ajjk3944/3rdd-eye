package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class dn0 {
    public static cn0 a(du1 du1Var) {
        String strB;
        cn0 cn0Var;
        if (du1Var != null && (strB = du1Var.B()) != null) {
            cn0.f25716c.getClass();
            cn0[] cn0VarArrValues = cn0.values();
            int length = cn0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cn0Var = null;
                    break;
                }
                cn0Var = cn0VarArrValues[i];
                if (kotlin.jvm.internal.l.b(cn0Var.b(), strB)) {
                    break;
                }
                i++;
            }
            if (cn0Var != null) {
                return cn0Var;
            }
        }
        cn0.f25716c.getClass();
        return cn0.f25717d;
    }
}
