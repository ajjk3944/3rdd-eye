package z;

/* loaded from: classes.dex */
public class f<T> extends e<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f3424c;

    public f(int i2) {
        super(i2);
        this.f3424c = new Object();
    }

    @Override // z.e, z.d
    public boolean a(T t2) {
        boolean zA;
        synchronized (this.f3424c) {
            zA = super.a(t2);
        }
        return zA;
    }

    @Override // z.e, z.d
    public T b() {
        T t2;
        synchronized (this.f3424c) {
            t2 = (T) super.b();
        }
        return t2;
    }
}
