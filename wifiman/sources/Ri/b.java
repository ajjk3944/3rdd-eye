package Ri;

import Ii.AbstractC3074p0;
import Ii.J;
import Ni.D;
import Ni.F;
import dh.C5385j;
import dh.InterfaceC5384i;
import java.util.concurrent.Executor;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class b extends AbstractC3074p0 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final b f19977d = new b();

    /* renamed from: e, reason: collision with root package name */
    private static final J f19978e = J.o0(k.f19995c, F.e("kotlinx.coroutines.io.parallelism", AbstractC7978m.d(64, D.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        f19978e.Y(interfaceC5384i, runnable);
    }

    @Override // Ii.J
    public void b0(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        f19978e.b0(interfaceC5384i, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Y(C5385j.f46088a, runnable);
    }

    @Override // Ii.J
    public J n0(int i10, String str) {
        return k.f19995c.n0(i10, str);
    }

    @Override // Ii.J
    public String toString() {
        return "Dispatchers.IO";
    }
}
