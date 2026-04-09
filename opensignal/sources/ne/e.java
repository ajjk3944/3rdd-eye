package ne;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    public final char f17520a;

    public e(char c4) {
        this.f17520a = c4;
    }

    @Override // ne.d
    public final boolean a(char c4) {
        return c4 == this.f17520a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c4 = this.f17520a;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c4 & 15);
            c4 = (char) (c4 >> 4);
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return c7.a.k(c7.a.d(18, strCopyValueOf), "CharMatcher.is('", strCopyValueOf, "')");
    }
}
