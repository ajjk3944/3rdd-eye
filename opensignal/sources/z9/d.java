package z9;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import qb.v;

/* loaded from: classes.dex */
public class d extends c5.a {
    public ByteBuffer B;
    public final int D;

    /* renamed from: g, reason: collision with root package name */
    public final tv.b f26790g;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f26791r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26792x;

    /* renamed from: y, reason: collision with root package name */
    public long f26793y;

    public d(int i10) {
        super(4);
        tv.b bVar = new tv.b();
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        bVar.f23030r = cryptoInfo;
        bVar.f23031x = v.f20828a >= 24 ? new q3.a(cryptoInfo) : null;
        this.f26790g = bVar;
        this.D = i10;
    }

    public void p() {
        this.f3295d = 0;
        ByteBuffer byteBuffer = this.f26791r;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.B;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f26792x = false;
    }

    public final ByteBuffer q(int i10) {
        int i11 = this.D;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f26791r;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("Buffer too small (");
        sb2.append(iCapacity);
        sb2.append(" < ");
        sb2.append(i10);
        sb2.append(")");
        throw new c(sb2.toString());
    }

    public final void r(int i10) {
        ByteBuffer byteBuffer = this.f26791r;
        if (byteBuffer == null) {
            this.f26791r = q(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f26791r = byteBuffer;
            return;
        }
        ByteBuffer byteBufferQ = q(i11);
        byteBufferQ.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferQ.put(byteBuffer);
        }
        this.f26791r = byteBufferQ;
    }

    public final void s() {
        ByteBuffer byteBuffer = this.f26791r;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.B;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
