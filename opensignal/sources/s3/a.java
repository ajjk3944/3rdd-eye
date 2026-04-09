package s3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f21853e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f21854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21855b;

    /* renamed from: c, reason: collision with root package name */
    public int f21856c;

    /* renamed from: d, reason: collision with root package name */
    public char f21857d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f21853e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f21854a = charSequence;
        this.f21855b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f21856c - 1;
        CharSequence charSequence = this.f21854a;
        char cCharAt = charSequence.charAt(i10);
        this.f21857d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f21856c);
            this.f21856c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f21856c--;
        char c4 = this.f21857d;
        return c4 < 1792 ? f21853e[c4] : Character.getDirectionality(c4);
    }
}
