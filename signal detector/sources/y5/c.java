package y5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class c implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f24258a;

    /* renamed from: b, reason: collision with root package name */
    public int f24259b;

    /* renamed from: c, reason: collision with root package name */
    public int f24260c;

    /* renamed from: d, reason: collision with root package name */
    public int f24261d;

    /* renamed from: e, reason: collision with root package name */
    public int f24262e;

    public c(CharSequence charSequence) {
        q5.i.e(charSequence, "string");
        this.f24258a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i3;
        int i6 = this.f24259b;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f24262e < 0) {
            this.f24259b = 2;
            return false;
        }
        CharSequence charSequence = this.f24258a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i7 = this.f24260c; i7 < length2; i7++) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i3 = i7 + 1) < charSequence.length() && charSequence.charAt(i3) == '\n') ? 2 : 1;
                length = i7;
                this.f24259b = 1;
                this.f24262e = i;
                this.f24261d = length;
                return true;
            }
        }
        i = -1;
        this.f24259b = 1;
        this.f24262e = i;
        this.f24261d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24259b = 0;
        int i = this.f24261d;
        int i3 = this.f24260c;
        this.f24260c = this.f24262e + i;
        return this.f24258a.subSequence(i3, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
