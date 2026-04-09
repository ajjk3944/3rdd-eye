package ia;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
/* loaded from: classes3.dex */
public interface g extends C, ReadableByteChannel {
    void F0(long j4) throws IOException;

    byte[] I() throws IOException;

    long J0() throws IOException;

    boolean K() throws IOException;

    InputStream L0();

    String S(long j4) throws IOException;

    String d0(Charset charset) throws IOException;

    h g(long j4) throws IOException;

    h h0() throws IOException;

    boolean l0(long j4) throws IOException;

    long o(C4468d c4468d) throws IOException;

    String o0() throws IOException;

    C4468d q();

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j4) throws IOException;

    int x0(s sVar) throws IOException;
}
