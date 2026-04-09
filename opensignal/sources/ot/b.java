package ot;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public int f19790a;

    /* renamed from: d, reason: collision with root package name */
    public Object f19791d;

    /* renamed from: g, reason: collision with root package name */
    public int f19792g = -1;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f19793r;

    public b(c cVar) {
        this.f19793r = cVar;
    }

    public final void a() {
        int i10;
        Object[] objArr;
        do {
            i10 = this.f19792g + 1;
            this.f19792g = i10;
            objArr = this.f19793r.f19794a;
            if (i10 >= objArr.length) {
                break;
            }
        } while (objArr[i10] == null);
        if (i10 >= objArr.length) {
            this.f19790a = 2;
            return;
        }
        Object obj = objArr[i10];
        br.l.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f19791d = obj;
        this.f19790a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f19790a;
        if (i10 == 0) {
            this.f19790a = 3;
            a();
            return this.f19790a == 1;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f19790a;
        if (i10 == 1) {
            this.f19790a = 0;
            return this.f19791d;
        }
        if (i10 != 2) {
            this.f19790a = 3;
            a();
            if (this.f19790a == 1) {
                this.f19790a = 0;
                return this.f19791d;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
