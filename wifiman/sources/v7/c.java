package v7;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f63489a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f63490b;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        AbstractC6492s.h(charArray, "this as java.lang.String).toCharArray()");
        f63490b = charArray;
    }

    private c() {
    }

    private final String a(byte[] bArr, String str) {
        int length = bArr.length * 2;
        char[] cArr = new char[length];
        int length2 = bArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length2; i11++) {
            byte b10 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f63490b;
            cArr[i12] = cArr2[(b10 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b10 & 15];
        }
        if (str == null) {
            return new String(cArr);
        }
        String str2 = new String();
        int i13 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i14 = i13 + 1;
            str2 = (i13 % 2 == 0 || i13 == length - 1) ? str2 + c10 : str2 + c10 + str;
            i10++;
            i13 = i14;
        }
        return str2;
    }

    public final String b(byte[] hwAddress, String str) {
        AbstractC6492s.i(hwAddress, "hwAddress");
        String strA = a(hwAddress, str);
        Locale US = Locale.US;
        AbstractC6492s.h(US, "US");
        String lowerCase = strA.toLowerCase(US);
        AbstractC6492s.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
