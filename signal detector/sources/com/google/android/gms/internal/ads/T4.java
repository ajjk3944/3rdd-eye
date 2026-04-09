package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class T4 extends AbstractC1422kN {
    static {
        C1476lN.t(T4.class);
    }

    public T4(C1756qg c1756qg, S4 s42) {
        ByteBuffer byteBuffer = c1756qg.f16390a;
        long jLimit = byteBuffer.limit();
        this.f15136b = c1756qg;
        this.f15138d = c1756qg.b();
        byteBuffer.position((int) (c1756qg.b() + jLimit));
        this.f15139e = c1756qg.b();
        this.f15135a = s42;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1422kN, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1422kN
    public final String toString() {
        String string = this.f15136b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
