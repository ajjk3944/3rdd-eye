package i2;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class a implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f11151a;

    /* renamed from: d, reason: collision with root package name */
    public final int f11152d;

    /* renamed from: g, reason: collision with root package name */
    public int f11153g = 0;

    public a(CharSequence charSequence, int i10) {
        this.f11151a = charSequence;
        this.f11152d = i10;
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
        int i10 = this.f11153g;
        if (i10 == this.f11152d) {
            return (char) 65535;
        }
        return this.f11151a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f11153g = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f11152d;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f11153g;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f11152d;
        if (i10 == 0) {
            this.f11153g = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f11153g = i11;
        return this.f11151a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f11153g + 1;
        this.f11153g = i10;
        int i11 = this.f11152d;
        if (i10 < i11) {
            return this.f11151a.charAt(i10);
        }
        this.f11153g = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f11153g;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f11153g = i11;
        return this.f11151a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f11152d || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f11153g = i10;
        return current();
    }
}
