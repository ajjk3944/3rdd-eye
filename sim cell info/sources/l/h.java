package l;

/* loaded from: classes.dex */
class h<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f2814a;

    /* renamed from: b, reason: collision with root package name */
    private int f2815b;

    h(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2814a = new Object[i2];
    }

    @Override // l.g
    public boolean a(T t2) {
        int i2 = this.f2815b;
        Object[] objArr = this.f2814a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t2;
        this.f2815b = i2 + 1;
        return true;
    }

    @Override // l.g
    public T b() {
        int i2 = this.f2815b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f2814a;
        T t2 = (T) objArr[i3];
        objArr[i3] = null;
        this.f2815b = i2 - 1;
        return t2;
    }

    @Override // l.g
    public void c(T[] tArr, int i2) {
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            T t2 = tArr[i3];
            int i4 = this.f2815b;
            Object[] objArr = this.f2814a;
            if (i4 < objArr.length) {
                objArr[i4] = t2;
                this.f2815b = i4 + 1;
            }
        }
    }
}
