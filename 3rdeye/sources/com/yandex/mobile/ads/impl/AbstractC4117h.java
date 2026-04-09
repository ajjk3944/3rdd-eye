package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.m12;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4117h<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    private int f28047b = 2;

    /* renamed from: c, reason: collision with root package name */
    private String f28048c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iA;
        int i = this.f28047b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iA2 = r8.a(i);
        if (iA2 == 0) {
            return true;
        }
        if (iA2 != 2) {
            this.f28047b = 4;
            m12.a aVar = (m12.a) this;
            int i10 = aVar.f30157g;
            while (true) {
                int i11 = aVar.f30157g;
                if (i11 == -1) {
                    aVar.f28047b = 3;
                    string = null;
                    break;
                }
                k12 k12Var = (k12) aVar;
                iA = k12Var.i.f29863a.a(k12Var.f30154d, i11);
                if (iA == -1) {
                    iA = aVar.f30154d.length();
                    aVar.f30157g = -1;
                } else {
                    aVar.f30157g = iA + 1;
                }
                int i12 = aVar.f30157g;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    aVar.f30157g = i13;
                    if (i13 > aVar.f30154d.length()) {
                        aVar.f30157g = -1;
                    }
                } else {
                    while (i10 < iA && aVar.f30155e.a(aVar.f30154d.charAt(i10))) {
                        i10++;
                    }
                    while (iA > i10 && aVar.f30155e.a(aVar.f30154d.charAt(iA - 1))) {
                        iA--;
                    }
                    if (!aVar.f30156f || i10 != iA) {
                        break;
                    }
                    i10 = aVar.f30157g;
                }
            }
            int i14 = aVar.f30158h;
            if (i14 == 1) {
                iA = aVar.f30154d.length();
                aVar.f30157g = -1;
                while (iA > i10 && aVar.f30155e.a(aVar.f30154d.charAt(iA - 1))) {
                    iA--;
                }
            } else {
                aVar.f30158h = i14 - 1;
            }
            string = aVar.f30154d.subSequence(i10, iA).toString();
            this.f28048c = string;
            if (this.f28047b != 3) {
                this.f28047b = 1;
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
        this.f28047b = 2;
        T t10 = (T) this.f28048c;
        this.f28048c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
