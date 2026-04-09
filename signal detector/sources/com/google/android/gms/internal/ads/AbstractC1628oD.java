package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.oD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1628oD extends XC {

    /* renamed from: j, reason: collision with root package name */
    public static final Cr f15917j;

    /* renamed from: k, reason: collision with root package name */
    public static final HD f15918k = new HD(AbstractC1628oD.class);

    /* renamed from: h, reason: collision with root package name */
    public volatile Set f15919h;
    public volatile int i;

    static {
        Throwable th;
        Cr c1574nD;
        try {
            c1574nD = new C1520mD(11);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c1574nD = new C1574nD(11);
        }
        Throwable th3 = th;
        f15917j = c1574nD;
        if (th3 != null) {
            f15918k.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
