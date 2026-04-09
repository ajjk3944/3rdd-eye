package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xj0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class vj0<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final Object[] f34604b = new Object[0];

    public static abstract class b<E> {
    }

    public int a(int i, Object[] objArr) {
        v72<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public xj0<E> b() {
        if (isEmpty()) {
            int i = xj0.f35328d;
            return (xj0<E>) fo1.f27413g;
        }
        Object[] array = toArray(f34604b);
        int i10 = xj0.f35328d;
        return xj0.b(array.length, array);
    }

    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract v72<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f34604b);
    }

    public Object writeReplace() {
        return new xj0.c(toArray(f34604b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] objArrC = c();
            if (objArrC != null) {
                return (T[]) kh1.a(objArrC, e(), d(), tArr);
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(0, tArr);
        return tArr;
    }

    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f34605a;

        /* renamed from: b, reason: collision with root package name */
        int f34606b;

        /* renamed from: c, reason: collision with root package name */
        boolean f34607c;

        public a() {
            jq.a(4, "initialCapacity");
            this.f34605a = new Object[4];
            this.f34606b = 0;
        }

        public final void a(Object obj) {
            obj.getClass();
            int i = this.f34606b;
            int i10 = i + 1;
            Object[] objArr = this.f34605a;
            if (objArr.length < i10) {
                int length = objArr.length;
                if (i10 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i10) {
                    iHighestOneBit = Integer.highestOneBit(i) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                this.f34605a = Arrays.copyOf(objArr, iHighestOneBit);
                this.f34607c = false;
            } else if (this.f34607c) {
                this.f34605a = (Object[]) objArr.clone();
                this.f34607c = false;
            }
            Object[] objArr2 = this.f34605a;
            int i11 = this.f34606b;
            this.f34606b = i11 + 1;
            objArr2[i11] = obj;
        }

        public void b(Object obj) {
            a(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final b a(List list) {
            if (list instanceof Collection) {
                int size = list.size() + this.f34606b;
                Object[] objArr = this.f34605a;
                if (objArr.length < size) {
                    int length = objArr.length;
                    if (size >= 0) {
                        int iHighestOneBit = length + (length >> 1) + 1;
                        if (iHighestOneBit < size) {
                            iHighestOneBit = Integer.highestOneBit(size - 1) << 1;
                        }
                        if (iHighestOneBit < 0) {
                            iHighestOneBit = Integer.MAX_VALUE;
                        }
                        this.f34605a = Arrays.copyOf(objArr, iHighestOneBit);
                        this.f34607c = false;
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                } else if (this.f34607c) {
                    this.f34605a = (Object[]) objArr.clone();
                    this.f34607c = false;
                }
                if (list instanceof vj0) {
                    this.f34606b = ((vj0) list).a(this.f34606b, this.f34605a);
                    return this;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((xj0.a) this).a(it.next());
            }
            return this;
        }
    }
}
