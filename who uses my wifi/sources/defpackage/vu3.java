package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vu3 {
    public static final Logger c = Logger.getLogger(vu3.class.getName());
    public static final vu3 d = new vu3();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final synchronized void a(cv3 cv3Var, boolean z) {
        c(cv3Var, 1, z);
    }

    public final cv3 b(Class cls, String str) throws GeneralSecurityException {
        cv3 cv3VarD = d(str);
        if (cv3VarD.b.equals(cls)) {
            return cv3VarD;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(cv3VarD.getClass());
        String string = cv3VarD.b.toString();
        StringBuilder sb = new StringBuilder(ga1.i(strValueOf, name.length() + 53, 23) + string.length());
        ex0.q(sb, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(ex0.k(sb, ", which only supports: ", string));
    }

    public final synchronized void c(cv3 cv3Var, int i, boolean z) {
        if (!yb.x(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(cv3Var, z);
    }

    public final synchronized cv3 d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (cv3) concurrentHashMap.get(str);
    }

    public final synchronized void e(cv3 cv3Var, boolean z) {
        try {
            String str = cv3Var.a;
            if (z) {
                ConcurrentHashMap concurrentHashMap = this.b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.a;
            cv3 cv3Var2 = (cv3) concurrentHashMap2.get(str);
            if (cv3Var2 != null && !cv3Var2.getClass().equals(cv3Var.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + cv3Var2.getClass().getName() + ", cannot be re-registered with " + cv3Var.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, cv3Var);
            this.b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
