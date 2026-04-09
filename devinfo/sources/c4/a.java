package c4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2739e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2741b;

    /* renamed from: c, reason: collision with root package name */
    public int f2742c;

    /* renamed from: d, reason: collision with root package name */
    public char f2743d;

    static {
        for (int i4 = 0; i4 < 1792; i4++) {
            f2739e[i4] = Character.getDirectionality(i4);
        }
    }

    public a(CharSequence charSequence) {
        this.f2740a = charSequence;
        this.f2741b = charSequence.length();
    }

    public final byte a() {
        int i4 = this.f2742c - 1;
        CharSequence charSequence = this.f2740a;
        char cCharAt = charSequence.charAt(i4);
        this.f2743d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f2742c);
            this.f2742c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f2742c--;
        char c9 = this.f2743d;
        return c9 < 1792 ? f2739e[c9] : Character.getDirectionality(c9);
    }
}
