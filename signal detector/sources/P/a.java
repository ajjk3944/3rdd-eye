package P;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3101e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3103b;

    /* renamed from: c, reason: collision with root package name */
    public int f3104c;

    /* renamed from: d, reason: collision with root package name */
    public char f3105d;

    static {
        for (int i = 0; i < 1792; i++) {
            f3101e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f3102a = charSequence;
        this.f3103b = charSequence.length();
    }

    public final byte a() {
        int i = this.f3104c - 1;
        CharSequence charSequence = this.f3102a;
        char cCharAt = charSequence.charAt(i);
        this.f3105d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f3104c);
            this.f3104c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f3104c--;
        char c6 = this.f3105d;
        return c6 < 1792 ? f3101e[c6] : Character.getDirectionality(c6);
    }
}
