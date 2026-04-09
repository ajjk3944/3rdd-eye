package l5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g extends c5.g {
    public long E;
    public int F;
    public int G;

    @Override // c5.g
    public final void p() {
        super.p();
        this.F = 0;
    }

    public final boolean t(c5.g gVar) {
        ByteBuffer byteBuffer;
        a5.a.e(!gVar.g(1073741824));
        a5.a.e(!gVar.g(268435456));
        a5.a.e(!gVar.g(4));
        int i10 = this.F;
        if (i10 > 0) {
            if (i10 >= this.G || gVar.g(Integer.MIN_VALUE) != g(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = gVar.f3306r;
            if (byteBuffer2 != null && (byteBuffer = this.f3306r) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.F;
        this.F = i11 + 1;
        if (i11 == 0) {
            this.f3308y = gVar.f3308y;
            if (gVar.g(1)) {
                this.f3295d = 1;
            }
        }
        if (gVar.g(Integer.MIN_VALUE)) {
            this.f3295d = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = gVar.f3306r;
        if (byteBuffer3 != null) {
            r(byteBuffer3.remaining());
            this.f3306r.put(byteBuffer3);
        }
        this.E = gVar.f3308y;
        return true;
    }
}
