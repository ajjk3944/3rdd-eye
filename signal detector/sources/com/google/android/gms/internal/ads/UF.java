package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class UF {

    /* renamed from: b, reason: collision with root package name */
    public static final UF f11629b = new UF();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11630a = new HashMap();

    public final synchronized void a(TF tf, Class cls) {
        try {
            HashMap map = this.f11630a;
            TF tf2 = (TF) map.get(cls);
            if (tf2 != null && !tf2.equals(tf)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, tf);
        } catch (Throwable th) {
            throw th;
        }
    }
}
