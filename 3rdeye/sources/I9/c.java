package I9;

import A9.A;
import A9.I;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final c f2625d;

    static {
        int i = k.f2634c;
        int i10 = k.f2635d;
        long j4 = k.f2636e;
        String str = k.f2632a;
        c cVar = new c();
        cVar.f2627c = new a(i, i10, str, j4);
        f2625d = cVar;
    }

    @Override // A9.A
    public final A Q0(int i) {
        I.n(1);
        return 1 >= k.f2634c ? this : super.Q0(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // A9.A
    public final String toString() {
        return "Dispatchers.Default";
    }
}
