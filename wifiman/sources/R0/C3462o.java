package R0;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: R0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3462o {

    /* renamed from: a, reason: collision with root package name */
    private int f19494a;

    /* renamed from: b, reason: collision with root package name */
    private char[] f19495b;

    /* renamed from: c, reason: collision with root package name */
    private int f19496c;

    /* renamed from: d, reason: collision with root package name */
    private int f19497d;

    public C3462o(char[] cArr, int i10, int i11) {
        this.f19494a = cArr.length;
        this.f19495b = cArr;
        this.f19496c = i10;
        this.f19497d = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.f19496c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f19495b;
            AbstractC3682n.i(cArr, cArr, this.f19497d - i13, i11, i12);
            this.f19496c = i10;
            this.f19497d -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.f19497d = i11 + c();
            this.f19496c = i10;
            return;
        }
        int iC = i10 + c();
        int iC2 = i11 + c();
        int i14 = this.f19497d;
        char[] cArr2 = this.f19495b;
        AbstractC3682n.i(cArr2, cArr2, this.f19496c, i14, iC);
        this.f19496c += iC - i14;
        this.f19497d = iC2;
    }

    private final int c() {
        return this.f19497d - this.f19496c;
    }

    private final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int iC = i10 - c();
        int i11 = this.f19494a;
        do {
            i11 *= 2;
        } while (i11 - this.f19494a < iC);
        char[] cArr = new char[i11];
        AbstractC3682n.i(this.f19495b, cArr, 0, 0, this.f19496c);
        int i12 = this.f19494a;
        int i13 = this.f19497d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        AbstractC3682n.i(this.f19495b, cArr, i15, i13, i14 + i13);
        this.f19495b = cArr;
        this.f19494a = i11;
        this.f19497d = i15;
    }

    public final void a(StringBuilder sb2) {
        sb2.append(this.f19495b, 0, this.f19496c);
        AbstractC6492s.h(sb2, "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.f19495b;
        int i10 = this.f19497d;
        sb2.append(cArr, i10, this.f19494a - i10);
        AbstractC6492s.h(sb2, "this.append(value, start…x, endIndex - startIndex)");
    }

    public final char d(int i10) {
        int i11 = this.f19496c;
        return i10 < i11 ? this.f19495b[i10] : this.f19495b[(i10 - i11) + this.f19497d];
    }

    public final int e() {
        return this.f19494a - c();
    }

    public final void g(int i10, int i11, String str) {
        f(str.length() - (i11 - i10));
        b(i10, i11);
        AbstractC3463p.b(str, this.f19495b, this.f19496c);
        this.f19496c += str.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }
}
