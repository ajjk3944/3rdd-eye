package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class Px extends Ox {
    public static Px i;

    public static final Px f(Context context) {
        Px px;
        synchronized (Px.class) {
            try {
                if (i == null) {
                    i = new Px(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                px = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return px;
    }

    public final U1.b g(long j6, boolean z6) {
        U1.b bVarA;
        synchronized (Px.class) {
            bVarA = a(null, null, j6, z6);
        }
        return bVarA;
    }

    public final void h() {
        synchronized (Px.class) {
            c(false);
        }
    }
}
