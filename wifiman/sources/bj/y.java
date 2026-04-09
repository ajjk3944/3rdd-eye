package bj;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class y implements o {

    /* renamed from: a, reason: collision with root package name */
    private char[] f33469a = C4122e.f33440c.d();

    /* renamed from: b, reason: collision with root package name */
    private int f33470b;

    private final void e(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iG = g(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= K.a().length || (b10 = K.a()[cCharAt]) == 0) {
                int i12 = iG + 1;
                this.f33469a[iG] = cCharAt;
                i11 = i12;
                i10++;
            } else {
                if (b10 == 1) {
                    String str2 = K.b()[cCharAt];
                    AbstractC6492s.f(str2);
                    int iG2 = g(iG, str2.length());
                    str2.getChars(0, str2.length(), this.f33469a, iG2);
                    i11 = iG2 + str2.length();
                    this.f33470b = i11;
                } else {
                    char[] cArr = this.f33469a;
                    cArr[iG] = '\\';
                    cArr[iG + 1] = (char) b10;
                    i11 = iG + 2;
                    this.f33470b = i11;
                }
                i10++;
            }
        }
        int iG3 = g(i11, 1);
        this.f33469a[iG3] = '\"';
        this.f33470b = iG3 + 1;
    }

    private final void f(int i10) {
        g(this.f33470b, i10);
    }

    private final int g(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f33469a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, AbstractC7978m.d(i12, i10 * 2));
            AbstractC6492s.h(cArrCopyOf, "copyOf(...)");
            this.f33469a = cArrCopyOf;
        }
        return i10;
    }

    @Override // bj.o
    public void a(char c10) {
        f(1);
        char[] cArr = this.f33469a;
        int i10 = this.f33470b;
        this.f33470b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // bj.o
    public void b(String text) {
        AbstractC6492s.i(text, "text");
        f(text.length() + 2);
        char[] cArr = this.f33469a;
        int i10 = this.f33470b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < K.a().length && K.a()[c10] != 0) {
                e(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f33470b = i12 + 1;
    }

    @Override // bj.o
    public void c(long j10) {
        d(String.valueOf(j10));
    }

    @Override // bj.o
    public void d(String text) {
        AbstractC6492s.i(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        f(length);
        text.getChars(0, text.length(), this.f33469a, this.f33470b);
        this.f33470b += length;
    }

    public void h() {
        C4122e.f33440c.c(this.f33469a);
    }

    public String toString() {
        return new String(this.f33469a, 0, this.f33470b);
    }
}
