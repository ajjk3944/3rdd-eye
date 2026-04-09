package S9;

/* compiled from: StringOps.kt */
/* loaded from: classes3.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f12064a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12065b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + b(i >> 12) + b(i >> 8) + b(i >> 4) + b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f12064a = strArr;
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
        f12065b = bArr;
    }

    public static final void a(StringBuilder sb, String value) {
        kotlin.jvm.internal.l.f(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            String[] strArr = f12064a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i, i10);
                sb.append(strArr[cCharAt]);
                i = i10 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final char b(int i) {
        int i10 = i & 15;
        return (char) (i10 < 10 ? i10 + 48 : i10 + 87);
    }
}
