package tt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f22997a;

    /* renamed from: d, reason: collision with root package name */
    public int f22998d;

    /* renamed from: g, reason: collision with root package name */
    public int f22999g;

    /* renamed from: r, reason: collision with root package name */
    public int f23000r;

    /* renamed from: x, reason: collision with root package name */
    public int f23001x;

    public h(CharSequence charSequence) {
        br.l.e(charSequence, "string");
        this.f22997a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f22998d;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f23001x < 0) {
            this.f22998d = 2;
            return false;
        }
        CharSequence charSequence = this.f22997a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f22999g; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f22998d = 1;
                this.f23001x = i10;
                this.f23000r = length;
                return true;
            }
        }
        i10 = -1;
        this.f22998d = 1;
        this.f23001x = i10;
        this.f23000r = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f22998d = 0;
        int i10 = this.f23000r;
        int i11 = this.f22999g;
        this.f22999g = this.f23001x + i10;
        return this.f22997a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
