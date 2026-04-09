package zg;

/* renamed from: zg.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8758k {

    /* renamed from: a, reason: collision with root package name */
    final float f67286a;

    /* renamed from: b, reason: collision with root package name */
    int f67287b;

    /* renamed from: c, reason: collision with root package name */
    int f67288c;

    /* renamed from: d, reason: collision with root package name */
    int f67289d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f67290e;

    public C8758k() {
        this(16, 0.75f);
    }

    static int c(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    public boolean a(Object obj) {
        Object obj2;
        Object[] objArr = this.f67290e;
        int i10 = this.f67287b;
        int iC = c(obj.hashCode()) & i10;
        Object obj3 = objArr[iC];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                iC = (iC + 1) & i10;
                obj2 = objArr[iC];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[iC] = obj;
        int i11 = this.f67288c + 1;
        this.f67288c = i11;
        if (i11 >= this.f67289d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f67290e;
    }

    void d() {
        Object obj;
        Object[] objArr = this.f67290e;
        int length = objArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        Object[] objArr2 = new Object[i10];
        int i12 = this.f67288c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f67287b = i11;
                this.f67289d = (int) (i10 * this.f67286a);
                this.f67290e = objArr2;
                return;
            }
            do {
                length--;
                obj = objArr[length];
            } while (obj == null);
            int iC = c(obj.hashCode()) & i11;
            if (objArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i11;
                } while (objArr2[iC] != null);
            }
            objArr2[iC] = objArr[length];
            i12 = i13;
        }
    }

    public boolean e(Object obj) {
        Object obj2;
        Object[] objArr = this.f67290e;
        int i10 = this.f67287b;
        int iC = c(obj.hashCode()) & i10;
        Object obj3 = objArr[iC];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            return f(iC, objArr, i10);
        }
        do {
            iC = (iC + 1) & i10;
            obj2 = objArr[iC];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return f(iC, objArr, i10);
    }

    boolean f(int i10, Object[] objArr, int i11) {
        int i12;
        Object obj;
        this.f67288c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i10] = null;
                    return true;
                }
                int iC = c(obj.hashCode()) & i11;
                if (i10 <= i12) {
                    if (i10 >= iC || iC > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < iC || iC <= i12) {
                    i13 = i12 + 1;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }

    public C8758k(int i10) {
        this(i10, 0.75f);
    }

    public C8758k(int i10, float f10) {
        this.f67286a = f10;
        int iA = AbstractC8759l.a(i10);
        this.f67287b = iA - 1;
        this.f67289d = (int) (f10 * iA);
        this.f67290e = new Object[iA];
    }
}
