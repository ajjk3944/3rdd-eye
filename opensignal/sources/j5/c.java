package j5;

import java.util.Arrays;
import lf.t1;

/* loaded from: classes.dex */
public final class c extends p5.e {
    public byte[] F;
    public volatile boolean G;
    public byte[] H;

    @Override // r5.k, pb.j0
    public final void c() {
        try {
            this.E.t(this.f20265d);
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
            t1.h(this.E);
        } catch (Throwable th2) {
            t1.h(this.E);
            throw th2;
        }
    }

    @Override // r5.k, pb.j0
    public final void d() {
        this.G = true;
    }
}
