package ia;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.kt */
/* loaded from: classes3.dex */
public interface f extends A, WritableByteChannel {
    f A0(int i, int i10, byte[] bArr) throws IOException;

    f H0(long j4) throws IOException;

    f L(int i) throws IOException;

    f P(h hVar) throws IOException;

    long X(C c10) throws IOException;

    f c0(String str) throws IOException;

    f f0(long j4) throws IOException;

    @Override // ia.A, java.io.Flushable
    void flush() throws IOException;

    f j(int i) throws IOException;

    f m(int i) throws IOException;

    C4468d q();

    f t0(byte[] bArr) throws IOException;
}
