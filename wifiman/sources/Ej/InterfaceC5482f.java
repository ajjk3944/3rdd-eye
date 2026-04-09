package ej;

import java.nio.channels.WritableByteChannel;

/* renamed from: ej.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5482f extends InterfaceC5474B, WritableByteChannel {
    InterfaceC5482f F(String str);

    InterfaceC5482f H(String str, int i10, int i11);

    InterfaceC5482f K(long j10);

    InterfaceC5482f R(h hVar);

    InterfaceC5482f X(byte[] bArr);

    C5481e b();

    long e0(InterfaceC5476D interfaceC5476D);

    @Override // ej.InterfaceC5474B, java.io.Flushable
    void flush();

    InterfaceC5482f h0(long j10);

    InterfaceC5482f m();

    InterfaceC5482f n(int i10);

    InterfaceC5482f o(int i10);

    InterfaceC5482f u(int i10);

    InterfaceC5482f write(byte[] bArr, int i10, int i11);

    InterfaceC5482f z();
}
