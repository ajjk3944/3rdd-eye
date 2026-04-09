package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o5 extends p5 {
    @Override // com.google.android.gms.internal.consent_sdk.p5
    public final byte a(int i4) {
        if (((47 - (i4 + 1)) | i4) >= 0) {
            return this.f19464b[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(je.u.r(i4, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(r5.c.h(i4, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.p5
    public final byte c(int i4) {
        return this.f19464b[i4];
    }

    @Override // com.google.android.gms.internal.consent_sdk.p5
    public final int d() {
        return 47;
    }
}
