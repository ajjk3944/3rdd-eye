package S9;

/* compiled from: JsonLexer.kt */
/* renamed from: S9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1574f implements CharSequence {

    /* renamed from: b, reason: collision with root package name */
    public final char[] f12083b;

    /* renamed from: c, reason: collision with root package name */
    public int f12084c;

    public C1574f(char[] cArr) {
        this.f12083b = cArr;
        this.f12084c = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f12083b[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12084c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return y9.n.S(this.f12083b, i, Math.min(i10, this.f12084c));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f12084c;
        return y9.n.S(this.f12083b, 0, Math.min(i, i));
    }
}
