package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b1 extends b implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final b1 f1248r = new b1(new Object[0], 0, false);

    /* renamed from: d, reason: collision with root package name */
    public Object[] f1249d;

    /* renamed from: g, reason: collision with root package name */
    public int f1250g;

    public b1(Object[] objArr, int i10, boolean z10) {
        this.f1247a = z10;
        this.f1249d = objArr;
        this.f1250g = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f1250g;
        Object[] objArr = this.f1249d;
        if (i10 == objArr.length) {
            this.f1249d = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1249d;
        int i11 = this.f1250g;
        this.f1250g = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f1250g) {
            StringBuilder sbU = h0.b.u("Index:", i10, ", Size:");
            sbU.append(this.f1250g);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
    }

    public final b1 c(int i10) {
        if (i10 >= this.f1250g) {
            return new b1(Arrays.copyOf(this.f1249d, i10), this.f1250g, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return this.f1249d[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        Object[] objArr = this.f1249d;
        Object obj = objArr[i10];
        if (i10 < this.f1250g - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f1250g--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        b(i10);
        Object[] objArr = this.f1249d;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1250g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f1250g)) {
            Object[] objArr = this.f1249d;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f1249d, i10, objArr2, i10 + 1, this.f1250g - i10);
                this.f1249d = objArr2;
            }
            this.f1249d[i10] = obj;
            this.f1250g++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbU = h0.b.u("Index:", i10, ", Size:");
        sbU.append(this.f1250g);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
