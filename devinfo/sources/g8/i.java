package g8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements k, com.bumptech.glide.load.data.f {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f24574a;

    public i(ByteBuffer byteBuffer, int i4) {
        switch (i4) {
            case 1:
                this.f24574a = byteBuffer;
                break;
            default:
                this.f24574a = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public Object a() {
        ByteBuffer byteBuffer = this.f24574a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // g8.k
    public int d() {
        return (e() << 8) | e();
    }

    @Override // g8.k
    public short e() throws j {
        ByteBuffer byteBuffer = this.f24574a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new j();
    }

    @Override // g8.k
    public int f(int i4, byte[] bArr) {
        ByteBuffer byteBuffer = this.f24574a;
        int iMin = Math.min(i4, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // g8.k
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f24574a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
    }
}
