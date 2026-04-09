package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ds0 extends yr0 {
    public int f;

    @Override // defpackage.yr0
    public final void a(byte[] bArr) throws t91 {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.position();
        byteBufferWrap.limit();
        if (2 > byteBufferWrap.remaining()) {
            throw new t91("end of input");
        }
        this.f = byteBufferWrap.getShort() & 65535;
        if (byteBufferWrap.remaining() > 0) {
            throw new t91("Unexpected number of bytes in port parameter");
        }
    }

    @Override // defpackage.yr0
    public final byte[] b() {
        t3 t3Var = new t3(2, (byte) 0);
        t3Var.m(this.f);
        return t3Var.i();
    }

    @Override // defpackage.yr0
    public final String toString() {
        return Integer.toString(this.f);
    }
}
