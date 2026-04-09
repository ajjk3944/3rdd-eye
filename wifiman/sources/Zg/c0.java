package Zg;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
final class c0 extends AbstractC3672d implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f25354b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25355c;

    /* renamed from: d, reason: collision with root package name */
    private int f25356d;

    /* renamed from: e, reason: collision with root package name */
    private int f25357e;

    public static final class a extends AbstractC3671c {

        /* renamed from: c, reason: collision with root package name */
        private int f25358c;

        /* renamed from: d, reason: collision with root package name */
        private int f25359d;

        a() {
            this.f25358c = c0.this.size();
            this.f25359d = c0.this.f25356d;
        }

        @Override // Zg.AbstractC3671c
        protected void d() {
            if (this.f25358c == 0) {
                e();
                return;
            }
            f(c0.this.f25354b[this.f25359d]);
            this.f25359d = (this.f25359d + 1) % c0.this.f25355c;
            this.f25358c--;
        }
    }

    public c0(Object[] buffer, int i10) {
        AbstractC6492s.i(buffer, "buffer");
        this.f25354b = buffer;
        if (i10 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f25355c = buffer.length;
            this.f25357e = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    public final void J(Object obj) {
        if (T()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f25354b[(this.f25356d + size()) % this.f25355c] = obj;
        this.f25357e = size() + 1;
    }

    public final c0 S(int i10) {
        Object[] array;
        int i11 = this.f25355c;
        int iG = AbstractC7978m.g(i11 + (i11 >> 1) + 1, i10);
        if (this.f25356d == 0) {
            array = Arrays.copyOf(this.f25354b, iG);
            AbstractC6492s.h(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iG]);
        }
        return new c0(array, size());
    }

    public final boolean T() {
        return size() == this.f25355c;
    }

    public final void b0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (i10 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f25356d;
            int i12 = (i11 + i10) % this.f25355c;
            if (i11 > i12) {
                AbstractC3682n.v(this.f25354b, null, i11, this.f25355c);
                AbstractC3682n.v(this.f25354b, null, 0, i12);
            } else {
                AbstractC3682n.v(this.f25354b, null, i11, i12);
            }
            this.f25356d = i12;
            this.f25357e = size() - i10;
        }
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public Object get(int i10) {
        AbstractC3672d.f25361a.b(i10, size());
        return this.f25354b[(this.f25356d + i10) % this.f25355c];
    }

    @Override // Zg.AbstractC3672d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f25357e;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC6492s.i(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC6492s.h(array, "copyOf(...)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f25356d; i11 < size && i12 < this.f25355c; i12++) {
            array[i11] = this.f25354b[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.f25354b[i10];
            i11++;
            i10++;
        }
        return AbstractC3689v.g(size, array);
    }

    public c0(int i10) {
        this(new Object[i10], 0);
    }

    @Override // Zg.AbstractC3670b, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
