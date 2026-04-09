package k;

/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f2737f = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f2738b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f2739c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f2740d;

    /* renamed from: e, reason: collision with root package name */
    private int f2741e;

    public d() {
        this(10);
    }

    public d(int i2) {
        this.f2738b = false;
        if (i2 == 0) {
            this.f2739c = c.f2735b;
            this.f2740d = c.f2736c;
        } else {
            int iF = c.f(i2);
            this.f2739c = new long[iF];
            this.f2740d = new Object[iF];
        }
    }

    private void e() {
        int i2 = this.f2741e;
        long[] jArr = this.f2739c;
        Object[] objArr = this.f2740d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2737f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2738b = false;
        this.f2741e = i3;
    }

    public void a(long j2, E e2) {
        int i2 = this.f2741e;
        if (i2 != 0 && j2 <= this.f2739c[i2 - 1]) {
            i(j2, e2);
            return;
        }
        if (this.f2738b && i2 >= this.f2739c.length) {
            e();
        }
        int i3 = this.f2741e;
        if (i3 >= this.f2739c.length) {
            int iF = c.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f2739c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2740d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2739c = jArr;
            this.f2740d = objArr;
        }
        this.f2739c[i3] = j2;
        this.f2740d[i3] = e2;
        this.f2741e = i3 + 1;
    }

    public void b() {
        int i2 = this.f2741e;
        Object[] objArr = this.f2740d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2741e = 0;
        this.f2738b = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f2739c = (long[]) this.f2739c.clone();
            dVar.f2740d = (Object[]) this.f2740d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Deprecated
    public void d(long j2) {
        j(j2);
    }

    public E f(long j2) {
        return g(j2, null);
    }

    public E g(long j2, E e2) {
        int iB = c.b(this.f2739c, this.f2741e, j2);
        if (iB >= 0) {
            Object[] objArr = this.f2740d;
            if (objArr[iB] != f2737f) {
                return (E) objArr[iB];
            }
        }
        return e2;
    }

    public long h(int i2) {
        if (this.f2738b) {
            e();
        }
        return this.f2739c[i2];
    }

    public void i(long j2, E e2) {
        int iB = c.b(this.f2739c, this.f2741e, j2);
        if (iB >= 0) {
            this.f2740d[iB] = e2;
            return;
        }
        int iB2 = iB ^ (-1);
        int i2 = this.f2741e;
        if (iB2 < i2) {
            Object[] objArr = this.f2740d;
            if (objArr[iB2] == f2737f) {
                this.f2739c[iB2] = j2;
                objArr[iB2] = e2;
                return;
            }
        }
        if (this.f2738b && i2 >= this.f2739c.length) {
            e();
            iB2 = c.b(this.f2739c, this.f2741e, j2) ^ (-1);
        }
        int i3 = this.f2741e;
        if (i3 >= this.f2739c.length) {
            int iF = c.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f2739c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2740d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2739c = jArr;
            this.f2740d = objArr2;
        }
        int i4 = this.f2741e;
        if (i4 - iB2 != 0) {
            long[] jArr3 = this.f2739c;
            int i5 = iB2 + 1;
            System.arraycopy(jArr3, iB2, jArr3, i5, i4 - iB2);
            Object[] objArr4 = this.f2740d;
            System.arraycopy(objArr4, iB2, objArr4, i5, this.f2741e - iB2);
        }
        this.f2739c[iB2] = j2;
        this.f2740d[iB2] = e2;
        this.f2741e++;
    }

    public void j(long j2) {
        int iB = c.b(this.f2739c, this.f2741e, j2);
        if (iB >= 0) {
            Object[] objArr = this.f2740d;
            Object obj = objArr[iB];
            Object obj2 = f2737f;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f2738b = true;
            }
        }
    }

    public void k(int i2) {
        Object[] objArr = this.f2740d;
        Object obj = objArr[i2];
        Object obj2 = f2737f;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f2738b = true;
        }
    }

    public int l() {
        if (this.f2738b) {
            e();
        }
        return this.f2741e;
    }

    public E m(int i2) {
        if (this.f2738b) {
            e();
        }
        return (E) this.f2740d[i2];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2741e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2741e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            E eM = m(i2);
            if (eM != this) {
                sb.append(eM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
