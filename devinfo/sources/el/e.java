package el;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final e f23563d;

    static {
        int i4 = k.f23571c;
        int i10 = k.f23572d;
        long j = k.f23573e;
        String str = k.f23569a;
        e eVar = new e();
        eVar.f23565c = new c(i4, j, i10, str);
        f23563d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // xk.r
    public final String toString() {
        return "Dispatchers.Default";
    }
}
