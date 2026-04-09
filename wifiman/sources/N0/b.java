package N0;

/* loaded from: classes.dex */
public abstract class b implements f {
    @Override // N0.f
    public int a(int i10) {
        int iE = e(i10);
        if (iE == -1 || e(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // N0.f
    public int b(int i10) {
        int iF = f(i10);
        if (iF == -1 || f(iF) == -1) {
            return -1;
        }
        return iF;
    }

    @Override // N0.f
    public int c(int i10) {
        return f(i10);
    }

    @Override // N0.f
    public int d(int i10) {
        return e(i10);
    }

    public abstract int e(int i10);

    public abstract int f(int i10);
}
