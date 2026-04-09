package ej;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: ej.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5483g extends InterfaceC5476D, ReadableByteChannel {
    long A();

    String D(long j10);

    int E(s sVar);

    String G(Charset charset);

    long M(h hVar);

    String Q();

    byte[] V(long j10);

    long W(h hVar);

    C5481e b();

    void d(long j10);

    void g0(long j10);

    boolean i0(long j10, h hVar);

    long j0(byte b10);

    C5481e k();

    long k0();

    h l(long j10);

    InputStream l0();

    InterfaceC5483g peek();

    long q(InterfaceC5474B interfaceC5474B);

    byte[] r();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j10);

    boolean t();

    void w(C5481e c5481e, long j10);
}
