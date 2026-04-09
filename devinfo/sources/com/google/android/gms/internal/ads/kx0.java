package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kx0 extends jx0 {

    /* renamed from: i, reason: collision with root package name */
    public static kx0 f13287i;

    public static final kx0 f(Context context) {
        kx0 kx0Var;
        synchronized (kx0.class) {
            try {
                if (f13287i == null) {
                    f13287i = new kx0(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                kx0Var = f13287i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kx0Var;
    }

    public final androidx.recyclerview.widget.d g(long j, boolean z3) {
        androidx.recyclerview.widget.d dVarA;
        synchronized (kx0.class) {
            dVarA = a(null, null, j, z3);
        }
        return dVarA;
    }

    public final void h() {
        synchronized (kx0.class) {
            c(false);
        }
    }
}
