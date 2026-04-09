package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.vm1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s6 extends IllegalArgumentException {
    public s6(int i4, int i10) {
        super(vm1.a(i10, i4, (byte) 32, "Unpaired surrogate at index ", " of "));
    }
}
