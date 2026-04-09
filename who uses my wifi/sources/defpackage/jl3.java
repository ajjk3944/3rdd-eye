package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class jl3 implements Iterator {
    public String f;
    public final CharSequence h;
    public int g = 2;
    public int i = 0;
    public int j = Integer.MAX_VALUE;

    public jl3(CharSequence charSequence) {
        this.h = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        zt0.b0(this.g != 4);
        int i = this.g;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.g = 4;
            int i3 = this.i;
            while (true) {
                int i4 = this.i;
                if (i4 == -1) {
                    this.g = 3;
                    break;
                }
                int iA = a(i4);
                CharSequence charSequence = this.h;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.i = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.i = iB;
                }
                if (iB == i3) {
                    int i5 = iB + 1;
                    this.i = i5;
                    if (i5 > charSequence.length()) {
                        this.i = -1;
                    }
                } else {
                    if (i3 < iA) {
                        charSequence.charAt(i3);
                    }
                    if (i3 < iA) {
                        charSequence.charAt(iA - 1);
                    }
                    int i6 = this.j;
                    if (i6 == 1) {
                        iA = charSequence.length();
                        this.i = -1;
                        if (iA > i3) {
                            charSequence.charAt(iA - 1);
                        }
                    } else {
                        this.j = i6 - 1;
                    }
                    string = charSequence.subSequence(i3, iA).toString();
                }
            }
            this.f = string;
            if (this.g != 3) {
                this.g = 1;
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
        this.g = 2;
        String str = this.f;
        this.f = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
