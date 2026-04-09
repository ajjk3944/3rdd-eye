package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class za extends xr1 {
    static {
        yr1.s(za.class);
    }

    public za(iy iyVar, ya yaVar) {
        ByteBuffer byteBuffer = iyVar.f12537a;
        long jLimit = byteBuffer.limit();
        this.f18451b = iyVar;
        this.f18453d = iyVar.e();
        byteBuffer.position((int) (iyVar.e() + jLimit));
        this.f18454e = iyVar.e();
        this.f18450a = yaVar;
    }

    @Override // com.google.android.gms.internal.ads.xr1
    public final String toString() {
        String string = this.f18451b.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.xr1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
