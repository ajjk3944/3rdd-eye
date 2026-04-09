package P6;

import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    public static final UUID f18063a = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    private byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    private int c(byte[] bArr, int i10, int i11, int i12, List list) {
        while (i11 > 0) {
            list.add(e(a(bArr, i10, i12)));
            i11 -= i12;
            i10 += i12;
        }
        return i10;
    }

    private int d(byte[] bArr, int i10, int i11, int i12, List list) {
        while (i11 > 0) {
            list.add(e(a(bArr, i10, i12)));
            i11 -= i12;
            i10 += i12;
        }
        return i10;
    }

    private static ParcelUuid e(byte[] bArr) {
        long j10;
        if (bArr == null) {
            throw new IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j10 = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
        } else {
            j10 = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
        }
        UUID uuid = f18063a;
        return new ParcelUuid(new UUID(uuid.getMostSignificantBits() + (j10 << 32), uuid.getLeastSignificantBits()));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Q6.e b(byte[] r18) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P6.I.b(byte[]):Q6.e");
    }
}
