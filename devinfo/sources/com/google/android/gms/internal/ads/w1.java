package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.EOFException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w1 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17817a = new byte[Buffer.SEGMENTING_THRESHOLD];

    @Override // com.google.android.gms.internal.ads.u2
    public final void b(int i4, sk0 sk0Var) {
        sk0Var.G(i4);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void c(sk0 sk0Var, int i4, int i10) {
        sk0Var.G(i4);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final int e(vs1 vs1Var, int i4, boolean z3) throws EOFException {
        int iD = vs1Var.d(0, Math.min(Buffer.SEGMENTING_THRESHOLD, i4), this.f17817a);
        if (iD != -1) {
            return iD;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final int g(vs1 vs1Var, int i4, boolean z3) {
        return e(vs1Var, i4, z3);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void f(mx1 mx1Var) {
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void d(long j, int i4, int i10, int i11, t2 t2Var) {
    }
}
