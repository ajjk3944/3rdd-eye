package z;

/* loaded from: classes.dex */
public class e<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f3422a;

    /* renamed from: b, reason: collision with root package name */
    private int f3423b;

    public e(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3422a = new Object[i2];
    }

    private boolean c(T t2) {
        for (int i2 = 0; i2 < this.f3423b; i2++) {
            if (this.f3422a[i2] == t2) {
                return true;
            }
        }
        return false;
    }

    @Override // z.d
    public boolean a(T t2) {
        if (c(t2)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i2 = this.f3423b;
        Object[] objArr = this.f3422a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t2;
        this.f3423b = i2 + 1;
        return true;
    }

    @Override // z.d
    public T b() {
        int i2 = this.f3423b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f3422a;
        T t2 = (T) objArr[i3];
        objArr[i3] = null;
        this.f3423b = i2 - 1;
        return t2;
    }
}
