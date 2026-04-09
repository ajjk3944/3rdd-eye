package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f23033a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23034b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + e(i10 >> 12) + e(i10 >> 8) + e(i10 >> 4) + e(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f23033a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f23034b = bArr;
    }

    public static final byte[] a() {
        return f23034b;
    }

    public static final String[] b() {
        return f23033a;
    }

    public static final void c(StringBuilder sb, String value) {
        kotlin.jvm.internal.p.e(sb, "<this>");
        kotlin.jvm.internal.p.e(value, "value");
        sb.append('\"');
        int length = value.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            String[] strArr = f23033a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i10, i11);
                sb.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb.append((CharSequence) value, i10, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final Boolean d(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        if (s9.r.x(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (s9.r.x(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char e(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : i11 + 87);
    }
}
