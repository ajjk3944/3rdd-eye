package com.google.android.exoplayer2.source.hls;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends ab.f {
    public byte[] F;
    public volatile boolean G;
    public byte[] H;

    @Override // pb.j0
    public final void c() {
        try {
            this.E.q(this.f302d);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.G) {
                byte[] bArr = this.F;
                if (bArr.length < i11 + 16384) {
                    this.F = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.E.read(this.F, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.G) {
                this.H = Arrays.copyOf(this.F, i11);
            }
            qb.v.g(this.E);
        } catch (Throwable th2) {
            qb.v.g(this.E);
            throw th2;
        }
    }

    @Override // pb.j0
    public final void d() {
        this.G = true;
    }
}
