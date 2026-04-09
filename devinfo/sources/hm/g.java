package hm;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface g extends w, ReadableByteChannel {
    int C(n nVar);

    e getBuffer();

    long i(e eVar);

    InputStream inputStream();

    byte readByte();

    h readByteString(long j);

    int readInt();

    short readShort();

    String readString(Charset charset);

    String readUtf8LineStrict(long j);

    boolean request(long j);

    void require(long j);

    void skip(long j);
}
