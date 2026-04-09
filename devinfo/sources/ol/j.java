package ol;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f30596a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f30597b;

    static {
        String[] strArr = new String[93];
        for (int i4 = 0; i4 < 32; i4++) {
            strArr[i4] = "\\u" + a(i4 >> 12) + a(i4 >> 8) + a(i4 >> 4) + a(i4);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f30596a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f30597b = bArr;
    }

    public static final char a(int i4) {
        int i10 = i4 & 15;
        return (char) (i10 < 10 ? i10 + 48 : i10 + 87);
    }
}
