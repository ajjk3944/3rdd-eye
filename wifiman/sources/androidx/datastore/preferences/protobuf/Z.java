package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class Z extends AbstractC3967c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Z f30822d;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f30823b;

    /* renamed from: c, reason: collision with root package name */
    private int f30824c;

    static {
        Z z10 = new Z(new Object[0], 0);
        f30822d = z10;
        z10.n();
    }

    private Z(Object[] objArr, int i10) {
        this.f30823b = objArr;
        this.f30824c = i10;
    }

    private static Object[] e(int i10) {
        return new Object[i10];
    }

    public static Z f() {
        return f30822d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f30824c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f30824c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b();
        int i10 = this.f30824c;
        Object[] objArr = this.f30823b;
        if (i10 == objArr.length) {
            this.f30823b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f30823b;
        int i11 = this.f30824c;
        this.f30824c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        g(i10);
        return this.f30823b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3987x.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Z p(int i10) {
        if (i10 >= this.f30824c) {
            return new Z(Arrays.copyOf(this.f30823b, i10), this.f30824c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        b();
        g(i10);
        Object[] objArr = this.f30823b;
        Object obj = objArr[i10];
        if (i10 < this.f30824c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f30824c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        b();
        g(i10);
        Object[] objArr = this.f30823b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f30824c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f30824c)) {
            Object[] objArr = this.f30823b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrE = e(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f30823b, 0, objArrE, 0, i10);
                System.arraycopy(this.f30823b, i10, objArrE, i10 + 1, this.f30824c - i10);
                this.f30823b = objArrE;
            }
            this.f30823b[i10] = obj;
            this.f30824c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i10));
    }
}
