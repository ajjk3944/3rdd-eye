package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final hd1 f11841b = new hd1();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11842a = new HashMap();

    public final synchronized void a(gd1 gd1Var, Class cls) {
        try {
            HashMap map = this.f11842a;
            gd1 gd1Var2 = (gd1) map.get(cls);
            if (gd1Var2 != null && !gd1Var2.equals(gd1Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, gd1Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
