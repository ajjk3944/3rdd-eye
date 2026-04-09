package t9;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f24471a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal[] f24472b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f24472b = threadLocalArr;
    }

    public static final boolean a() {
        return f24471a;
    }
}
