package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class da extends la {

    /* renamed from: a, reason: collision with root package name */
    private final int f35682a;

    /* renamed from: b, reason: collision with root package name */
    private int f35683b;

    protected da(int i10, int i11) {
        W9.b(i11, i10, "index");
        this.f35682a = i10;
        this.f35683b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f35683b < this.f35682a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f35683b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f35683b;
        this.f35683b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f35683b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f35683b - 1;
        this.f35683b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f35683b - 1;
    }
}
