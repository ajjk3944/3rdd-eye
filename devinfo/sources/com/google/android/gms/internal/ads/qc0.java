package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qc0 extends l90 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc0(f90 f90Var, qz qzVar, int i4) {
        super(11, f90Var, qzVar);
        this.f15314d = i4;
    }

    @Override // com.google.android.gms.internal.ads.l90
    public Set x(n50 n50Var) {
        switch (this.f15314d) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.x(n50Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.l90
    public Set y(n50 n50Var) {
        switch (this.f15314d) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.y(n50Var);
        }
    }
}
