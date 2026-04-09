package cv;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface h extends d0, WritableByteChannel {
    h B(j jVar);

    h H(String str);

    h M(String str, int i10, int i11);

    h P(long j);

    @Override // cv.d0, java.io.Flushable
    void flush();

    h h0(long j);

    h write(byte[] bArr);

    h writeByte(int i10);

    h writeInt(int i10);

    h writeShort(int i10);
}
