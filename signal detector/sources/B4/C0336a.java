package b4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import l1.InterfaceC2640f;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336a implements InterfaceC0343h, InterfaceC2640f, com.bumptech.glide.load.data.f {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f5731a;

    public C0336a(ByteBuffer byteBuffer, int i) {
        switch (i) {
            case 2:
                this.f5731a = byteBuffer;
                break;
            default:
                this.f5731a = byteBuffer.slice();
                break;
        }
    }

    @Override // b4.InterfaceC0343h
    public long a() {
        return this.f5731a.capacity();
    }

    @Override // com.bumptech.glide.load.data.f
    public Object c() {
        ByteBuffer byteBuffer = this.f5731a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // l1.InterfaceC2640f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l2 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f5731a) {
            this.f5731a.position(0);
            messageDigest.update(this.f5731a.putLong(l2.longValue()).array());
        }
    }

    @Override // b4.InterfaceC0343h
    public void g(MessageDigest[] messageDigestArr, long j6, int i) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f5731a) {
            int i3 = (int) j6;
            this.f5731a.position(i3);
            this.f5731a.limit(i3 + i);
            byteBufferSlice = this.f5731a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    public C0336a() {
        this.f5731a = ByteBuffer.allocate(8);
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
    }
}
