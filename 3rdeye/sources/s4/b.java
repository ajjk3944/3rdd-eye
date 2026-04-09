package S4;

import S9.L;
import S9.S;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* compiled from: HttpResponse.java */
/* loaded from: classes2.dex */
public final class b implements L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11911a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f11912b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f11913c;

    public /* synthetic */ b() {
    }

    @Override // S9.L
    public void a(char c10) {
        e(this.f11912b, 1);
        char[] cArr = (char[]) this.f11913c;
        int i = this.f11912b;
        this.f11912b = i + 1;
        cArr[i] = c10;
    }

    @Override // S9.L
    public void b(String text) {
        byte b10;
        l.f(text, "text");
        e(this.f11912b, text.length() + 2);
        char[] cArr = (char[]) this.f11913c;
        int i = this.f11912b;
        int i10 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            byte[] bArr = S.f12065b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = text.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    e(i12, 2);
                    char cCharAt = text.charAt(i13);
                    byte[] bArr2 = S.f12065b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i14 = i12 + 1;
                        ((char[]) this.f11913c)[i12] = cCharAt;
                        i12 = i14;
                    } else {
                        if (b10 == 1) {
                            String str = S.f12064a[cCharAt];
                            l.c(str);
                            e(i12, str.length());
                            str.getChars(0, str.length(), (char[]) this.f11913c, i12);
                            int length3 = str.length() + i12;
                            this.f11912b = length3;
                            i12 = length3;
                        } else {
                            char[] cArr2 = (char[]) this.f11913c;
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = (char) b10;
                            i12 += 2;
                            this.f11912b = i12;
                        }
                    }
                }
                e(i12, 1);
                ((char[]) this.f11913c)[i12] = '\"';
                this.f11912b = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        this.f11912b = i11 + 1;
    }

    @Override // S9.L
    public void c(long j4) {
        d(String.valueOf(j4));
    }

    @Override // S9.L
    public void d(String text) {
        l.f(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(this.f11912b, length);
        text.getChars(0, text.length(), (char[]) this.f11913c, this.f11912b);
        this.f11912b += length;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [char[], java.io.Serializable, java.lang.Object] */
    public void e(int i, int i10) {
        int i11 = i10 + i;
        char[] cArr = (char[]) this.f11913c;
        if (cArr.length <= i11) {
            int i12 = i * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            ?? CopyOf = Arrays.copyOf(cArr, i11);
            l.e(CopyOf, "copyOf(this, newSize)");
            this.f11913c = CopyOf;
        }
    }

    public String toString() {
        switch (this.f11911a) {
            case 1:
                return new String((char[]) this.f11913c, 0, this.f11912b);
            default:
                return super.toString();
        }
    }

    public b(int i, String str) {
        this.f11912b = i;
        this.f11913c = str;
    }
}
