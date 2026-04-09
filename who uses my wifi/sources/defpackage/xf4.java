package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xf4 extends vw3 {
    public long j;
    public int k;
    public int l;

    @Override // defpackage.vw3
    public final void i() {
        super.i();
        this.k = 0;
    }

    public final int n() {
        return this.k;
    }

    public final boolean o() {
        return this.k > 0;
    }

    public final boolean p(vw3 vw3Var) {
        ByteBuffer byteBuffer;
        zt0.D(!vw3Var.h(1073741824));
        zt0.D(!vw3Var.h(268435456));
        zt0.D(!vw3Var.h(4));
        if (o()) {
            if (this.k >= this.l) {
                return false;
            }
            ByteBuffer byteBuffer2 = vw3Var.e;
            if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.g = vw3Var.g;
            if (vw3Var.h(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = vw3Var.e;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.j = vw3Var.g;
        return true;
    }
}
