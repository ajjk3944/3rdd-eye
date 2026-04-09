package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j31 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public String f12615a;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f12617c;

    /* renamed from: b, reason: collision with root package name */
    public int f12616b = 2;

    /* renamed from: d, reason: collision with root package name */
    public int f12618d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f12619e = Integer.MAX_VALUE;

    public j31(CharSequence charSequence) {
        this.f12617c = charSequence;
    }

    public abstract int a(int i4);

    public abstract int b(int i4);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        mq0.c0(this.f12616b != 4);
        int i4 = this.f12616b;
        int i10 = i4 - 1;
        String string = null;
        if (i4 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            this.f12616b = 4;
            int i11 = this.f12618d;
            while (true) {
                int i12 = this.f12618d;
                if (i12 == -1) {
                    this.f12616b = 3;
                    break;
                }
                int iA = a(i12);
                CharSequence charSequence = this.f12617c;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.f12618d = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.f12618d = iB;
                }
                if (iB == i11) {
                    int i13 = iB + 1;
                    this.f12618d = i13;
                    if (i13 > charSequence.length()) {
                        this.f12618d = -1;
                    }
                } else {
                    if (i11 < iA) {
                        charSequence.charAt(i11);
                    }
                    if (i11 < iA) {
                        charSequence.charAt(iA - 1);
                    }
                    int i14 = this.f12619e;
                    if (i14 == 1) {
                        iA = charSequence.length();
                        this.f12618d = -1;
                        if (iA > i11) {
                            charSequence.charAt(iA - 1);
                        }
                    } else {
                        this.f12619e = i14 - 1;
                    }
                    string = charSequence.subSequence(i11, iA).toString();
                }
            }
            this.f12615a = string;
            if (this.f12616b != 3) {
                this.f12616b = 1;
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
        this.f12616b = 2;
        String str = this.f12615a;
        this.f12615a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
