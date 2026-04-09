package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class GF {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f8339c = Logger.getLogger(GF.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final GF f8340d = new GF();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8341a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8342b = new ConcurrentHashMap();

    public final synchronized void a(MF mf, boolean z6) {
        c(mf, 1, z6);
    }

    public final MF b(Class cls, String str) throws GeneralSecurityException {
        MF mfD = d(str);
        if (mfD.f9854b.equals(cls)) {
            return mfD;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(mfD.getClass());
        String string = mfD.f9854b.toString();
        StringBuilder sb = new StringBuilder(AbstractC2763b.b(name.length() + 53, 23, strValueOf) + string.length());
        A.f.w(sb, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(A.f.p(sb, ", which only supports: ", string));
    }

    public final synchronized void c(MF mf, int i, boolean z6) {
        if (!Cr.m(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(mf, z6);
    }

    public final synchronized MF d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f8341a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (MF) concurrentHashMap.get(str);
    }

    public final synchronized void e(MF mf, boolean z6) {
        try {
            String str = mf.f9853a;
            if (z6) {
                ConcurrentHashMap concurrentHashMap = this.f8342b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f8341a;
            MF mf2 = (MF) concurrentHashMap2.get(str);
            if (mf2 != null && !mf2.getClass().equals(mf.getClass())) {
                f8339c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + mf2.getClass().getName() + ", cannot be re-registered with " + mf.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, mf);
            this.f8342b.put(str, Boolean.valueOf(z6));
        } catch (Throwable th) {
            throw th;
        }
    }
}
