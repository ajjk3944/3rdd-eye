package T;

/* renamed from: T.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3520d {

    /* renamed from: a, reason: collision with root package name */
    private int f21047a;

    public C3520d(int i10) {
        this.f21047a = i10;
    }

    public final int a() {
        return this.f21047a;
    }

    public final boolean b() {
        return this.f21047a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f21047a = i10;
    }

    public final int d(C3516b1 c3516b1) {
        return c3516b1.e(this);
    }

    public final int e(C3525e1 c3525e1) {
        return c3525e1.F(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f21047a + " }";
    }
}
