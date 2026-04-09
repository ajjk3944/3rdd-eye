package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class XA implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public String f12398a;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f12400c;

    /* renamed from: b, reason: collision with root package name */
    public int f12399b = 2;

    /* renamed from: d, reason: collision with root package name */
    public int f12401d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f12402e = Integer.MAX_VALUE;

    public XA(CharSequence charSequence) {
        this.f12400c = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        AbstractC0582Jp.h0(this.f12399b != 4);
        int i = this.f12399b;
        int i3 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f12399b = 4;
            int i6 = this.f12401d;
            while (true) {
                int i7 = this.f12401d;
                if (i7 == -1) {
                    this.f12399b = 3;
                    break;
                }
                int iA = a(i7);
                CharSequence charSequence = this.f12400c;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.f12401d = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.f12401d = iB;
                }
                if (iB == i6) {
                    int i8 = iB + 1;
                    this.f12401d = i8;
                    if (i8 > charSequence.length()) {
                        this.f12401d = -1;
                    }
                } else {
                    if (i6 < iA) {
                        charSequence.charAt(i6);
                    }
                    if (i6 < iA) {
                        charSequence.charAt(iA - 1);
                    }
                    int i9 = this.f12402e;
                    if (i9 == 1) {
                        iA = charSequence.length();
                        this.f12401d = -1;
                        if (iA > i6) {
                            charSequence.charAt(iA - 1);
                        }
                    } else {
                        this.f12402e = i9 - 1;
                    }
                    string = charSequence.subSequence(i6, iA).toString();
                }
            }
            this.f12398a = string;
            if (this.f12399b != 3) {
                this.f12399b = 1;
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
        this.f12399b = 2;
        String str = this.f12398a;
        this.f12398a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
