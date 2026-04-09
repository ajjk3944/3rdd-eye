package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4110g<T> extends v72<T> {

    /* renamed from: b, reason: collision with root package name */
    private int f27495b = 2;

    /* renamed from: c, reason: collision with root package name */
    private T f27496c;

    public abstract T a();

    public final void b() {
        this.f27495b = 3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f27495b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iA = r8.a(i);
        if (iA == 0) {
            return true;
        }
        if (iA != 2) {
            this.f27495b = 4;
            this.f27496c = a();
            if (this.f27495b != 3) {
                this.f27495b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27495b = 2;
        T t10 = this.f27496c;
        this.f27496c = null;
        return t10;
    }
}
