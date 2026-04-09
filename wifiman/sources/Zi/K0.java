package Zi;

/* loaded from: classes4.dex */
public abstract class K0 {
    public static /* synthetic */ void c(K0 k02, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = k02.d() + 1;
        }
        k02.b(i10);
    }

    public abstract Object a();

    public abstract void b(int i10);

    public abstract int d();
}
