package ej;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: ej.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5474B extends Closeable, Flushable {
    void Z(C5481e c5481e, long j10);

    E c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
