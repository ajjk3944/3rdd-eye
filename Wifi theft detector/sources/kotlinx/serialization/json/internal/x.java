package kotlinx.serialization.json.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class x implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f23047a = h.f23013a.b();

    /* renamed from: b, reason: collision with root package name */
    public int f23048b;

    @Override // kotlinx.serialization.json.internal.d0
    public void a(char c10) {
        e(1);
        char[] cArr = this.f23047a;
        int i10 = this.f23048b;
        this.f23048b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // kotlinx.serialization.json.internal.d0
    public void b(String text) {
        kotlin.jvm.internal.p.e(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f23047a;
        int i10 = this.f23048b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < k0.a().length && k0.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f23048b = i12 + 1;
    }

    @Override // kotlinx.serialization.json.internal.d0
    public void c(String text) {
        kotlin.jvm.internal.p.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f23047a, this.f23048b);
        this.f23048b += length;
    }

    public final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= k0.a().length || (b10 = k0.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f23047a[iF] = cCharAt;
                i11 = i12;
                i10++;
            } else {
                if (b10 == 1) {
                    String str2 = k0.b()[cCharAt];
                    kotlin.jvm.internal.p.b(str2);
                    int iF2 = f(iF, str2.length());
                    str2.getChars(0, str2.length(), this.f23047a, iF2);
                    i11 = iF2 + str2.length();
                    this.f23048b = i11;
                } else {
                    char[] cArr = this.f23047a;
                    cArr[iF] = '\\';
                    cArr[iF + 1] = (char) b10;
                    i11 = iF + 2;
                    this.f23048b = i11;
                }
                i10++;
            }
        }
        int iF3 = f(i11, 1);
        this.f23047a[iF3] = '\"';
        this.f23048b = iF3 + 1;
    }

    public final void e(int i10) {
        f(this.f23048b, i10);
    }

    public final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f23047a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, q9.e.b(i12, i10 * 2));
            kotlin.jvm.internal.p.d(cArrCopyOf, "copyOf(this, newSize)");
            this.f23047a = cArrCopyOf;
        }
        return i10;
    }

    public void g() {
        h.f23013a.a(this.f23047a);
    }

    public String toString() {
        return new String(this.f23047a, 0, this.f23048b);
    }

    @Override // kotlinx.serialization.json.internal.d0
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
