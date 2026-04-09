package ej;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class k implements InterfaceC5476D {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5476D f46479a;

    public k(InterfaceC5476D delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f46479a = delegate;
    }

    @Override // ej.InterfaceC5476D
    public long U(C5481e sink, long j10) {
        AbstractC6492s.i(sink, "sink");
        return this.f46479a.U(sink, j10);
    }

    public final InterfaceC5476D a() {
        return this.f46479a;
    }

    @Override // ej.InterfaceC5476D
    public E c() {
        return this.f46479a.c();
    }

    @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46479a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f46479a + ')';
    }
}
