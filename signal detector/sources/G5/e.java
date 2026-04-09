package G5;

/* loaded from: classes3.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final e f1707d;

    static {
        int i = k.f1715c;
        int i3 = k.f1716d;
        long j6 = k.f1717e;
        String str = k.f1713a;
        e eVar = new e();
        eVar.f1709c = new c(i, j6, i3, str);
        f1707d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // z5.AbstractC3042s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
