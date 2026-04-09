package Ri;

import Ii.J;
import Ni.AbstractC3409k;

/* loaded from: classes4.dex */
public final class c extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final c f19979i = new c();

    private c() {
        super(j.f19991c, j.f19992d, j.f19993e, j.f19989a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Ii.J
    public J n0(int i10, String str) {
        AbstractC3409k.a(i10);
        return i10 >= j.f19991c ? AbstractC3409k.b(this, str) : super.n0(i10, str);
    }

    @Override // Ii.J
    public String toString() {
        return "Dispatchers.Default";
    }
}
