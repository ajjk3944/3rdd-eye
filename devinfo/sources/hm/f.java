package hm;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface f extends u, WritableByteChannel {
    f J(h hVar);

    @Override // hm.u, java.io.Flushable
    void flush();

    e getBuffer();

    f write(byte[] bArr);

    f writeByte(int i4);

    f writeInt(int i4);

    f writeShort(int i4);

    f writeUtf8(String str);

    f x(int i4, byte[] bArr);
}
