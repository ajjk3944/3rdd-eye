package vk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f36272a;

    /* renamed from: b, reason: collision with root package name */
    public int f36273b;

    /* renamed from: c, reason: collision with root package name */
    public int f36274c;

    /* renamed from: d, reason: collision with root package name */
    public int f36275d;

    /* renamed from: e, reason: collision with root package name */
    public int f36276e;

    public b(CharSequence charSequence) {
        nk.k.e(charSequence, "string");
        this.f36272a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i10;
        int i11 = this.f36273b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f36276e < 0) {
            this.f36273b = 2;
            return false;
        }
        CharSequence charSequence = this.f36272a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f36274c; i12 < length2; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i4 = (cCharAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f36273b = 1;
                this.f36276e = i4;
                this.f36275d = length;
                return true;
            }
        }
        i4 = -1;
        this.f36273b = 1;
        this.f36276e = i4;
        this.f36275d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f36273b = 0;
        int i4 = this.f36275d;
        int i10 = this.f36274c;
        this.f36274c = this.f36276e + i4;
        return this.f36272a.subSequence(i10, i4).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
