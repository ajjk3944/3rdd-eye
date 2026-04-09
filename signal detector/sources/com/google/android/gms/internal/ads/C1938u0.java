package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1938u0 implements T0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17017a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.T0
    public final void a(int i, C2036vr c2036vr) {
        c2036vr.G(i);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void b(C2036vr c2036vr, int i, int i3) {
        c2036vr.G(i);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void c(long j6, int i, int i3, int i6, S0 s02) {
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final int d(IN in, int i, boolean z6) throws EOFException {
        int iD = in.d(0, Math.min(4096, i), this.f17017a);
        if (iD != -1) {
            return iD;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void e(TP tp) {
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final int f(IN in, int i, boolean z6) {
        return d(in, i, z6);
    }
}
