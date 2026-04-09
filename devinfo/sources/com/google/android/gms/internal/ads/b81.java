package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b81 extends al0 {
    @Override // com.google.android.gms.internal.ads.al0
    public final void p(z71 z71Var, Set set) {
        synchronized (z71Var) {
            try {
                if (z71Var.f10017h == null) {
                    z71Var.f10017h = set;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final int t(z71 z71Var) {
        int i4;
        synchronized (z71Var) {
            i4 = z71Var.f10018i - 1;
            z71Var.f10018i = i4;
        }
        return i4;
    }
}
