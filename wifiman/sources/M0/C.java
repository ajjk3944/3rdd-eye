package M0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class C implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f12329a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12330b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12331c;

    /* renamed from: d, reason: collision with root package name */
    private int f12332d;

    public C(CharSequence charSequence, int i10, int i11) {
        this.f12329a = charSequence;
        this.f12330b = i10;
        this.f12331c = i11;
        this.f12332d = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f12332d;
        if (i10 == this.f12331c) {
            return (char) 65535;
        }
        return this.f12329a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f12332d = this.f12330b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f12330b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f12331c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f12332d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f12330b;
        int i11 = this.f12331c;
        if (i10 == i11) {
            this.f12332d = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f12332d = i12;
        return this.f12329a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f12332d + 1;
        this.f12332d = i10;
        int i11 = this.f12331c;
        if (i10 < i11) {
            return this.f12329a.charAt(i10);
        }
        this.f12332d = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f12332d;
        if (i10 <= this.f12330b) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f12332d = i11;
        return this.f12329a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f12330b;
        if (i10 > this.f12331c || i11 > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f12332d = i10;
        return current();
    }
}
