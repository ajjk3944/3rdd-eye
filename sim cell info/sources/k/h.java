package k;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f2772f = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f2773b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f2774c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f2775d;

    /* renamed from: e, reason: collision with root package name */
    private int f2776e;

    public h() {
        this(10);
    }

    public h(int i2) {
        this.f2773b = false;
        if (i2 == 0) {
            this.f2774c = c.f2734a;
            this.f2775d = c.f2736c;
        } else {
            int iE = c.e(i2);
            this.f2774c = new int[iE];
            this.f2775d = new Object[iE];
        }
    }

    private void d() {
        int i2 = this.f2776e;
        int[] iArr = this.f2774c;
        Object[] objArr = this.f2775d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2772f) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2773b = false;
        this.f2776e = i3;
    }

    public void a(int i2, E e2) {
        int i3 = this.f2776e;
        if (i3 != 0 && i2 <= this.f2774c[i3 - 1]) {
            h(i2, e2);
            return;
        }
        if (this.f2773b && i3 >= this.f2774c.length) {
            d();
        }
        int i4 = this.f2776e;
        if (i4 >= this.f2774c.length) {
            int iE = c.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f2774c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2775d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2774c = iArr;
            this.f2775d = objArr;
        }
        this.f2774c[i4] = i2;
        this.f2775d[i4] = e2;
        this.f2776e = i4 + 1;
    }

    public void b() {
        int i2 = this.f2776e;
        Object[] objArr = this.f2775d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2776e = 0;
        this.f2773b = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f2774c = (int[]) this.f2774c.clone();
            hVar.f2775d = (Object[]) this.f2775d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E e(int i2) {
        return f(i2, null);
    }

    public E f(int i2, E e2) {
        int iA = c.a(this.f2774c, this.f2776e, i2);
        if (iA >= 0) {
            Object[] objArr = this.f2775d;
            if (objArr[iA] != f2772f) {
                return (E) objArr[iA];
            }
        }
        return e2;
    }

    public int g(int i2) {
        if (this.f2773b) {
            d();
        }
        return this.f2774c[i2];
    }

    public void h(int i2, E e2) {
        int iA = c.a(this.f2774c, this.f2776e, i2);
        if (iA >= 0) {
            this.f2775d[iA] = e2;
            return;
        }
        int iA2 = iA ^ (-1);
        int i3 = this.f2776e;
        if (iA2 < i3) {
            Object[] objArr = this.f2775d;
            if (objArr[iA2] == f2772f) {
                this.f2774c[iA2] = i2;
                objArr[iA2] = e2;
                return;
            }
        }
        if (this.f2773b && i3 >= this.f2774c.length) {
            d();
            iA2 = c.a(this.f2774c, this.f2776e, i2) ^ (-1);
        }
        int i4 = this.f2776e;
        if (i4 >= this.f2774c.length) {
            int iE = c.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f2774c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2775d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2774c = iArr;
            this.f2775d = objArr2;
        }
        int i5 = this.f2776e;
        if (i5 - iA2 != 0) {
            int[] iArr3 = this.f2774c;
            int i6 = iA2 + 1;
            System.arraycopy(iArr3, iA2, iArr3, i6, i5 - iA2);
            Object[] objArr4 = this.f2775d;
            System.arraycopy(objArr4, iA2, objArr4, i6, this.f2776e - iA2);
        }
        this.f2774c[iA2] = i2;
        this.f2775d[iA2] = e2;
        this.f2776e++;
    }

    public void i(int i2) {
        int iA = c.a(this.f2774c, this.f2776e, i2);
        if (iA >= 0) {
            Object[] objArr = this.f2775d;
            Object obj = objArr[iA];
            Object obj2 = f2772f;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f2773b = true;
            }
        }
    }

    public int j() {
        if (this.f2773b) {
            d();
        }
        return this.f2776e;
    }

    public E k(int i2) {
        if (this.f2773b) {
            d();
        }
        return (E) this.f2775d[i2];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2776e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2776e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(g(i2));
            sb.append('=');
            E eK = k(i2);
            if (eK != this) {
                sb.append(eK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
