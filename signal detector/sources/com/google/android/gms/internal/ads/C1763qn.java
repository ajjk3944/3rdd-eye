package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763qn {

    /* renamed from: a, reason: collision with root package name */
    public final C1492lm f16399a;

    public C1763qn(C1492lm c1492lm) {
        this.f16399a = c1492lm;
    }

    public final void a() {
        q2.B0 b0X = this.f16399a.X();
        q2.C0 c0P = null;
        if (b0X != null) {
            try {
                c0P = b0X.p();
            } catch (RemoteException unused) {
            }
        }
        if (c0P == null) {
            return;
        }
        try {
            c0P.b();
        } catch (RemoteException e6) {
            u2.k.i("Unable to call onVideoEnd()", e6);
        }
    }
}
