package cv;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface i extends f0, ReadableByteChannel {
    int D(v vVar);

    String J(Charset charset);

    long O(j jVar);

    boolean S(long j);

    String W();

    long b0(j jVar);

    long e0(y yVar);

    void g0(long j);

    j k(long j);

    long k0();

    InputStream l0();

    boolean m0(long j, j jVar);

    byte[] r();

    byte readByte();

    int readInt();

    short readShort();

    g s();

    void skip(long j);

    long x(byte b2, long j, long j7);

    String z(long j);
}
