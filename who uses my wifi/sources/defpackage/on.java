package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class on extends ft0 {
    public static final on i;

    static {
        int i2 = o01.c;
        int i3 = o01.d;
        long j = o01.e;
        String str = o01.a;
        on onVar = new on();
        onVar.h = new pk(i2, i3, j, str);
        i = onVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.lk
    public final String toString() {
        return "Dispatchers.Default";
    }
}
