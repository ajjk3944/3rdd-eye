package S9;

/* compiled from: AbstractJsonLexer.kt */
/* renamed from: S9.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1582n {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f12094a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12095b = new byte[126];

    static {
        int i = 0;
        for (int i10 = 0; i10 < 32; i10++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f12095b;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = 127;
            i++;
        }
    }

    public static void a(char c10, int i) {
        if (c10 != 'u') {
            f12094a[c10] = (char) i;
        }
    }
}
