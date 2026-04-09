package du;

import wt.q;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: r, reason: collision with root package name */
    public static final f f7572r;

    static {
        int i10 = l.f7580c;
        int i11 = l.f7581d;
        long j = l.f7582e;
        String str = l.f7578a;
        f fVar = new f();
        fVar.f7574g = new d(str, i10, j, i11);
        f7572r = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // wt.q
    public final q q0(int i10) {
        bu.a.a(1);
        return 1 >= l.f7580c ? this : super.q0(1);
    }

    @Override // wt.q
    public final String toString() {
        return "Dispatchers.Default";
    }
}
