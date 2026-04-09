package mj;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import org.snmp4j.asn1.BER;

/* renamed from: mj.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6846c {

    /* renamed from: a, reason: collision with root package name */
    private byte f54048a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f54049b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f54050c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f54051d;

    public C6846c(byte b10, boolean z10, byte[] bArr) {
        this.f54051d = false;
        this.f54048a = b10;
        this.f54049b = z10;
        if (bArr != null) {
            this.f54050c = (byte[]) bArr.clone();
        }
    }

    public static void a(ByteBuffer byteBuffer, byte b10, boolean z10) {
        byteBuffer.put((byte) ((b10 & 15) | (z10 ? (byte) 128 : (byte) 0)));
    }

    private static void b(ByteBuffer byteBuffer, int i10, boolean z10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        int i11 = z10 ? -128 : 0;
        if (i10 <= 65535) {
            if (i10 < 126) {
                byteBuffer.put((byte) (i10 | i11));
                return;
            }
            byteBuffer.put((byte) (i11 | 126));
            byteBuffer.put((byte) (i10 >> 8));
            byteBuffer.put((byte) (i10 & 255));
            return;
        }
        byteBuffer.put((byte) (i11 | BER.MAX_OID_LENGTH));
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) ((i10 >> 24) & 255));
        byteBuffer.put((byte) ((i10 >> 16) & 255));
        byteBuffer.put((byte) ((i10 >> 8) & 255));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void c(ByteBuffer byteBuffer, int i10, byte[] bArr) {
        if (bArr == null) {
            b(byteBuffer, i10, false);
        } else {
            b(byteBuffer, i10, true);
            byteBuffer.put(bArr);
        }
    }

    public static byte[] e() {
        SecureRandom secureRandom = new SecureRandom();
        return new byte[]{(byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255)};
    }

    private void h(byte b10) {
        this.f54049b = (b10 & 128) != 0;
        this.f54048a = (byte) (b10 & 15);
    }

    public byte[] d() {
        byte[] bArr = this.f54050c;
        int length = bArr.length;
        int i10 = length + 6;
        if (bArr.length > 65535) {
            i10 = length + 14;
        } else if (bArr.length >= 126) {
            i10 = length + 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        a(byteBufferAllocate, this.f54048a, this.f54049b);
        byte[] bArrE = e();
        c(byteBufferAllocate, this.f54050c.length, bArrE);
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f54050c;
            if (i11 >= bArr2.length) {
                byteBufferAllocate.flip();
                return byteBufferAllocate.array();
            }
            byte b10 = (byte) (bArr2[i11] ^ bArrE[i11 % 4]);
            bArr2[i11] = b10;
            byteBufferAllocate.put(b10);
            i11++;
        }
    }

    public byte[] f() {
        return this.f54050c;
    }

    public boolean g() {
        return this.f54051d;
    }

    public C6846c(InputStream inputStream) throws IOException {
        byte[] bArr;
        int i10 = 0;
        this.f54051d = false;
        h((byte) inputStream.read());
        byte b10 = this.f54048a;
        if (b10 != 2) {
            if (b10 == 8) {
                this.f54051d = true;
                return;
            } else {
                throw new IOException("Invalid Frame: Opcode: " + ((int) this.f54048a));
            }
        }
        byte b11 = (byte) inputStream.read();
        boolean z10 = (b11 & 128) != 0;
        int i11 = (byte) (b11 & 127);
        int i12 = i11 != 127 ? i11 == 126 ? 2 : 0 : 8;
        i11 = i12 > 0 ? 0 : i11;
        while (true) {
            i12--;
            if (i12 < 0) {
                break;
            } else {
                i11 |= (((byte) inputStream.read()) & 255) << (i12 * 8);
            }
        }
        if (z10) {
            bArr = new byte[4];
            inputStream.read(bArr, 0, 4);
        } else {
            bArr = null;
        }
        this.f54050c = new byte[i11];
        int i13 = 0;
        int i14 = i11;
        while (i13 != i11) {
            int i15 = inputStream.read(this.f54050c, i13, i14);
            i13 += i15;
            i14 -= i15;
        }
        if (!z10) {
            return;
        }
        while (true) {
            byte[] bArr2 = this.f54050c;
            if (i10 >= bArr2.length) {
                return;
            }
            bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i10 % 4]);
            i10++;
        }
    }
}
