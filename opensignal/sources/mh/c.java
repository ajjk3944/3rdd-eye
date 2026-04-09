package mh;

import ch.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: o, reason: collision with root package name */
    public static final Random f16709o = new Random();

    /* renamed from: a, reason: collision with root package name */
    public int f16710a;

    /* renamed from: b, reason: collision with root package name */
    public int f16711b;

    /* renamed from: c, reason: collision with root package name */
    public int f16712c;

    /* renamed from: d, reason: collision with root package name */
    public int f16713d;

    /* renamed from: e, reason: collision with root package name */
    public int f16714e;

    /* renamed from: f, reason: collision with root package name */
    public long f16715f;

    /* renamed from: g, reason: collision with root package name */
    public long f16716g;

    /* renamed from: h, reason: collision with root package name */
    public long f16717h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f16718i = new byte[4];
    public byte[] j;
    public final byte[] k;

    /* renamed from: l, reason: collision with root package name */
    public long f16719l;

    /* renamed from: m, reason: collision with root package name */
    public int f16720m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f16721n;

    public c(ByteBuffer byteBuffer, boolean z10, int i10) {
        this.f16710a = 1;
        this.f16712c = 1;
        this.f16719l = 0L;
        this.f16720m = 0;
        byte[] bArr = new byte[6];
        this.f16721n = bArr;
        if (z10) {
            this.f16711b = i10;
        } else {
            this.f16711b = byteBuffer.capacity();
        }
        byteBuffer.position(0);
        byteBuffer.get(this.f16718i);
        this.f16713d = byteBuffer.getShort();
        this.f16714e = byteBuffer.getShort();
        this.f16715f = byteBuffer.getLong();
        this.f16716g = byteBuffer.getLong();
        this.f16712c = byteBuffer.get();
        byte b2 = byteBuffer.get();
        this.f16710a = b2;
        if (b2 == 2) {
            byteBuffer.get(bArr);
        }
        if (z10) {
            byteBuffer.position(26);
            byte[] bArr2 = new byte[102];
            this.j = bArr2;
            byteBuffer.get(bArr2);
            byte[] bArr3 = new byte[i10 - 128];
            this.k = bArr3;
            byteBuffer.get(bArr3);
            try {
                this.f16719l = ByteBuffer.wrap(bArr3).order(ByteOrder.BIG_ENDIAN).getLong();
            } catch (Exception e4) {
                n.c("UdpPacketPayload", "Error reading server verification response: " + e4.getMessage());
                this.f16719l = 0L;
            }
            this.f16720m = i10;
        }
    }

    public final String toString() {
        return "UdpPacketPayload {mPayloadLength=" + this.f16711b + ", mNumberOfBytesReadFromChannel=" + this.f16720m + ", mIsVerificationPayload=false, mSchemaVersion=" + this.f16710a + ", mEchoFactor=" + this.f16712c + ", mSequenceNumber=" + this.f16713d + ", mEchoSequenceNumber=" + this.f16714e + ", mElapsedSendTimeMicroseconds=" + this.f16715f + ", mElapsedReceivedTimeMicroseconds=" + this.f16717h + ", mSendTime=" + this.f16716g + ", mTestId=" + Arrays.toString(this.f16718i) + ", first6bytes=" + dr.a.a(this.f16721n) + ", mSecurityToken=" + dr.a.a(this.j) + ", mServerVerificationResponseBytes=" + Arrays.toString(this.k) + '}';
    }
}
