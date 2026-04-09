package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.internal.ads.vD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2005vD extends AbstractC1466lD {

    /* renamed from: D, reason: collision with root package name */
    public C1951uD f17236D;

    @Override // com.google.android.gms.internal.ads.YC
    public final void k() {
        C1951uD c1951uD = this.f17236D;
        if (c1951uD != null) {
            c1951uD.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1466lD
    public final void r(int i) {
        this.f15369l = null;
        if (i == 1) {
            this.f17236D = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1466lD
    public final void w(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1466lD
    public final void x() {
        C1951uD c1951uD = this.f17236D;
        if (c1951uD != null) {
            try {
                c1951uD.f17076c.execute(c1951uD);
            } catch (RejectedExecutionException e6) {
                c1951uD.f17077d.e(e6);
            }
        }
    }
}
