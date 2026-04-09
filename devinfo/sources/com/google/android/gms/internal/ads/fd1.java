package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final fd1 f11109b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11110a = new HashMap();

    static {
        ga1 ga1Var = ga1.f11443k;
        fd1 fd1Var = new fd1();
        try {
            fd1Var.a(ga1Var, dd1.class);
            f11109b = fd1Var;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("unexpected error.", e2);
        }
    }

    public final synchronized void a(sc1 sc1Var, Class cls) {
        try {
            HashMap map = this.f11110a;
            sc1 sc1Var2 = (sc1) map.get(cls);
            if (sc1Var2 != null && !sc1Var2.equals(sc1Var)) {
                String string = cls.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 60);
                sb2.append("Different key creator for parameters class ");
                sb2.append(string);
                sb2.append(" already inserted");
                throw new GeneralSecurityException(sb2.toString());
            }
            map.put(cls, sc1Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final al0 b(s91 s91Var, Integer num) {
        al0 al0VarA;
        synchronized (this) {
            sc1 sc1Var = (sc1) this.f11110a.get(s91Var.getClass());
            if (sc1Var == null) {
                String string = s91Var.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 86);
                sb2.append("Cannot create a new key for parameters ");
                sb2.append(string);
                sb2.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb2.toString());
            }
            al0VarA = sc1Var.a(s91Var, num);
        }
        return al0VarA;
    }
}
