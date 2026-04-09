package ej;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ej.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5480d implements InterfaceC5474B {
    @Override // ej.InterfaceC5474B
    public void Z(C5481e source, long j10) throws EOFException {
        AbstractC6492s.i(source, "source");
        source.d(j10);
    }

    @Override // ej.InterfaceC5474B
    public E c() {
        return E.f46437f;
    }

    @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // ej.InterfaceC5474B, java.io.Flushable
    public void flush() {
    }
}
