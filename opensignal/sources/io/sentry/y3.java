package io.sentry;

/* loaded from: classes.dex */
public interface y3 {
    static boolean H(u0 u0Var, String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        u0Var.m(b5.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    x3 k(b1 b1Var, x5 x5Var);
}
