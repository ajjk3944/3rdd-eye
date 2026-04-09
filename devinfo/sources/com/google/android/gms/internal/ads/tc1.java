package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tc1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f16782c = Logger.getLogger(tc1.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final tc1 f16783d = new tc1();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f16784a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16785b = new ConcurrentHashMap();

    public final synchronized void a(zc1 zc1Var, boolean z3) {
        c(zc1Var, 1, z3);
    }

    public final zc1 b(Class cls, String str) throws GeneralSecurityException {
        zc1 zc1VarD = d(str);
        if (zc1VarD.f19059b.equals(cls)) {
            return zc1VarD;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zc1VarD.getClass());
        String string = zc1VarD.f19059b.toString();
        StringBuilder sb2 = new StringBuilder(r5.c.f(name.length() + 53, 23, strValueOf) + string.length());
        je.u.B(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(d.h.w(sb2, ", which only supports: ", string));
    }

    public final synchronized void c(zc1 zc1Var, int i4, boolean z3) {
        if (!al0.q(i4)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(zc1Var, z3);
    }

    public final synchronized zc1 d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f16784a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (zc1) concurrentHashMap.get(str);
    }

    public final synchronized void e(zc1 zc1Var, boolean z3) {
        try {
            String str = zc1Var.f19058a;
            if (z3) {
                ConcurrentHashMap concurrentHashMap = this.f16785b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f16784a;
            zc1 zc1Var2 = (zc1) concurrentHashMap2.get(str);
            if (zc1Var2 != null && !zc1Var2.getClass().equals(zc1Var.getClass())) {
                f16782c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + zc1Var2.getClass().getName() + ", cannot be re-registered with " + zc1Var.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, zc1Var);
            this.f16785b.put(str, Boolean.valueOf(z3));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
