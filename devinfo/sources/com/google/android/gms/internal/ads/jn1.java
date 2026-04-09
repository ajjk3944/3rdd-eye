package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jn1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile jn1 f12801a;

    /* renamed from: b, reason: collision with root package name */
    public static final jn1 f12802b;

    static {
        jn1 jn1Var = new jn1();
        Map map = Collections.EMPTY_MAP;
        f12802b = jn1Var;
    }

    public static jn1 a() {
        jn1 jn1Var = f12801a;
        if (jn1Var != null) {
            return jn1Var;
        }
        synchronized (jn1.class) {
            try {
                jn1 jn1Var2 = f12801a;
                if (jn1Var2 != null) {
                    return jn1Var2;
                }
                int i4 = um1.f17262a;
                jn1 jn1VarK = nn1.k();
                f12801a = jn1VarK;
                return jn1VarK;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
