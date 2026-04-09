package u1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import l1.InterfaceC2640f;

/* loaded from: classes.dex */
public final class j implements l, InterfaceC2640f {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f23741a;

    public j() {
        this.f23741a = ByteBuffer.allocate(4);
    }

    @Override // u1.l
    public int a() {
        return (e() << 8) | e();
    }

    @Override // l1.InterfaceC2640f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f23741a) {
            this.f23741a.position(0);
            messageDigest.update(this.f23741a.putInt(num.intValue()).array());
        }
    }

    @Override // u1.l
    public short e() throws k {
        ByteBuffer byteBuffer = this.f23741a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new k();
    }

    @Override // u1.l
    public int f(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f23741a;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // u1.l
    public long skip(long j6) {
        ByteBuffer byteBuffer = this.f23741a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j6);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public j(ByteBuffer byteBuffer) {
        this.f23741a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
