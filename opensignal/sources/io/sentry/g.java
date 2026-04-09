package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes.dex */
public final class g extends AbstractCollection implements Queue, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object[] f12255a;

    /* renamed from: d, reason: collision with root package name */
    public transient int f12256d = 0;

    /* renamed from: g, reason: collision with root package name */
    public transient int f12257g = 0;

    /* renamed from: r, reason: collision with root package name */
    public transient boolean f12258r = false;

    /* renamed from: x, reason: collision with root package name */
    public final int f12259x;

    public g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i10];
        this.f12255a = objArr;
        this.f12259x = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i10 = this.f12259x;
        if (size == i10) {
            remove();
        }
        int i11 = this.f12257g;
        int i12 = i11 + 1;
        this.f12257g = i12;
        this.f12255a[i11] = obj;
        if (i12 >= i10) {
            this.f12257g = 0;
        }
        if (this.f12257g == this.f12256d) {
            this.f12258r = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f12258r = false;
        this.f12256d = 0;
        this.f12257g = 0;
        Arrays.fill(this.f12255a, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new f(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f12255a[this.f12256d];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int i10 = this.f12256d;
        Object[] objArr = this.f12255a;
        Object obj = objArr[i10];
        if (obj != null) {
            int i11 = i10 + 1;
            this.f12256d = i11;
            objArr[i10] = null;
            if (i11 >= this.f12259x) {
                this.f12256d = 0;
            }
            this.f12258r = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = this.f12257g;
        int i11 = this.f12256d;
        int i12 = this.f12259x;
        if (i10 < i11) {
            return (i12 - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.f12258r) {
            return i12;
        }
        return 0;
    }
}
