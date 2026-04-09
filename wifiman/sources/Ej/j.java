package ej;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class j implements InterfaceC5474B {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5474B f46478a;

    public j(InterfaceC5474B delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f46478a = delegate;
    }

    @Override // ej.InterfaceC5474B
    public void Z(C5481e source, long j10) {
        AbstractC6492s.i(source, "source");
        this.f46478a.Z(source, j10);
    }

    @Override // ej.InterfaceC5474B
    public E c() {
        return this.f46478a.c();
    }

    @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46478a.close();
    }

    @Override // ej.InterfaceC5474B, java.io.Flushable
    public void flush() {
        this.f46478a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f46478a + ')';
    }
}
