package I;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class W {

    /* renamed from: a, reason: collision with root package name */
    private int f8102a;

    /* renamed from: b, reason: collision with root package name */
    private char[] f8103b;

    /* renamed from: c, reason: collision with root package name */
    private int f8104c;

    /* renamed from: d, reason: collision with root package name */
    private int f8105d;

    public W(char[] cArr, int i10, int i11) {
        this.f8102a = cArr.length;
        this.f8103b = cArr;
        this.f8104c = i10;
        this.f8105d = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.f8104c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f8103b;
            AbstractC3682n.i(cArr, cArr, this.f8105d - i13, i11, i12);
            this.f8104c = i10;
            this.f8105d -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.f8105d = i11 + c();
            this.f8104c = i10;
            return;
        }
        int iC = i10 + c();
        int iC2 = i11 + c();
        int i14 = this.f8105d;
        char[] cArr2 = this.f8103b;
        AbstractC3682n.i(cArr2, cArr2, this.f8104c, i14, iC);
        this.f8104c += iC - i14;
        this.f8105d = iC2;
    }

    private final int c() {
        return this.f8105d - this.f8104c;
    }

    private final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int iC = i10 - c();
        int i11 = this.f8102a;
        do {
            i11 *= 2;
        } while (i11 - this.f8102a < iC);
        char[] cArr = new char[i11];
        AbstractC3682n.i(this.f8103b, cArr, 0, 0, this.f8104c);
        int i12 = this.f8102a;
        int i13 = this.f8105d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        AbstractC3682n.i(this.f8103b, cArr, i15, i13, i14 + i13);
        this.f8103b = cArr;
        this.f8102a = i11;
        this.f8105d = i15;
    }

    public final void a(StringBuilder sb2) {
        sb2.append(this.f8103b, 0, this.f8104c);
        AbstractC6492s.h(sb2, "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.f8103b;
        int i10 = this.f8105d;
        sb2.append(cArr, i10, this.f8102a - i10);
        AbstractC6492s.h(sb2, "this.append(value, start…x, endIndex - startIndex)");
    }

    public final char d(int i10) {
        int i11 = this.f8104c;
        return i10 < i11 ? this.f8103b[i10] : this.f8103b[(i10 - i11) + this.f8105d];
    }

    public final int e() {
        return this.f8102a - c();
    }

    public final void g(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        int i14 = i13 - i12;
        f(i14 - (i11 - i10));
        b(i10, i11);
        n1.a(charSequence, this.f8103b, this.f8104c, i12, i13);
        this.f8104c += i14;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }
}
