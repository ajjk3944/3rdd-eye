package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class SF {

    /* renamed from: b, reason: collision with root package name */
    public static final SF f11162b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11163a = new HashMap();

    static {
        C1790rE c1790rE = C1790rE.f16494k;
        SF sf = new SF();
        try {
            sf.a(c1790rE, QF.class);
            f11162b = sf;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException("unexpected error.", e6);
        }
    }

    public final synchronized void a(FF ff, Class cls) {
        try {
            HashMap map = this.f11163a;
            FF ff2 = (FF) map.get(cls);
            if (ff2 != null && !ff2.equals(ff)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, ff);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Cr b(AbstractC1089eE abstractC1089eE, Integer num) {
        Cr crA;
        synchronized (this) {
            FF ff = (FF) this.f11163a.get(abstractC1089eE.getClass());
            if (ff == null) {
                String string = abstractC1089eE.toString();
                StringBuilder sb = new StringBuilder(string.length() + 86);
                sb.append("Cannot create a new key for parameters ");
                sb.append(string);
                sb.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb.toString());
            }
            crA = ff.a(abstractC1089eE, num);
        }
        return crA;
    }
}
