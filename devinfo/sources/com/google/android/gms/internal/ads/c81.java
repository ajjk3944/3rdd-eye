package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c81 extends l71 {
    public static final al0 j;

    /* renamed from: k, reason: collision with root package name */
    public static final v81 f10016k = new v81(0, c81.class);

    /* renamed from: h, reason: collision with root package name */
    public volatile Set f10017h;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f10018i;

    static {
        Throwable th2;
        al0 b81Var;
        try {
            b81Var = new a81(11);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            b81Var = new b81(11);
        }
        Throwable th4 = th2;
        j = b81Var;
        if (th4 != null) {
            f10016k.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th4);
        }
    }
}
