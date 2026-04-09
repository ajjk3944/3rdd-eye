package oe;

/* loaded from: classes.dex */
public final class a1 extends k0 {
    public static final Object[] E;
    public static final a1 F;
    public final transient int B;
    public final transient int D;

    /* renamed from: r, reason: collision with root package name */
    public final transient Object[] f19298r;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f19299x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f19300y;

    static {
        Object[] objArr = new Object[0];
        E = objArr;
        F = new a1(0, 0, 0, objArr, objArr);
    }

    public a1(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f19298r = objArr;
        this.f19299x = i10;
        this.f19300y = objArr2;
        this.B = i11;
        this.D = i12;
    }

    @Override // oe.c0
    public final int b(int i10, Object[] objArr) {
        Object[] objArr2 = this.f19298r;
        int i11 = this.D;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // oe.c0
    public final Object[] c() {
        return this.f19298r;
    }

    @Override // oe.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f19300y;
            if (objArr.length != 0) {
                int iS = s.s(obj);
                while (true) {
                    int i10 = iS & this.B;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iS = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // oe.c0
    public final int d() {
        return this.D;
    }

    @Override // oe.c0
    public final int e() {
        return 0;
    }

    @Override // oe.c0
    public final boolean g() {
        return false;
    }

    @Override // oe.k0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19299x;
    }

    @Override // oe.c0
    /* renamed from: j */
    public final h1 iterator() {
        return a().listIterator(0);
    }

    @Override // oe.k0
    public final h0 n() {
        return h0.k(this.D, this.f19298r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D;
    }
}
