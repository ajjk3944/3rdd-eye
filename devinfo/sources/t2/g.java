package t2;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f34123a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34124b;

    /* renamed from: c, reason: collision with root package name */
    public int f34125c = 0;

    public g(int i4, CharSequence charSequence) {
        this.f34123a = charSequence;
        this.f34124b = i4;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i4 = this.f34125c;
        if (i4 == this.f34124b) {
            return (char) 65535;
        }
        return this.f34123a.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f34125c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f34124b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f34125c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i4 = this.f34124b;
        if (i4 == 0) {
            this.f34125c = i4;
            return (char) 65535;
        }
        int i10 = i4 - 1;
        this.f34125c = i10;
        return this.f34123a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i4 = this.f34125c + 1;
        this.f34125c = i4;
        int i10 = this.f34124b;
        if (i4 < i10) {
            return this.f34123a.charAt(i4);
        }
        this.f34125c = i10;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i4 = this.f34125c;
        if (i4 <= 0) {
            return (char) 65535;
        }
        int i10 = i4 - 1;
        this.f34125c = i10;
        return this.f34123a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i4) {
        if (i4 > this.f34124b || i4 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f34125c = i4;
        return current();
    }
}
