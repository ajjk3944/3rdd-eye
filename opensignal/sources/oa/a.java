package oa;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends z9.d {
    public long E;
    public int F;
    public int G;

    @Override // z9.d
    public final void p() {
        super.p();
        this.F = 0;
    }

    public final boolean t(z9.d dVar) {
        ByteBuffer byteBuffer;
        qb.b.g(!dVar.g(1073741824));
        qb.b.g(!dVar.g(268435456));
        qb.b.g(!dVar.g(4));
        int i10 = this.F;
        if (i10 > 0) {
            if (i10 >= this.G || dVar.g(Integer.MIN_VALUE) != g(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = dVar.f26791r;
            if (byteBuffer2 != null && (byteBuffer = this.f26791r) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.F;
        this.F = i11 + 1;
        if (i11 == 0) {
            this.f26793y = dVar.f26793y;
            if (dVar.g(1)) {
                this.f3295d = 1;
            }
        }
        if (dVar.g(Integer.MIN_VALUE)) {
            this.f3295d = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = dVar.f26791r;
        if (byteBuffer3 != null) {
            r(byteBuffer3.remaining());
            this.f26791r.put(byteBuffer3);
        }
        this.E = dVar.f26793y;
        return true;
    }
}
