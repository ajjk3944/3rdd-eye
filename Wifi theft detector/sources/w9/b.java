package w9;

/* loaded from: classes4.dex */
public final class b extends e {

    /* renamed from: h, reason: collision with root package name */
    public static final b f24844h = new b();

    public b() {
        super(k.f24857c, k.f24858d, k.f24859e, k.f24855a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}
