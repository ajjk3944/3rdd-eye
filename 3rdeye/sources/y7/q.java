package y7;

/* compiled from: TabMeasurement.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f48315a;

    /* renamed from: b, reason: collision with root package name */
    public int f48316b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f48317c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f48318d;

    /* renamed from: e, reason: collision with root package name */
    public final C5816a f48319e;

    public q(int i, C5816a c5816a) {
        this.f48315a = i;
        this.f48319e = c5816a;
        this.f48318d = new int[i];
    }

    public final int a() {
        if (this.f48316b < 0) {
            this.f48316b = this.f48319e.a(0);
        }
        return this.f48316b;
    }

    public final int b() {
        if (this.f48317c < 0) {
            int iA = a();
            for (int i = 1; i < this.f48315a; i++) {
                iA = Math.max(iA, this.f48319e.a(i));
            }
            this.f48317c = iA;
        }
        return this.f48317c;
    }

    public final int c(int i) {
        int i10 = this.f48315a;
        if (i10 == 0) {
            return 0;
        }
        if (i < 0) {
            return c(0);
        }
        if (i >= i10) {
            return c(i10);
        }
        int[] iArr = this.f48318d;
        if (iArr[i] <= 0) {
            iArr[i] = this.f48319e.a(i);
        }
        return iArr[i];
    }
}
