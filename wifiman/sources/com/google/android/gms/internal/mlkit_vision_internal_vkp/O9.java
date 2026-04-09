package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class O9 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Object f35622a;

    /* renamed from: b, reason: collision with root package name */
    private int f35623b = 2;

    protected O9() {
    }

    protected abstract Object a();

    protected final Object c() {
        this.f35623b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        W9.d(this.f35623b != 4);
        int i10 = this.f35623b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f35623b = 4;
            this.f35622a = a();
            if (this.f35623b != 3) {
                this.f35623b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f35623b = 2;
        Object obj = this.f35622a;
        this.f35622a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
