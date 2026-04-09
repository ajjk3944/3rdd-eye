package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v0 extends b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f1074d = new v0(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1075b;

    /* renamed from: c, reason: collision with root package name */
    public int f1076c;

    public v0(Object[] objArr, int i4, boolean z3) {
        this.f936a = z3;
        this.f1075b = objArr;
        this.f1076c = i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i4 = this.f1076c;
        Object[] objArr = this.f1075b;
        if (i4 == objArr.length) {
            this.f1075b = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1075b;
        int i10 = this.f1076c;
        this.f1076c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i4) {
        if (i4 < 0 || i4 >= this.f1076c) {
            StringBuilder sbW = je.u.w(i4, "Index:", ", Size:");
            sbW.append(this.f1076c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    public final v0 d(int i4) {
        if (i4 >= this.f1076c) {
            return new v0(Arrays.copyOf(this.f1075b, i4), this.f1076c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        c(i4);
        return this.f1075b[i4];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        a();
        c(i4);
        Object[] objArr = this.f1075b;
        Object obj = objArr[i4];
        if (i4 < this.f1076c - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f1076c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        a();
        c(i4);
        Object[] objArr = this.f1075b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1076c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        a();
        if (i4 >= 0 && i4 <= (i10 = this.f1076c)) {
            Object[] objArr = this.f1075b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i10 - i4);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(this.f1075b, i4, objArr2, i4 + 1, this.f1076c - i4);
                this.f1075b = objArr2;
            }
            this.f1075b[i4] = obj;
            this.f1076c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbW = je.u.w(i4, "Index:", ", Size:");
        sbW.append(this.f1076c);
        throw new IndexOutOfBoundsException(sbW.toString());
    }
}
