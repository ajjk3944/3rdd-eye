package w5;

import a5.d0;
import u5.a0;
import u5.w;
import u5.y;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f24218a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24219b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24220c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24221d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24222e;

    /* renamed from: f, reason: collision with root package name */
    public int f24223f;

    /* renamed from: g, reason: collision with root package name */
    public int f24224g;

    /* renamed from: h, reason: collision with root package name */
    public int f24225h;

    /* renamed from: i, reason: collision with root package name */
    public int f24226i;
    public int j;
    public long[] k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f24227l;

    public e(int i10, int i11, long j, int i12, a0 a0Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        a5.a.e(z10);
        this.f24221d = j;
        this.f24222e = i12;
        this.f24218a = a0Var;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f24219b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.f24220c = i11 == 2 ? i13 | 1650720768 : -1;
        this.k = new long[512];
        this.f24227l = new int[512];
    }

    public final y a(int i10) {
        return new y(((this.f24221d * 1) / this.f24222e) * this.f24227l[i10], this.k[i10]);
    }

    public final w b(long j) {
        int i10 = (int) (j / ((this.f24221d * 1) / this.f24222e));
        int iD = d0.d(this.f24227l, i10, true, true);
        if (this.f24227l[iD] == i10) {
            y yVarA = a(iD);
            return new w(yVarA, yVarA);
        }
        y yVarA2 = a(iD);
        int i11 = iD + 1;
        return i11 < this.k.length ? new w(yVarA2, a(i11)) : new w(yVarA2, yVarA2);
    }
}
