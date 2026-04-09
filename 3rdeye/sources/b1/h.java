package b1;

import c1.C2044b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* compiled from: MetadataListReader.java */
/* loaded from: classes.dex */
public final class h {
    public static C2044b a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j4;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                j4 = -1;
                break;
            }
            int i11 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j4 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j4 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j4 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j10 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i12 = 0; i12 < j10; i12++) {
                int i13 = byteBufferDuplicate.getInt();
                long j11 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    byteBufferDuplicate.position((int) (j11 + j4));
                    C2044b c2044b = new C2044b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c2044b.f4178d = byteBufferDuplicate;
                    c2044b.f4175a = iPosition;
                    int i14 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c2044b.f4176b = i14;
                    c2044b.f4177c = ((ByteBuffer) c2044b.f4178d).getShort(i14);
                    return c2044b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
