package ej;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public class l extends E {

    /* renamed from: g, reason: collision with root package name */
    private E f46480g;

    public l(E delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f46480g = delegate;
    }

    @Override // ej.E
    public void a(Condition condition) throws InterruptedException, InterruptedIOException {
        AbstractC6492s.i(condition, "condition");
        this.f46480g.a(condition);
    }

    @Override // ej.E
    public E b() {
        return this.f46480g.b();
    }

    @Override // ej.E
    public E c() {
        return this.f46480g.c();
    }

    @Override // ej.E
    public long d() {
        return this.f46480g.d();
    }

    @Override // ej.E
    public E e(long j10) {
        return this.f46480g.e(j10);
    }

    @Override // ej.E
    public boolean f() {
        return this.f46480g.f();
    }

    @Override // ej.E
    public void g() throws InterruptedIOException {
        this.f46480g.g();
    }

    @Override // ej.E
    public E h(long j10, TimeUnit unit) {
        AbstractC6492s.i(unit, "unit");
        return this.f46480g.h(j10, unit);
    }

    @Override // ej.E
    public long i() {
        return this.f46480g.i();
    }

    @Override // ej.E
    public void j(Object monitor) throws InterruptedException, InterruptedIOException {
        AbstractC6492s.i(monitor, "monitor");
        this.f46480g.j(monitor);
    }

    public final E k() {
        return this.f46480g;
    }

    public final l l(E delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f46480g = delegate;
        return this;
    }
}
